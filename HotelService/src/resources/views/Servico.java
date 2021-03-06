/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views;

import app.controllers.ServicoController;
import app.models.Servicos;
import app.models.TipoServico;
import config.App;
import config.Flash;
import config.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardo
 */
public class Servico extends javax.swing.JDialog {

    // Manipulação dos registros que retornam das consultas MySQL
    private ResultSet resultSet;

    // Utilizando variaveis locais para a manipulação das classes controller e model
    private final Servicos servicos;
    private final TipoServico tiposervico = new TipoServico();
    private final ServicoController servicoController;

    private final int[] tipo_servico_id;

    /**
     * Creates new form Service
     */
    public Servico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);

        this.servicos = new Servicos();
        this.servicoController = new ServicoController(this.servicos);

        this.tipo_servico_id = new int[this.tiposervico.count()];
        loadComboBox();
        loadTable(this.servicoController.index());
        controlVisible(true, false, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableServicos = new javax.swing.JTable();
        tfSearchTable = new javax.swing.JTextField();
        labelPesquisar = new javax.swing.JLabel();
        btnAddNovo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfObservacao = new javax.swing.JTextArea();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        labelAtivo = new javax.swing.JLabel();
        labelObservacao = new javax.swing.JLabel();
        tfNumeroMaximoPessoas = new javax.swing.JTextField();
        labelDePessoas = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        labelNumeroMaxicoPessoas = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelDisponiveis = new javax.swing.JLabel();
        labelVagas = new javax.swing.JLabel();
        labelNumeroMaximoCriancas = new javax.swing.JLabel();
        labelDeCriancas = new javax.swing.JLabel();
        tfNumeroMaximoCriancas = new javax.swing.JTextField();
        tfVagasDisponiveis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        labelDescricao = new javax.swing.JLabel();
        tfNomeServico = new javax.swing.JTextField();
        labelNomeServico = new javax.swing.JLabel();
        labelTipoServico = new javax.swing.JLabel();
        tfTipoServico = new javax.swing.JComboBox<>();
        btnAddServico = new javax.swing.JLabel();
        btnEditaServico = new javax.swing.JLabel();
        btnRemoveServico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/banners/servicos.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        TableServicos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TableServicos.setModel(new javax.swing.table.DefaultTableModel(
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
        TableServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableServicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableServicos);

        tfSearchTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfSearchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchTableKeyReleased(evt);
            }
        });

        labelPesquisar.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelPesquisar.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnAddNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/add-new.png"))); // NOI18N
        btnAddNovo.setToolTipText("Adicionar novo tipo de serviço.");
        btnAddNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNovoMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        tfObservacao.setColumns(20);
        tfObservacao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfObservacao.setLineWrap(true);
        tfObservacao.setRows(5);
        tfObservacao.setWrapStyleWord(true);
        jScrollPane3.setViewportView(tfObservacao);

        rbSim.setBackground(new java.awt.Color(255, 255, 255));
        rbSim.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbSim.setSelected(true);
        rbSim.setText("Sim");

        rbNao.setBackground(new java.awt.Color(255, 255, 255));
        rbNao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbNao.setText("Não");

        labelAtivo.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelAtivo.setText("Ativo:");

        labelObservacao.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelObservacao.setText("Obsevação:");

        tfNumeroMaximoPessoas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelDePessoas.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDePessoas.setText("de Pessoas:");

        tfPreco.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelNumeroMaxicoPessoas.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNumeroMaxicoPessoas.setText("Nº Máximo");

        labelPreco.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelPreco.setText("Preço:");

        labelDisponiveis.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDisponiveis.setText("disponíveis:");

        labelVagas.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelVagas.setText("Vagas");

        labelNumeroMaximoCriancas.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNumeroMaximoCriancas.setText("Nº Máximo");

        labelDeCriancas.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDeCriancas.setText("de Crianças:");

        tfNumeroMaximoCriancas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tfVagasDisponiveis.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tfDescricao.setColumns(20);
        tfDescricao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfDescricao.setLineWrap(true);
        tfDescricao.setRows(5);
        tfDescricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tfDescricao);

        labelDescricao.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        tfNomeServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        labelNomeServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelNomeServico.setText("Serviço:");

        labelTipoServico.setFont(new java.awt.Font("Roboto Lt", 0, 14)); // NOI18N
        labelTipoServico.setText("Tipo de Serviço:");

        tfTipoServico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btnAddServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/add-servico.png"))); // NOI18N
        btnAddServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddServicoMouseClicked(evt);
            }
        });

        btnEditaServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/editar-servico.png"))); // NOI18N
        btnEditaServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditaServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditaServicoMouseClicked(evt);
            }
        });

        btnRemoveServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/remove-servico.png"))); // NOI18N
        btnRemoveServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveServicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVagasDisponiveis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDePessoas)
                                    .addComponent(labelNumeroMaxicoPessoas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelAtivo)
                                        .addComponent(labelObservacao)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(tfNumeroMaximoPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDeCriancas)
                                            .addComponent(labelNumeroMaximoCriancas, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(12, 12, 12)
                                        .addComponent(tfNumeroMaximoCriancas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNao))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelTipoServico)
                                        .addGap(10, 10, 10)
                                        .addComponent(tfTipoServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(labelNomeServico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelPreco)
                                            .addComponent(labelDescricao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelVagas, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(labelDisponiveis, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddServico)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditaServico)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveServico)
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelTipoServico))
                    .addComponent(tfTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeServico)
                    .addComponent(tfNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPreco)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelVagas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDisponiveis))
                    .addComponent(tfVagasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNumeroMaximoPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelNumeroMaxicoPessoas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDePessoas))
                    .addComponent(tfNumeroMaximoCriancas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelNumeroMaximoCriancas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDeCriancas)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservacao)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtivo)
                    .addComponent(rbSim)
                    .addComponent(rbNao))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddServico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveServico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddNovo)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableServicosMouseClicked
        int linha = TableServicos.getSelectedRow();
        int rowsTable = this.servicos.count();

        if (linha >= 0 && linha < rowsTable) {
            clearInputs();
            fillInputs();
            controlVisible(false, true, true);
        }
    }//GEN-LAST:event_TableServicosMouseClicked

    private void tfSearchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchTableKeyReleased
        if (tfSearchTable.getText().equals("")) {
            loadTable(this.servicoController.index());
        } else {
            loadTable(this.servicos.search(tfSearchTable.getText()));
        }
    }//GEN-LAST:event_tfSearchTableKeyReleased

    private void btnAddNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNovoMouseClicked
        clearInputs();
        controlVisible(true, false, false);
    }//GEN-LAST:event_btnAddNovoMouseClicked

    private void btnRemoveServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveServicoMouseClicked
        deleteServico();
    }//GEN-LAST:event_btnRemoveServicoMouseClicked

    private void btnEditaServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditaServicoMouseClicked
        if (isValidForm()) {
            int id = Integer.valueOf(TableServicos.getValueAt(TableServicos.getSelectedRow(), 0).toString());
            this.resultSet = this.servicoController.update(requestsInputs(), id);

            loadTable(this.resultSet);
            clearInputs();
            controlVisible(true, false, false);
        }
    }//GEN-LAST:event_btnEditaServicoMouseClicked

    private void btnAddServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServicoMouseClicked
        if (isValidForm()) {
            this.resultSet = this.servicoController.store(requestsInputs());
            loadTable(this.resultSet);
            clearInputs();
            controlVisible(true, false, false);
        }
    }//GEN-LAST:event_btnAddServicoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableServicos;
    private javax.swing.JLabel btnAddNovo;
    private javax.swing.JLabel btnAddServico;
    private javax.swing.JLabel btnEditaServico;
    private javax.swing.JLabel btnRemoveServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAtivo;
    private javax.swing.JLabel labelDeCriancas;
    private javax.swing.JLabel labelDePessoas;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDisponiveis;
    private javax.swing.JLabel labelNomeServico;
    private javax.swing.JLabel labelNumeroMaxicoPessoas;
    private javax.swing.JLabel labelNumeroMaximoCriancas;
    private javax.swing.JLabel labelObservacao;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelTipoServico;
    private javax.swing.JLabel labelVagas;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField tfNomeServico;
    private javax.swing.JTextField tfNumeroMaximoCriancas;
    private javax.swing.JTextField tfNumeroMaximoPessoas;
    private javax.swing.JTextArea tfObservacao;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfSearchTable;
    private javax.swing.JComboBox<String> tfTipoServico;
    private javax.swing.JTextField tfVagasDisponiveis;
    // End of variables declaration//GEN-END:variables

    private void controlVisible(boolean add, boolean edit, boolean delete) {
        btnAddServico.setVisible(add);
        btnEditaServico.setVisible(edit);
        btnRemoveServico.setVisible(delete);
    }

    public Object[] requestsInputs() {
        Object[] dados = {
            this.tipo_servico_id[tfTipoServico.getSelectedIndex() - 1],
            tfNomeServico.getText().toUpperCase().trim(),
            tfDescricao.getText().trim(),
            tfPreco.getText().trim(),
            tfVagasDisponiveis.getText().trim(),
            tfNumeroMaximoPessoas.getText().trim(),
            tfNumeroMaximoCriancas.getText().trim(),
            tfObservacao.getText().toUpperCase().trim(),
            (rbSim.isSelected()) ? 1 : 0
        };
        return dados;
    }

    public void clearInputs() {
        tfTipoServico.setSelectedIndex(0);
        tfNomeServico.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfVagasDisponiveis.setText("");
        tfNumeroMaximoPessoas.setText("");
        tfNumeroMaximoCriancas.setText("");
        tfObservacao.setText("");
        rbSim.setSelected(false);
        rbNao.setSelected(false);
    }

    public boolean isValidForm() {
        return (this.servicos.setTipoServicoID(tfTipoServico.getSelectedIndex())
                && this.servicos.setNome(tfNomeServico.getText())
                && this.servicos.setDescricao(tfDescricao.getText())
                && this.servicos.setPreco(tfPreco.getText())
                && this.servicos.setVagas(tfVagasDisponiveis.getText())
                && this.servicos.setQtdePessoaMax(tfNumeroMaximoPessoas.getText())
                && this.servicos.setQtdeCriancaMax(tfNumeroMaximoCriancas.getText())
                && this.servicos.setAtivo(rbSim.isSelected(), rbNao.isSelected()));
    }

    public void fillInputs() {
        try {
            int id = Integer.valueOf(TableServicos.getValueAt(TableServicos.getSelectedRow(), 0).toString());
            this.resultSet = this.servicoController.show(id);
            if (this.resultSet != null) {

                for (int i = 0; i < this.tipo_servico_id.length; i++) {
                    if (this.tipo_servico_id[i] == this.resultSet.getInt("tipo_servico_id")) {
                        tfTipoServico.setSelectedIndex(i + 1);
                    }
                }

                tfNomeServico.setText(this.resultSet.getString("nome"));
                tfDescricao.setText(this.resultSet.getString("descricao"));
                tfPreco.setText(String.valueOf(this.resultSet.getDouble("preco")));
                tfVagasDisponiveis.setText(String.valueOf(this.resultSet.getInt("vagas")));
                tfNumeroMaximoPessoas.setText(String.valueOf(this.resultSet.getInt("qtde_pessoa_max")));
                tfNumeroMaximoCriancas.setText(String.valueOf(this.resultSet.getInt("qtde_crianca_max")));
                tfObservacao.setText(this.resultSet.getString("obs"));
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

    public void loadTable(ResultSet rs) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Serviço", "Preço", "Vagas", "Ativo"}, 0) {
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
                        rs.getString("preco"),
                        rs.getString("vagas"),
                        (rs.getInt("ativo") == 1) ? "Sim" : "Não"
                    });
                }
            }

            TableServicos.setModel(modelo);

            TableServicos.getColumnModel().getColumn(0).setPreferredWidth(1);
            TableServicos.getColumnModel().getColumn(1).setPreferredWidth(250);
            TableServicos.getColumnModel().getColumn(2).setPreferredWidth(5);
            TableServicos.getColumnModel().getColumn(3).setPreferredWidth(5);
            TableServicos.getColumnModel().getColumn(4).setPreferredWidth(1);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void loadComboBox() {
        int cont = 0;
        tfTipoServico.removeAllItems();
        try {
            this.resultSet = this.tiposervico.hasManyTipoServico();
            tfTipoServico.addItem("Selecione um item");
            tfTipoServico.setSelectedIndex(0);
            if (this.resultSet != null) {
                while (this.resultSet.next()) {
                    tfTipoServico.addItem(this.resultSet.getString("nome"));
                    this.tipo_servico_id[cont] = this.resultSet.getInt("id");
                    cont++;
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro na função loadComboBox: " + ex);
        }
    }

    private void deleteServico() {
        try {
            int linha = TableServicos.getSelectedRow();
            int rowsTable = this.servicos.count();

            if (linha >= 0 && linha < rowsTable) {
                if (Flash.confirm("Deseja remover este tipo de serviço?", "warning") == 0) {
                    if (this.servicos.haveAny(Integer.valueOf(TableServicos.getValueAt(linha, 0).toString()))) {
                        this.resultSet = this.servicoController.delete(Integer.valueOf(TableServicos.getValueAt(linha, 0).toString()));
                        loadTable(this.resultSet);
                    }
                }
            }

            clearInputs();
            controlVisible(true, false, false);
        } catch (Exception ex) {
            System.out.println("Function nameExcluirMouseClicked ERROR: " + ex);
        }
    }

}
