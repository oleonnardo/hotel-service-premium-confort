/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources.views;

import config.App;
import java.awt.Color;
import java.awt.event.KeyEvent;
import config.Flash;
import config.Helper;

/**
 *
 * @author leonardo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        itemMenuHospede = new javax.swing.JLabel();
        itemMenuServico = new javax.swing.JLabel();
        itemMenuContratarServico = new javax.swing.JLabel();
        itemMenuProdutos = new javax.swing.JLabel();
        itemMenuContratarProdutos = new javax.swing.JLabel();
        itemInfoCheckInHospede = new javax.swing.JLabel();
        itemInfoProjeto = new javax.swing.JLabel();
        itemConfiguracoes = new javax.swing.JLabel();
        itemLogout = new javax.swing.JLabel();
        itemMenuContratosHospede = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setForeground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        itemMenuHospede.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuHospede.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuHospede.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuHospede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuHospede.setText("Checkin Hóspede");
        itemMenuHospede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuHospedeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuHospedeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuHospedeMouseEntered(evt);
            }
        });

        itemMenuServico.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuServico.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuServico.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuServico.setText("Serviços");
        itemMenuServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuServicoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuServicoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuServicoMouseEntered(evt);
            }
        });

        itemMenuContratarServico.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuContratarServico.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuContratarServico.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuContratarServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuContratarServico.setText("Contratar Serviços");
        itemMenuContratarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuContratarServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuContratarServicoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuContratarServicoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuContratarServicoMouseEntered(evt);
            }
        });

        itemMenuProdutos.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuProdutos.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuProdutos.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuProdutos.setText("Produtos");
        itemMenuProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuProdutosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuProdutosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuProdutosMouseEntered(evt);
            }
        });

        itemMenuContratarProdutos.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuContratarProdutos.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuContratarProdutos.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuContratarProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuContratarProdutos.setText("Contratar Produtos");
        itemMenuContratarProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuContratarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuContratarProdutosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuContratarProdutosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuContratarProdutosMouseEntered(evt);
            }
        });

        itemInfoCheckInHospede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemInfoCheckInHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/user.png"))); // NOI18N
        itemInfoCheckInHospede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemInfoCheckInHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInfoCheckInHospedeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemInfoCheckInHospedeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemInfoCheckInHospedeMouseEntered(evt);
            }
        });

        itemInfoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemInfoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/info.png"))); // NOI18N
        itemInfoProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemInfoProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemInfoProjetoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemInfoProjetoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemInfoProjetoMouseEntered(evt);
            }
        });

        itemConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/cog.png"))); // NOI18N
        itemConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConfiguracoesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemConfiguracoesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemConfiguracoesMouseEntered(evt);
            }
        });

        itemLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/png/logout.png"))); // NOI18N
        itemLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemLogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemLogoutMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemLogoutMouseEntered(evt);
            }
        });

        itemMenuContratosHospede.setBackground(new java.awt.Color(255, 255, 255));
        itemMenuContratosHospede.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        itemMenuContratosHospede.setForeground(new java.awt.Color(87, 89, 98));
        itemMenuContratosHospede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemMenuContratosHospede.setText("Contrato Hóspede");
        itemMenuContratosHospede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuContratosHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuContratosHospedeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itemMenuContratosHospedeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemMenuContratosHospedeMouseEntered(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemMenuContratosHospede)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(itemMenuServico)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemMenuContratarProdutos)
                                    .addComponent(itemMenuContratarServico)
                                    .addComponent(itemMenuProdutos))
                                .addComponent(itemMenuHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(itemInfoCheckInHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemInfoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {itemMenuContratarProdutos, itemMenuContratarServico, itemMenuContratosHospede, itemMenuHospede, itemMenuProdutos, itemMenuServico});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuContratarServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuProdutos)
                .addGap(12, 12, 12)
                .addComponent(itemMenuContratarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemMenuContratosHospede)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemConfiguracoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemInfoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemInfoCheckInHospede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {itemMenuContratarProdutos, itemMenuContratarServico, itemMenuContratosHospede, itemMenuHospede, itemMenuProdutos, itemMenuServico});

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 640));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/slideshow.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 870, 680));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemConfiguracoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfiguracoesMouseEntered
        Helper.hoverImage(itemConfiguracoes, "/resources/images/png/cog-hover.png", this.getClass());
    }//GEN-LAST:event_itemConfiguracoesMouseEntered

    private void itemConfiguracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfiguracoesMouseExited
        Helper.hoverImage(itemConfiguracoes, "/resources/images/png/cog.png", this.getClass());
    }//GEN-LAST:event_itemConfiguracoesMouseExited

    private void itemConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConfiguracoesMouseClicked
        Configuracoes configuracao = new Configuracoes(this, true);
        configuracao.setVisible(true);
    }//GEN-LAST:event_itemConfiguracoesMouseClicked

    private void itemMenuContratarServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarServicoMouseEntered
        Helper.hoverLabel(itemMenuContratarServico, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuContratarServicoMouseEntered

    private void itemMenuContratarServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarServicoMouseExited
        Helper.hoverLabel(itemMenuContratarServico, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuContratarServicoMouseExited

    private void itemMenuServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuServicoMouseClicked
        Servico servico = new Servico(this, true);
        servico.setVisible(true);
    }//GEN-LAST:event_itemMenuServicoMouseClicked

    private void itemMenuServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuServicoMouseEntered
        Helper.hoverLabel(itemMenuServico, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuServicoMouseEntered

    private void itemMenuServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuServicoMouseExited
        Helper.hoverLabel(itemMenuServico, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuServicoMouseExited

    private void itemMenuHospedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuHospedeMouseEntered
        Helper.hoverLabel(itemMenuHospede, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuHospedeMouseEntered

    private void itemMenuHospedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuHospedeMouseExited
        Helper.hoverLabel(itemMenuHospede, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuHospedeMouseExited

    private void itemLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemLogoutMouseClicked
        if (Flash.confirm("Deseja encerrar o aplicativo?", "remove") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_itemLogoutMouseClicked

    private void itemLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemLogoutMouseEntered
        Helper.hoverImage(itemLogout, "/resources/images/png/logout-hover.png", this.getClass());
    }//GEN-LAST:event_itemLogoutMouseEntered

    private void itemLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemLogoutMouseExited
        Helper.hoverImage(itemLogout, "/resources/images/png/logout.png", this.getClass());
    }//GEN-LAST:event_itemLogoutMouseExited

    private void itemInfoProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoProjetoMouseClicked
       InfoProjeto infoProjeto = new InfoProjeto(this, true);
       infoProjeto.setVisible(true);
    }//GEN-LAST:event_itemInfoProjetoMouseClicked

    private void itemInfoProjetoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoProjetoMouseEntered
        Helper.hoverImage(itemInfoProjeto, "/resources/images/png/info-hover.png", this.getClass());// TODO add your handling code here:
    }//GEN-LAST:event_itemInfoProjetoMouseEntered

    private void itemInfoProjetoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoProjetoMouseExited
        Helper.hoverImage(itemInfoProjeto, "/resources/images/png/info.png", this.getClass());
    }//GEN-LAST:event_itemInfoProjetoMouseExited

    private void itemMenuProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuProdutosMouseEntered
        Helper.hoverLabel(itemMenuProdutos, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuProdutosMouseEntered

    private void itemMenuProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuProdutosMouseExited
        Helper.hoverLabel(itemMenuProdutos, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuProdutosMouseExited

    private void itemMenuContratarProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarProdutosMouseEntered
        Helper.hoverLabel(itemMenuContratarProdutos, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuContratarProdutosMouseEntered

    private void itemMenuContratarProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarProdutosMouseExited
        Helper.hoverLabel(itemMenuContratarProdutos, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuContratarProdutosMouseExited

    private void itemMenuProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuProdutosMouseClicked
        Produto produto = new Produto(this, true);
        produto.setVisible(true);
    }//GEN-LAST:event_itemMenuProdutosMouseClicked

    private void itemInfoCheckInHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoCheckInHospedeMouseClicked
        CheckInHospede checkInHospede = new CheckInHospede(this, true);
        checkInHospede.setVisible(true);
    }//GEN-LAST:event_itemInfoCheckInHospedeMouseClicked

    private void itemInfoCheckInHospedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoCheckInHospedeMouseEntered
        Helper.hoverImage(itemInfoCheckInHospede, "/resources/images/png/user-hover.png", this.getClass());
    }//GEN-LAST:event_itemInfoCheckInHospedeMouseEntered

    private void itemInfoCheckInHospedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemInfoCheckInHospedeMouseExited
        Helper.hoverImage(itemInfoCheckInHospede, "/resources/images/png/user.png", this.getClass());
    }//GEN-LAST:event_itemInfoCheckInHospedeMouseExited

    private void itemMenuHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuHospedeMouseClicked
        CheckInHospede checkInHospede = new CheckInHospede(this, true);
        checkInHospede.setVisible(true);
    }//GEN-LAST:event_itemMenuHospedeMouseClicked

    private void itemMenuContratarServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarServicoMouseClicked
        BuscarHospede buscarHospede = new BuscarHospede(this, true, "ContratarServico");
        buscarHospede.setVisible(true);
    }//GEN-LAST:event_itemMenuContratarServicoMouseClicked

    private void itemMenuContratarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratarProdutosMouseClicked
        BuscarHospede buscarHospede = new BuscarHospede(this, true, "ContratarProduto");
        buscarHospede.setVisible(true);
    }//GEN-LAST:event_itemMenuContratarProdutosMouseClicked

    private void itemMenuContratosHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratosHospedeMouseClicked
        ContratoHospede contratoHospede = new ContratoHospede(this, true);
        contratoHospede.setVisible(true);
    }//GEN-LAST:event_itemMenuContratosHospedeMouseClicked

    private void itemMenuContratosHospedeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratosHospedeMouseExited
        Helper.hoverLabel(itemMenuContratosHospede, App.COLOR_APP);
    }//GEN-LAST:event_itemMenuContratosHospedeMouseExited

    private void itemMenuContratosHospedeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuContratosHospedeMouseEntered
        Helper.hoverLabel(itemMenuContratosHospede, App.COLOR_HOVER);
    }//GEN-LAST:event_itemMenuContratosHospedeMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (App.makeAndFell.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemConfiguracoes;
    private javax.swing.JLabel itemInfoCheckInHospede;
    private javax.swing.JLabel itemInfoProjeto;
    private javax.swing.JLabel itemLogout;
    private javax.swing.JLabel itemMenuContratarProdutos;
    private javax.swing.JLabel itemMenuContratarServico;
    private javax.swing.JLabel itemMenuContratosHospede;
    private javax.swing.JLabel itemMenuHospede;
    private javax.swing.JLabel itemMenuProdutos;
    private javax.swing.JLabel itemMenuServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
