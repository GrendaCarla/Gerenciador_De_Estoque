
package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Fornecedores;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class TelaFornecedorAlterar extends javax.swing.JFrame {
    
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
    
    int numero;

    public TelaFornecedorAlterar() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFPais = new javax.swing.JTextField();
        jTFEstado = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jTFNomeFantasia = new javax.swing.JTextField();
        jFTFNumero = new javax.swing.JFormattedTextField();
        jTFRazaoSocial = new javax.swing.JTextField();
        jFTFCNPJ = new javax.swing.JFormattedTextField();
        jLbPais = new javax.swing.JLabel();
        jLbEstado = new javax.swing.JLabel();
        jLbCidade = new javax.swing.JLabel();
        jLbBairro = new javax.swing.JLabel();
        jLbRua = new javax.swing.JLabel();
        jLbNumero = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbTelefone1 = new javax.swing.JLabel();
        jLbTelefone2 = new javax.swing.JLabel();
        jLbEmail1 = new javax.swing.JLabel();
        jLbEmail2 = new javax.swing.JLabel();
        jLbNomeFantasia = new javax.swing.JLabel();
        jLbRazaoSocial = new javax.swing.JLabel();
        jLbCNPJ = new javax.swing.JLabel();
        jBntCancelar = new javax.swing.JButton();
        jBntSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais.setBorder(null);
        getContentPane().add(jTFPais);
        jTFPais.setBounds(240, 530, 258, 22);

        jTFEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEstado.setBorder(null);
        getContentPane().add(jTFEstado);
        jTFEstado.setBounds(580, 560, 91, 22);

        jTFCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCidade.setBorder(null);
        getContentPane().add(jTFCidade);
        jTFCidade.setBounds(790, 560, 327, 22);

        jTFBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBairro.setBorder(null);
        getContentPane().add(jTFBairro);
        jTFBairro.setBounds(270, 560, 256, 22);

        jTFRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRua.setBorder(null);
        getContentPane().add(jTFRua);
        jTFRua.setBounds(150, 540, 327, 22);

        jTFTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone1.setBorder(null);
        getContentPane().add(jTFTelefone1);
        jTFTelefone1.setBounds(340, 300, 258, 22);

        jTFTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone2.setBorder(null);
        getContentPane().add(jTFTelefone2);
        jTFTelefone2.setBounds(810, 300, 258, 22);

        jTFEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail2.setBorder(null);
        jTFEmail2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFEmail2);
        jTFEmail2.setBounds(790, 350, 258, 22);

        jTFEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail1.setBorder(null);
        jTFEmail1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFEmail1);
        jTFEmail1.setBounds(320, 350, 258, 22);

        jTFNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNomeFantasia.setBorder(null);
        getContentPane().add(jTFNomeFantasia);
        jTFNomeFantasia.setBounds(370, 130, 280, 30);

        jFTFNumero.setBorder(null);
        jFTFNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFNumero);
        jFTFNumero.setBounds(120, 140, 90, 22);

        jTFRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRazaoSocial.setBorder(null);
        getContentPane().add(jTFRazaoSocial);
        jTFRazaoSocial.setBounds(690, 130, 308, 30);

        jFTFCNPJ.setBorder(null);
        try {
            jFTFCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## . ### . ### / #### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFCNPJ);
        jFTFCNPJ.setBounds(120, 140, 50, 22);

        jLbPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbPais.setText("  País:");
        getContentPane().add(jLbPais);
        jLbPais.setBounds(171, 530, 60, 22);

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
        jLbNumero.setBounds(1072, 570, 90, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("ALTERAR  FORNECEDOR");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(212, 11, 750, 60);

        jLbTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone1.setText("  Telefone 1:");
        getContentPane().add(jLbTelefone1);
        jLbTelefone1.setBounds(240, 300, 110, 22);

        jLbTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTelefone2.setText("  Telefone 2:");
        getContentPane().add(jLbTelefone2);
        jLbTelefone2.setBounds(700, 300, 110, 22);

        jLbEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail1.setText("  E-mail 1:");
        getContentPane().add(jLbEmail1);
        jLbEmail1.setBounds(240, 350, 90, 22);

        jLbEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbEmail2.setText("  E-mail 2:");
        getContentPane().add(jLbEmail2);
        jLbEmail2.setBounds(700, 350, 90, 22);

        jLbNomeFantasia.setBackground(new java.awt.Color(51, 255, 153));
        jLbNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNomeFantasia.setText("  Nome Fantasia:");
        getContentPane().add(jLbNomeFantasia);
        jLbNomeFantasia.setBounds(230, 130, 140, 22);

        jLbRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbRazaoSocial.setText("  Razão Social:");
        getContentPane().add(jLbRazaoSocial);
        jLbRazaoSocial.setBounds(630, 130, 120, 22);

        jLbCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCNPJ.setText("  CNPJ:");
        getContentPane().add(jLbCNPJ);
        jLbCNPJ.setBounds(340, 150, 60, 22);

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
        jBntCancelar.setBounds(290, 610, 150, 40);

        jBntSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSalvar.setForeground(new java.awt.Color(0, 153, 0));
        jBntSalvar.setText("Salvar");
        jBntSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntSalvar);
        jBntSalvar.setBounds(460, 630, 150, 40);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 50, 1260, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed

        try {
            TelaAdministrador Janela = new TelaAdministrador();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        if(jTFPais.getText().isEmpty() == true || jTFEstado.getText().isEmpty() == true || jTFCidade.getText().isEmpty() == true || jTFBairro.getText().isEmpty() == true || jTFRua.getText().isEmpty() == true || jFTFNumero.getText().isEmpty() == true || jTFTelefone1.getText().isEmpty() == true || (jFTFCNPJ.getText().replaceAll(" ","")).length() != 18 || jTFRazaoSocial.getText().isEmpty() == true || jTFNomeFantasia.getText().isEmpty() == true){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "É obrigatório o preenchimento de todos os campos.\nExceto: Telefone 2, E-mail 1 e E-mail 2\n\n\n\n");
        }else{
            try {

                Fornecedores fornecedor = new Fornecedores();
                fornecedor.ConsultarFornecedor();

                fornecedor.AlterarFornecedor(jTFPais.getText(), jTFEstado.getText(), jTFCidade.getText(), jTFBairro.getText(), jTFRua.getText(), jFTFNumero.getText(), jTFTelefone1.getText(), jTFTelefone2.getText(), jTFEmail1.getText(), jTFEmail2.getText(), (jFTFCNPJ.getText().substring(0, 2) + jFTFCNPJ.getText().substring(5, 8) + jFTFCNPJ.getText().substring(11, 14) + jFTFCNPJ.getText().substring(17, 21) + jFTFCNPJ.getText().substring(24, 26)), jTFRazaoSocial.getText(), jTFNomeFantasia.getText(), numero);


                TelaAdministrador Janela = new TelaAdministrador();
                //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                Janela.setSize(d.width + 8, d.height - 37);
                Janela.setResizable(false);

                Janela.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntSalvarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedorAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JFormattedTextField jFTFCNPJ;
    private javax.swing.JFormattedTextField jFTFNumero;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCNPJ;
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
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNomeFantasia;
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
        
        jLbTitulo.setBounds(CentralizarLargura(750, 2, 1),CentralizarAltura(55, 18, 1),750,55);
        jLbTitulo.setForeground(corFundo3);
        jLbTitulo.setBackground(corFundo4);
         
        
        jLbNomeFantasia.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),140 + 370 + 15 + 4,30);
        jTFNomeFantasia.setBounds(CentralizarLargura(116, 18,2)+ 140 + 15,CentralizarAltura(30, 15, 4),370,30);
        jLbNomeFantasia.setBackground(corFundo4);
        jLbNomeFantasia.setOpaque(true);
        jTFNomeFantasia.setBackground(corFundo4);
        jTFNomeFantasia.setOpaque(true);
        
        
        jLbRazaoSocial.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(26, 15, 4),140 + 370 + 15 + 4,30);
        jTFRazaoSocial.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 120 + 15, CentralizarAltura(26, 15, 4),390,30);
        jLbRazaoSocial.setBackground(corFundo4);
        jLbRazaoSocial.setOpaque(true);
        jTFRazaoSocial.setBackground(corFundo4);
        jTFRazaoSocial.setOpaque(true);
        
        jLbCNPJ.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 5),140 + 370 + 15 + 4,30);
        jFTFCNPJ.setBounds(CentralizarLargura(116, 18,2)+ 60 + 15,CentralizarAltura(30, 15, 5),450,30);
        jLbCNPJ.setBackground(corFundo4);
        jLbCNPJ.setOpaque(true);
        jFTFCNPJ.setBackground(corFundo4);
        jFTFCNPJ.setOpaque(true);
        
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
        jFTFNumero.setBounds(largura - CentralizarLargura(116, 18, 2) - 100 - 4,CentralizarAltura(30, 15, 10),100,30);
        jLbNumero.setBackground(corFundo4);
        jLbNumero.setOpaque(true);
        jFTFNumero.setBackground(corFundo4);
        jFTFNumero.setOpaque(true);
        
        jBntSalvar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(corFundo5);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
                
        Fornecedores fornecedor = new Fornecedores();
        
        fornecedor.ConsultarFornecedor();
        
        jTFNomeFantasia.setText(fornecedor.getNomeFantasia().get(num));
        jTFRazaoSocial.setText(fornecedor.getRazaoSocial().get(num));
        jFTFCNPJ.setText(fornecedor.getCNPJ().get(num));
        
        jTFTelefone1.setText(fornecedor.getTelefone1().get(num));
        jTFTelefone2.setText(fornecedor.getTelefone2().get(num));
        jTFEmail1.setText(fornecedor.getEmail1().get(num));
        jTFEmail2.setText(fornecedor.getEmail2().get(num));
        
        jTFPais.setText(fornecedor.getPais().get(num));
        jTFEstado.setText(fornecedor.getEstado().get(num));
        jTFCidade.setText(fornecedor.getCidade().get(num));
        jTFBairro.setText(fornecedor.getBairro().get(num));
        jTFRua.setText(fornecedor.getRua().get(num));
        jFTFNumero.setText(fornecedor.getNumero().get(num));
        
    }

}
