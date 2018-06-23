/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views;

import app.controllers.ProdutoController;
import app.models.CategoriaProduto;
import app.models.Produtos;
import config.App;
import config.Flash;
import config.Helper;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import vendor.interfaces.Views;

/**
 *
 * @author LEONARDO
 */
public final class Produto extends javax.swing.JDialog implements Views {

    // Manipulação dos registros que retornam das consultas MySQL
    private ResultSet resultSet;

    // Utilizando variaveis locais para a manipulação das classes controller e model
    private final Produtos produtos;
    private final CategoriaProduto categoriaproduto = new CategoriaProduto();
    private final ProdutoController produtoController;

    // Controle das ações de cadastrar e modificar da tela PRODUTO
    private boolean action_cadastrar = true;
    private boolean action_modificar = false;

    private final int[] categoria_produto_id;


    /**
     * Creates new form Produto
     * @param parent
     * @param modal
     */
    public Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.produtos = new Produtos();
        this.produtoController = new ProdutoController(this.produtos);

        this.categoria_produto_id = new int[this.categoriaproduto.count()];
        loadComboBox();
        loadTable(this.produtoController.index());

        Helper.visible(btnCadastrar_btnEditar, true);
        Helper.visible(btnModificar_btnCancelar, false);
        Helper.visible(btnExcluir, false);

        action_cadastrar(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAtivoProduto = new javax.swing.ButtonGroup();
        pBody = new javax.swing.JPanel();
        panelDivisoriaBody = new javax.swing.JPanel();
        imageDivisoria = new javax.swing.JLabel();
        pageServico = new javax.swing.JPanel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProduto = new javax.swing.JTable();
        labelDescricao = new javax.swing.JLabel();
        labelCategoriaProduto = new javax.swing.JLabel();
        labelAtivo = new javax.swing.JLabel();
        btnCadastrar_btnEditar = new javax.swing.JPanel();
        nameCadastrar_nameEditar = new javax.swing.JLabel();
        btnModificar_btnCancelar = new javax.swing.JPanel();
        nameModificar_nameCancelar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JPanel();
        nameExcluir = new javax.swing.JLabel();
        tfCategoriaProduto = new javax.swing.JComboBox<>();
        labelPreco = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        tfPreco = new javax.swing.JTextField();
        tfSearchTable = new javax.swing.JTextField();
        labelPesquisar = new javax.swing.JLabel();
        labelNomeServico1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfNome = new javax.swing.JTextArea();
        labelTituloSecao = new javax.swing.JLabel();
        btnAddNovo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pBody.setBackground(new java.awt.Color(255, 255, 255));

        panelDivisoriaBody.setBackground(new java.awt.Color(240, 241, 246));

        imageDivisoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/bg-menu-horizontal.png"))); // NOI18N

        pageServico.setBackground(new java.awt.Color(255, 255, 255));

        rbSim.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivoProduto.add(rbSim);
        rbSim.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSim.setSelected(true);
        rbSim.setText("Sim");

        rbNao.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupAtivoProduto.add(rbNao);
        rbNao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNao.setText("Não");

        TableProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TableProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        TableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProduto);

        labelDescricao.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        labelCategoriaProduto.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelCategoriaProduto.setText("Categoria Produto:");

        labelAtivo.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelAtivo.setText("Ativo:");

        btnCadastrar_btnEditar.setBackground(new java.awt.Color(100, 149, 237));

        nameCadastrar_nameEditar.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameCadastrar_nameEditar.setForeground(new java.awt.Color(255, 255, 255));
        nameCadastrar_nameEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameCadastrar_nameEditar.setText("Cadastrar");
        nameCadastrar_nameEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameCadastrar_nameEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameCadastrar_nameEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCadastrar_btnEditarLayout = new javax.swing.GroupLayout(btnCadastrar_btnEditar);
        btnCadastrar_btnEditar.setLayout(btnCadastrar_btnEditarLayout);
        btnCadastrar_btnEditarLayout.setHorizontalGroup(
            btnCadastrar_btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnCadastrar_btnEditarLayout.setVerticalGroup(
            btnCadastrar_btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameCadastrar_nameEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnModificar_btnCancelar.setBackground(new java.awt.Color(113, 106, 202));

        nameModificar_nameCancelar.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameModificar_nameCancelar.setForeground(new java.awt.Color(255, 255, 255));
        nameModificar_nameCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameModificar_nameCancelar.setText("Modificar Item");
        nameModificar_nameCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameModificar_nameCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameModificar_nameCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModificar_btnCancelarLayout = new javax.swing.GroupLayout(btnModificar_btnCancelar);
        btnModificar_btnCancelar.setLayout(btnModificar_btnCancelarLayout);
        btnModificar_btnCancelarLayout.setHorizontalGroup(
            btnModificar_btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnModificar_btnCancelarLayout.setVerticalGroup(
            btnModificar_btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameModificar_nameCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnExcluir.setBackground(new java.awt.Color(244, 81, 108));

        nameExcluir.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        nameExcluir.setForeground(new java.awt.Color(255, 255, 255));
        nameExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameExcluir.setText("Excluir");
        nameExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExcluirLayout = new javax.swing.GroupLayout(btnExcluir);
        btnExcluir.setLayout(btnExcluirLayout);
        btnExcluirLayout.setHorizontalGroup(
            btnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnExcluirLayout.setVerticalGroup(
            btnExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tfCategoriaProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelPreco.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelPreco.setText("Preço:");

        tfDescricao.setColumns(20);
        tfDescricao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfDescricao.setLineWrap(true);
        tfDescricao.setRows(5);
        tfDescricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tfDescricao);

        tfPreco.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tfSearchTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfSearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchTableKeyReleased(evt);
            }
        });

        labelPesquisar.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelPesquisar.setText("Pesquisar:");

        labelNomeServico1.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNomeServico1.setText("Produto:");

        tfNome.setColumns(20);
        tfNome.setLineWrap(true);
        tfNome.setRows(3);
        tfNome.setWrapStyleWord(true);
        jScrollPane3.setViewportView(tfNome);

        javax.swing.GroupLayout pageServicoLayout = new javax.swing.GroupLayout(pageServico);
        pageServico.setLayout(pageServicoLayout);
        pageServicoLayout.setHorizontalGroup(
            pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageServicoLayout.createSequentialGroup()
                .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pageServicoLayout.createSequentialGroup()
                        .addComponent(labelPesquisar)
                        .addGap(17, 17, 17)
                        .addComponent(tfSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageServicoLayout.createSequentialGroup()
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pageServicoLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(btnCadastrar_btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(btnModificar_btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pageServicoLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNomeServico1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pageServicoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pageServicoLayout.createSequentialGroup()
                                        .addComponent(labelCategoriaProduto)
                                        .addGap(10, 10, 10)
                                        .addComponent(tfCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pageServicoLayout.createSequentialGroup()
                                            .addComponent(labelDescricao)
                                            .addGap(6, 6, 6)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pageServicoLayout.createSequentialGroup()
                                            .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pageServicoLayout.createSequentialGroup()
                                                    .addGap(30, 30, 30)
                                                    .addComponent(labelPreco)
                                                    .addGap(5, 5, 5))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageServicoLayout.createSequentialGroup()
                                                    .addComponent(labelAtivo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pageServicoLayout.createSequentialGroup()
                                                    .addComponent(rbSim)
                                                    .addGap(14, 14, 14)
                                                    .addComponent(rbNao))))))))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        pageServicoLayout.setVerticalGroup(
            pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pageServicoLayout.createSequentialGroup()
                .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageServicoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pageServicoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelPesquisar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pageServicoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageServicoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelCategoriaProduto))
                            .addComponent(tfCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeServico1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageServicoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelPreco))
                            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbSim)
                                .addComponent(labelAtivo))
                            .addComponent(rbNao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pageServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificar_btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar_btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDivisoriaBodyLayout = new javax.swing.GroupLayout(panelDivisoriaBody);
        panelDivisoriaBody.setLayout(panelDivisoriaBodyLayout);
        panelDivisoriaBodyLayout.setHorizontalGroup(
            panelDivisoriaBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDivisoriaBodyLayout.createSequentialGroup()
                .addGroup(panelDivisoriaBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDivisoriaBodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pageServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(481, 481, 481))
        );
        panelDivisoriaBodyLayout.setVerticalGroup(
            panelDivisoriaBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDivisoriaBodyLayout.createSequentialGroup()
                .addComponent(imageDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTituloSecao.setFont(new java.awt.Font("Roboto Th", 3, 30)); // NOI18N
        labelTituloSecao.setForeground(App.COLOR_APP);
        labelTituloSecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloSecao.setText("Produtos");
        labelTituloSecao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAddNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/add-new.png"))); // NOI18N
        btnAddNovo.setToolTipText("Adicionar novo tipo de serviço.");
        btnAddNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNovoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pBodyLayout = new javax.swing.GroupLayout(pBody);
        pBody.setLayout(pBodyLayout);
        pBodyLayout.setHorizontalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTituloSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddNovo)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBodyLayout.createSequentialGroup()
                .addComponent(panelDivisoriaBody, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pBodyLayout.setVerticalGroup(
            pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(labelTituloSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDivisoriaBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProdutoMouseClicked
        int linha = TableProduto.getSelectedRow();
        int rowsTable = this.produtos.count();

        if (linha >= 0 && linha < rowsTable) {
            clearInputs();

            Helper.visible(btnCadastrar_btnEditar, false);
            Helper.visible(btnModificar_btnCancelar, true);
            Helper.visible(btnExcluir, true);

            action_cadastrar(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar(true, "Modificar Item", App.COLOR_BTN_MODIFICAR);
        }
    }//GEN-LAST:event_TableProdutoMouseClicked

    private void nameCadastrar_nameEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameCadastrar_nameEditarMouseClicked
        if (isValidForm()) {

            if (this.action_cadastrar) {
                this.resultSet = this.produtoController.store(requestsInputs());
            } else {
                int id = Integer.valueOf(TableProduto.getValueAt(TableProduto.getSelectedRow(), 0).toString());
                this.resultSet = produtoController.update(requestsInputs(), id);
            }

            loadTable(this.resultSet);
            clearInputs();

            Helper.visible(btnCadastrar_btnEditar, true);
            Helper.visible(btnModificar_btnCancelar, false);
            Helper.visible(btnExcluir, false);

            action_cadastrar(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        }
    }//GEN-LAST:event_nameCadastrar_nameEditarMouseClicked

    private void nameModificar_nameCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameModificar_nameCancelarMouseClicked
        if (this.action_modificar) { // EDIÇÃO ATIVADA
            fillInputs();

            Helper.visible(this.btnCadastrar_btnEditar, true);
            Helper.visible(this.btnModificar_btnCancelar, true);
            Helper.visible(this.btnExcluir, true);

            action_cadastrar(false, "Editar", App.COLOR_BTN_EDITAR);
            action_modificar(false, "Cancelar Edição", App.COLOR_BTN_CANCELAR);

        } else { // CANCELAR EDIÇÃO - RESETAR PARA O ESTADO DE CADASTRO
            clearInputs();

            Helper.visible(this.btnCadastrar_btnEditar, true);
            Helper.visible(this.btnModificar_btnCancelar, false);
            Helper.visible(this.btnExcluir, false);

            action_cadastrar(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        }
    }//GEN-LAST:event_nameModificar_nameCancelarMouseClicked

    private void nameExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameExcluirMouseClicked
        try {
            int linha = TableProduto.getSelectedRow();
            int rowsTable = this.produtos.count();

            if (linha >= 0 && linha < rowsTable) {
                if (Flash.confirm("Deseja remover este produto?", "warning") == 0) {
                    if (this.produtos.haveAny(Integer.valueOf(TableProduto.getValueAt(linha, 0).toString()))) {
                        this.resultSet = this.produtoController.delete(Integer.valueOf(TableProduto.getValueAt(linha, 0).toString()));
                        loadTable(this.resultSet);
                    }
                }
            }

            clearInputs();

            Helper.visible(btnCadastrar_btnEditar, true);
            Helper.visible(btnModificar_btnCancelar, false);
            Helper.visible(btnExcluir, false);

            action_cadastrar(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
            action_modificar(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);

        } catch (Exception ex) {
            System.out.println("Function nameExcluirMouseClicked ERROR: " + ex);
        }
    }//GEN-LAST:event_nameExcluirMouseClicked

    private void btnAddNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNovoMouseClicked
        clearInputs();

        Helper.visible(btnCadastrar_btnEditar, true);
        Helper.visible(btnModificar_btnCancelar, false);
        Helper.visible(btnExcluir, false);

        action_cadastrar(true, "Cadastrar", App.COLOR_BTN_CADASTRAR);
        action_modificar(false, "Modificar Item", App.COLOR_BTN_MODIFICAR);
    }//GEN-LAST:event_btnAddNovoMouseClicked

    private void tfSearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchTableKeyReleased
        if (tfSearchTable.getText().equals("")) {
            loadTable(this.produtoController.index());
        }else{
            loadTable(this.produtos.search(tfSearchTable.getText()));
        }
    }//GEN-LAST:event_tfSearchTableKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProduto;
    private javax.swing.JLabel btnAddNovo;
    private javax.swing.JPanel btnCadastrar_btnEditar;
    private javax.swing.JPanel btnExcluir;
    private javax.swing.ButtonGroup btnGroupAtivoProduto;
    private javax.swing.JPanel btnModificar_btnCancelar;
    private javax.swing.JLabel imageDivisoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAtivo;
    private javax.swing.JLabel labelCategoriaProduto;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeServico1;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelTituloSecao;
    private javax.swing.JLabel nameCadastrar_nameEditar;
    private javax.swing.JLabel nameExcluir;
    private javax.swing.JLabel nameModificar_nameCancelar;
    private javax.swing.JPanel pBody;
    private javax.swing.JPanel pageServico;
    private javax.swing.JPanel panelDivisoriaBody;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JComboBox<String> tfCategoriaProduto;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextArea tfNome;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfSearchTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object[] requestsInputs() {
        Object[] dados = {
            this.categoria_produto_id[tfCategoriaProduto.getSelectedIndex() - 1],
            tfNome.getText().toUpperCase().trim(),
            tfDescricao.getText().trim(),
            tfPreco.getText().trim(),
            (rbSim.isSelected()) ? 1 : 0
        };
        return dados;
    }

    @Override
    public void clearInputs() {
        tfCategoriaProduto.setSelectedIndex(0);
        tfNome.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        rbSim.setSelected(false);
        rbNao.setSelected(false);
    }

    @Override
    public boolean isValidForm() {
        return (this.produtos.setCategoriaProduto(tfCategoriaProduto.getSelectedIndex())
                && this.produtos.setTitulo(tfNome.getText())
                && this.produtos.setDescricao(tfDescricao.getText())
                && this.produtos.setPreco(tfPreco.getText())
                && this.produtos.setAtivo(rbSim.isSelected(), rbNao.isSelected()));
    }

    @Override
    public void fillInputs() {
        try {
            int id = Integer.valueOf(TableProduto.getValueAt(TableProduto.getSelectedRow(), 0).toString());
            this.resultSet = this.produtoController.show(id);
            if (this.resultSet != null) {

                for (int i = 0; i < this.categoria_produto_id.length; i++) {
                    if (this.categoria_produto_id[i] == this.resultSet.getInt("categoria_produto_id")) {
                        tfCategoriaProduto.setSelectedIndex(i + 1);
                    }
                }

                tfNome.setText(this.resultSet.getString("titulo"));
                tfDescricao.setText(this.resultSet.getString("descricao"));
                tfPreco.setText(String.valueOf(this.resultSet.getDouble("preco")));
                if (this.resultSet.getInt("ativo") == 1) {
                    this.rbSim.setSelected(true);
                    this.rbNao.setSelected(false);
                } else {
                    this.rbSim.setSelected(false);
                    this.rbNao.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Function fillInputs() ERROR: " + ex);
        }
    }

    @Override
    public void loadTable(ResultSet rs) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Produto", "Preço", "Ativo"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            if (rs != null) {
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("preco"),
                        (rs.getInt("ativo") == 1) ? "Sim" : "Não"
                    });
                }
            }

            TableProduto.setModel(modelo);

            TableProduto.getColumnModel().getColumn(0).setPreferredWidth(1);
            TableProduto.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableProduto.getColumnModel().getColumn(2).setPreferredWidth(1);
            TableProduto.getColumnModel().getColumn(3).setPreferredWidth(1);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void action_cadastrar(boolean status, String btn, Color color) {
        this.action_cadastrar = status;
        this.nameCadastrar_nameEditar.setText(btn);
        this.btnCadastrar_btnEditar.setBackground(color);
    }

    @Override
    public void action_modificar(boolean status, String btn, Color color) {
        this.action_modificar = status;
        this.nameModificar_nameCancelar.setText(btn);
        this.btnModificar_btnCancelar.setBackground(color);
    }

    private void loadComboBox() {
        int cont = 0;
        tfCategoriaProduto.removeAllItems();
        try {
            this.resultSet = this.produtos.hasManyCategoriaProduto();
            tfCategoriaProduto.addItem("Selecione um item");
            tfCategoriaProduto.setSelectedIndex(0);
            if (this.resultSet != null) {
                while (this.resultSet.next()) {
                    tfCategoriaProduto.addItem(this.resultSet.getString("nome"));
                    this.categoria_produto_id[cont] = this.resultSet.getInt("id");
                    cont++;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro na função loadComboBox: " + ex);
        }
    }

}
