/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views.elementos;

import app.controllers.CompraServicoController;
import app.controllers.HospedeController;
import app.models.CompraServico;
import config.Flash;
import config.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import resources.views.ContratarServico;
import resources.views.Principal;

/**
 *
 * @author leonardo
 */
public class HospedeServicos extends javax.swing.JPanel {

    private int idHospedeSelecionado;

    private JTabbedPane tabbedPane;

    private ResultSet resultSet;
    private ResultSet sessaoHospede;

    private CompraServico compraServico;
    private app.models.Hospede hospede;

    private CompraServicoController compraServicoController;
    private HospedeController hospedeController;

    /**
     * Creates new form Servicos
     */
    public HospedeServicos(int id, JTabbedPane jp) {
        try {
            initComponents();
            this.idHospedeSelecionado = id;
            this.tabbedPane = jp;

            this.hospede = new app.models.Hospede();
            this.compraServico = new CompraServico();

            this.hospedeController = new HospedeController(this.hospede);
            this.compraServicoController = new CompraServicoController(this.compraServico);

            this.sessaoHospede = this.hospede.find(this.idHospedeSelecionado);

            loadHospedeServicos();
            loadValorTotalServicos();
        } catch (Exception ex) {
            System.out.println("Erro no construtor HospedeServicos(): " + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHospedeServico = new javax.swing.JTable();
        tfPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TotalCompra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRefreshTable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRemoveServico = new javax.swing.JLabel();
        btnAddServico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Serviços Hóspede");

        TableHospedeServico.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        TableHospedeServico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableHospedeServico);

        tfPesquisa.setFont(new java.awt.Font("Poppins", 2, 13)); // NOI18N
        tfPesquisa.setText("Procurar...");
        tfPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusLost(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/fechar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        TotalCompra.setFont(new java.awt.Font("Poppins", 0, 30)); // NOI18N
        TotalCompra.setForeground(new java.awt.Color(24, 147, 2));
        TotalCompra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TotalCompra.setText("R$ 0.00");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(111, 111, 111));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("TOTAL DOS SERVIÇOS");

        btnRefreshTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRefreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/atualizar-tabela.png"))); // NOI18N
        btnRefreshTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTableMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        btnRemoveServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRemoveServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/remove-servico.png"))); // NOI18N
        btnRemoveServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveServicoMouseClicked(evt);
            }
        });

        btnAddServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/add-servico.png"))); // NOI18N
        btnAddServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddServicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(btnAddServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveServico)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddServico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveServico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefreshTable, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalCompra)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusGained
        tfPesquisa.setText("");
    }//GEN-LAST:event_tfPesquisaFocusGained

    private void tfPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusLost
        tfPesquisa.setText("Procurar...");
    }//GEN-LAST:event_tfPesquisaFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.tabbedPane.setSelectedIndex(1);
        this.tabbedPane.removeTabAt(this.tabbedPane.getTabCount() - 1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRemoveServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveServicoMouseClicked
        int linha = TableHospedeServico.getSelectedRow();
        if (linha >= 0) {
            try {
                int idCompraServico = Integer.valueOf(TableHospedeServico.getValueAt(linha, 0).toString());
                this.resultSet = this.compraServico.find(idCompraServico);

                if (this.resultSet.next()) {
                    this.compraServico.update(new Object[]{
                        this.resultSet.getString("hospede_id"),
                        this.resultSet.getString("servicos_id"),
                        this.resultSet.getString("qtde_criancas"),
                        this.resultSet.getString("qtde_pessoas"),
                        this.resultSet.getString("obs"),
                        this.resultSet.getString("data_compra"),
                        "N"
                    }, idCompraServico);
                    loadHospedeServicos();
                }

            } catch (Exception ex) {
                System.out.println("Erro na função btnRemoveServicoMouseClicked(): " + ex);
            }
        } else {
            Flash.error("Nenhum serviço selecionad.");
        }
    }//GEN-LAST:event_btnRemoveServicoMouseClicked

    private void btnAddServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServicoMouseClicked
        try {
            if (this.sessaoHospede.next()) {
                ContratarServico contratarServico = new ContratarServico(new Principal(), true, this.sessaoHospede);
                contratarServico.setVisible(true);
            } else {
                Flash.error("Houve um erro na tentativa de recuperar os dados do hóspede.");
            }
        } catch (SQLException ex) {
            System.out.println("Erro na função btnAddServicoMouseClicked(): " + ex);
        }
    }//GEN-LAST:event_btnAddServicoMouseClicked

    private void btnRefreshTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTableMouseClicked
        loadHospedeServicos();
    }//GEN-LAST:event_btnRefreshTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableHospedeServico;
    private javax.swing.JLabel TotalCompra;
    private javax.swing.JLabel btnAddServico;
    private javax.swing.JLabel btnRefreshTable;
    private javax.swing.JLabel btnRemoveServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * Listar os Serviços que o hóspede possui
     */
    private void loadHospedeServicos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Serviço", "Valor", "Qtde Pessoas"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            String sql = "SELECT compra_servico.*, servicos.nome AS nome_servico, servicos.preco FROM compra_servico INNER JOIN servicos ON compra_servico.servicos_id = servicos.id WHERE compra_servico.hospede_id = " + this.idHospedeSelecionado + " AND compra_servico.ativo = 'S'";
            System.out.println(sql);
            this.resultSet = this.compraServico.select(sql);

            if (this.resultSet != null) {
                while (this.resultSet.next()) {
                    modelo.addRow(new Object[]{
                        this.resultSet.getInt("id"),
                        this.resultSet.getString("nome_servico"),
                        this.resultSet.getString("preco"),
                        this.resultSet.getInt("qtde_pessoas") + this.resultSet.getInt("qtde_criancas")
                    });
                }
            }

            TableHospedeServico.setModel(modelo);
            this.loadValorTotalServicos();

            TableHospedeServico.getColumnModel().getColumn(0).setPreferredWidth(1 / 2);
            TableHospedeServico.getColumnModel().getColumn(1).setPreferredWidth(200);
            TableHospedeServico.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableHospedeServico.getColumnModel().getColumn(3).setPreferredWidth(50);

        } catch (SQLException ex) {
            System.out.println("SQLException na listagem, na função loadHospedeServicos(): " + ex);
        } catch (Exception ex) {
            System.out.println("Exception consulta, na função loadHospedeServicos(): " + ex);
        }
    }

    private void loadValorTotalServicos() {
        double totalCompra = 0.0;
        for (int i = 0; i < TableHospedeServico.getRowCount(); i++) {
            totalCompra += Double.valueOf(TableHospedeServico.getValueAt(i, 2).toString());
        }
        TotalCompra.setText(Helper.formatPrice(totalCompra));
    }

}