package Gerenciador_De_Estoque.Tela_Administrador;

import Design.Design;
import Gerenciador_De_Estoque.Clientes;
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

public class TelaClienteAlterar extends javax.swing.JFrame {

    int numero;
    
    Design design = new Design();
    
    public TelaClienteAlterar() {
        initComponents();
        
        AlinhamentoDosItens();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbData1 = new javax.swing.JLabel();
        jLbData2 = new javax.swing.JLabel();
        jTFPais = new javax.swing.JTextField();
        jTFEstado = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFRua = new javax.swing.JTextField();
        jFTFNumero = new javax.swing.JFormattedTextField();
        jTFTelefone1 = new javax.swing.JTextField();
        jTFTelefone2 = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFData1 = new javax.swing.JFormattedTextField();
        jTFData2 = new javax.swing.JFormattedTextField();
        jTFData3 = new javax.swing.JFormattedTextField();
        jFTFCPF = new javax.swing.JFormattedTextField();
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
        jLbDataDeNascimento = new javax.swing.JLabel();
        jLbCPF = new javax.swing.JLabel();
        jBntCancelar = new javax.swing.JButton();
        jBntSalvar = new javax.swing.JButton();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLbData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbData1.setText("/");
        jLbData1.setToolTipText("");
        getContentPane().add(jLbData1);
        jLbData1.setBounds(240, 120, 60, 22);

        jLbData2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbData2.setText("/");
        jLbData2.setToolTipText("");
        getContentPane().add(jLbData2);
        jLbData2.setBounds(270, 110, 60, 22);

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

        jFTFNumero.setBorder(null);
        jFTFNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFNumero);
        jFTFNumero.setBounds(120, 140, 90, 22);

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

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNome.setBorder(null);
        getContentPane().add(jTFNome);
        jTFNome.setBounds(370, 130, 280, 30);

        jTFData1.setBorder(null);
        jTFData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd"))));
        jTFData1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFData1KeyReleased(evt);
            }
        });
        getContentPane().add(jTFData1);
        jTFData1.setBounds(810, 130, 110, 22);

        jTFData2.setBorder(null);
        jTFData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM"))));
        jTFData2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFData2KeyReleased(evt);
            }
        });
        getContentPane().add(jTFData2);
        jTFData2.setBounds(810, 130, 110, 22);

        jTFData3.setBorder(null);
        jTFData3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        jTFData3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTFData3);
        jTFData3.setBounds(810, 130, 110, 22);

        jFTFCPF.setBorder(null);
        try {
            jFTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### . ### . ### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFCPF);
        jFTFCPF.setBounds(120, 140, 50, 22);

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
        jLbTitulo.setText("ALTERAR  CLIENTE");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
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

        jLbNome.setBackground(new java.awt.Color(51, 255, 153));
        jLbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(230, 130, 70, 22);

        jLbDataDeNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbDataDeNascimento.setText("  Data de Nascimento:");
        getContentPane().add(jLbDataDeNascimento);
        jLbDataDeNascimento.setBounds(500, 130, 180, 22);

        jLbCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCPF.setText("  CPF:");
        jLbCPF.setToolTipText("");
        getContentPane().add(jLbCPF);
        jLbCPF.setBounds(170, 110, 60, 30);

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

    private void jTFData1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData1KeyReleased
        if (jTFData1.getText().length() == 2) {
            jTFData2.requestFocus();
        }
    }//GEN-LAST:event_jTFData1KeyReleased

    private void jTFData2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData2KeyReleased
        if (jTFData2.getText().length() == 2) {
            jTFData3.requestFocus();
        }
    }//GEN-LAST:event_jTFData2KeyReleased

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed

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
            Logger.getLogger(TelaClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed

        if(jTFPais.getText().isEmpty() == true || jTFEstado.getText().isEmpty() == true || jTFCidade.getText().isEmpty() == true || jTFBairro.getText().isEmpty() == true || jTFRua.getText().isEmpty() == true || jFTFNumero.getText().isEmpty() == true || jTFTelefone1.getText().isEmpty() == true || jFTFCPF.getText().isEmpty() == true || jTFData1.getText().isEmpty() == true || jTFData2.getText().isEmpty() == true || jTFData3.getText().isEmpty() == true || jTFNome.getText().isEmpty() == true){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "É obrigatório o preenchimento de todos os campos.\nExceto: Telefone 2, E-mail 1 e E-mail 2\n\n\n\n");

        }else{
            try {
                
                Clientes cliente = new Clientes();
                cliente.ConsultarClientes();

                cliente.AlterarCliente(jTFPais.getText(), jTFEstado.getText(), jTFCidade.getText(), jTFBairro.getText(), jTFRua.getText(), jFTFNumero.getText(), jTFTelefone1.getText(), jTFTelefone2.getText(), jTFEmail1.getText(), jTFEmail2.getText(), (jFTFCPF.getText().substring(0, 3) + jFTFCPF.getText().substring(6, 9) + jFTFCPF.getText().substring(12, 15) + jFTFCPF.getText().substring(18, 20)), (jTFData3.getText() + "-" + jTFData2.getText()  + "-" + jTFData1.getText()), jTFNome.getText(), numero);
            } catch (SQLException ex) {
                Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

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
                Logger.getLogger(TelaClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntSalvarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFNumero;
    private javax.swing.JLabel jLbBairro;
    private javax.swing.JLabel jLbCPF;
    private javax.swing.JLabel jLbCidade;
    private javax.swing.JLabel jLbData1;
    private javax.swing.JLabel jLbData2;
    private javax.swing.JLabel jLbDataDeNascimento;
    private javax.swing.JLabel jLbEmail1;
    private javax.swing.JLabel jLbEmail2;
    private javax.swing.JLabel jLbEstado;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbPais;
    private javax.swing.JLabel jLbRua;
    private javax.swing.JLabel jLbTelefone1;
    private javax.swing.JLabel jLbTelefone2;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JFormattedTextField jTFData1;
    private javax.swing.JFormattedTextField jTFData2;
    private javax.swing.JFormattedTextField jTFData3;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNome;
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
        
        jLbTitulo.setBounds(design.CentralizarLargura(750, 2, 1),design.CentralizarAltura(55, 18, 1),750,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
         
        
        jLbNome.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 34),70 + 400 + 15 + 4,30);
        jTFNome.setBounds(design.CentralizarLargura(116, 18,2)+ 70 + 15,design.CentralizarAltura(30, 120, 34),400,30);
        jLbNome.setBackground(design.getCorCampoTexto());
        jLbNome.setOpaque(true);
        jTFNome.setBackground(design.getCorCampoTexto());
        jTFNome.setOpaque(true);
        
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacodata = (((design.getLargura() - design.CentralizarLargura(116, 18,2)-180-15-20-20-20-20-45-15)- (design.CentralizarLargura(116, 18,2)+ 70 + 400 + 15 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 70 + 400 + 15 + 4)) - (60 + 170 + 15 + 15)/2;
        
        
        jLbDataDeNascimento.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-180-15-20-20-20-20-40-15, design.CentralizarAltura(30, 120, 34),180 + 15 + 20 + 20 + 20 + 20 + 45 + 15,30);
        jTFData1.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-20-20-20-20-40-15, design.CentralizarAltura(30, 120, 34),20,30);
        jLbData1.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-20-20-20-40-15, design.CentralizarAltura(30, 120, 34),20,30);
        jTFData2.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-20-20-40-15, design.CentralizarAltura(30, 120, 34),20,30);
        jLbData2.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-20-40-15, design.CentralizarAltura(30, 120, 34),20,30);
        jTFData3.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)-45-15, design.CentralizarAltura(30, 120, 34),45,30);
        jLbDataDeNascimento.setBackground(design.getCorCampoTexto());
        jLbDataDeNascimento.setOpaque(true);
        jLbData1.setBackground(design.getCorCampoTexto());
        jLbData1.setOpaque(true);
        jLbData2.setBackground(design.getCorCampoTexto());
        jLbData2.setOpaque(true);
        jTFData1.setBackground(design.getCorCampoTexto());
        jTFData1.setOpaque(true);
        jTFData2.setBackground(design.getCorCampoTexto());
        jTFData2.setOpaque(true);
        jTFData3.setBackground(design.getCorCampoTexto());
        jTFData3.setOpaque(true);
        
        jLbCPF.setBounds(espacodata,design.CentralizarAltura(30, 120, 34),60 + 170 + 15 + 15,30);
        jFTFCPF.setBounds(espacodata + 60 + 15,design.CentralizarAltura(30, 120, 34),170,30);
        jLbCPF.setBackground(design.getCorCampoTexto());
        jLbCPF.setOpaque(true);
        jFTFCPF.setBackground(design.getCorCampoTexto());
        jFTFCPF.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbTelefone1.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 48),140 + 370 + 15 + 4,30);
        jTFTelefone1.setBounds(design.CentralizarLargura(116, 18,2)+ 110 +15,design.CentralizarAltura(30, 120, 48),400,30);
        jLbTelefone1.setBackground(design.getCorCampoTexto());
        jLbTelefone1.setOpaque(true);
        jTFTelefone1.setBackground(design.getCorCampoTexto());
        jTFTelefone1.setOpaque(true);
        
        jLbEmail1.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2, design.CentralizarAltura(30, 120, 48),140 + 370 + 15 + 4,30);
        jTFEmail1.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2 + 90 + 15, design.CentralizarAltura(30, 120, 48),420,30);
        jLbEmail1.setBackground(design.getCorCampoTexto());
        jLbEmail1.setOpaque(true);
        jTFEmail1.setBackground(design.getCorCampoTexto());
        jTFEmail1.setOpaque(true);
        
        jLbTelefone2.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 58),140 + 370 + 15 + 4,30);
        jTFTelefone2.setBounds(design.CentralizarLargura(116, 18,2)+ 110 + 15,design.CentralizarAltura(30, 120, 58),400,30);
        jLbTelefone2.setBackground(design.getCorCampoTexto());
        jLbTelefone2.setOpaque(true);
        jTFTelefone2.setBackground(design.getCorCampoTexto());
        jTFTelefone2.setOpaque(true);
        
        jLbEmail2.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2, design.CentralizarAltura(30, 120, 58),140 + 370 + 15 + 4,30);
        jTFEmail2.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2 + 90 + 15, design.CentralizarAltura(30, 120, 58),420,30);
        jLbEmail2.setBackground(design.getCorCampoTexto());
        jLbEmail2.setOpaque(true);
        jTFEmail2.setBackground(design.getCorCampoTexto());
        jTFEmail2.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbPais.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 72),60 + 15 + 220 + 4,30);
        jTFPais.setBounds(design.CentralizarLargura(116, 18,2)+ 60 + 15,design.CentralizarAltura(30, 120, 72),220,30);
        jLbPais.setBackground(design.getCorCampoTexto());
        jLbPais.setOpaque(true);
        jTFPais.setBackground(design.getCorCampoTexto());
        jTFPais.setOpaque(true);
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacoEstado = (((design.getLargura() - design.CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4)- (design.CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) - (80 + 15 + 270 + 4)/2;
        
        jLbEstado.setBounds(espacoEstado,design.CentralizarAltura(30, 120, 72),80 + 15 + 270 + 4,30);
        jTFEstado.setBounds(espacoEstado + 80+ 15,design.CentralizarAltura(30, 120, 72),270,30);
        jLbEstado.setBackground(design.getCorCampoTexto());
        jLbEstado.setOpaque(true);
        jTFEstado.setBackground(design.getCorCampoTexto());
        jTFEstado.setOpaque(true);
        
        jLbCidade.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4,design.CentralizarAltura(30, 120, 72),80 + 15 + 270 + 4,30);
        jTFCidade.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 270 - 4,design.CentralizarAltura(30, 120, 72),270,30);
        jLbCidade.setBackground(design.getCorCampoTexto());
        jLbCidade.setOpaque(true);
        jTFCidade.setBackground(design.getCorCampoTexto());
        jTFCidade.setOpaque(true);
        
        
        jLbBairro.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 120, 82),70 + 15 + 300 + 4,30);
        jTFBairro.setBounds(design.CentralizarLargura(116, 18,2)+ 70 + 15,design.CentralizarAltura(30, 120, 82),300,30);
        jLbBairro.setBackground(design.getCorCampoTexto());
        jLbBairro.setOpaque(true);
        jTFBairro.setBackground(design.getCorCampoTexto());
        jTFBairro.setOpaque(true);
        
        // conta prara saber aonde deve colocar a rua para q fique centralizado entre o bairro e a numero
        int espacoRua = (((design.getLargura() - design.CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4)- (design.CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) / 2 + (design.CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) - (50 + 15 + 320 + 4)/2;
        
        jLbRua.setBounds(espacoRua,design.CentralizarAltura(30, 120, 82),50 + 15 + 320 + 4,30);
        jTFRua.setBounds(espacoRua + 50 + 15,design.CentralizarAltura(30, 120, 82),320,30);
        jLbRua.setBackground(design.getCorCampoTexto());
        jLbRua.setOpaque(true);
        jTFRua.setBackground(design.getCorCampoTexto());
        jTFRua.setOpaque(true);
        
        jLbNumero.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4,design.CentralizarAltura(30, 120, 82),90 + 15 + 100 + 4,30);
        jFTFNumero.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 2) - 100 - 4,design.CentralizarAltura(30, 120, 82),100,30);
        jLbNumero.setBackground(design.getCorCampoTexto());
        jLbNumero.setOpaque(true);
        jFTFNumero.setBackground(design.getCorCampoTexto());
        jFTFNumero.setOpaque(true);
        
        jBntSalvar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(design.getCorBotaoSalvar());
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(design.getCorFundo3());
        
        jBntCancelar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18, 3) - 150, design.CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(design.getCorLetra1());
        
    }
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
                
        Clientes cliente = new Clientes();
        
        cliente.ConsultarClientes();
        
        jTFNome.setText(cliente.getNome().get(num));
        jTFData1.setText((cliente.getDataDeNascimento().get(num)).substring(8, 10));
        jTFData2.setText((cliente.getDataDeNascimento().get(num)).substring(5, 7));
        jTFData3.setText((cliente.getDataDeNascimento().get(num)).substring(0, 4));
        jFTFCPF.setText(cliente.getCPF().get(num));
        
        jTFTelefone1.setText(cliente.getTelefone1().get(num));
        jTFTelefone2.setText(cliente.getTelefone2().get(num));
        jTFEmail1.setText(cliente.getEmail1().get(num));
        jTFEmail2.setText(cliente.getEmail2().get(num));
        
        jTFPais.setText(cliente.getPais().get(num));
        jTFEstado.setText(cliente.getEstado().get(num));
        jTFCidade.setText(cliente.getCidade().get(num));
        jTFBairro.setText(cliente.getBairro().get(num));
        jTFRua.setText(cliente.getRua().get(num));
        jFTFNumero.setText(cliente.getNumero().get(num));
        
    }

}
