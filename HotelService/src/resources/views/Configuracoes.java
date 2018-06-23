/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views;

import app.controllers.CategoriaProdutoController;
import app.controllers.SistemaController;
import app.controllers.TipoServicoController;
import app.models.CategoriaProduto;
import app.models.Sistema;
import app.models.TipoServico;
import config.App;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import config.Flash;
import config.Helper;

/**
 *
 * @author leonardo
 */
public class Configuracoes extends javax.swing.JDialog {

    // Manipulação dos registros que retornam das consultas MySQL
    private ResultSet resultSet;

    // Utilizando variaveis locais para a manipulação das classes controller e model
    private final TipoServicoController tipoServicoController;
    private final TipoServico tiposervico;
    private final CategoriaProdutoController categoriaProdutoController;
    private final CategoriaProduto categoriaproduto;
    private final SistemaController sistemaController;
    private final Sistema sistema;

    // Controle das ações de cadastrar e modificar da tela
    private boolean action_cadastrar_TipoServico = true;
    private boolean action_modificar_TipoServico = false;
    private boolean action_cadastrar_TipoProduto = true;
    private boolean action_modificar_TipoProduto = false;

    private boolean menu_configuracoes = false;

    /**
     * Creates new form TipoServico
     *
     * @param parent
     * @param modal
     */
    public Configuracoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.panelMenu.setVisible(false);

        this.tiposervico = new TipoServico();
        this.tipoServicoController = new TipoServicoController(this.tiposervico);

        this.categoriaproduto = new CategoriaProduto();
        this.categoriaProdutoController = new CategoriaProdutoController(this.categoriaproduto);
        
        this.sistema = new Sistema();
        this.sistemaController = new SistemaController(this.sistema);

        loadTableTipoServico(this.tipoServicoController.index());
        loadTableTipoProduto(this.categoriaProdutoController.index());
        fillInputsSistema();

        Helper.visible(btnCadastrar_btnEditar_TipoServico, true);
        Helper.visible(btnModificar_btnCancelar_TipoServico, false);
        Helper.visible(btnExcluir_TipoServico, false);

        Helper.visible(btnCadastrar_btnEditar_TipoProduto, true);
        Helper.visible(btnModificar_btnCancelar_TipoProduto, false);
        Helper.visible(btnExcluir_TipoProduto, false);

        action_cadastrar_TipoServico(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar_TipoServico(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
        
        action_cadastrar_TipoProduto(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar_TipoProduto(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAtivo = new javax.swing.ButtonGroup();
        btnGroupTarifacao = new javax.swing.ButtonGroup();
        btnGroupBabysitterPorHora = new javax.swing.ButtonGroup();
        pBody = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AbasPaginas = new javax.swing.JTabbedPane();
        pageGeral = new javax.swing.JPanel();
        jSeparator_Sistema = new javax.swing.JSeparator();
        tfValorTarifacao_Sistema = new javax.swing.JTextField();
        TitlePageActive_Sistema = new javax.swing.JLabel();
        labelValorTarifacao_Sistema = new javax.swing.JLabel();
        btnCadastrar_Sistema = new javax.swing.JPanel();
        nameCadastrar_Sistema = new javax.swing.JLabel();
        labelTarifacao_Sistema = new javax.swing.JLabel();
        rbSimTarifacao_Sistema = new javax.swing.JRadioButton();
        rbNaoTarifacao_Sistema = new javax.swing.JRadioButton();
        labelBabysitterPorHora_Sistema = new javax.swing.JLabel();
        rbSimBabysitterPorHora_Sistema = new javax.swing.JRadioButton();
        rbNaoBabysitterPorHora_Sistema = new javax.swing.JRadioButton();
        labelBabysitterIdadeMinima_Sistema = new javax.swing.JLabel();
        tfBabysitterIdadeMinima_Sistema = new javax.swing.JTextField();
        tfBabysitterIdadeMaxima_Sistema = new javax.swing.JTextField();
        labelBabysitterIdadeMaxima_Sistema = new javax.swing.JLabel();
        pageTipoServico = new javax.swing.JPanel();
        rbSim_TipoServico = new javax.swing.JRadioButton();
        rbNao_TipoServico = new javax.swing.JRadioButton();
        jScrollPane_TipoServico = new javax.swing.JScrollPane();
        tfDescricao_TipoServico = new javax.swing.JTextArea();
        jScrollPane_TipoServico1 = new javax.swing.JScrollPane();
        TableTipoServico = new javax.swing.JTable();
        labelDescricao_TipoServico = new javax.swing.JLabel();
        tfNome_TipoServico = new javax.swing.JTextField();
        labelNome_TipoServico = new javax.swing.JLabel();
        labelAtivo_TipoServico = new javax.swing.JLabel();
        btnCadastrar_btnEditar_TipoServico = new javax.swing.JPanel();
        nameCadastrar_nameEditar_TipoServico = new javax.swing.JLabel();
        btnModificar_btnCancelar_TipoServico = new javax.swing.JPanel();
        nameModificar_nameCancelar_TipoServico = new javax.swing.JLabel();
        btnExcluir_TipoServico = new javax.swing.JPanel();
        nameExcluir_TipoServico = new javax.swing.JLabel();
        btnAddNovo_TipoServico = new javax.swing.JLabel();
        jSeparator_TipoServico = new javax.swing.JSeparator();
        TitlePageActive_TipoServico = new javax.swing.JLabel();
        pageTipoProduto = new javax.swing.JPanel();
        rbSim_TipoProduto = new javax.swing.JRadioButton();
        rbNao_TipoProduto = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfDescricao_TipoProduto = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableTipoProduto = new javax.swing.JTable();
        labelDescricao_TipoProduto = new javax.swing.JLabel();
        tfNome_TipoProduto = new javax.swing.JTextField();
        labelNome_TipoProduto = new javax.swing.JLabel();
        labelAtivo_TipoProduto = new javax.swing.JLabel();
        btnCadastrar_btnEditar_TipoProduto = new javax.swing.JPanel();
        nameCadastrar_nameEditar_TipoProduto = new javax.swing.JLabel();
        btnModificar_btnCancelar_TipoProduto = new javax.swing.JPanel();
        nameModificar_nameCancelar_TipoProduto = new javax.swing.JLabel();
        btnExcluir_TipoProduto = new javax.swing.JPanel();
        nameExcluir_TipoProduto = new javax.swing.JLabel();
        btnAddNovo_TipoProduto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TitlePageActive_TipoProduto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlTituloSecao = new javax.swing.JLabel();
        MenuConfiguracoes = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        itemMenuGeral = new javax.swing.JLabel();
        itemMenuTipoServico = new javax.swing.JLabel();
        itemMenuTipoProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuracoes");

        pBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(240, 241, 246));

        AbasPaginas.setBackground(new java.awt.Color(255, 255, 255));
        AbasPaginas.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        AbasPaginas.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        AbasPaginas.setEnabled(false);

        pageGeral.setBackground(new java.awt.Color(255, 255, 255));

        tfValorTarifacao_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        TitlePageActive_Sistema.setBackground(new java.awt.Color(103, 108, 123));
        TitlePageActive_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 30)); // NOI18N
        TitlePageActive_Sistema.setForeground(App.COLOR_APP);
        TitlePageActive_Sistema.setText("Geral (Sistema)");

        labelValorTarifacao_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelValorTarifacao_Sistema.setText("Valor Tarifação:");

        btnCadastrar_Sistema.setBackground(new java.awt.Color(100, 149, 237));
        btnCadastrar_Sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nameCadastrar_Sistema.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameCadastrar_Sistema.setForeground(new java.awt.Color(255, 255, 255));
        nameCadastrar_Sistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCadastrar_Sistema.setText("Salvar");
        nameCadastrar_Sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameCadastrar_Sistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameCadastrar_SistemaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCadastrar_SistemaLayout = new javax.swing.GroupLayout(btnCadastrar_Sistema);
        btnCadastrar_Sistema.setLayout(btnCadastrar_SistemaLayout);
        btnCadastrar_SistemaLayout.setHorizontalGroup(
            btnCadastrar_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_Sistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        btnCadastrar_SistemaLayout.setVerticalGroup(
            btnCadastrar_SistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_Sistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        labelTarifacao_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelTarifacao_Sistema.setText("Tarifação:");

        rbSimTarifacao_Sistema.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTarifacao.add(rbSimTarifacao_Sistema);
        rbSimTarifacao_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSimTarifacao_Sistema.setText("Sim");

        rbNaoTarifacao_Sistema.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTarifacao.add(rbNaoTarifacao_Sistema);
        rbNaoTarifacao_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNaoTarifacao_Sistema.setText("Não");

        labelBabysitterPorHora_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelBabysitterPorHora_Sistema.setText("Babysitter por hora:");

        rbSimBabysitterPorHora_Sistema.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupBabysitterPorHora.add(rbSimBabysitterPorHora_Sistema);
        rbSimBabysitterPorHora_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSimBabysitterPorHora_Sistema.setText("Sim");

        rbNaoBabysitterPorHora_Sistema.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupBabysitterPorHora.add(rbNaoBabysitterPorHora_Sistema);
        rbNaoBabysitterPorHora_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNaoBabysitterPorHora_Sistema.setText("Não");

        labelBabysitterIdadeMinima_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelBabysitterIdadeMinima_Sistema.setText("Babysitter (idade mímina):");

        tfBabysitterIdadeMinima_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tfBabysitterIdadeMaxima_Sistema.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelBabysitterIdadeMaxima_Sistema.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelBabysitterIdadeMaxima_Sistema.setText("Babysitter (idade máxima):");

        javax.swing.GroupLayout pageGeralLayout = new javax.swing.GroupLayout(pageGeral);
        pageGeral.setLayout(pageGeralLayout);
        pageGeralLayout.setHorizontalGroup(
            pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelValorTarifacao_Sistema)
                    .addComponent(labelTarifacao_Sistema))
                .addGap(18, 18, 18)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageGeralLayout.createSequentialGroup()
                        .addComponent(rbSimTarifacao_Sistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaoTarifacao_Sistema))
                    .addComponent(tfValorTarifacao_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitlePageActive_Sistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pageGeralLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                        .addComponent(labelBabysitterIdadeMinima_Sistema)
                        .addGap(18, 18, 18)
                        .addComponent(tfBabysitterIdadeMinima_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                        .addComponent(labelBabysitterPorHora_Sistema)
                        .addGap(18, 18, 18)
                        .addComponent(rbSimBabysitterPorHora_Sistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaoBabysitterPorHora_Sistema)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                        .addComponent(labelBabysitterIdadeMaxima_Sistema)
                        .addGap(18, 18, 18)
                        .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBabysitterIdadeMaxima_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pageGeralLayout.setVerticalGroup(
            pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageGeralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitlePageActive_Sistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTarifacao_Sistema)
                    .addComponent(rbSimTarifacao_Sistema)
                    .addComponent(rbNaoTarifacao_Sistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorTarifacao_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorTarifacao_Sistema))
                .addGap(18, 18, 18)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBabysitterPorHora_Sistema)
                    .addComponent(rbSimBabysitterPorHora_Sistema)
                    .addComponent(rbNaoBabysitterPorHora_Sistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBabysitterIdadeMinima_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBabysitterIdadeMinima_Sistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pageGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBabysitterIdadeMaxima_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBabysitterIdadeMaxima_Sistema))
                .addGap(51, 51, 51)
                .addComponent(btnCadastrar_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        AbasPaginas.addTab("", pageGeral);

        pageTipoServico.setBackground(new java.awt.Color(255, 255, 255));

        rbSim_TipoServico.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivo.add(rbSim_TipoServico);
        rbSim_TipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSim_TipoServico.setText("Sim");

        rbNao_TipoServico.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivo.add(rbNao_TipoServico);
        rbNao_TipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNao_TipoServico.setText("Não");

        tfDescricao_TipoServico.setColumns(20);
        tfDescricao_TipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfDescricao_TipoServico.setLineWrap(true);
        tfDescricao_TipoServico.setRows(5);
        tfDescricao_TipoServico.setWrapStyleWord(true);
        jScrollPane_TipoServico.setViewportView(tfDescricao_TipoServico);

        TableTipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TableTipoServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Título 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTipoServicoMouseClicked(evt);
            }
        });
        jScrollPane_TipoServico1.setViewportView(TableTipoServico);

        labelDescricao_TipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDescricao_TipoServico.setText("Descrição:");

        tfNome_TipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelNome_TipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNome_TipoServico.setText("Nome:");

        labelAtivo_TipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelAtivo_TipoServico.setText("Ativo:");

        btnCadastrar_btnEditar_TipoServico.setBackground(new java.awt.Color(100, 149, 237));

        nameCadastrar_nameEditar_TipoServico.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameCadastrar_nameEditar_TipoServico.setForeground(new java.awt.Color(255, 255, 255));
        nameCadastrar_nameEditar_TipoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCadastrar_nameEditar_TipoServico.setText("Cadastrar");
        nameCadastrar_nameEditar_TipoServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameCadastrar_nameEditar_TipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameCadastrar_nameEditar_TipoServicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCadastrar_btnEditar_TipoServicoLayout = new javax.swing.GroupLayout(btnCadastrar_btnEditar_TipoServico);
        btnCadastrar_btnEditar_TipoServico.setLayout(btnCadastrar_btnEditar_TipoServicoLayout);
        btnCadastrar_btnEditar_TipoServicoLayout.setHorizontalGroup(
            btnCadastrar_btnEditar_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnCadastrar_btnEditar_TipoServicoLayout.setVerticalGroup(
            btnCadastrar_btnEditar_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar_TipoServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnModificar_btnCancelar_TipoServico.setBackground(new java.awt.Color(113, 106, 202));

        nameModificar_nameCancelar_TipoServico.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameModificar_nameCancelar_TipoServico.setForeground(new java.awt.Color(255, 255, 255));
        nameModificar_nameCancelar_TipoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameModificar_nameCancelar_TipoServico.setText("Modificar Item");
        nameModificar_nameCancelar_TipoServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameModificar_nameCancelar_TipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameModificar_nameCancelar_TipoServicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModificar_btnCancelar_TipoServicoLayout = new javax.swing.GroupLayout(btnModificar_btnCancelar_TipoServico);
        btnModificar_btnCancelar_TipoServico.setLayout(btnModificar_btnCancelar_TipoServicoLayout);
        btnModificar_btnCancelar_TipoServicoLayout.setHorizontalGroup(
            btnModificar_btnCancelar_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnModificar_btnCancelar_TipoServicoLayout.setVerticalGroup(
            btnModificar_btnCancelar_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar_TipoServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnExcluir_TipoServico.setBackground(new java.awt.Color(244, 81, 108));

        nameExcluir_TipoServico.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameExcluir_TipoServico.setForeground(new java.awt.Color(255, 255, 255));
        nameExcluir_TipoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameExcluir_TipoServico.setText("Excluir");
        nameExcluir_TipoServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameExcluir_TipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameExcluir_TipoServicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExcluir_TipoServicoLayout = new javax.swing.GroupLayout(btnExcluir_TipoServico);
        btnExcluir_TipoServico.setLayout(btnExcluir_TipoServicoLayout);
        btnExcluir_TipoServicoLayout.setHorizontalGroup(
            btnExcluir_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnExcluir_TipoServicoLayout.setVerticalGroup(
            btnExcluir_TipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir_TipoServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnAddNovo_TipoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/add-new.png"))); // NOI18N
        btnAddNovo_TipoServico.setToolTipText("Adicionar novo tipo de serviço.");
        btnAddNovo_TipoServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNovo_TipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNovo_TipoServicoMouseClicked(evt);
            }
        });

        TitlePageActive_TipoServico.setBackground(new java.awt.Color(103, 108, 123));
        TitlePageActive_TipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 30)); // NOI18N
        TitlePageActive_TipoServico.setForeground(App.COLOR_APP);
        TitlePageActive_TipoServico.setText("Tipo de Serviço");

        javax.swing.GroupLayout pageTipoServicoLayout = new javax.swing.GroupLayout(pageTipoServico);
        pageTipoServico.setLayout(pageTipoServicoLayout);
        pageTipoServicoLayout.setHorizontalGroup(
            pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageTipoServicoLayout.createSequentialGroup()
                .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome_TipoServico)
                            .addGroup(pageTipoServicoLayout.createSequentialGroup()
                                .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                                        .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTipoServicoLayout.createSequentialGroup()
                                                .addComponent(rbSim_TipoServico)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbNao_TipoServico))
                                            .addComponent(btnCadastrar_btnEditar_TipoServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(btnModificar_btnCancelar_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnExcluir_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelAtivo_TipoServico)
                                    .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane_TipoServico)
                                        .addComponent(labelDescricao_TipoServico)
                                        .addComponent(tfNome_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane_TipoServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pageTipoServicoLayout.createSequentialGroup()
                                .addComponent(TitlePageActive_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddNovo_TipoServico)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pageTipoServicoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar_btnEditar_TipoServico, btnExcluir_TipoServico, btnModificar_btnCancelar_TipoServico});

        pageTipoServicoLayout.setVerticalGroup(
            pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTipoServicoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                        .addComponent(TitlePageActive_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                        .addComponent(btnAddNovo_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pageTipoServicoLayout.createSequentialGroup()
                        .addComponent(labelNome_TipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDescricao_TipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_TipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(labelAtivo_TipoServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSim_TipoServico)
                            .addComponent(rbNao_TipoServico))
                        .addGap(18, 18, 18)
                        .addGroup(pageTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificar_btnCancelar_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar_btnEditar_TipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane_TipoServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pageTipoServicoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar_btnEditar_TipoServico, btnExcluir_TipoServico, btnModificar_btnCancelar_TipoServico});

        AbasPaginas.addTab("", pageTipoServico);

        pageTipoProduto.setBackground(new java.awt.Color(255, 255, 255));

        rbSim_TipoProduto.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivo.add(rbSim_TipoProduto);
        rbSim_TipoProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSim_TipoProduto.setSelected(true);
        rbSim_TipoProduto.setText("Sim");

        rbNao_TipoProduto.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivo.add(rbNao_TipoProduto);
        rbNao_TipoProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNao_TipoProduto.setText("Não");

        tfDescricao_TipoProduto.setColumns(20);
        tfDescricao_TipoProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfDescricao_TipoProduto.setLineWrap(true);
        tfDescricao_TipoProduto.setRows(5);
        tfDescricao_TipoProduto.setWrapStyleWord(true);
        jScrollPane3.setViewportView(tfDescricao_TipoProduto);

        TableTipoProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TableTipoProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Título 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTipoProdutoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableTipoProduto);

        labelDescricao_TipoProduto.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDescricao_TipoProduto.setText("Descrição:");

        tfNome_TipoProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelNome_TipoProduto.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNome_TipoProduto.setText("Nome:");

        labelAtivo_TipoProduto.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelAtivo_TipoProduto.setText("Ativo:");

        btnCadastrar_btnEditar_TipoProduto.setBackground(new java.awt.Color(100, 149, 237));

        nameCadastrar_nameEditar_TipoProduto.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameCadastrar_nameEditar_TipoProduto.setForeground(new java.awt.Color(255, 255, 255));
        nameCadastrar_nameEditar_TipoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCadastrar_nameEditar_TipoProduto.setText("Cadastrar");
        nameCadastrar_nameEditar_TipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameCadastrar_nameEditar_TipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameCadastrar_nameEditar_TipoProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCadastrar_btnEditar_TipoProdutoLayout = new javax.swing.GroupLayout(btnCadastrar_btnEditar_TipoProduto);
        btnCadastrar_btnEditar_TipoProduto.setLayout(btnCadastrar_btnEditar_TipoProdutoLayout);
        btnCadastrar_btnEditar_TipoProdutoLayout.setHorizontalGroup(
            btnCadastrar_btnEditar_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnCadastrar_btnEditar_TipoProdutoLayout.setVerticalGroup(
            btnCadastrar_btnEditar_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar_TipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnModificar_btnCancelar_TipoProduto.setBackground(new java.awt.Color(113, 106, 202));

        nameModificar_nameCancelar_TipoProduto.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameModificar_nameCancelar_TipoProduto.setForeground(new java.awt.Color(255, 255, 255));
        nameModificar_nameCancelar_TipoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameModificar_nameCancelar_TipoProduto.setText("Modificar Item");
        nameModificar_nameCancelar_TipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameModificar_nameCancelar_TipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameModificar_nameCancelar_TipoProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModificar_btnCancelar_TipoProdutoLayout = new javax.swing.GroupLayout(btnModificar_btnCancelar_TipoProduto);
        btnModificar_btnCancelar_TipoProduto.setLayout(btnModificar_btnCancelar_TipoProdutoLayout);
        btnModificar_btnCancelar_TipoProdutoLayout.setHorizontalGroup(
            btnModificar_btnCancelar_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnModificar_btnCancelar_TipoProdutoLayout.setVerticalGroup(
            btnModificar_btnCancelar_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar_TipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnExcluir_TipoProduto.setBackground(new java.awt.Color(244, 81, 108));

        nameExcluir_TipoProduto.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameExcluir_TipoProduto.setForeground(new java.awt.Color(255, 255, 255));
        nameExcluir_TipoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameExcluir_TipoProduto.setText("Excluir");
        nameExcluir_TipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameExcluir_TipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameExcluir_TipoProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExcluir_TipoProdutoLayout = new javax.swing.GroupLayout(btnExcluir_TipoProduto);
        btnExcluir_TipoProduto.setLayout(btnExcluir_TipoProdutoLayout);
        btnExcluir_TipoProdutoLayout.setHorizontalGroup(
            btnExcluir_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnExcluir_TipoProdutoLayout.setVerticalGroup(
            btnExcluir_TipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir_TipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnAddNovo_TipoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/add-new.png"))); // NOI18N
        btnAddNovo_TipoProduto.setToolTipText("Adicionar novo tipo de serviço.");
        btnAddNovo_TipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNovo_TipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNovo_TipoProdutoMouseClicked(evt);
            }
        });

        TitlePageActive_TipoProduto.setBackground(new java.awt.Color(103, 108, 123));
        TitlePageActive_TipoProduto.setFont(new java.awt.Font("Roboto Lt", 0, 30)); // NOI18N
        TitlePageActive_TipoProduto.setForeground(App.COLOR_APP);
        TitlePageActive_TipoProduto.setText("Tipo de Produto");

        javax.swing.GroupLayout pageTipoProdutoLayout = new javax.swing.GroupLayout(pageTipoProduto);
        pageTipoProduto.setLayout(pageTipoProdutoLayout);
        pageTipoProdutoLayout.setHorizontalGroup(
            pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome_TipoProduto)
                            .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                                .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                                        .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTipoProdutoLayout.createSequentialGroup()
                                                .addComponent(rbSim_TipoProduto)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbNao_TipoProduto))
                                            .addComponent(btnCadastrar_btnEditar_TipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(btnModificar_btnCancelar_TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnExcluir_TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelAtivo_TipoProduto)
                                    .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3)
                                        .addComponent(labelDescricao_TipoProduto)
                                        .addComponent(tfNome_TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                                .addComponent(TitlePageActive_TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddNovo_TipoProduto)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pageTipoProdutoLayout.setVerticalGroup(
            pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageTipoProdutoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                        .addComponent(TitlePageActive_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                        .addComponent(btnAddNovo_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pageTipoProdutoLayout.createSequentialGroup()
                        .addComponent(labelNome_TipoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome_TipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDescricao_TipoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(labelAtivo_TipoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSim_TipoProduto)
                            .addComponent(rbNao_TipoProduto))
                        .addGap(18, 18, 18)
                        .addGroup(pageTipoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificar_btnCancelar_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar_btnEditar_TipoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        AbasPaginas.addTab("", pageTipoProduto);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/bg-menu-horizontal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AbasPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(AbasPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jlTituloSecao.setFont(new java.awt.Font("Roboto Th", 3, 30)); // NOI18N
        jlTituloSecao.setForeground(App.COLOR_APP);
        jlTituloSecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloSecao.setText("Configurações");
        jlTituloSecao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        MenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/add-menu.png"))); // NOI18N
        MenuConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuConfiguracoesMouseClicked(evt);
            }
        });

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        itemMenuGeral.setBackground(new java.awt.Color(103, 108, 123));
        itemMenuGeral.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        itemMenuGeral.setForeground(App.COLOR_APP);
        itemMenuGeral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuGeral.setText("Geral");
        itemMenuGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuGeralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuGeralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuGeralMouseExited(evt);
            }
        });

        itemMenuTipoServico.setBackground(new java.awt.Color(103, 108, 123));
        itemMenuTipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        itemMenuTipoServico.setForeground(App.COLOR_APP);
        itemMenuTipoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuTipoServico.setText("Tipo de Serviço");
        itemMenuTipoServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuTipoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuTipoServicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuTipoServicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuTipoServicoMouseExited(evt);
            }
        });

        itemMenuTipoProduto.setBackground(new java.awt.Color(103, 108, 123));
        itemMenuTipoProduto.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        itemMenuTipoProduto.setForeground(App.COLOR_APP);
        itemMenuTipoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuTipoProduto.setText("Tipo de Produto");
        itemMenuTipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuTipoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuTipoProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuTipoProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuTipoProdutoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(itemMenuGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuTipoServico)
                .addGap(18, 18, 18)
                .addComponent(itemMenuTipoProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemMenuGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(itemMenuTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(itemMenuTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {itemMenuGeral, itemMenuTipoServico});

        javax.swing.GroupLayout pBodyLayout = new javax.swing.GroupLayout(pBody);
        pBody.setLayout(pBodyLayout);
        pBodyLayout.setHorizontalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBodyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTituloSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuConfiguracoes)
                .addContainerGap())
        );
        pBodyLayout.setVerticalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTituloSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pBodyLayout.createSequentialGroup()
                        .addGroup(pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(MenuConfiguracoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameCadastrar_nameEditar_TipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameCadastrar_nameEditar_TipoServicoMouseClicked
        if (isValidFormTipoServico()) {

            if (this.action_cadastrar_TipoServico) {
                this.resultSet = this.tipoServicoController.store(requestsInputsTipoServico());
            } else {
                int id = Integer.valueOf(TableTipoServico.getValueAt(TableTipoServico.getSelectedRow(), 0).toString());
                this.resultSet = this.tipoServicoController.update(requestsInputsTipoServico(), id);
            }

            loadTableTipoServico(this.resultSet);

            Helper.visible(btnCadastrar_btnEditar_TipoServico, true);
            Helper.visible(btnModificar_btnCancelar_TipoServico, false);
            Helper.visible(btnExcluir_TipoServico, false);

            action_cadastrar_TipoServico(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoServico(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

            clearInputsTipoServico();
        }
    }//GEN-LAST:event_nameCadastrar_nameEditar_TipoServicoMouseClicked

    private void nameExcluir_TipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameExcluir_TipoServicoMouseClicked
        try {
            int linha = TableTipoServico.getSelectedRow();
            int rowsTable = this.tiposervico.count();

            if (linha >= 0 && linha < rowsTable) {
                if (Flash.confirm("Deseja remover este tipo de serviço?", "warning") == 0) {
                    if (this.tiposervico.haveAny(Integer.valueOf(TableTipoServico.getValueAt(linha, 0).toString()))) {
                        this.resultSet = this.tipoServicoController.delete(Integer.valueOf(TableTipoServico.getValueAt(linha, 0).toString()));
                        loadTableTipoServico(this.resultSet);
                    }
                }
            }

            clearInputsTipoServico();

            Helper.visible(btnCadastrar_btnEditar_TipoServico, true);
            Helper.visible(btnModificar_btnCancelar_TipoServico, false);
            Helper.visible(btnExcluir_TipoServico, false);

            action_cadastrar_TipoServico(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoServico(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        } catch (Exception ex) {
            System.out.println("Function nameExcluirTipoServicoMouseClicked ERROR: " + ex);
        }
    }//GEN-LAST:event_nameExcluir_TipoServicoMouseClicked

    private void nameModificar_nameCancelar_TipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameModificar_nameCancelar_TipoServicoMouseClicked
        if (this.action_modificar_TipoServico) { // EDIÇÃO ATIVADA
            fillInputsTipoServico();

            Helper.visible(this.btnCadastrar_btnEditar_TipoServico, true);
            Helper.visible(this.btnModificar_btnCancelar_TipoServico, true);
            Helper.visible(this.btnExcluir_TipoServico, true);

            action_cadastrar_TipoServico(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar_TipoServico(false, "Cancelar Edição", App.COLOR_BTN_CANCELAR);

        } else { // CANCELAR EDIÇÃO - RESETAR PARA O ESTADO DE CADASTRO
            clearInputsTipoServico();

            Helper.visible(this.btnCadastrar_btnEditar_TipoServico, true);
            Helper.visible(this.btnModificar_btnCancelar_TipoServico, false);
            Helper.visible(this.btnExcluir_TipoServico, false);

            action_cadastrar_TipoServico(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoServico(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        }
    }//GEN-LAST:event_nameModificar_nameCancelar_TipoServicoMouseClicked

    private void TableTipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTipoServicoMouseClicked
        int linha = TableTipoServico.getSelectedRow();
        int rowsTable = this.tiposervico.count();

        if (linha >= 0 && linha < rowsTable) {
            clearInputsTipoServico();

            Helper.visible(btnCadastrar_btnEditar_TipoServico, false);
            Helper.visible(btnModificar_btnCancelar_TipoServico, true);
            Helper.visible(btnExcluir_TipoServico, true);

            action_cadastrar_TipoServico(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar_TipoServico(true, "Modificar Item", App.COLOR_BTN_MODIFICAR);
        }
    }//GEN-LAST:event_TableTipoServicoMouseClicked

    private void btnAddNovo_TipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNovo_TipoServicoMouseClicked
        clearInputsTipoServico();

        Helper.visible(btnCadastrar_btnEditar_TipoServico, true);
        Helper.visible(btnModificar_btnCancelar_TipoServico, false);
        Helper.visible(btnExcluir_TipoServico, false);

        action_cadastrar_TipoServico(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar_TipoServico(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
    }//GEN-LAST:event_btnAddNovo_TipoServicoMouseClicked

    private void MenuConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuConfiguracoesMouseClicked
        if (this.menu_configuracoes) {
            this.panelMenu.setVisible(true);
            Helper.hoverImage(MenuConfiguracoes, "/resources/images/png/close-menu.png", this.getClass());
            this.menu_configuracoes = false;
        } else {
            this.panelMenu.setVisible(false);
            Helper.hoverImage(MenuConfiguracoes, "/resources/images/png/add-menu.png", this.getClass());
            this.menu_configuracoes = true;
        }
    }//GEN-LAST:event_MenuConfiguracoesMouseClicked

    private void itemMenuTipoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoServicoMouseClicked
        AbasPaginas.setSelectedIndex(1);
    }//GEN-LAST:event_itemMenuTipoServicoMouseClicked

    private void itemMenuGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuGeralMouseClicked
        AbasPaginas.setSelectedIndex(0);
    }//GEN-LAST:event_itemMenuGeralMouseClicked

    private void itemMenuTipoServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoServicoMouseEntered
        Helper.hoverLabel(this.itemMenuTipoServico, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuTipoServicoMouseEntered

    private void itemMenuTipoServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoServicoMouseExited
        Helper.hoverLabel(this.itemMenuTipoServico, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuTipoServicoMouseExited

    private void itemMenuGeralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuGeralMouseEntered
        Helper.hoverLabel(this.itemMenuGeral, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuGeralMouseEntered

    private void itemMenuGeralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuGeralMouseExited
        Helper.hoverLabel(this.itemMenuGeral, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuGeralMouseExited

    private void itemMenuTipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoProdutoMouseClicked
        AbasPaginas.setSelectedIndex(2);
    }//GEN-LAST:event_itemMenuTipoProdutoMouseClicked

    private void itemMenuTipoProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoProdutoMouseEntered
        Helper.hoverLabel(this.itemMenuTipoProduto, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuTipoProdutoMouseEntered

    private void itemMenuTipoProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuTipoProdutoMouseExited
        Helper.hoverLabel(this.itemMenuTipoProduto, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuTipoProdutoMouseExited

    /**
     *
     * TIPO PRODUTO
     * ---------------------------------------------------------------------------
     *
     */

    private void TableTipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTipoProdutoMouseClicked
        int linha = TableTipoProduto.getSelectedRow();
        int rowsTable = this.categoriaproduto.count();

        if (linha >= 0 && linha < rowsTable) {
            clearInputsTipoProduto();

            Helper.visible(btnCadastrar_btnEditar_TipoProduto, false);
            Helper.visible(btnModificar_btnCancelar_TipoProduto, true);
            Helper.visible(btnExcluir_TipoProduto, true);

            action_cadastrar_TipoProduto(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar_TipoProduto(true, "Modificar Item", App.COLOR_BTN_MODIFICAR);
        }
    }//GEN-LAST:event_TableTipoProdutoMouseClicked

    private void nameCadastrar_nameEditar_TipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameCadastrar_nameEditar_TipoProdutoMouseClicked
        if (isValidFormTipoProduto()) {

            if (this.action_cadastrar_TipoProduto) {
                this.resultSet = this.categoriaProdutoController.store(requestsInputsTipoProduto());
            } else {
                int id = Integer.valueOf(TableTipoProduto.getValueAt(TableTipoProduto.getSelectedRow(), 0).toString());
                this.resultSet = this.categoriaProdutoController.update(requestsInputsTipoProduto(), id);
            }

            loadTableTipoProduto(this.resultSet);
            clearInputsTipoProduto();

            Helper.visible(btnCadastrar_btnEditar_TipoProduto, true);
            Helper.visible(btnModificar_btnCancelar_TipoProduto, false);
            Helper.visible(btnExcluir_TipoProduto, false);

            action_cadastrar_TipoProduto(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoProduto(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
        }
    }//GEN-LAST:event_nameCadastrar_nameEditar_TipoProdutoMouseClicked

    private void nameModificar_nameCancelar_TipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameModificar_nameCancelar_TipoProdutoMouseClicked
        if (this.action_modificar_TipoProduto) { // EDIÇÃO ATIVADA
            fillInputsTipoProduto();

            Helper.visible(this.btnCadastrar_btnEditar_TipoProduto, true);
            Helper.visible(this.btnModificar_btnCancelar_TipoProduto, true);
            Helper.visible(this.btnExcluir_TipoProduto, true);

            action_cadastrar_TipoProduto(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar_TipoProduto(false, "Cancelar Edição", App.COLOR_BTN_CANCELAR);

        } else { // CANCELAR EDIÇÃO - RESETAR PARA O ESTADO DE CADASTRO
            clearInputsTipoProduto();

            Helper.visible(this.btnCadastrar_btnEditar_TipoProduto, true);
            Helper.visible(this.btnModificar_btnCancelar_TipoProduto, false);
            Helper.visible(this.btnExcluir_TipoProduto, false);

            action_cadastrar_TipoProduto(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoProduto(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        }
    }//GEN-LAST:event_nameModificar_nameCancelar_TipoProdutoMouseClicked

    private void nameExcluir_TipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameExcluir_TipoProdutoMouseClicked
        try {
            int linha = TableTipoProduto.getSelectedRow();
            int rowsTable = this.categoriaproduto.count();

            if (linha >= 0 && linha < rowsTable) {
                if (Flash.confirm("Deseja remover essa categoria de produto?", "warning") == 0) {
                    if (this.categoriaproduto.haveAny(Integer.valueOf(TableTipoProduto.getValueAt(linha, 0).toString()))) {
                        this.resultSet = this.categoriaProdutoController.delete(Integer.valueOf(TableTipoProduto.getValueAt(linha, 0).toString()));
                        loadTableTipoProduto(this.resultSet);
                    }
                }
            }

            clearInputsTipoProduto();

            Helper.visible(btnCadastrar_btnEditar_TipoProduto, true);
            Helper.visible(btnModificar_btnCancelar_TipoProduto, false);
            Helper.visible(btnExcluir_TipoProduto, false);

            action_cadastrar_TipoProduto(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar_TipoProduto(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        } catch (Exception ex) {
            System.out.println("Function nameExcluirTipoProdutoMouseClicked ERROR: " + ex);
        }
    }//GEN-LAST:event_nameExcluir_TipoProdutoMouseClicked

    private void btnAddNovo_TipoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNovo_TipoProdutoMouseClicked
        clearInputsTipoProduto();

        Helper.visible(btnCadastrar_btnEditar_TipoProduto, true);
        Helper.visible(btnModificar_btnCancelar_TipoProduto, false);
        Helper.visible(btnExcluir_TipoProduto, false);

        action_cadastrar_TipoProduto(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar_TipoProduto(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
    }//GEN-LAST:event_btnAddNovo_TipoProdutoMouseClicked

    /**
     *
     * TIPO PRODUTO
     * ---------------------------------------------------------------------------
     *
     */
    private void nameCadastrar_SistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameCadastrar_SistemaMouseClicked
        if (isValidFormSistema()) {
            this.sistemaController.update(requestsInputsSistema(), 1);
            fillInputsSistema();
        }
    }//GEN-LAST:event_nameCadastrar_SistemaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AbasPaginas;
    private javax.swing.JLabel MenuConfiguracoes;
    private javax.swing.JTable TableTipoProduto;
    private javax.swing.JTable TableTipoServico;
    private javax.swing.JLabel TitlePageActive_Sistema;
    private javax.swing.JLabel TitlePageActive_TipoProduto;
    private javax.swing.JLabel TitlePageActive_TipoServico;
    private javax.swing.JLabel btnAddNovo_TipoProduto;
    private javax.swing.JLabel btnAddNovo_TipoServico;
    private javax.swing.JPanel btnCadastrar_Sistema;
    private javax.swing.JPanel btnCadastrar_btnEditar_TipoProduto;
    private javax.swing.JPanel btnCadastrar_btnEditar_TipoServico;
    private javax.swing.JPanel btnExcluir_TipoProduto;
    private javax.swing.JPanel btnExcluir_TipoServico;
    private javax.swing.ButtonGroup btnGroupAtivo;
    private javax.swing.ButtonGroup btnGroupBabysitterPorHora;
    private javax.swing.ButtonGroup btnGroupTarifacao;
    private javax.swing.JPanel btnModificar_btnCancelar_TipoProduto;
    private javax.swing.JPanel btnModificar_btnCancelar_TipoServico;
    private javax.swing.JLabel itemMenuGeral;
    private javax.swing.JLabel itemMenuTipoProduto;
    private javax.swing.JLabel itemMenuTipoServico;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane_TipoServico;
    private javax.swing.JScrollPane jScrollPane_TipoServico1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator_Sistema;
    private javax.swing.JSeparator jSeparator_TipoServico;
    private javax.swing.JLabel jlTituloSecao;
    private javax.swing.JLabel labelAtivo_TipoProduto;
    private javax.swing.JLabel labelAtivo_TipoServico;
    private javax.swing.JLabel labelBabysitterIdadeMaxima_Sistema;
    private javax.swing.JLabel labelBabysitterIdadeMinima_Sistema;
    private javax.swing.JLabel labelBabysitterPorHora_Sistema;
    private javax.swing.JLabel labelDescricao_TipoProduto;
    private javax.swing.JLabel labelDescricao_TipoServico;
    private javax.swing.JLabel labelNome_TipoProduto;
    private javax.swing.JLabel labelNome_TipoServico;
    private javax.swing.JLabel labelTarifacao_Sistema;
    private javax.swing.JLabel labelValorTarifacao_Sistema;
    private javax.swing.JLabel nameCadastrar_Sistema;
    private javax.swing.JLabel nameCadastrar_nameEditar_TipoProduto;
    private javax.swing.JLabel nameCadastrar_nameEditar_TipoServico;
    private javax.swing.JLabel nameExcluir_TipoProduto;
    private javax.swing.JLabel nameExcluir_TipoServico;
    private javax.swing.JLabel nameModificar_nameCancelar_TipoProduto;
    private javax.swing.JLabel nameModificar_nameCancelar_TipoServico;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pageGeral;
    private javax.swing.JPanel pageTipoProduto;
    private javax.swing.JPanel pageTipoServico;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JRadioButton rbNaoBabysitterPorHora_Sistema;
    private javax.swing.JRadioButton rbNaoTarifacao_Sistema;
    private javax.swing.JRadioButton rbNao_TipoProduto;
    private javax.swing.JRadioButton rbNao_TipoServico;
    private javax.swing.JRadioButton rbSimBabysitterPorHora_Sistema;
    private javax.swing.JRadioButton rbSimTarifacao_Sistema;
    private javax.swing.JRadioButton rbSim_TipoProduto;
    private javax.swing.JRadioButton rbSim_TipoServico;
    private javax.swing.JTextField tfBabysitterIdadeMaxima_Sistema;
    private javax.swing.JTextField tfBabysitterIdadeMinima_Sistema;
    private javax.swing.JTextArea tfDescricao_TipoProduto;
    private javax.swing.JTextArea tfDescricao_TipoServico;
    private javax.swing.JTextField tfNome_TipoProduto;
    private javax.swing.JTextField tfNome_TipoServico;
    private javax.swing.JTextField tfValorTarifacao_Sistema;
    // End of variables declaration//GEN-END:variables

    /**
     * --------------------------------------------------------------------------------------------------------------------------
     *
     * @return TIPO SERVICO
     * --------------------------------------------------------------------------------------------------------------------------
     */
    private Object[] requestsInputsTipoServico() {
        Object[] dados = {
            tfNome_TipoServico.getText().toUpperCase().trim(),
            tfDescricao_TipoServico.getText().trim(),
            (rbSim_TipoServico.isSelected()) ? 1 : 0
        };
        return dados;
    }

    private void clearInputsTipoServico() {
        tfNome_TipoServico.setText("");
        tfDescricao_TipoServico.setText("");
        rbSim_TipoServico.setSelected(false);
        rbNao_TipoServico.setSelected(false);
    }

    private boolean isValidFormTipoServico() {
        return (this.tiposervico.setNome(tfNome_TipoServico.getText())
                && this.tiposervico.setDescricao(tfDescricao_TipoServico.getText())
                && this.tiposervico.setAtivo(rbSim_TipoServico.isSelected(), rbNao_TipoServico.isSelected()));
    }

    private void fillInputsTipoServico() {
        try {
            int id = Integer.valueOf(TableTipoServico.getValueAt(TableTipoServico.getSelectedRow(), 0).toString());
            this.resultSet = this.tipoServicoController.show(id);
            if (this.resultSet != null) {
                tfNome_TipoServico.setText(this.resultSet.getString("nome"));
                tfDescricao_TipoServico.setText(this.resultSet.getString("descricao"));
                if (this.resultSet.getInt("ativo") == 1) {
                    this.rbSim_TipoServico.setSelected(true);
                    this.rbNao_TipoServico.setSelected(false);
                } else {
                    this.rbSim_TipoServico.setSelected(false);
                    this.rbNao_TipoServico.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Function fillInputsTipoServico() ERROR: " + ex);
        }
    }

    private void loadTableTipoServico(ResultSet rs) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Ativo"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            if (rs != null) {
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nome"),
                        (rs.getInt("ativo") == 1) ? "Sim" : "Não"
                    });
                }
            }

            TableTipoServico.setModel(modelo);

            TableTipoServico.getColumnModel().getColumn(0).setPreferredWidth(1);
            TableTipoServico.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableTipoServico.getColumnModel().getColumn(2).setPreferredWidth(1);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void action_cadastrar_TipoServico(boolean status, String btn, Color color) {
        this.action_cadastrar_TipoServico = status;
        this.nameCadastrar_nameEditar_TipoServico.setText(btn);
        this.btnCadastrar_btnEditar_TipoServico.setBackground(color);
    }

    private void action_modificar_TipoServico(boolean status, String btn, Color color) {
        this.action_modificar_TipoServico = status;
        this.nameModificar_nameCancelar_TipoServico.setText(btn);
        this.btnModificar_btnCancelar_TipoServico.setBackground(color);
    }

    /**
     * --------------------------------------------------------------------------------------------------------------------------
     *
     * TIPO PRODUTO
     * --------------------------------------------------------------------------------------------------------------------------
     */
    private Object[] requestsInputsTipoProduto() {
        Object[] dados = {
            tfNome_TipoProduto.getText().toUpperCase().trim(),
            tfDescricao_TipoProduto.getText().trim(),
            (rbSim_TipoProduto.isSelected()) ? 1 : 0
        };
        return dados;
    }

    private void clearInputsTipoProduto() {
        tfNome_TipoProduto.setText("");
        tfDescricao_TipoProduto.setText("");
        rbSim_TipoProduto.setSelected(false);
        rbNao_TipoProduto.setSelected(false);
    }

    private boolean isValidFormTipoProduto() {
        return (this.categoriaproduto.setNome(tfNome_TipoProduto.getText())
                && this.categoriaproduto.setDescricao(tfDescricao_TipoProduto.getText())
                && this.categoriaproduto.setAtivo(rbSim_TipoProduto.isSelected(), rbNao_TipoProduto.isSelected()));
    }

    private void fillInputsTipoProduto() {
        try {
            int id = Integer.valueOf(TableTipoProduto.getValueAt(TableTipoProduto.getSelectedRow(), 0).toString());
            this.resultSet = this.categoriaProdutoController.show(id);
            if (this.resultSet != null) {
                tfNome_TipoProduto.setText(this.resultSet.getString("nome"));
                tfDescricao_TipoProduto.setText(this.resultSet.getString("descricao"));
                if (this.resultSet.getInt("ativo") == 1) {
                    this.rbSim_TipoProduto.setSelected(true);
                    this.rbNao_TipoProduto.setSelected(false);
                } else {
                    this.rbSim_TipoProduto.setSelected(false);
                    this.rbNao_TipoProduto.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Function fillInputsTipoProduto() ERROR: " + ex);
        }
    }

    private void loadTableTipoProduto(ResultSet rs) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Ativo"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            if (rs != null) {
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nome"),
                        (rs.getInt("ativo") == 1) ? "Sim" : "Não"
                    });
                }
            }

            TableTipoProduto.setModel(modelo);

            TableTipoProduto.getColumnModel().getColumn(0).setPreferredWidth(1);
            TableTipoProduto.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableTipoProduto.getColumnModel().getColumn(2).setPreferredWidth(1);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void action_cadastrar_TipoProduto(boolean status, String btn, Color color) {
        this.action_cadastrar_TipoProduto = status;
        this.nameCadastrar_nameEditar_TipoProduto.setText(btn);
        this.btnCadastrar_btnEditar_TipoProduto.setBackground(color);
    }

    private void action_modificar_TipoProduto(boolean status, String btn, Color color) {
        this.action_modificar_TipoProduto = status;
        this.nameModificar_nameCancelar_TipoProduto.setText(btn);
        this.btnModificar_btnCancelar_TipoProduto.setBackground(color);
    }

    /**
     * --------------------------------------------------------------------------------------------------------------------------
     *
     * SERVIÇO
     * --------------------------------------------------------------------------------------------------------------------------
     */
    private Object[] requestsInputsSistema() {
        Object[] dados = {
            (rbSimTarifacao_Sistema.isSelected()) ? 1 : 0,
            tfValorTarifacao_Sistema.getText().trim(),
            (rbSimBabysitterPorHora_Sistema.isSelected()) ? 1 : 0,
            tfBabysitterIdadeMinima_Sistema.getText().trim(),
            tfBabysitterIdadeMaxima_Sistema.getText().trim()
        };
        return dados;
    }

    private boolean isValidFormSistema() {
        return (this.sistema.setTarifacao(rbSimTarifacao_Sistema.isSelected(), rbNaoTarifacao_Sistema.isSelected())
                && this.sistema.setValorTarifacao(tfValorTarifacao_Sistema.getText().trim())
                && this.sistema.setTarifacao(rbSimBabysitterPorHora_Sistema.isSelected(), rbNaoBabysitterPorHora_Sistema.isSelected())
                && this.sistema.setBabysitterIdadeMin(tfBabysitterIdadeMinima_Sistema.getText().trim())
                && this.sistema.setBabysitterIdadeMax(tfBabysitterIdadeMaxima_Sistema.getText().trim()));
    }

    private void fillInputsSistema() {
        try {
            this.resultSet = this.sistemaController.show(1);
            if (this.resultSet != null) {
                if (this.resultSet.getInt("tarifacao") == 1) {
                    this.rbSimTarifacao_Sistema.setSelected(true);
                    this.rbNaoTarifacao_Sistema.setSelected(false);
                } else {
                    this.rbSimTarifacao_Sistema.setSelected(false);
                    this.rbNaoTarifacao_Sistema.setSelected(true);
                }
                if (this.resultSet.getInt("babysitter_por_hora") == 1) {
                    this.rbSimBabysitterPorHora_Sistema.setSelected(true);
                    this.rbNaoBabysitterPorHora_Sistema.setSelected(false);
                } else {
                    this.rbSimBabysitterPorHora_Sistema.setSelected(false);
                    this.rbNaoBabysitterPorHora_Sistema.setSelected(true);
                }
                
                tfValorTarifacao_Sistema.setText(String.valueOf(this.resultSet.getDouble("valor_tarifacao")));
                tfBabysitterIdadeMinima_Sistema.setText(String.valueOf(this.resultSet.getInt("babysitter_idade_min")));
                tfBabysitterIdadeMaxima_Sistema.setText(String.valueOf(this.resultSet.getInt("babysitter_idade_max")));
                
            }
        } catch (SQLException ex) {
            System.out.println("Function fillInputsSistema() ERROR: " + ex);
        }
    }

}
