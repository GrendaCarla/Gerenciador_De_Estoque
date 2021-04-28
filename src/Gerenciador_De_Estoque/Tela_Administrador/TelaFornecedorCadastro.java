
package Gerenciador_De_Estoque.Tela_Administrador;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TelaFornecedorCadastro extends javax.swing.JFrame {
    
    // resolução tela pc
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    int largura = d.width;
    int altura = d.height;

    
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
        jTFPais1 = new javax.swing.JTextField();
        jLbTelefone2 = new javax.swing.JLabel();
        jTFPais2 = new javax.swing.JTextField();
        jTFPais3 = new javax.swing.JTextField();
        jLbEmail1 = new javax.swing.JLabel();
        jTFPais4 = new javax.swing.JTextField();
        jLbEmail2 = new javax.swing.JLabel();
        jLbNomeFantasia = new javax.swing.JLabel();
        jTFNomeFantasia = new javax.swing.JTextField();
        jLbRazaoSocial = new javax.swing.JLabel();
        jTFRazaoSocial = new javax.swing.JTextField();
        jTFCNPJ = new javax.swing.JTextField();
        jLbCNPJ = new javax.swing.JLabel();
        jBntCancelar = new javax.swing.JButton();
        jBntCadastrar = new javax.swing.JButton();
        jSeparador1 = new javax.swing.JSeparator();
        jSeparador2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(147, 87, 107));
        setName("FornecedorCadastro"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1340, 690));
        setSize(new java.awt.Dimension(1340, 690));
        getContentPane().setLayout(null);

        jLbPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbPais.setText("País");
        getContentPane().add(jLbPais);
        jLbPais.setBounds(133, 137, 31, 22);

        jTFPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaisActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais);
        jTFPais.setBounds(182, 134, 258, 28);

        jLbEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEstado.setText("Estado");
        getContentPane().add(jLbEstado);
        jLbEstado.setBounds(506, 137, 53, 22);

        jLbCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCidade.setText("Cidade");
        getContentPane().add(jLbCidade);
        jLbCidade.setBounds(744, 137, 53, 22);

        jLbBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbBairro.setText("Bairro");
        getContentPane().add(jLbBairro);
        jLbBairro.setBounds(133, 190, 46, 22);

        jLbRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbRua.setText("Rua");
        getContentPane().add(jLbRua);
        jLbRua.setBounds(517, 190, 30, 22);

        jLbNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNumero.setText("Número");
        getContentPane().add(jLbNumero);
        jLbNumero.setBounds(982, 190, 62, 22);

        jLbCadastro.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLbCadastro.setText("CADASTRO");
        getContentPane().add(jLbCadastro);
        jLbCadastro.setBounds(583, 11, 159, 39);

        jTFEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFEstado);
        jTFEstado.setBounds(577, 134, 91, 28);

        jTFCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCidade);
        jTFCidade.setBounds(815, 134, 327, 28);

        jTFBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTFBairro);
        jTFBairro.setBounds(197, 187, 256, 28);

        jTFRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFRua);
        jTFRua.setBounds(565, 187, 327, 28);

        jTFNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNumero);
        jTFNumero.setBounds(1062, 187, 110, 28);

        jLbTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone1.setText("Telefone 1");
        getContentPane().add(jLbTelefone1);
        jLbTelefone1.setBounds(240, 300, 84, 22);

        jTFPais1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPais1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais1);
        jTFPais1.setBounds(340, 300, 258, 28);

        jLbTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone2.setText("Telefone 2");
        getContentPane().add(jLbTelefone2);
        jLbTelefone2.setBounds(700, 300, 84, 22);

        jTFPais2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPais2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais2);
        jTFPais2.setBounds(810, 300, 258, 28);

        jTFPais3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPais3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais3);
        jTFPais3.setBounds(790, 350, 258, 28);

        jLbEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail1.setText("E-mail 1");
        getContentPane().add(jLbEmail1);
        jLbEmail1.setBounds(240, 350, 65, 22);

        jTFPais4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPais4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais4);
        jTFPais4.setBounds(320, 350, 258, 28);

        jLbEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail2.setText("E-mail 2");
        getContentPane().add(jLbEmail2);
        jLbEmail2.setBounds(700, 350, 65, 22);

        jLbNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNomeFantasia.setText("Nome Fantasia");
        getContentPane().add(jLbNomeFantasia);
        jLbNomeFantasia.setBounds(40, 470, 116, 22);

        jTFNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeFantasiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNomeFantasia);
        jTFNomeFantasia.setBounds(180, 470, 258, 28);

        jLbRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbRazaoSocial.setText("Razão Social");
        getContentPane().add(jLbRazaoSocial);
        jLbRazaoSocial.setBounds(510, 470, 98, 22);

        jTFRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRazaoSocialActionPerformed(evt);
            }
        });
        getContentPane().add(jTFRazaoSocial);
        jTFRazaoSocial.setBounds(630, 470, 308, 28);

        jTFCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(jTFCNPJ);
        jTFCNPJ.setBounds(1050, 470, 217, 28);

        jLbCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCNPJ.setText("CNPJ");
        getContentPane().add(jLbCNPJ);
        jLbCNPJ.setBounds(1000, 470, 41, 22);

        jBntCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCancelar.setText("Cancelar");
        jBntCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntCancelar);
        jBntCancelar.setBounds(810, 610, 150, 40);

        jBntCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrar.setText("Cadastrar");
        jBntCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntCadastrar);
        jBntCadastrar.setBounds(460, 630, 150, 40);
        getContentPane().add(jSeparador1);
        jSeparador1.setBounds(10, 260, 1320, 2);
        getContentPane().add(jSeparador2);
        jSeparador2.setBounds(10, 420, 1320, 2);

        jPanel1.setBackground(new java.awt.Color(235, 223, 218));
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jPanel2.setBackground(new java.awt.Color(249, 242, 234));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 465));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));
        jPanel1.add(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 50, 1260, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        TelaAdministrador administrador = new TelaAdministrador();
        administrador.setExtendedState(JFrame.MAXIMIZED_BOTH);
        administrador.show();
        dispose();
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jTFPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaisActionPerformed

    private void jTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstadoActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBairroActionPerformed

    private void jTFRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRuaActionPerformed

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jTFPais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPais1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPais1ActionPerformed

    private void jTFPais2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPais2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPais2ActionPerformed

    private void jTFPais3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPais3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPais3ActionPerformed

    private void jTFPais4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPais4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPais4ActionPerformed

    private void jTFNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeFantasiaActionPerformed

    private void jTFRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRazaoSocialActionPerformed

    private void jTFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCNPJActionPerformed

    private void jBntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntCadastrarActionPerformed


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
    private javax.swing.JSeparator jSeparador1;
    private javax.swing.JSeparator jSeparador2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNomeFantasia;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFPais1;
    private javax.swing.JTextField jTFPais2;
    private javax.swing.JTextField jTFPais3;
    private javax.swing.JTextField jTFPais4;
    private javax.swing.JTextField jTFRazaoSocial;
    private javax.swing.JTextField jTFRua;
    // End of variables declaration//GEN-END:variables

    public void corDeFundo() {
        Color corFundo1 = new Color(147, 87, 107);
        getContentPane().setBackground(corFundo1);

        Color corFundo2 = new Color(227, 215, 206);
        jPanel1.setBackground(corFundo2);

        Color corFundo3 = new Color(249,242,234);
        jPanel2.setBackground(corFundo3);
    }

    public void TamanhoDoFundo() {

        jPanel1.setSize(largura - 40, altura - 200);
        jPanel1.setLocation(20, 110);

        jPanel2.setPreferredSize(new Dimension ((largura - 40)-30, (altura - 200)-80)); 
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 50));
    }
    
    public int CentralizarLargura(int tamanhoObjeto, int posicao) { 
        return (largura/posicao) - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao) { 
        return (altura/posicao) - (tamanhoObjeto/2);
    }
    
    public void AlinhamentoDosItens() {
        
        
        jLbCadastro.setBounds(CentralizarLargura(158, 2),CentralizarAltura(39, 18),159,39);
        System.out.println(jLbCadastro.getX());
        //jLbCadastro.setY(altura/18);
        
    }


}
