/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author deste serviço Tomaz Lavieri
 */
public abstract class WebServiceCep {

    /**
     * Enumeration para setar os parametros do XML, cada constante conhece o seu
     * método correspondente, invocando a partir de um atalho comum
     *
     */
    private enum Xml {
        CIDADE {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setCidade(text);
            }
        },
        BAIRRO {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setBairro(text);
            }
        },
        TIPO_LOGRADOURO {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setLogradouroType(text);
            }
        },
        LOGRADOURO {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setLogradouro(text);
            }
        },
        RESULTADO {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setResulCode(Integer.parseInt(text));
            }
        },
        RESULTADO_TXT {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setResultText(text);
            }
        },
        UF {
            @Override
            public void setCep(String text, WebServiceCep webServiceCep) {
                webServiceCep.setUf(text);
            }
        };

        /**
         * Seta o texto enviado no parametro <tt>text</tt> no objeto
         * {@link WebServiceCep} no seu parametro correspondente. Cada constante
         * do enum conhece o seu parametro a passar.
         *
         * @param text {@link String} contendo o texto a ser inserido.
         * @param webServiceCep {@link WebServiceCep} referencia do objeto para
         * inserir o parametro text.
         */
        public abstract void setCep(String text, WebServiceCep webServiceCep);
    }

    /**
     * Classe utilitária apenas encapsula o Iterator de elements da root dentro
     * de um Iterable, para ser usado dentro de um for.
     */
    private static final class IterableElement implements Iterable<Element> {

        private final Iterator<Element> itr;

        @SuppressWarnings("unchecked")
        public IterableElement(Iterator<?> itr) {
            this.itr = (Iterator<Element>) itr;
        }

        @Override
        public Iterator<Element> iterator() {
            return itr;
        }
    }

    /**
     * Classe contendo todos os Enums {@link Xml}. Tem como finalidade, buscar
     * um Enumeration especifico pelo seu nome.
     */
    private static final class XmlEnums {

        private HashMap<String, Xml> enumsMap;

        /**
         * Cria um {@link XmlEnums}
         */
        public XmlEnums() {
            initializeEnums();
        }

        /**
         * Inicializa este objeto, guardando os enumerations em um
         * {@link HashMap}
         */
        private void initializeEnums() {
            Xml[] enums = Xml.class.getEnumConstants();
            enumsMap = new HashMap<>();
            for (Xml enum1 : enums) {
                enumsMap.put(enum1.name().toLowerCase(), enum1);
            }
        }

        /**
         * Busca um Enum {@link Xml} a partir do seu nome, a busca n�o � case
         * sensitive, portanto o nome pode ser escrito ignorando lowercases or
         * uppercases.
         */
        public Xml getXml(String xmlName) {
            return enumsMap.get(xmlName.toLowerCase());
        }
    }

    /**
     * Mascara para a string url de conex�o, onde <tt>"%s"</tt> � substituido
     * pelo valor do cep.
     */
    private static final String URL_STRING = "http://cep.republicavirtual.com.br/web_cep.php?cep=%s&formato=xml";

    /**
     * Carrega o Documento xml a partir do CEP enviado.
     */
    private static Document getDocument(String cep) throws DocumentException, MalformedURLException {
        URL url = new URL(String.format(URL_STRING, cep));
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }

    /**
     * Retorna o elemento principal (root) da arvore XML.
     */
    private static Element getRootElement(String cep) throws DocumentException, MalformedURLException {
        return getDocument(cep).getRootElement();
    }

    /**
     * Encapsula os elementos XML dentro de um objeto
     * <tt>{@link Iterable}<{@link Element}></tt>
     * podendo ser recuperados um a um dentro de um for
     */
    private static IterableElement getElements(String cep) throws DocumentException, MalformedURLException {
        return new IterableElement(getRootElement(cep).elementIterator());
    }

    /**
     * Faz uma busca a partir do cep enviado, no site
     * <a href="http://www.republicavirtual.com.br" target="_blank">republicavirtual.com.br</a>,
     * retornando o resultado em um objeto {@link WebServiceCep}.
     *
     * @param cep
     * @return
     */
    public static WebServiceCep searchCep(String cep) {
        cep = cep.replaceAll("\\D*", "");
        if (cep.length() > 8) {
            cep = cep.substring(0, 8);
        }
        WebServiceCep loadCep = new WebServiceCep(cep) {
        };
        try {
            XmlEnums enums = new XmlEnums();
            try {
                for (Element e : getElements(cep)) {
                    enums.getXml(e.getQualifiedName()).setCep(e.getText(), loadCep);
                }
            } catch (MalformedURLException ex) {
                Flash.error("Erro na busca pelo CEP informado.");
            }
        } catch (DocumentException ex) {
            if (ex.getNestedException() != null && ex.getNestedException() instanceof java.net.UnknownHostException) {
                Flash.error("Site não encontrado.");
                loadCep.setResulCode(-14);
            } else {
                Flash.error("Não foi possivel ler o documento xml.");
                loadCep.setResulCode(-15);
            }
            loadCep.setException(ex);
        }
        return loadCep;
    }

    private int resulCode = -1;
    private String resultText = "Busca não realizada.";
    private String cep = null;
    private String bairro = null;
    private String cidade = null;
    private String logradouro = null;
    private String logradouroType = null;
    private String uf = null;
    private Exception exception;

    /**
     * Privado para que seja invocado apenas através da função searchCep
     */
    private WebServiceCep(String cep) {
        this.cep = cep;
    }

    private void setException(Exception ex) {
        this.exception = ex;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private void setLogradouroType(String logradouroType) {
        this.logradouroType = logradouroType;
    }

    private void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    private void setResulCode(int resultado) {
        this.resulCode = resultado;
    }

    private void setResultText(String resultado_txt) {
        this.resultText = resultado_txt;
    }

    private void setUf(String uf) {
        this.uf = uf;
    }

    public int getResulCode() {
        return resulCode;
    }

    public String getResultText() {
        return resultText;
    }

    public boolean wasSuccessful() {
        return (resulCode == 1 && exception == null);
    }

    public boolean isCepNotFound() {
        return (resulCode == 0);
    }

    public boolean hasException() {
        return (exception != null);
    }

    public Exception getException() {
        return exception;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getLogradouroFull() {
        return (logradouro == null || logradouroType == null) ? null
                : logradouroType + " " + logradouro;
    }

    public String getLogradouroType() {
        return logradouroType;
    }

    public String getCep() {
        return cep;
    }

}
