
package Telas;
import Classes.ConnectionFactory;
import Design.Design;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class TelaCadastroBanco extends javax.swing.JFrame {
   
    Design design = new Design();
    ConnectionFactory connection = new ConnectionFactory();
    
    public TelaCadastroBanco() {
        initComponents();
        
        AlinhamentoDosItens();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFServidor = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jTFPorta = new javax.swing.JFormattedTextField();
        jLbServidor = new javax.swing.JLabel();
        jLbUsuario = new javax.swing.JLabel();
        jLbSenha = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbTexto2 = new javax.swing.JLabel();
        jLbTexto = new javax.swing.JLabel();
        jLbPorta = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFServidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFServidor.setBorder(null);
        getContentPane().add(jTFServidor);
        jTFServidor.setBounds(350, 40, 91, 22);

        jTFUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFUsuario.setBorder(null);
        getContentPane().add(jTFUsuario);
        jTFUsuario.setBounds(370, 170, 91, 22);

        jPFSenha.setBorder(null);
        getContentPane().add(jPFSenha);
        jPFSenha.setBounds(450, 110, 150, 20);

        jTFPorta.setBorder(null);
        jTFPorta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTFPorta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFPorta.setText("1433");
        jTFPorta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTFPorta);
        jTFPorta.setBounds(600, 190, 110, 22);

        jLbServidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbServidor.setText(" Servidor:");
        getContentPane().add(jLbServidor);
        jLbServidor.setBounds(250, 40, 80, 22);

        jLbUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbUsuario.setText(" Usuário:");
        getContentPane().add(jLbUsuario);
        jLbUsuario.setBounds(250, 190, 80, 22);

        jLbSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbSenha.setText(" Senha:");
        getContentPane().add(jLbSenha);
        jLbSenha.setBounds(250, 140, 70, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("CONECTANDO SQL SERVER");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(50, 50, 530, 50);

        jLbTexto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTexto2.setText("Escreva nos campos abaixo o nome do servidor, usuário (com permissão de dbcreator e função");
        jLbTexto2.setToolTipText("");
        getContentPane().add(jLbTexto2);
        jLbTexto2.setBounds(90, 290, 760, 30);

        jLbTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTexto.setText("db_datawriter) e senha do seu banco SQL Server.");
        jLbTexto.setToolTipText("");
        getContentPane().add(jLbTexto);
        jLbTexto.setBounds(100, 360, 1160, 30);

        jLbPorta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbPorta.setText(" Porta:");
        getContentPane().add(jLbPorta);
        jLbPorta.setBounds(500, 190, 60, 22);

        jBntSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBntSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jBntSalvar.setText("Salvar");
        jBntSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBntSalvar);
        jBntSalvar.setBounds(310, 250, 150, 40);

        jLbFundo2.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo2.setOpaque(true);
        getContentPane().add(jLbFundo2);
        jLbFundo2.setBounds(0, 110, 180, 140);

        jLbFundo1.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbFundo1.setOpaque(true);
        getContentPane().add(jLbFundo1);
        jLbFundo1.setBounds(60, 370, 170, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        
        try {
            File file = new File("../Gerenciador_De_Estoque/banco.txt");

            file.createNewFile();

            FileWriter arq = new FileWriter("../Gerenciador_De_Estoque/banco.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.println(jTFServidor.getText());
            gravarArq.println(jTFUsuario.getText());
            gravarArq.println(jPFSenha.getText());
            gravarArq.println(jTFPorta.getText());
            gravarArq.println("db_Gerenciador_de_Estoque");

            arq.close();

            if(connection.testeDeConexao() == true){
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!\n\n\n\n");

                if(connection.criarBanco("db_Gerenciador_de_Estoque") == false){
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                    int resposta = JOptionPane.showConfirmDialog(null, "O banco de dados já existe. Gostaria de usar o existente?\n\n\n\n");

                    if(resposta == 0){
                        Toolkit tk = Toolkit.getDefaultToolkit();
                        Dimension d = tk.getScreenSize();

                        try {
                            TelaPrincipal Janela = new TelaPrincipal();

                            Janela.setSize(d.width + 8, d.height - 37);
                            Janela.setResizable(false);

                            Janela.show();
                        } catch (SQLException ex) {
                            Logger.getLogger(TelaCadastroBanco.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else if(resposta == 1){
                        criarNovoBanco();
                    }
                } else{
                    Toolkit tk = Toolkit.getDefaultToolkit();
                    Dimension d = tk.getScreenSize();

                    try {
                        TelaPrincipal Janela = new TelaPrincipal();

                        Janela.setSize(d.width + 8, d.height - 37);
                        Janela.setResizable(false);

                        Janela.show();
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaCadastroBanco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }


            }else{
                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "Sua conexão falhou!\n\n\n\n");

                File file2 = new File("../Gerenciador_De_Estoque/banco.txt");
                file2.delete();
            }



        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }//GEN-LAST:event_jBntSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbPorta;
    private javax.swing.JLabel jLbSenha;
    private javax.swing.JLabel jLbServidor;
    private javax.swing.JLabel jLbTexto;
    private javax.swing.JLabel jLbTexto2;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JFormattedTextField jTFPorta;
    private javax.swing.JTextField jTFServidor;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

    
    public int CentralizarLargura(int tamanhoObjeto, int posicao, int muti) { 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
       
        int largura = Math.round(d.width / 1.5f);
    
        return (largura/posicao)*muti - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao, int muti) { 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        int altura = Math.round(d.height / 1.5f);

        return (altura/posicao)* muti - (tamanhoObjeto/2);
    }
    
    public void AlinhamentoDosItens() {
        
        Color corFundo1 = new Color(31, 163, 168);
        Color corFundo2 = new Color(171, 221, 223);
        Color corFundo3 = new Color(163, 203, 204);
        
        getContentPane().setBackground(design.getCorFundo1());
        
        jLbFundo1.setBounds(20, 110, Math.round(design.getLargura()/1.5f) - 45, Math.round(design.getAltura()/1.7f) - 155);
        jLbFundo1.setBackground(corFundo1);
        
        jLbFundo2.setBounds(20+10 , 110+70, (Math.round(design.getLargura()/1.5f) - 45)-20, (Math.round(design.getAltura()/1.7f) - 155)-135);
        jLbFundo2.setBackground(design.getCorFundo3());
        
        jLbTitulo.setBounds(CentralizarLargura(530, 2, 1),CentralizarAltura(50, 40, 3),530,50);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
         
        jLbTexto2.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1),CentralizarAltura(30, 40, 11),760,30);
        jLbTexto2.setForeground(design.getCorLetra1());
        jLbTexto.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1),CentralizarAltura(30, 40, 13),760,30);
        jLbTexto.setForeground(design.getCorLetra1());
                
        jLbServidor.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1),CentralizarAltura(30, 40, 18),80 + 15 + 500 + 4,34);
        jTFServidor.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1)+ 80 + 15,CentralizarAltura(30, 40, 18) +3, 500 ,28);
        jLbServidor.setBackground(corFundo1);
        jLbServidor.setOpaque(true);
        jLbServidor.setForeground(design.getCorLetra1());
        jTFServidor.setBackground(corFundo3);
        jTFServidor.setOpaque(true);
        jTFServidor.setForeground(design.getCorLetra1());
        
        jLbPorta.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1) + 80 + 15 + 500 + 4 + 30,CentralizarAltura(30, 40, 18),60 + 15 + 115 + 4,34);
        jTFPorta.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1) + 80 + 15 + 500 + 4 + 30 + 60 + 15,CentralizarAltura(30, 40, 18)+3,115,28);
        jLbPorta.setBackground(corFundo1);
        jLbPorta.setOpaque(true);
        jLbPorta.setForeground(design.getCorLetra1());
        jTFPorta.setBackground(corFundo3);
        jTFPorta.setOpaque(true);
        jTFPorta.setForeground(design.getCorLetra1());
        
        jLbUsuario.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1),CentralizarAltura(30, 40, 24),80 + 15 + 300 + 4,34);
        jTFUsuario.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1)+ 80 + 15,CentralizarAltura(30, 40, 24)+3,300,28);
        jLbUsuario.setBackground(corFundo1);
        jLbUsuario.setOpaque(true);
        jLbUsuario.setForeground(design.getCorLetra1());
        jTFUsuario.setBackground(corFundo3);
        jTFUsuario.setOpaque(true);
        jTFUsuario.setForeground(design.getCorLetra1());
        
        jLbSenha.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1) + 80 + 15 + 300 + 4 + 30, CentralizarAltura(30, 40, 24),70 + 15 + 305 + 4,34);
        jPFSenha.setBounds(CentralizarLargura(80 + 15 + 300 + 4 + 30 + 80 + 15 + 300 + 4, 2,1) + 80 + 15 + 300 + 4 + 30 + 70 + 15, CentralizarAltura(30, 40, 24)+3,305,28);
        jLbSenha.setBackground(corFundo1);
        jLbSenha.setOpaque(true);
        jLbSenha.setForeground(design.getCorLetra1());
        jPFSenha.setBackground(corFundo3);
        jPFSenha.setOpaque(true);
        jPFSenha.setForeground(design.getCorLetra1());
        
        jBntSalvar.setBounds(CentralizarLargura(150, 2,1),CentralizarAltura(30, 40, 31),150,40);
        jBntSalvar.setBackground(corFundo3);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(design.getCorLetra1());
        
    }
    
    public void criarNovoBanco() throws FileNotFoundException, IOException {
        
        FileReader arq = new FileReader("../Gerenciador_De_Estoque/banco.txt");
        BufferedReader lerArq = new BufferedReader(arq);

        lerArq.readLine(); lerArq.readLine(); lerArq.readLine(); lerArq.readLine();
        String banco = lerArq.readLine();
        
        banco = "db_Gerenciador_de_Estoque"+ ("db_Gerenciador_de_Estoque".equals(banco) ? "1" : (Integer.parseInt(banco.replaceAll("[^0-9]", "")) + 1) + "");
  
        arq.close();
        
        
        File file = new File("../Gerenciador_De_Estoque/banco.txt");
        file.delete();
        
        File file2 = new File("../Gerenciador_De_Estoque/banco.txt");
        file2.createNewFile();

        FileWriter arq2 = new FileWriter("../Gerenciador_De_Estoque/banco.txt");
        PrintWriter gravarArq = new PrintWriter(arq2);

        gravarArq.println(jTFServidor.getText());
        gravarArq.println(jTFUsuario.getText());
        gravarArq.println(jPFSenha.getText());
        gravarArq.println(jTFPorta.getText());
        gravarArq.println(banco);

        
        arq2.close();
            
        if(connection.testeDeConexao() == true){
            
            if(connection.criarBanco(banco) == true){
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                try {
                    TelaPrincipal Janela = new TelaPrincipal();

                    Janela.setSize(d.width + 8, d.height - 37);
                    Janela.setResizable(false);

                    Janela.show();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCadastroBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else{
                criarNovoBanco();
            }
        } else{
            
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "Sua conexão falhou!\n\n\n\n");

            File file3 = new File("../Gerenciador_De_Estoque/banco.txt");
            file3.delete();
        }

    }
    
}
