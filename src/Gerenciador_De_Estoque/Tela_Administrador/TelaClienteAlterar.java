package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Clientes;
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

public class TelaClienteAlterar extends javax.swing.JFrame {

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
    
    public TelaClienteAlterar() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

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
        jLbTitulo.setText("ALTERAR FORNECEDOR");
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
            Janela.MudarAba(3);

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
                Janela.MudarAba(3);

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
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbNumero;
    private javax.swing.JLabel jLbPais;
    private javax.swing.JLabel jLbRua;
    private javax.swing.JLabel jLbTelefone1;
    private javax.swing.JLabel jLbTelefone2;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
         
        
        jLbNome.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 34),70 + 400 + 15 + 4,30);
        jTFNome.setBounds(CentralizarLargura(116, 18,2)+ 70 + 15,CentralizarAltura(30, 120, 34),400,30);
        jLbNome.setBackground(corFundo4);
        jLbNome.setOpaque(true);
        jTFNome.setBackground(corFundo4);
        jTFNome.setOpaque(true);
        
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacodata = (((largura - CentralizarLargura(116, 18,2)-180-15-20-20-20-20-40-15)- (CentralizarLargura(116, 18,2)+ 70 + 400 + 15 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 70 + 400 + 15 + 4)) - (60 + 170 + 15 + 15)/2;
        
        
        jLbDataDeNascimento.setBounds(largura - CentralizarLargura(116, 18,2)-180-15-20-20-20-20-40-15, CentralizarAltura(30, 120, 34),180 + 15 + 20 + 20 + 20 + 20 + 40 + 15,30);
        jTFData1.setBounds(largura - CentralizarLargura(116, 18,2)-20-20-20-20-40-15, CentralizarAltura(30, 120, 34),20,30);
        jLbData1.setBounds(largura - CentralizarLargura(116, 18,2)-20-20-20-40-15, CentralizarAltura(30, 120, 34),20,30);
        jTFData2.setBounds(largura - CentralizarLargura(116, 18,2)-20-20-40-15, CentralizarAltura(30, 120, 34),20,30);
        jLbData2.setBounds(largura - CentralizarLargura(116, 18,2)-20-40-15, CentralizarAltura(30, 120, 34),20,30);
        jTFData3.setBounds(largura - CentralizarLargura(116, 18,2)-40-15, CentralizarAltura(30, 120, 34),40,30);
        jLbDataDeNascimento.setBackground(corFundo4);
        jLbDataDeNascimento.setOpaque(true);
        jLbData1.setBackground(corFundo4);
        jLbData1.setOpaque(true);
        jLbData2.setBackground(corFundo4);
        jLbData2.setOpaque(true);
        jTFData1.setBackground(corFundo4);
        jTFData1.setOpaque(true);
        jTFData2.setBackground(corFundo4);
        jTFData2.setOpaque(true);
        jTFData3.setBackground(corFundo4);
        jTFData3.setOpaque(true);
        
        jLbCPF.setBounds(espacodata,CentralizarAltura(30, 120, 34),60 + 170 + 15 + 15,30);
        jFTFCPF.setBounds(espacodata + 60 + 15,CentralizarAltura(30, 120, 34),170,30);
        jLbCPF.setBackground(corFundo4);
        jLbCPF.setOpaque(true);
        jFTFCPF.setBackground(corFundo4);
        jFTFCPF.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbTelefone1.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 48),140 + 370 + 15 + 4,30);
        jTFTelefone1.setBounds(CentralizarLargura(116, 18,2)+ 110 +15,CentralizarAltura(30, 120, 48),400,30);
        jLbTelefone1.setBackground(corFundo4);
        jLbTelefone1.setOpaque(true);
        jTFTelefone1.setBackground(corFundo4);
        jTFTelefone1.setOpaque(true);
        
        jLbEmail1.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 120, 48),140 + 370 + 15 + 4,30);
        jTFEmail1.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 90 + 15, CentralizarAltura(30, 120, 48),420,30);
        jLbEmail1.setBackground(corFundo4);
        jLbEmail1.setOpaque(true);
        jTFEmail1.setBackground(corFundo4);
        jTFEmail1.setOpaque(true);
        
        jLbTelefone2.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 58),140 + 370 + 15 + 4,30);
        jTFTelefone2.setBounds(CentralizarLargura(116, 18,2)+ 110 + 15,CentralizarAltura(30, 120, 58),400,30);
        jLbTelefone2.setBackground(corFundo4);
        jLbTelefone2.setOpaque(true);
        jTFTelefone2.setBackground(corFundo4);
        jTFTelefone2.setOpaque(true);
        
        jLbEmail2.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 120, 58),140 + 370 + 15 + 4,30);
        jTFEmail2.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 90 + 15, CentralizarAltura(30, 120, 58),420,30);
        jLbEmail2.setBackground(corFundo4);
        jLbEmail2.setOpaque(true);
        jTFEmail2.setBackground(corFundo4);
        jTFEmail2.setOpaque(true);
        
        // ----------------------------------------------------------------------------------------------------
        
        jLbPais.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 72),60 + 15 + 220 + 4,30);
        jTFPais.setBounds(CentralizarLargura(116, 18,2)+ 60 + 15,CentralizarAltura(30, 120, 72),220,30);
        jLbPais.setBackground(corFundo4);
        jLbPais.setOpaque(true);
        jTFPais.setBackground(corFundo4);
        jTFPais.setOpaque(true);
        
        // conta prara saber aonde deve colocar o estado para q fique centralizado entre o pais e a cidade
        int espacoEstado = (((largura - CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4)- (CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 60 + 220 + 15 + 4)) - (80 + 15 + 270 + 4)/2;
        
        jLbEstado.setBounds(espacoEstado,CentralizarAltura(30, 120, 72),80 + 15 + 270 + 4,30);
        jTFEstado.setBounds(espacoEstado + 80+ 15,CentralizarAltura(30, 120, 72),270,30);
        jLbEstado.setBackground(corFundo4);
        jLbEstado.setOpaque(true);
        jTFEstado.setBackground(corFundo4);
        jTFEstado.setOpaque(true);
        
        jLbCidade.setBounds(largura - CentralizarLargura(116, 18, 2) - 80 - 15 - 270 - 4,CentralizarAltura(30, 120, 72),80 + 15 + 270 + 4,30);
        jTFCidade.setBounds(largura - CentralizarLargura(116, 18, 2) - 270 - 4,CentralizarAltura(30, 120, 72),270,30);
        jLbCidade.setBackground(corFundo4);
        jLbCidade.setOpaque(true);
        jTFCidade.setBackground(corFundo4);
        jTFCidade.setOpaque(true);
        
        
        jLbBairro.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 120, 82),70 + 15 + 300 + 4,30);
        jTFBairro.setBounds(CentralizarLargura(116, 18,2)+ 70 + 15,CentralizarAltura(30, 120, 82),300,30);
        jLbBairro.setBackground(corFundo4);
        jLbBairro.setOpaque(true);
        jTFBairro.setBackground(corFundo4);
        jTFBairro.setOpaque(true);
        
        // conta prara saber aonde deve colocar a rua para q fique centralizado entre o bairro e a numero
        int espacoRua = (((largura - CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4)- (CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 70 + 15 + 300 + 4)) - (50 + 15 + 320 + 4)/2;
        
        jLbRua.setBounds(espacoRua,CentralizarAltura(30, 120, 82),50 + 15 + 320 + 4,30);
        jTFRua.setBounds(espacoRua + 50 + 15,CentralizarAltura(30, 120, 82),320,30);
        jLbRua.setBackground(corFundo4);
        jLbRua.setOpaque(true);
        jTFRua.setBackground(corFundo4);
        jTFRua.setOpaque(true);
        
        jLbNumero.setBounds(largura - CentralizarLargura(116, 18, 2) - 90 - 15 - 100 - 4,CentralizarAltura(30, 120, 82),90 + 15 + 100 + 4,30);
        jFTFNumero.setBounds(largura - CentralizarLargura(116, 18, 2) - 100 - 4,CentralizarAltura(30, 120, 82),100,30);
        jLbNumero.setBackground(corFundo4);
        jLbNumero.setOpaque(true);
        jFTFNumero.setBackground(corFundo4);
        jFTFNumero.setOpaque(true);
        
        jBntSalvar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(corFundo5);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18, 3) - 150, CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
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
