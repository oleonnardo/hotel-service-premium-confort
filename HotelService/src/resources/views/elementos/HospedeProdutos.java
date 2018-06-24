/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views.elementos;

import app.controllers.CompraProdutoController;
import app.controllers.HospedeController;
import app.models.CompraProduto;
import config.Flash;
import config.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import resources.views.ContratarProduto;
import resources.views.Principal;

/**
 *
 * @author leonardo
 */
public class HospedeProdutos extends javax.swing.JPanel {

    private int idHospedeSelecionado;

    private JTabbedPane tabbedPane;

    private ResultSet resultSet;
    private ResultSet sessaoHospede;

    private CompraProduto compraProduto;
    private app.models.Hospede hospede;

    private CompraProdutoController compraProdutoController;
    private HospedeController hospedeController;

    /**
     * Creates new form HospedeProdutos
     */
    public HospedeProdutos(int id, JTabbedPane jp) {
        try {
            initComponents();
            this.idHospedeSelecionado = id;
            this.tabbedPane = jp;

            this.hospede = new app.models.Hospede();
            this.compraProduto = new CompraProduto();

            this.hospedeController = new HospedeController(this.hospede);
            this.compraProdutoController = new CompraProdutoController(this.compraProduto);

            this.sessaoHospede = this.hospede.find(this.idHospedeSelecionado);

            loadHospedeProdutos();
            loadValorTotalProdutos();
        } catch (Exception ex) {
            System.out.println("Erro no construtor HospedeProdutos(): " + ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHospedeProduto = new javax.swing.JTable();
        tfPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TotalCompra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAddServico = new javax.swing.JLabel();
        btnRefreshTable = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produtos Hóspede");

        TableHospedeProduto.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        TableHospedeProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableHospedeProduto);

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
        jLabel4.setText("TOTAL DOS PRODUTOS");

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        btnAddServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/add-produto.png"))); // NOI18N
        btnAddServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddServicoMouseClicked(evt);
            }
        });

        btnRefreshTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRefreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/botoes/atualizar-tabela.png"))); // NOI18N
        btnRefreshTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddServico)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalCompra)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void btnRefreshTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTableMouseClicked
        loadHospedeProdutos();
        this.loadValorTotalProdutos();
    }//GEN-LAST:event_btnRefreshTableMouseClicked

    private void btnAddServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServicoMouseClicked
        try {
            if (this.sessaoHospede.next()) {
                ContratarProduto contratarProduto = new ContratarProduto(new Principal(), true, this.sessaoHospede);
                contratarProduto.setVisible(true);
            } else {
                Flash.error("Houve um erro na tentativa de recuperar os dados do hóspede.");
            }
        } catch (SQLException ex) {
            System.out.println("Erro na função btnAddServicoMouseClicked(): " + ex);
        }
    }//GEN-LAST:event_btnAddServicoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableHospedeProduto;
    private javax.swing.JLabel TotalCompra;
    private javax.swing.JLabel btnAddServico;
    private javax.swing.JLabel btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * Listar os Produtos que o hóspede possui
     */
    private void loadHospedeProdutos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Produto", "Valor", "Porções"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            String sql = "SELECT compra_produto.*, produto.titulo AS nome_produto, produto.preco FROM compra_produto\n" +
                         "INNER JOIN produto ON compra_produto.produto_id = produto.id\n" +
                         "WHERE compra_produto.hospede_id = " + this.idHospedeSelecionado + " AND \n" +
                               "compra_produto.ativo = 'S'";
            this.resultSet = this.compraProduto.select(sql);

            if (this.resultSet != null) {
                while (this.resultSet.next()) {
                    modelo.addRow(new Object[]{
                        this.resultSet.getInt("id"),
                        this.resultSet.getString("nome_produto"),
                        this.resultSet.getString("preco"),
                        this.resultSet.getInt("porcoes")
                    });
                }
            }

            TableHospedeProduto.setModel(modelo);

            TableHospedeProduto.getColumnModel().getColumn(0).setPreferredWidth(1 / 2);
            TableHospedeProduto.getColumnModel().getColumn(1).setPreferredWidth(200);
            TableHospedeProduto.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableHospedeProduto.getColumnModel().getColumn(3).setPreferredWidth(50);

        } catch (SQLException ex) {
            System.out.println("SQLException na listagem, na função loadHospedeProdutos(): " + ex);
        } catch (Exception ex) {
            System.out.println("Exception consulta, na função loadHospedeProdutos(): " + ex);
        }
    }

    private void loadValorTotalProdutos() {
        double totalCompra = 0.0, porcoes, preco_unitario;
        for (int i = 0; i < TableHospedeProduto.getRowCount(); i++) {
            
            porcoes = Double.valueOf(TableHospedeProduto.getValueAt(i, 2).toString()); 
            preco_unitario = Double.valueOf(TableHospedeProduto.getValueAt(i, 3).toString());
            totalCompra = totalCompra + (preco_unitario * porcoes);
            
        }
        TotalCompra.setText(Helper.formatPrice(totalCompra));
    }
}
