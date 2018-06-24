/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views;

import app.controllers.HospedeController;
import app.models.Hospede;
import config.Carbon;
import config.Flash;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import resources.views.elementos.HospedeServicos;

/**
 *
 * @author leonardo
 */
public class ContratoHospede extends javax.swing.JDialog {

    private int idHospedeSelecionado;

    private JPanel jpanel;

    private ResultSet resultSet;

    private Hospede hospede;
    private HospedeController hospedeController;

    public ContratoHospede(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);

        this.hospede = new Hospede();
        this.hospedeController = new HospedeController(this.hospede);

        loadTableHospede(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        Body = new javax.swing.JPanel();
        BannerJanela = new javax.swing.JLabel();
        JanelaHospede = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHospede = new javax.swing.JTable();
        FieldsetSearch = new javax.swing.JPanel();
        tfBuscaHospede = new javax.swing.JTextField();
        isNome = new javax.swing.JRadioButton();
        isEmail = new javax.swing.JRadioButton();
        isCpf = new javax.swing.JRadioButton();
        btnPesquisar = new javax.swing.JLabel();
        btnTodosOsContratos = new javax.swing.JLabel();
        btnSelecionarHospede = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelDetalheHospede = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        boardInfoHospede = new javax.swing.JTextPane();
        panel2GrupoDeBotoes = new javax.swing.JPanel();
        btnEditarHospede = new javax.swing.JLabel();
        btnEncerrarContrato = new javax.swing.JLabel();
        btnAddRemoveServicos = new javax.swing.JLabel();
        btnAddRemoveProdutos = new javax.swing.JLabel();
        btnAtualizarJanela = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelStatusHospede = new javax.swing.JLabel();
        labelCpfHospede = new javax.swing.JLabel();
        labelEmailHospede = new javax.swing.JLabel();
        labelNomeHospede = new javax.swing.JLabel();
        btnBuscarContrato = new javax.swing.JLabel();
        titleEmailHospede = new javax.swing.JLabel();
        titleNomeHospede = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Body.setBackground(new java.awt.Color(254, 254, 254));

        BannerJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/banners/contrato-hospede.png"))); // NOI18N

        JanelaHospede.setBackground(new java.awt.Color(254, 254, 254));
        JanelaHospede.setEnabled(false);
        JanelaHospede.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Body, org.jdesktop.beansbinding.ELProperty.create("${background}"), jPanel1, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        TableHospede.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        TableHospede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableHospede);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Body, org.jdesktop.beansbinding.ELProperty.create("${background}"), FieldsetSearch, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        tfBuscaHospede.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        tfBuscaHospede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscaHospedeKeyReleased(evt);
            }
        });

        isNome.setBackground(new java.awt.Color(255, 250, 250));
        buttonGroup1.add(isNome);
        isNome.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        isNome.setText("Nome");

        isEmail.setBackground(new java.awt.Color(255, 250, 250));
        buttonGroup1.add(isEmail);
        isEmail.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        isEmail.setText("E-mail");

        isCpf.setBackground(new java.awt.Color(255, 250, 250));
        buttonGroup1.add(isCpf);
        isCpf.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        isCpf.setSelected(true);
        isCpf.setText("CPF");

        btnPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/buscar-hospede.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });

        btnTodosOsContratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTodosOsContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/todos-contratos.png"))); // NOI18N
        btnTodosOsContratos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodosOsContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodosOsContratosMouseClicked(evt);
            }
        });

        btnSelecionarHospede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelecionarHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/selecionar-hospede.png"))); // NOI18N
        btnSelecionarHospede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionarHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecionarHospedeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FieldsetSearchLayout = new javax.swing.GroupLayout(FieldsetSearch);
        FieldsetSearch.setLayout(FieldsetSearchLayout);
        FieldsetSearchLayout.setHorizontalGroup(
            FieldsetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsetSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FieldsetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldsetSearchLayout.createSequentialGroup()
                        .addComponent(isNome)
                        .addGap(18, 18, 18)
                        .addComponent(isEmail)
                        .addGap(18, 18, 18)
                        .addComponent(isCpf)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldsetSearchLayout.createSequentialGroup()
                        .addComponent(tfBuscaHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldsetSearchLayout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTodosOsContratos)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FieldsetSearchLayout.createSequentialGroup()
                        .addComponent(btnSelecionarHospede)
                        .addGap(123, 123, 123))))
        );
        FieldsetSearchLayout.setVerticalGroup(
            FieldsetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsetSearchLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(tfBuscaHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FieldsetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isNome)
                    .addComponent(isEmail)
                    .addComponent(isCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FieldsetSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTodosOsContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarHospede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Procurar Hóspede");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FieldsetSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FieldsetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        JanelaHospede.addTab("Contratos", jPanel1);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Body, org.jdesktop.beansbinding.ELProperty.create("${background}"), panelDetalheHospede, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        boardInfoHospede.setEditable(false);
        boardInfoHospede.setBackground(new java.awt.Color(254, 254, 254));
        boardInfoHospede.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 243, 248), 2));
        boardInfoHospede.setContentType("text/html\n"); // NOI18N
        boardInfoHospede.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(boardInfoHospede);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Body, org.jdesktop.beansbinding.ELProperty.create("${background}"), panel2GrupoDeBotoes, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        btnEditarHospede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/editar-hospede.png"))); // NOI18N
        btnEditarHospede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarHospedeMouseClicked(evt);
            }
        });

        btnEncerrarContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEncerrarContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/encerrar-contrato.png"))); // NOI18N
        btnEncerrarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncerrarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncerrarContratoMouseClicked(evt);
            }
        });

        btnAddRemoveServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddRemoveServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/adicionar-remover-servicos.png"))); // NOI18N
        btnAddRemoveServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRemoveServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddRemoveServicosMouseClicked(evt);
            }
        });

        btnAddRemoveProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddRemoveProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/adicionar-remover-produtos.png"))); // NOI18N
        btnAddRemoveProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRemoveProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddRemoveProdutosMouseClicked(evt);
            }
        });

        btnAtualizarJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizarJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/atualizar-dados.png"))); // NOI18N
        btnAtualizarJanela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarJanela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarJanelaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2GrupoDeBotoesLayout = new javax.swing.GroupLayout(panel2GrupoDeBotoes);
        panel2GrupoDeBotoes.setLayout(panel2GrupoDeBotoesLayout);
        panel2GrupoDeBotoesLayout.setHorizontalGroup(
            panel2GrupoDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2GrupoDeBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2GrupoDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2GrupoDeBotoesLayout.createSequentialGroup()
                        .addComponent(btnAddRemoveServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddRemoveProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel2GrupoDeBotoesLayout.createSequentialGroup()
                        .addComponent(btnEditarHospede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEncerrarContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarJanela)))
                .addContainerGap())
        );
        panel2GrupoDeBotoesLayout.setVerticalGroup(
            panel2GrupoDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2GrupoDeBotoesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel2GrupoDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditarHospede)
                    .addComponent(btnAtualizarJanela)
                    .addComponent(btnEncerrarContrato, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2GrupoDeBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRemoveServicos)
                    .addComponent(btnAddRemoveProdutos))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel2GrupoDeBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddRemoveProdutos, btnAddRemoveServicos, btnEditarHospede, btnEncerrarContrato});

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Body, org.jdesktop.beansbinding.ELProperty.create("${background}"), jPanel2, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        labelStatusHospede.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        labelStatusHospede.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelStatusHospede.setText("STATUS");

        labelCpfHospede.setText("Cpf");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelEmailHospede, org.jdesktop.beansbinding.ELProperty.create("${background}"), labelCpfHospede, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelEmailHospede, org.jdesktop.beansbinding.ELProperty.create("${font}"), labelCpfHospede, org.jdesktop.beansbinding.BeanProperty.create("font"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelEmailHospede, org.jdesktop.beansbinding.ELProperty.create("${foreground}"), labelCpfHospede, org.jdesktop.beansbinding.BeanProperty.create("foreground"));
        bindingGroup.addBinding(binding);

        labelEmailHospede.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        labelEmailHospede.setForeground(new java.awt.Color(142, 142, 142));
        labelEmailHospede.setText("E-mail");

        labelNomeHospede.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        labelNomeHospede.setForeground(new java.awt.Color(11, 160, 161));
        labelNomeHospede.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(labelEmailHospede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCpfHospede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelStatusHospede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmailHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCpfHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatusHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        btnBuscarContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/buscar-contrato.png"))); // NOI18N
        btnBuscarContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarContratoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDetalheHospedeLayout = new javax.swing.GroupLayout(panelDetalheHospede);
        panelDetalheHospede.setLayout(panelDetalheHospedeLayout);
        panelDetalheHospedeLayout.setHorizontalGroup(
            panelDetalheHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalheHospedeLayout.createSequentialGroup()
                .addGroup(panelDetalheHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                        .addGroup(panelDetalheHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(panel2GrupoDeBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        panelDetalheHospedeLayout.setVerticalGroup(
            panelDetalheHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalheHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                        .addComponent(btnBuscarContrato)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetalheHospedeLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel2GrupoDeBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        JanelaHospede.addTab("Detalhe Hóspede", panelDetalheHospede);

        titleEmailHospede.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        titleEmailHospede.setForeground(new java.awt.Color(142, 142, 142));

        titleNomeHospede.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        titleNomeHospede.setForeground(new java.awt.Color(11, 160, 161));

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addComponent(BannerJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JanelaHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleEmailHospede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleNomeHospede, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BannerJanela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleEmailHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JanelaHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscaHospedeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscaHospedeKeyReleased
        loadTableHospede(null);
    }//GEN-LAST:event_tfBuscaHospedeKeyReleased

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        if (!tfBuscaHospede.getText().trim().equals("")) {
            search(tfBuscaHospede.getText().trim(), this.getColumnSearch());
        } else {
            Flash.error("Hóspede não encontrado");
        }
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnTodosOsContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosOsContratosMouseClicked
        loadTableHospede(this.hospedeController.index());
    }//GEN-LAST:event_btnTodosOsContratosMouseClicked

    private void btnSelecionarHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarHospedeMouseClicked
        int linha = TableHospede.getSelectedRow();
        if (linha >= 0) {
            setSelectedWindow(1);
            loadInfoHospede(Integer.valueOf(TableHospede.getValueAt(linha, 0).toString()));
            loadRestricoes(Integer.valueOf(TableHospede.getValueAt(linha, 0).toString()));
        } else {
            Flash.error("Nenhum hóspede selecionado.");
        }
    }//GEN-LAST:event_btnSelecionarHospedeMouseClicked

    private void btnAddRemoveProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRemoveProdutosMouseClicked
        this.jpanel = new resources.views.elementos.HospedeProdutos(this.idHospedeSelecionado, JanelaHospede);
        JanelaHospede.add("Produtos Hóspede", this.jpanel);
        JanelaHospede.setSelectedComponent(this.jpanel);
    }//GEN-LAST:event_btnAddRemoveProdutosMouseClicked

    private void btnAddRemoveServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRemoveServicosMouseClicked
        this.jpanel = new resources.views.elementos.HospedeServicos(this.idHospedeSelecionado, JanelaHospede);
        JanelaHospede.add("Serviços Hóspede", this.jpanel);
        JanelaHospede.setSelectedComponent(this.jpanel);
    }//GEN-LAST:event_btnAddRemoveServicosMouseClicked

    private void btnEncerrarContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncerrarContratoMouseClicked
        this.jpanel = new resources.views.elementos.EncerrarContrato(this.idHospedeSelecionado, JanelaHospede);
        JanelaHospede.add("Encerrar Contrato Hóspede", this.jpanel);
        JanelaHospede.setSelectedComponent(this.jpanel);
    }//GEN-LAST:event_btnEncerrarContratoMouseClicked

    private void btnEditarHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarHospedeMouseClicked
        this.jpanel = new resources.views.elementos.EditarHospede(this.idHospedeSelecionado, JanelaHospede);
        JanelaHospede.add("Editar Hóspede", this.jpanel);
        JanelaHospede.setSelectedComponent(this.jpanel);
    }//GEN-LAST:event_btnEditarHospedeMouseClicked

    private void btnAtualizarJanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarJanelaMouseClicked
        atualizarJanela();
    }//GEN-LAST:event_btnAtualizarJanelaMouseClicked

    private void btnBuscarContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarContratoMouseClicked
        setSelectedWindow(0);
        titleNomeHospede.setText("");
        titleEmailHospede.setText("");
    }//GEN-LAST:event_btnBuscarContratoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BannerJanela;
    private javax.swing.JPanel Body;
    private javax.swing.JPanel FieldsetSearch;
    private javax.swing.JTabbedPane JanelaHospede;
    private javax.swing.JTable TableHospede;
    private javax.swing.JTextPane boardInfoHospede;
    private javax.swing.JLabel btnAddRemoveProdutos;
    private javax.swing.JLabel btnAddRemoveServicos;
    private javax.swing.JLabel btnAtualizarJanela;
    private javax.swing.JLabel btnBuscarContrato;
    private javax.swing.JLabel btnEditarHospede;
    private javax.swing.JLabel btnEncerrarContrato;
    private javax.swing.JLabel btnPesquisar;
    private javax.swing.JLabel btnSelecionarHospede;
    private javax.swing.JLabel btnTodosOsContratos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton isCpf;
    private javax.swing.JRadioButton isEmail;
    private javax.swing.JRadioButton isNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCpfHospede;
    private javax.swing.JLabel labelEmailHospede;
    private javax.swing.JLabel labelNomeHospede;
    private javax.swing.JLabel labelStatusHospede;
    private javax.swing.JPanel panel2GrupoDeBotoes;
    private javax.swing.JPanel panelDetalheHospede;
    private javax.swing.JTextField tfBuscaHospede;
    private javax.swing.JLabel titleEmailHospede;
    private javax.swing.JLabel titleNomeHospede;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void setSelectedWindow(int index) {
        JanelaHospede.setSelectedIndex(index);
    }

    private void atualizarJanela() {
        loadTableHospede(null);
        loadInfoHospede(this.idHospedeSelecionado);
    }

    private void loadTableHospede(ResultSet rs) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Hospede", "E-mail", "Checkin", "Status"}, 0) {
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
                        rs.getString("email"),
                        Carbon.getDate(rs.getDate("data_inicial"), "dd/MM/yyyy"),
                        labelStatusContrato(rs.getString("status_contrato"))
                    });
                }
            }

            TableHospede.setModel(modelo);

            TableHospede.getColumnModel().getColumn(0).setPreferredWidth(1);
            TableHospede.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableHospede.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableHospede.getColumnModel().getColumn(3).setPreferredWidth(25);
            TableHospede.getColumnModel().getColumn(4).setPreferredWidth(25);

        } catch (SQLException ex) {
            System.out.println("Erro na função loadTable() no model Hospede: " + ex);
        }
    }

    public String labelStatusContrato(String str) {
        if (str.equals("A")) {
            labelStatusHospede.setForeground(new java.awt.Color(108, 187, 216));
            return "Aberto";
        } else {
            labelStatusHospede.setForeground(new java.awt.Color(206, 34, 55));
            return "Fechado";
        }
    }

    public void search(String field, String column) {
        try {
            loadTableHospede(this.hospede.like(column, field, null));
        } catch (Exception ex) {
            System.out.println("Erro na função search() in model Hospede: " + ex);
        }
    }

    private String getColumnSearch() {
        if (isCpf.isSelected()) {
            return "cpf";
        }
        if (isEmail.isSelected()) {
            return "email";
        }
        return "nome";
    }

    private void loadInfoHospede(int id) {

        try {
            this.resultSet = this.hospede.find(id);
            if (this.resultSet.next()) {

                this.idHospedeSelecionado = this.resultSet.getInt("id");

                titleNomeHospede.setText(this.resultSet.getString("nome"));
                titleEmailHospede.setText(this.resultSet.getString("email"));

                labelNomeHospede.setText(this.resultSet.getString("nome"));
                labelEmailHospede.setText(this.resultSet.getString("email"));
                labelCpfHospede.setText(this.resultSet.getString("cpf"));
                labelStatusHospede.setText(labelStatusContrato(this.resultSet.getString("status_contrato")));

                boardInfoHospede.setText("");
                StyledDocument doc = boardInfoHospede.getStyledDocument();
                doc.insertString(0, "DETALHES DO HÓSPEDE:\n\n", null);
                doc.insertString(doc.getLength(), "Endereço:\n", null);
                doc.insertString(doc.getLength(), this.resultSet.getString("logradouro") + ", " + this.resultSet.getString("numero") + "\n", null);
                doc.insertString(doc.getLength(), this.resultSet.getString("bairro") + ", " + this.resultSet.getString("cep") + "\n", null);
                doc.insertString(doc.getLength(), this.resultSet.getString("cidade") + " - " + this.resultSet.getString("estado") + "\n\n", null);

                doc.insertString(doc.getLength(), "Contatos:\n", null);
                doc.insertString(doc.getLength(), this.resultSet.getString("email") + "\n", null);
                doc.insertString(doc.getLength(), this.resultSet.getString("celular") + " - " + this.resultSet.getString("telefone") + "\n\n", null);

                doc.insertString(doc.getLength(), "Contrato:\n", null);
                doc.insertString(doc.getLength(), "Inicio: " + Carbon.getDate(this.resultSet.getDate("data_inicial"), "dd/MM/yyyy") + "\n", null);
                doc.insertString(doc.getLength(), "Final: " + Carbon.getDate(this.resultSet.getDate("data_final"), "dd/MM/yyyy"), null);

            } else {
                setSelectedWindow(0);
                Flash.warning("Oops, ocorreu um problema ao tentar carregar as informações do hóspede");
            }
        } catch (SQLException ex) {
            System.out.println("Erro na função loadInfoHospede(): " + ex);
        } catch (BadLocationException ex) {
            System.out.println("Erro na utilização do StyledDocument()" + ex);
        } catch (Exception ex) {
            System.out.println("Erro na utilização do find() in loadInfoHospede()" + ex);
        }
    }

    private void loadRestricoes(int id) {

        try {
            this.resultSet = this.hospede.find(id);
            if (this.resultSet.next()) {
                if (this.resultSet.getString("status_contrato").equals("F")) {
                    panel2GrupoDeBotoes.setVisible(false);
                }else{
                    panel2GrupoDeBotoes.setVisible(true);
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro na utilização do find() in loadRestricoes()" + ex);
        }

    }
}
