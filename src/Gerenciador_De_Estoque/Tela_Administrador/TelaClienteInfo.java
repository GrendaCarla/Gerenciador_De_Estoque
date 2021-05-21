
package Gerenciador_De_Estoque.Tela_Administrador;

import Design.Design;
import Gerenciador_De_Estoque.Clientes;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaClienteInfo extends javax.swing.JFrame {

    int numero;
    
    Design design = new Design();
    
    public TelaClienteInfo() {
        initComponents();
        
        AlinhamentoDosItens();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFID = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jTFPais = new javax.swing.JTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFEstado = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jTFCPF = new javax.swing.JTextField();
        jLbDataDeNascimento = new javax.swing.JLabel();
        jLbCPF = new javax.swing.JLabel();
        jLbID = new javax.swing.JLabel();
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
        jLbNome = new javax.swing.JLabel();
        jBntAlterar = new javax.swing.JButton();
        jBntVoltar = new javax.swing.JButton();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 465));
        setSize(new java.awt.Dimension(1200, 465));
        getContentPane().setLayout(null);

        jTFID.setEditable(false);
        jTFID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFID.setBorder(null);
        jTFID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFID);
        jTFID.setBounds(240, 530, 258, 22);

        jTFEmail2.setEditable(false);
        jTFEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail2.setBorder(null);
        jTFEmail2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFEmail2);
        jTFEmail2.setBounds(790, 350, 258, 22);

        jTFEmail1.setEditable(false);
        jTFEmail1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEmail1.setBorder(null);
        jTFEmail1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFEmail1);
        jTFEmail1.setBounds(320, 350, 258, 22);

        jTFTelefone2.setEditable(false);
        jTFTelefone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone2.setBorder(null);
        jTFTelefone2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFTelefone2);
        jTFTelefone2.setBounds(810, 300, 258, 22);

        jTFRua.setEditable(false);
        jTFRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFRua.setBorder(null);
        jTFRua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFRua);
        jTFRua.setBounds(150, 540, 327, 22);

        jTFPais.setEditable(false);
        jTFPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFPais.setBorder(null);
        jTFPais.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFPais);
        jTFPais.setBounds(240, 530, 258, 22);

        jTFTelefone1.setEditable(false);
        jTFTelefone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTelefone1.setBorder(null);
        jTFTelefone1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFTelefone1);
        jTFTelefone1.setBounds(340, 300, 258, 22);

        jTFCidade.setEditable(false);
        jTFCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCidade.setBorder(null);
        jTFCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFCidade);
        jTFCidade.setBounds(790, 560, 327, 22);

        jTFBairro.setEditable(false);
        jTFBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBairro.setBorder(null);
        jTFBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFBairro);
        jTFBairro.setBounds(270, 560, 256, 22);

        jTFEstado.setEditable(false);
        jTFEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFEstado.setBorder(null);
        jTFEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFEstado);
        jTFEstado.setBounds(580, 560, 91, 22);

        jTFNome.setEditable(false);
        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNome.setBorder(null);
        jTFNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFNome);
        jTFNome.setBounds(370, 130, 280, 30);

        jTFNumero.setEditable(false);
        jTFNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNumero.setBorder(null);
        jTFNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFNumero);
        jTFNumero.setBounds(1170, 570, 110, 22);

        jTFData.setEditable(false);
        jTFData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData.setBorder(null);
        jTFData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFData);
        jTFData.setBounds(1170, 570, 110, 22);

        jTFCPF.setEditable(false);
        jTFCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCPF.setBorder(null);
        jTFCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFCPF);
        jTFCPF.setBounds(1170, 570, 110, 22);

        jLbDataDeNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbDataDeNascimento.setText("  Data de Nascimento:");
        getContentPane().add(jLbDataDeNascimento);
        jLbDataDeNascimento.setBounds(500, 130, 180, 22);

        jLbCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCPF.setText("  CPF:");
        jLbCPF.setToolTipText("");
        getContentPane().add(jLbCPF);
        jLbCPF.setBounds(170, 110, 60, 30);

        jLbID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbID.setText("  ID:");
        jLbID.setToolTipText("");
        getContentPane().add(jLbID);
        jLbID.setBounds(171, 530, 60, 22);

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
        jLbTitulo.setText("CLIENTE");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(412, 11, 550, 60);

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

        jLbNome.setBackground(new java.awt.Color(51, 255, 153));
        jLbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(230, 130, 70, 22);

        jBntAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntAlterar.setForeground(new java.awt.Color(0, 153, 0));
        jBntAlterar.setText("Alterar");
        jBntAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntAlterar);
        jBntAlterar.setBounds(590, 610, 150, 40);

        jBntVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jBntVoltar.setText("Voltar");
        jBntVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntVoltar);
        jBntVoltar.setBounds(290, 610, 150, 40);

        jLbFundo2.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo2.setOpaque(true);
        getContentPane().add(jLbFundo2);
        jLbFundo2.setBounds(0, 250, 0, 0);

        jLbFundo1.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoTabela.png"))); // NOI18N
        getContentPane().add(jLbFundo1);
        jLbFundo1.setBounds(60, 370, 170, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntAlterarActionPerformed
        try {
            TelaClienteAlterar alterCliente = new TelaClienteAlterar();
            //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            alterCliente.setSize(d.width + 8, d.height - 37);
            alterCliente.setResizable(false);

            alterCliente.PegarDados(numero);

            alterCliente.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntAlterarActionPerformed

    private void jBntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarActionPerformed

        try {
            TelaAdministrador Janela = new TelaAdministrador();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(4);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClienteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntAlterar;
    private javax.swing.JButton jBntVoltar;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCPF;
    private javax.swing.JLabel jLbCidade;
    private javax.swing.JLabel jLbDataDeNascimento;
    private javax.swing.JLabel jLbEmail1;
    private javax.swing.JLabel jLbEmail2;
    private javax.swing.JLabel jLbEstado;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbID;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbPais;
    private javax.swing.JLabel jLbRua;
    private javax.swing.JLabel jLbTelefone1;
    private javax.swing.JLabel jLbTelefone2;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPais;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFTelefone1;
    private javax.swing.JTextField jTFTelefone2;
    // End of variables declaration//GEN-END:variables

    public void AlinhamentoDosItens() {
        
        getContentPane().setBackground(design.getCorFundo1());
        
        jLbFundo1.setBounds(20, 110,design.getLargura() - 40, design.getAltura() - 200);
        
        jLbFundo2.setBounds(20+15 , 110+50, (design.getLargura() - 40)-30, (design.getAltura() - 200)-80);
        jLbFundo2.setBackground(design.getCorFundo3());
        
        jLbTitulo.setBounds(design.CentralizarLargura(550, 2, 1),design.CentralizarAltura(55, 18, 1),550,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
        
        jLbID.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 4),40 + 15 + 100 + 4,30);
        jTFID.setBounds(design.CentralizarLargura(116, 18,2)+ 40 + 15,design.CentralizarAltura(30, 15, 4),100,30);
        jLbID.setBackground(design.getCorCampoTexto());
        jLbID.setOpaque(true);
        jTFID.setBackground(design.getCorCampoTexto());
        jTFID.setOpaque(true);
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacodata = (((design.getLargura() - design.CentralizarLargura(116, 18,2)-180-15-125-15)- (design.CentralizarLargura(116, 18,2)+ 40 + 15 + 100 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 40 + 15 + 100 + 4)) - (70 + 460 + 15 + 4)/2;
        
        
        jLbNome.setBounds(espacodata, design.CentralizarAltura(30, 15, 4),70 + 460 + 15 + 4,30);
        jTFNome.setBounds(espacodata + 70 +15, design.CentralizarAltura(30, 15, 4),460,30);
        jLbNome.setBackground(design.getCorCampoTexto());
        jLbNome.setOpaque(true);
        jTFNome.setBackground(design.getCorCampoTexto());
        jTFNome.setOpaque(true);
        
        
        jLbDataDeNascimento.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-180-15-125-15, design.CentralizarAltura(30, 15, 4),180 + 15 + 125 + 15,30);
        jTFData.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-125 - 15, design.CentralizarAltura(30, 15, 4),125,30);
        jLbDataDeNascimento.setBackground(design.getCorCampoTexto());
        jLbDataDeNascimento.setOpaque(true);
        jTFData.setBackground(design.getCorCampoTexto());
        jTFData.setOpaque(true);
        
        
        jLbCPF.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 5),60 + 170 + 15 + 15,30);
        jTFCPF.setBounds(design.CentralizarLargura(116, 18,2) + 60 + 15,design.CentralizarAltura(30, 15, 5),170,30);
        jLbCPF.setBackground(design.getCorCampoTexto());
        jLbCPF.setOpaque(true);
        jTFCPF.setBackground(design.getCorCampoTexto());
        jTFCPF.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbTelefone1.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 55),140 + 370 + 15 + 4,30);
        jTFTelefone1.setBounds(design.CentralizarLargura(116, 18,2)+ 110 +15,design.CentralizarAltura(30, 120, 55),400,30);
        jLbTelefone1.setBackground(design.getCorCampoTexto());
        jLbTelefone1.setOpaque(true);
        jTFTelefone1.setBackground(design.getCorCampoTexto());
        jTFTelefone1.setOpaque(true);
        
        jLbEmail1.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2, design.CentralizarAltura(30, 120, 55),140 + 370 + 15 + 4,30);
        jTFEmail1.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2 + 90 + 15, design.CentralizarAltura(30, 120, 55),420,30);
        jLbEmail1.setBackground(design.getCorCampoTexto());
        jLbEmail1.setOpaque(true);
        jTFEmail1.setBackground(design.getCorCampoTexto());
        jTFEmail1.setOpaque(true);
        
        jLbTelefone2.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 64),140 + 370 + 15 + 4,30);
        jTFTelefone2.setBounds(design.CentralizarLargura(116, 18,2)+ 110 + 15,design.CentralizarAltura(30, 120, 64),400,30);
        jLbTelefone2.setBackground(design.getCorCampoTexto());
        jLbTelefone2.setOpaque(true);
        jTFTelefone2.setBackground(design.getCorCampoTexto());
        jTFTelefone2.setOpaque(true);
        
        jLbEmail2.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2, design.CentralizarAltura(30, 120, 64),140 + 370 + 15 + 4,30);
        jTFEmail2.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2 + 90 + 15, design.CentralizarAltura(30, 120, 64),420,30);
        jLbEmail2.setBackground(design.getCorCampoTexto());
        jLbEmail2.setOpaque(true);
        jTFEmail2.setBackground(design.getCorCampoTexto());
        jTFEmail2.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbPais.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 9),60 + 15 + 220 + 4,30);
        jTFPais.setBounds(design.CentralizarLargura(116, 18,2)+ 60 + 15,design.CentralizarAltura(30, 15, 9),220,30);
        jLbPais.setBackground(design.getCorCampoTexto());
        jLbPais.setOpaque(true);
        jTFPais.setBackground(design.getCorCampoTexto());
        jTFPais.setOpaque(true);
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacoEstado = (((design.getLargura() - design.CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4)- (design.CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) - (80 + 15 + 270 + 4)/2;
        
        jLbEstado.setBounds(espacoEstado,design.CentralizarAltura(30, 15, 9),80 + 15 + 270 + 4,30);
        jTFEstado.setBounds(espacoEstado + 80+ 15,design.CentralizarAltura(30, 15, 9),270,30);
        jLbEstado.setBackground(design.getCorCampoTexto());
        jLbEstado.setOpaque(true);
        jTFEstado.setBackground(design.getCorCampoTexto());
        jTFEstado.setOpaque(true);
        
        jLbCidade.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4,design.CentralizarAltura(30, 15, 9),80 + 15 + 270 + 4,30);
        jTFCidade.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 270 - 4,design.CentralizarAltura(30, 15, 9),270,30);
        jLbCidade.setBackground(design.getCorCampoTexto());
        jLbCidade.setOpaque(true);
        jTFCidade.setBackground(design.getCorCampoTexto());
        jTFCidade.setOpaque(true);
        
        
        jLbBairro.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 10),70 + 15 + 300 + 4,30);
        jTFBairro.setBounds(design.CentralizarLargura(116, 18,2)+ 70 + 15,design.CentralizarAltura(30, 15, 10),300,30);
        jLbBairro.setBackground(design.getCorCampoTexto());
        jLbBairro.setOpaque(true);
        jTFBairro.setBackground(design.getCorCampoTexto());
        jTFBairro.setOpaque(true);
        
        // conta prara saber aonde deve colocar a rua para q fique centralizado entre o bairro e a numero
        int espacoRua = (((design.getLargura() - design.CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4)- (design.CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) - (50 + 15 + 320 + 4)/2;
        
        jLbRua.setBounds(espacoRua,design.CentralizarAltura(30, 15, 10),50 + 15 + 320 + 4,30);
        jTFRua.setBounds(espacoRua + 50 + 15,design.CentralizarAltura(30, 15, 10),320,30);
        jLbRua.setBackground(design.getCorCampoTexto());
        jLbRua.setOpaque(true);
        jTFRua.setBackground(design.getCorCampoTexto());
        jTFRua.setOpaque(true);
        
        jLbNumero.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4,design.CentralizarAltura(30, 15, 10),90 + 15 + 100 + 4,30);
        jTFNumero.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 100 - 4,design.CentralizarAltura(30, 15, 10),100,30);
        jLbNumero.setBackground(design.getCorCampoTexto());
        jLbNumero.setOpaque(true);
        jTFNumero.setBackground(design.getCorCampoTexto());
        jTFNumero.setOpaque(true);
        
        jBntAlterar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntAlterar.setBackground(design.getCorBotaoSalvar());
        jBntAlterar.setOpaque(true);
        jBntAlterar.setForeground(design.getCorLetra1());
        
        jBntVoltar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 3) - 150, design.CentralizarAltura(30, 30, 24),150,40);
        jBntVoltar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntVoltar.setOpaque(true);
        jBntVoltar.setForeground(design.getCorLetra1());
        
    }
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
                
        Clientes cliente = new Clientes();
        
        cliente.ConsultarClientes();
        
        jTFID.setText(""+cliente.getIDCliente().get(num));
        jTFNome.setText(cliente.getNome().get(num));
        jTFData.setText((cliente.getDataDeNascimento().get(num)).substring(8, 10) + " / " + (cliente.getDataDeNascimento().get(num)).substring(5, 7) + " / " + (cliente.getDataDeNascimento().get(num)).substring(0, 4));
        jTFCPF.setText((cliente.getCPF().get(num)).substring(0, 3) + " . " + (cliente.getCPF().get(num)).substring(3, 6) + " . " + (cliente.getCPF().get(num)).substring(6, 9) + " - " + (cliente.getCPF().get(num)).substring(9, 11));
        
        jTFTelefone1.setText(cliente.getTelefone1().get(num));
        jTFTelefone2.setText(cliente.getTelefone2().get(num));
        jTFEmail1.setText(cliente.getEmail1().get(num));
        jTFEmail2.setText(cliente.getEmail2().get(num));
        
        jTFPais.setText(cliente.getPais().get(num));
        jTFEstado.setText(cliente.getEstado().get(num));
        jTFCidade.setText(cliente.getCidade().get(num));
        jTFBairro.setText(cliente.getBairro().get(num));
        jTFRua.setText(cliente.getRua().get(num));
        jTFNumero.setText(cliente.getNumero().get(num));
        
    }
}