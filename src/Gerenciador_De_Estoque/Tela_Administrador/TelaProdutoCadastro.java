
package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class TelaProdutoCadastro extends javax.swing.JFrame {
    
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

    public TelaProdutoCadastro() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMedida = new javax.swing.JTextField();
        jTFQuantidade = new javax.swing.JTextField();
        jTFValorVenda = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLbMedida = new javax.swing.JLabel();
        jLbQuantidade = new javax.swing.JLabel();
        jLbNome = new javax.swing.JLabel();
        jLbValorVenda = new javax.swing.JLabel();
        jLbMarca = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbDescricao = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMedida.setBorder(null);
        jTFMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMedidaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFMedida);
        jTFMedida.setBounds(340, 300, 258, 22);

        jTFQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFQuantidade.setBorder(null);
        jTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFQuantidade);
        jTFQuantidade.setBounds(810, 300, 258, 22);

        jTFValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFValorVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFValorVenda.setBorder(null);
        jTFValorVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFValorVenda);
        jTFValorVenda.setBounds(320, 350, 258, 22);

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNome.setBorder(null);
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNome);
        jTFNome.setBounds(690, 30, 280, 30);

        jTFMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMarca.setBorder(null);
        jTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFMarca);
        jTFMarca.setBounds(140, 20, 308, 30);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setBorder(null);
        jTFDescricao.setViewportView(jTextAreaDescricao);

        getContentPane().add(jTFDescricao);
        jTFDescricao.setBounds(20, 20, 310, 240);

        jLbMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMedida.setText("  Medida:");
        getContentPane().add(jLbMedida);
        jLbMedida.setBounds(240, 300, 80, 22);

        jLbQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbQuantidade.setText("  Quantidade:");
        getContentPane().add(jLbQuantidade);
        jLbQuantidade.setBounds(700, 300, 120, 22);

        jLbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(460, 100, 70, 22);

        jLbValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorVenda.setText("  Preço:");
        getContentPane().add(jLbValorVenda);
        jLbValorVenda.setBounds(140, 270, 70, 22);

        jLbMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMarca.setText("  Marca:");
        getContentPane().add(jLbMarca);
        jLbMarca.setBounds(60, 30, 80, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("CADASTRAR PRODUTO");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(170, -30, 750, 60);

        jLbDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbDescricao.setText("  Descrição:");
        getContentPane().add(jLbDescricao);
        jLbDescricao.setBounds(90, 370, 100, 22);

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

    private void jTFMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMedidaActionPerformed

    private void jTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFQuantidadeActionPerformed

    private void jTFValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorVendaActionPerformed

    private void jTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMarcaActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

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
        Produtos produtos = new Produtos();

        try {
            produtos.CadastrarProduto(jTFNome.getText(), jTFMarca.getText(), jTFMedida.getText(), Float.parseFloat(jTFValorVenda.getText()), Integer.parseInt(jTFQuantidade.getText()), jTFDescricao.getToolTipText());
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

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(TelaProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JLabel jLbDescricao;
    private javax.swing.JLabel jLbMarca;
    private javax.swing.JLabel jLbMedida;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbQuantidade;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jTFDescricao;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTextField jTFValorVenda;
    private javax.swing.JTextArea jTextAreaDescricao;
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
         
        
        jLbNome.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 25, 7),140 + 370 + 15 + 4,30);
        jTFNome.setBounds(CentralizarLargura(116, 18,2)+ 70 + 15,CentralizarAltura(30, 25, 7),440,30);
        jLbNome.setBackground(corFundo4);
        jLbNome.setOpaque(true);
        jTFNome.setBackground(corFundo4);
        jTFNome.setOpaque(true);
        
        
        jLbMarca.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 25, 7),140 + 370 + 15 + 4,30);
        jTFMarca.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 70 + 15, CentralizarAltura(30, 25, 7),440,30); 
        jLbMarca.setBackground(corFundo4);
        jLbMarca.setOpaque(true);
        jTFMarca.setBackground(corFundo4);
        jTFMarca.setOpaque(true);
        
        jLbMedida.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 25, 9),140 + 370 + 15 + 4,30);
        jTFMedida.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15,CentralizarAltura(30, 25, 9),430,30);
        jLbMedida.setBackground(corFundo4);
        jLbMedida.setOpaque(true);
        jTFMedida.setBackground(corFundo4);
        jTFMedida.setOpaque(true);
        
        
        jLbValorVenda.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2, CentralizarAltura(30, 25, 9),140 + 370 + 15 + 4,30);
        jTFValorVenda.setBounds((largura/2 -(CentralizarLargura(116, 18, 2) + 529)) + largura/2 + 70 + 15, CentralizarAltura(30, 25, 9),440,30);
        jLbValorVenda.setBackground(corFundo4);
        jLbValorVenda.setOpaque(true);
        jTFValorVenda.setBackground(corFundo4);
        jTFValorVenda.setOpaque(true);
        
        jLbQuantidade.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 25, 11),140 + 370 + 15 + 4,30);
        jTFQuantidade.setBounds(CentralizarLargura(116, 18,2)+ 115 + 15,CentralizarAltura(30, 25, 11),395,30);
        jLbQuantidade.setBackground(corFundo4);
        jLbQuantidade.setOpaque(true);
        jTFQuantidade.setBackground(corFundo4);
        jTFQuantidade.setOpaque(true);
        
        jLbDescricao.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 25, 13), 100,30);
        jTFDescricao.setBounds(CentralizarLargura(116, 18,2)+ 100 + 15,CentralizarAltura(30, 25, 13),largura-CentralizarLargura(116, 18, 2)-CentralizarLargura(116, 18, 2) - 100-15,CentralizarAltura(30, 30, 23) - CentralizarAltura(30, 25, 13));
        jLbDescricao.setBackground(corFundo4);
        jLbDescricao.setOpaque(true);
        jTextAreaDescricao.setBackground(corFundo4);
        jTextAreaDescricao.setOpaque(true);
        
        
        jBntSalvar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(corFundo5);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }


}
