
package Gerenciador_De_Estoque.Tela_Administrador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

public final class TelaClienteCadastro extends javax.swing.JFrame {

    // resolução tela pc
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    int largura = d.width;
    int altura = d.height;
    
    Color corFundo1 = new Color(238, 247, 242);
    Color corFundo2 = new Color(3, 152, 158);
    Color corFundo3 = new Color(255, 255, 255);
    Color corFundo4 = new Color(207,220,212);
    Color corFundo5 = new Color(5,180,145);
    Color corFundo6 = new Color(129,88,119);
    
    public TelaClienteCadastro() {
        initComponents();      
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbEmail1 = new javax.swing.JLabel();
        jLbBairro = new javax.swing.JLabel();
        jTFPais = new javax.swing.JTextField();
        jLbNome = new javax.swing.JLabel();
        jLbEmail2 = new javax.swing.JLabel();
        jLbTelefone1 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLbEstado = new javax.swing.JLabel();
        jTFDataDeNascimento = new javax.swing.JTextField();
        jLbCidade = new javax.swing.JLabel();
        jLbTelefone2 = new javax.swing.JLabel();
        jLbNumero = new javax.swing.JLabel();
        jTFCPF = new javax.swing.JTextField();
        jLbDataDeNascimento = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jLbPais = new javax.swing.JLabel();
        jLbCPF = new javax.swing.JLabel();
        jLbRua = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jLbCadastro = new javax.swing.JLabel();
        jBntCadastrar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 465));
        setSize(new java.awt.Dimension(1200, 465));
        getContentPane().setLayout(null);

        jLbEmail1.setText("  Email1:");
        getContentPane().add(jLbEmail1);
        jLbEmail1.setBounds(580, 370, 60, 14);

        jLbBairro.setText("  Bairro:");
        getContentPane().add(jLbBairro);
        jLbBairro.setBounds(560, 200, 40, 14);

        jTFPais.setBorder(null);
        jTFPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaisActionPerformed(evt);
            }
        });
        getContentPane().add(jTFPais);
        jTFPais.setBounds(620, 110, 10, 14);

        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(570, 10, 37, 14);

        jLbEmail2.setText("  Email2:");
        getContentPane().add(jLbEmail2);
        jLbEmail2.setBounds(580, 410, 50, 14);

        jLbTelefone1.setText("  Telefone1:");
        getContentPane().add(jLbTelefone1);
        jLbTelefone1.setBounds(570, 290, 60, 14);

        jTFCidade.setBorder(null);
        getContentPane().add(jTFCidade);
        jTFCidade.setBounds(610, 170, 0, 14);

        jLbEstado.setText("  Estado:");
        getContentPane().add(jLbEstado);
        jLbEstado.setBounds(570, 140, 50, 14);

        jTFDataDeNascimento.setBorder(null);
        jTFDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataDeNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFDataDeNascimento);
        jTFDataDeNascimento.setBounds(680, 70, 59, 14);

        jLbCidade.setText("  Cidade:");
        getContentPane().add(jLbCidade);
        jLbCidade.setBounds(560, 170, 50, 14);

        jLbTelefone2.setText("  Telefone2:");
        getContentPane().add(jLbTelefone2);
        jLbTelefone2.setBounds(570, 330, 60, 14);

        jLbNumero.setText("  Numero:");
        getContentPane().add(jLbNumero);
        jLbNumero.setBounds(570, 260, 50, 14);

        jTFCPF.setBorder(null);
        getContentPane().add(jTFCPF);
        jTFCPF.setBounds(610, 40, 0, 14);

        jLbDataDeNascimento.setText("  DataDeNascimento:");
        getContentPane().add(jLbDataDeNascimento);
        jLbDataDeNascimento.setBounds(570, 70, 130, 14);

        jTFBairro.setBorder(null);
        getContentPane().add(jTFBairro);
        jTFBairro.setBounds(610, 200, 0, 14);

        jTFNome.setBorder(null);
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNome);
        jTFNome.setBounds(610, 10, 59, 14);

        jTFRua.setBorder(null);
        getContentPane().add(jTFRua);
        jTFRua.setBounds(610, 230, 0, 14);

        jLbPais.setText("  Pais:");
        getContentPane().add(jLbPais);
        jLbPais.setBounds(580, 110, 34, 14);

        jLbCPF.setText("  CPF:");
        getContentPane().add(jLbCPF);
        jLbCPF.setBounds(570, 40, 29, 14);

        jLbRua.setText("  Rua:");
        getContentPane().add(jLbRua);
        jLbRua.setBounds(570, 230, 29, 14);

        jTFEstado.setBorder(null);
        jTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFEstado);
        jTFEstado.setBounds(630, 140, 0, 14);

        jTFTelefone1.setBorder(null);
        getContentPane().add(jTFTelefone1);
        jTFTelefone1.setBounds(650, 290, 0, 14);

        jTFTelefone2.setBorder(null);
        getContentPane().add(jTFTelefone2);
        jTFTelefone2.setBounds(640, 330, 0, 14);

        jTFEmail1.setBorder(null);
        getContentPane().add(jTFEmail1);
        jTFEmail1.setBounds(650, 370, 0, 14);

        jTFEmail2.setBorder(null);
        getContentPane().add(jTFEmail2);
        jTFEmail2.setBounds(650, 410, 0, 14);

        jTFNumero.setBorder(null);
        getContentPane().add(jTFNumero);
        jTFNumero.setBounds(600, 210, 0, 14);

        jLbCadastro.setBackground(new java.awt.Color(204, 204, 204));
        jLbCadastro.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbCadastro.setText("CADASTRO ");
        jLbCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbCadastro.setOpaque(true);
        getContentPane().add(jLbCadastro);
        jLbCadastro.setBounds(210, 10, 400, 60);

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
        jBntCadastrar.setBounds(250, 420, 107, 31);

        jBntCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBntCancelar.setText("Cancelar");
        jBntCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntCancelar);
        jBntCancelar.setBounds(110, 400, 99, 31);

        jPanel1.setBackground(new java.awt.Color(235, 223, 218));
        jPanel1.setEnabled(false);
        jPanel1.setFocusable(false);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(249, 242, 234));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 465));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 465);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 50, 1260, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataDeNascimentoActionPerformed

    private void jTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstadoActionPerformed

    private void jTFPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaisActionPerformed

    private void jBntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntCadastrarActionPerformed

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        /*TelaAdministrador administrador = new TelaAdministrador();
        administrador.setExtendedState(JFrame.MAXIMIZED_BOTH);
        administrador.show();
        dispose();*/
    }//GEN-LAST:event_jBntCancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCadastrar;
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCPF;
    private javax.swing.JLabel jLbCadastro;
    private javax.swing.JLabel jLbCidade;
    private javax.swing.JLabel jLbDataDeNascimento;
    private javax.swing.JLabel jLbEmail1;
    private javax.swing.JLabel jLbEmail2;
    private javax.swing.JLabel jLbEstado;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbPais;
    private javax.swing.JLabel jLbRua;
    private javax.swing.JLabel jLbTelefone1;
    private javax.swing.JLabel jLbTelefone2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFDataDeNascimento;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPais;
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
        jLbCadastro.setForeground(corFundo3);
        jLbCadastro.setBackground(corFundo4);
         
        
        jLbNome.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),140 + 370 + 15 + 4,30);
        jTFNome.setBounds(CentralizarLargura(116, 18,2)+ 70 + 15,CentralizarAltura(30, 15, 4),440,30);
        jLbNome.setBackground(corFundo4);
        jLbNome.setOpaque(true);
        jTFNome.setBackground(corFundo4);
        jTFNome.setOpaque(true);
        
        
        jLbDataDeNascimento.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(26, 15, 4),140 + 370 + 15 + 4,30);
        jTFDataDeNascimento.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 120 + 15, CentralizarAltura(26, 15, 4),390,30);
        jLbDataDeNascimento.setBackground(corFundo4);
        jLbDataDeNascimento.setOpaque(true);
        jTFDataDeNascimento.setBackground(corFundo4);
        jTFDataDeNascimento.setOpaque(true);
        
        jLbCPF.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 5),140 + 220 + 15 + 4,30);
        jTFCPF.setBounds(CentralizarLargura(116, 18,2)+ 60 + 15,CentralizarAltura(30, 15, 5),250,30);
        jLbCPF.setBackground(corFundo4);
        jLbCPF.setOpaque(true);
        jTFCPF.setBackground(corFundo4);
        jTFCPF.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbTelefone1.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 55),140 + 370 + 15 + 4,30);
        jTFTelefone1.setBounds(CentralizarLargura(116, 18,2)+ 110 +15,CentralizarAltura(30, 120, 55),400,30);
        jLbTelefone1.setBackground(corFundo4);
        jLbTelefone1.setOpaque(true);
        jTFTelefone1.setBackground(corFundo4);
        jTFTelefone1.setOpaque(true);
        
        jLbEmail1.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 120, 55),140 + 370 + 15 + 4,30);
        jTFEmail1.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 90 + 15, CentralizarAltura(30, 120, 55),420,30);
        jLbEmail1.setBackground(corFundo4);
        jLbEmail1.setOpaque(true);
        jTFEmail1.setBackground(corFundo4);
        jTFEmail1.setOpaque(true);
        
        jLbTelefone2.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 64),140 + 370 + 15 + 4,30);
        jTFTelefone2.setBounds(CentralizarLargura(116, 18,2)+ 110 + 15,CentralizarAltura(30, 120, 64),400,30);
        jLbTelefone2.setBackground(corFundo4);
        jLbTelefone2.setOpaque(true);
        jTFTelefone2.setBackground(corFundo4);
        jTFTelefone2.setOpaque(true);
        
        jLbEmail2.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 120, 64),140 + 370 + 15 + 4,30);
        jTFEmail2.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 90 + 15, CentralizarAltura(30, 120, 64),420,30);
        jLbEmail2.setBackground(corFundo4);
        jLbEmail2.setOpaque(true);
        jTFEmail2.setBackground(corFundo4);
        jTFEmail2.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbPais.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 9),60 + 15 + 220 + 4,30);
        jTFPais.setBounds(CentralizarLargura(116, 18,2)+ 60 + 15,CentralizarAltura(30, 15, 9),220,30);
        jLbPais.setBackground(corFundo4);
        jLbPais.setOpaque(true);
        jTFPais.setBackground(corFundo4);
        jTFPais.setOpaque(true);
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacoEstado = (((largura - CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4)- (CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) - (80 + 15 + 270 + 4)/2;
        
        jLbEstado.setBounds(espacoEstado,CentralizarAltura(30, 15, 9),80 + 15 + 270 + 4,30);
        jTFEstado.setBounds(espacoEstado + 80+ 15,CentralizarAltura(30, 15, 9),270,30);
        jLbEstado.setBackground(corFundo4);
        jLbEstado.setOpaque(true);
        jTFEstado.setBackground(corFundo4);
        jTFEstado.setOpaque(true);
        
        jLbCidade.setBounds(largura - CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4,CentralizarAltura(30, 15, 9),80 + 15 + 270 + 4,30);
        jTFCidade.setBounds(largura - CentralizarLargura(116, 18, 2) - 270 - 4,CentralizarAltura(30, 15, 9),270,30);
        jLbCidade.setBackground(corFundo4);
        jLbCidade.setOpaque(true);
        jTFCidade.setBackground(corFundo4);
        jTFCidade.setOpaque(true);
        
        
        jLbBairro.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 10),70 + 15 + 300 + 4,30);
        jTFBairro.setBounds(CentralizarLargura(116, 18,2)+ 70 + 15,CentralizarAltura(30, 15, 10),300,30);
        jLbBairro.setBackground(corFundo4);
        jLbBairro.setOpaque(true);
        jTFBairro.setBackground(corFundo4);
        jTFBairro.setOpaque(true);
        
        // conta prara saber aonde deve colocar a rua para q fique centralizado entre o bairro e a numero
        int espacoRua = (((largura - CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4)- (CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) - (50 + 15 + 320 + 4)/2;
        
        jLbRua.setBounds(espacoRua,CentralizarAltura(30, 15, 10),50 + 15 + 320 + 4,30);
        jTFRua.setBounds(espacoRua + 50 + 15,CentralizarAltura(30, 15, 10),320,30);
        jLbRua.setBackground(corFundo4);
        jLbRua.setOpaque(true);
        jTFRua.setBackground(corFundo4);
        jTFRua.setOpaque(true);
        
        jLbNumero.setBounds(largura - CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4,CentralizarAltura(30, 15, 10),90 + 15 + 100 + 4,30);
        jTFNumero.setBounds(largura - CentralizarLargura(116, 18, 2) - 100 - 4,CentralizarAltura(30, 15, 10),100,30);
        jLbNumero.setBackground(corFundo4);
        jLbNumero.setOpaque(true);
        jTFNumero.setBackground(corFundo4);
        jTFNumero.setOpaque(true);
        
        jBntCadastrar.setBounds(CentralizarLargura(116, 18,6),CentralizarAltura(30, 30, 24),150,40);
        jBntCadastrar.setBackground(corFundo5);
        jBntCadastrar.setOpaque(true);
        jBntCadastrar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,6) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }


}
