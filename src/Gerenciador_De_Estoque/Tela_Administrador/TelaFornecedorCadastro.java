
package Gerenciador_De_Estoque.Tela_Administrador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public final class TelaFornecedorCadastro extends javax.swing.JFrame {
    
    // resolução tela pc
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    int largura = d.width;
    int altura = d.height;
    
    Color corFundo1 = new Color(147, 87, 107);
    Color corFundo2 = new Color(227, 215, 206);
    Color corFundo3 = new Color(249,242,234);
    Color corFundo4 = new Color(229,203,234);
    Color corFonte1 = new Color(0,153,0);
    Color corFonte2 = new Color(0,153,0);
    
    public TelaFornecedorCadastro() {
        initComponents();
       
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbPais = new javax.swing.JLabel();
        jTFPais = new javax.swing.JTextField();
        jLbEstado = new javax.swing.JLabel();
        jLbCidade = new javax.swing.JLabel();
        jLbBairro = new javax.swing.JLabel();
        jLbRua = new javax.swing.JLabel();
        jLbNumero = new javax.swing.JLabel();
        jLbCadastro = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jLbTelefone1 = new javax.swing.JLabel();
        jTFTelefone1 = new javax.swing.JTextField();
        jLbTelefone2 = new javax.swing.JLabel();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jLbEmail1 = new javax.swing.JLabel();
        jTFEmail1 = new javax.swing.JTextField();
        jLbEmail2 = new javax.swing.JLabel();
        jLbNomeFantasia = new javax.swing.JLabel();
        jTFNomeFantasia = new javax.swing.JTextField();
        jLbRazaoSocial = new javax.swing.JLabel();
        jTFRazaoSocial = new javax.swing.JTextField();
        jTFCNPJ = new javax.swing.JTextField();
        jLbCNPJ = new javax.swing.JLabel();
        jBntCancelar = new javax.swing.JButton();
        jBntCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(147, 87, 107));
        setName("FornecedorCadastro"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1340, 690));
        setSize(new java.awt.Dimension(1340, 690));
        getContentPane().setLayout(null);

        jLbPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbPais.setText("  País:");
        getContentPane().add(jLbPais);
        jLbPais.setBounds(171, 530, 50, 22);

        jTFPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais.setBorder(null);
        jTFPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaisActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais);
        jTFPais.setBounds(240, 530, 258, 22);

        jLbEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEstado.setText("  Estado:");
        getContentPane().add(jLbEstado);
        jLbEstado.setBounds(483, 560, 80, 22);

        jLbCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCidade.setText("  Cidade:");
        getContentPane().add(jLbCidade);
        jLbCidade.setBounds(723, 560, 80, 22);

        jLbBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbBairro.setText("  Bairro:");
        getContentPane().add(jLbBairro);
        jLbBairro.setBounds(186, 560, 70, 22);

        jLbRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbRua.setText("  Rua:");
        getContentPane().add(jLbRua);
        jLbRua.setBounds(90, 540, 50, 22);

        jLbNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNumero.setText("  Número:");
        getContentPane().add(jLbNumero);
        jLbNumero.setBounds(1072, 570, 80, 22);

        jLbCadastro.setBackground(new java.awt.Color(204, 204, 204));
        jLbCadastro.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbCadastro.setText("CADASTRO ");
        jLbCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 215, 206), 7));
        jLbCadastro.setOpaque(true);
        getContentPane().add(jLbCadastro);
        jLbCadastro.setBounds(392, 11, 400, 60);

        jTFEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEstado.setBorder(null);
        jTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFEstado);
        jTFEstado.setBounds(580, 560, 91, 22);

        jTFCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCidade.setBorder(null);
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCidade);
        jTFCidade.setBounds(790, 560, 327, 22);

        jTFBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBairro.setBorder(null);
        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTFBairro);
        jTFBairro.setBounds(270, 560, 256, 22);

        jTFRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRua.setBorder(null);
        jTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFRua);
        jTFRua.setBounds(150, 540, 327, 22);

        jTFNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNumero.setBorder(null);
        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNumero);
        jTFNumero.setBounds(1170, 570, 110, 22);

        jLbTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone1.setText("  Telefone 1:");
        getContentPane().add(jLbTelefone1);
        jLbTelefone1.setBounds(240, 300, 90, 22);

        jTFTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone1.setBorder(null);
        jTFTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFTelefone1);
        jTFTelefone1.setBounds(340, 300, 258, 22);

        jLbTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone2.setText("  Telefone 2:");
        getContentPane().add(jLbTelefone2);
        jLbTelefone2.setBounds(700, 300, 90, 22);

        jTFTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone2.setBorder(null);
        jTFTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefone2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFTelefone2);
        jTFTelefone2.setBounds(810, 300, 258, 22);

        jTFEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail2.setBorder(null);
        jTFEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmail2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFEmail2);
        jTFEmail2.setBounds(790, 350, 258, 22);

        jLbEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail1.setText("  E-mail 1:");
        getContentPane().add(jLbEmail1);
        jLbEmail1.setBounds(240, 350, 83, 22);

        jTFEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail1.setBorder(null);
        jTFEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFEmail1);
        jTFEmail1.setBounds(320, 350, 258, 22);

        jLbEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail2.setText("  E-mail 2:");
        getContentPane().add(jLbEmail2);
        jLbEmail2.setBounds(700, 350, 90, 22);

        jLbNomeFantasia.setBackground(new java.awt.Color(51, 255, 153));
        jLbNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNomeFantasia.setText("  Nome Fantasia:");
        jLbNomeFantasia.setOpaque(true);
        getContentPane().add(jLbNomeFantasia);
        jLbNomeFantasia.setBounds(230, 130, 134, 22);

        jTFNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNomeFantasia.setBorder(null);
        jTFNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeFantasiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNomeFantasia);
        jTFNomeFantasia.setBounds(370, 130, 280, 30);

        jLbRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbRazaoSocial.setText("  Razão Social:");
        getContentPane().add(jLbRazaoSocial);
        jLbRazaoSocial.setBounds(630, 130, 120, 22);

        jTFRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRazaoSocial.setBorder(null);
        jTFRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRazaoSocialActionPerformed(evt);
            }
        });
        getContentPane().add(jTFRazaoSocial);
        jTFRazaoSocial.setBounds(690, 130, 308, 30);

        jTFCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCNPJ.setBorder(null);
        jTFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCNPJ);
        jTFCNPJ.setBounds(370, 170, 280, 30);

        jLbCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCNPJ.setText("  CNPJ:");
        getContentPane().add(jLbCNPJ);
        jLbCNPJ.setBounds(340, 150, 60, 22);

        jBntCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCancelar.setForeground(new java.awt.Color(204, 0, 0));
        jBntCancelar.setText("Cancelar");
        jBntCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntCancelar);
        jBntCancelar.setBounds(290, 610, 150, 40);

        jBntCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrar.setForeground(new java.awt.Color(0, 153, 0));
        jBntCadastrar.setText("Cadastrar");
        jBntCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntCadastrar);
        jBntCadastrar.setBounds(460, 630, 150, 40);

        jPanel1.setBackground(new java.awt.Color(235, 223, 218));
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(249, 242, 234));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 465));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 24, 1200, 465);
        jPanel2.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 50, 1260, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntCadastrarActionPerformed

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        /*TelaAdministrador administrador = new TelaAdministrador();
        administrador.setExtendedState(JFrame.MAXIMIZED_BOTH);
        administrador.show();
        dispose();*/
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jTFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCNPJActionPerformed

    private void jTFRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRazaoSocialActionPerformed

    private void jTFNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeFantasiaActionPerformed

    private void jTFEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmail1ActionPerformed

    private void jTFEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmail2ActionPerformed

    private void jTFTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone2ActionPerformed

    private void jTFTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefone1ActionPerformed

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaActionPerformed

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstadoActionPerformed

    private void jTFPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaisActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedorCadastro().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCadastrar;
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCNPJ;
    private javax.swing.JLabel jLbCadastro;
    private javax.swing.JLabel jLbCidade;
    private javax.swing.JLabel jLbEmail1;
    private javax.swing.JLabel jLbEmail2;
    private javax.swing.JLabel jLbEstado;
    private javax.swing.JLabel jLbNomeFantasia;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbPais;
    private javax.swing.JLabel jLbRazaoSocial;
    private javax.swing.JLabel jLbRua;
    private javax.swing.JLabel jLbTelefone1;
    private javax.swing.JLabel jLbTelefone2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNomeFantasia;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFRazaoSocial;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone2;
    // End of variables declaration//GEN-END:variables
    
    public void corDeFundo() {
        
        getContentPane().setBackground(corFundo1);
        jPanel1.setBackground(corFundo2);
        jPanel2.setBackground(corFundo3);
        
    }

    public void TamanhoDoFundo() {

        jPanel1.setSize(largura - 40, altura - 200);
        jPanel1.setLocation(20, 110);

        jPanel2.setPreferredSize(new Dimension ((largura - 40)-30, (altura - 200)-80)); 
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 50));
        
    }
    
    public int CentralizarLargura(int tamanhoObjeto, int posicao, int muti) { 
        return (largura/posicao)*muti - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao, int muti) { 
        return (altura/posicao)* muti - (tamanhoObjeto/2);
    }
    
    public void AlinhamentoDosItens() {
        
        jLbCadastro.setBounds(CentralizarLargura(400, 2, 1),CentralizarAltura(55, 18, 1),400,55);
        jLbCadastro.setForeground(corFundo1);
        jLbCadastro.setBackground(corFundo3);
         
        
        jLbNomeFantasia.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),116 + 30 + 380 + 2,30);
        jTFNomeFantasia.setBounds(CentralizarLargura(116, 18,2)+ 116 + 40,CentralizarAltura(30, 15, 4),370,30);
        jLbNomeFantasia.setBackground(corFundo2);
        jLbNomeFantasia.setOpaque(true);
        jTFNomeFantasia.setBackground(corFundo2);
        jTFNomeFantasia.setOpaque(true);
        
        
        jLbRazaoSocial.setBounds((largura/2 -(CentralizarLargura(380, 16, 5) + 380)) + largura/2, CentralizarAltura(26, 15, 4),116 +29 + 380,30);
        jTFRazaoSocial.setBounds(largura - 380 - CentralizarLargura(116, 18,2), CentralizarAltura(26, 15, 4),380,30);
        jLbRazaoSocial.setBackground(corFundo2);
        jLbRazaoSocial.setOpaque(true);
        jTFRazaoSocial.setBackground(corFundo2);
        jTFRazaoSocial.setOpaque(true);
        
        jLbCNPJ.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 5),116 + 30 + 380 + 2,30);
        jTFCNPJ.setBounds(CentralizarLargura(116, 18,1)+ 116 + 40,CentralizarAltura(30, 15, 5),445,30);
        jLbCNPJ.setBackground(corFundo2);
        jLbCNPJ.setOpaque(true);
        jTFCNPJ.setBackground(corFundo2);
        jTFCNPJ.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbTelefone1.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 7)-15,116 + 30 + 380 + 2,30);
        jTFTelefone1.setBounds(CentralizarLargura(116, 18,2)+ 116+10,CentralizarAltura(30, 15, 7)-15,400,30);
        jLbTelefone1.setBackground(corFundo2);
        jLbTelefone1.setOpaque(true);
        jTFTelefone1.setBackground(corFundo2);
        jTFTelefone1.setOpaque(true);
        
        jLbEmail1.setBounds((largura/2 -(CentralizarLargura(380, 16, 5) + 380)) + largura/2, CentralizarAltura(26, 15, 7)-15,116 +29 + 380,30);
        jTFEmail1.setBounds(largura - 380 - CentralizarLargura(116, 18,2) -32, CentralizarAltura(26, 15, 7)-15,412,30);
        jLbEmail1.setBackground(corFundo2);
        jLbEmail1.setOpaque(true);
        jTFEmail1.setBackground(corFundo2);
        jTFEmail1.setOpaque(true);
        
        jLbTelefone2.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 8)-15,116 + 30 + 380 + 2,30);
        jTFTelefone2.setBounds(CentralizarLargura(116, 18,2)+ 116+10,CentralizarAltura(30, 15, 8)-15,400,30);
        jLbTelefone2.setBackground(corFundo2);
        jLbTelefone2.setOpaque(true);
        jTFTelefone2.setBackground(corFundo2);
        jTFTelefone2.setOpaque(true);
        
        jLbEmail2.setBounds((largura/2 -(CentralizarLargura(380, 16, 5) + 380)) + largura/2, CentralizarAltura(26, 15, 8)-15,116 +29 + 380,30);
        jTFEmail2.setBounds(largura - 380 - CentralizarLargura(116, 18,2) -32, CentralizarAltura(26, 15, 8)-15,412,30);
        jLbEmail2.setBackground(corFundo2);
        jLbEmail2.setOpaque(true);
        jTFEmail2.setBackground(corFundo2);
        jTFEmail2.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbPais.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 10)-30,116 + 180 + 1,30);
        jTFPais.setBounds(CentralizarLargura(116, 18,2)+ 75,CentralizarAltura(30, 15, 10)-30,220,30);
        jLbPais.setBackground(corFundo2);
        jLbPais.setOpaque(true);
        jTFPais.setBackground(corFundo2);
        jTFPais.setOpaque(true);
        
        jLbEstado.setBounds(CentralizarLargura(116, 18,7)-10,CentralizarAltura(30, 15, 10)-30,116 + 255 + 1,30);
        jTFEstado.setBounds(CentralizarLargura(116, 18,7)+ 90,CentralizarAltura(30, 15, 10)-30,270,30);
        jLbEstado.setBackground(corFundo2);
        jLbEstado.setOpaque(true);
        jTFEstado.setBackground(corFundo2);
        jTFEstado.setOpaque(true);
        
        jLbCidade.setBounds(CentralizarLargura(116, 18,13)-20,CentralizarAltura(30, 15, 10)-30,116 + 255 + 1,30);
        jTFCidade.setBounds(CentralizarLargura(116, 18,13)+ 80,CentralizarAltura(30, 15, 10)-30,270,30);
        jLbCidade.setBackground(corFundo2);
        jLbCidade.setOpaque(true);
        jTFCidade.setBackground(corFundo2);
        jTFCidade.setOpaque(true);
        
        
        jLbBairro.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 11)-30,116 + 180 + 1,30);
        jTFBairro.setBounds(CentralizarLargura(116, 18,2)+ 90,CentralizarAltura(30, 15, 11)-30,300,30);
        jLbBairro.setBackground(corFundo2);
        jLbBairro.setOpaque(true);
        jTFBairro.setBackground(corFundo2);
        jTFBairro.setOpaque(true);
        
        jLbRua.setBounds(CentralizarLargura(116, 18,7)+120,CentralizarAltura(30, 15, 11)-30,116 + 255 + 1,30);
        jTFRua.setBounds(CentralizarLargura(116, 18,7)+ 190,CentralizarAltura(30, 15, 11)-30,300,30);
        jLbRua.setBackground(corFundo2);
        jLbRua.setOpaque(true);
        jTFRua.setBackground(corFundo2);
        jTFRua.setOpaque(true);
        
        jLbNumero.setBounds(CentralizarLargura(116, 18,13)-20+170,CentralizarAltura(30, 15, 11)-30,116 + 85 + 1,30);
        jTFNumero.setBounds(CentralizarLargura(116, 18,13)+ 250,CentralizarAltura(30, 15, 11)-30,100,30);
        jLbNumero.setBackground(corFundo2);
        jLbNumero.setOpaque(true);
        jTFNumero.setBackground(corFundo2);
        jTFNumero.setOpaque(true);
        
        jBntCadastrar.setBounds(CentralizarLargura(116, 18,6),CentralizarAltura(30, 15, 12)-10,150,40);
        jBntCadastrar.setBackground(corFundo4);
        jBntCadastrar.setOpaque(true);
        jBntCadastrar.setForeground(corFonte1);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,6) - 150,CentralizarAltura(30, 15, 12)-10,150,40);
        jBntCancelar.setBackground(corFundo4);
        jBntCancelar.setOpaque(true);
        jBntCadastrar.setForeground(corFonte2);
        
    }


}
