
package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Gerenciador_De_Estoque.Fornecedores;
import java.sql.SQLException;

public class TelaProdutoInfo extends javax.swing.JFrame {

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
    
    public TelaProdutoInfo() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMedida = new javax.swing.JTextField();
        jTFAtivo = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jTFValorVenda = new javax.swing.JTextField();
        jFTFQuantidade = new javax.swing.JFormattedTextField();
        jFTFIDProduto = new javax.swing.JFormattedTextField();
        jLbEscondeLinha1 = new javax.swing.JLabel();
        jLbEscondeLinha2 = new javax.swing.JLabel();
        jLbEscondeLinha3 = new javax.swing.JLabel();
        jLbEscondeLinha4 = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLbMedida = new javax.swing.JLabel();
        jLbMarca = new javax.swing.JLabel();
        jLbQuantidade = new javax.swing.JLabel();
        jLbValorVenda = new javax.swing.JLabel();
        jLbNome = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbDescricao = new javax.swing.JLabel();
        jLbAtivo = new javax.swing.JLabel();
        jLbIDProduto = new javax.swing.JLabel();
        jBntAlterar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFMedida.setEditable(false);
        jTFMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMedida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMedida.setBorder(null);
        jTFMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMedidaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFMedida);
        jTFMedida.setBounds(340, 300, 258, 22);

        jTFAtivo.setEditable(false);
        jTFAtivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFAtivo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFAtivo.setBorder(null);
        jTFAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAtivoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFAtivo);
        jTFAtivo.setBounds(340, 300, 258, 22);

        jTFNome.setEditable(false);
        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNome.setBorder(null);
        jTFNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNome);
        jTFNome.setBounds(690, 30, 280, 30);

        jTFMarca.setEditable(false);
        jTFMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMarca.setBorder(null);
        jTFMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFMarca);
        jTFMarca.setBounds(140, 20, 308, 30);

        jTFValorVenda.setEditable(false);
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
        jTFValorVenda.setBounds(690, 30, 280, 30);

        jFTFQuantidade.setEditable(false);
        jFTFQuantidade.setBorder(null);
        jFTFQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jFTFQuantidade);
        jFTFQuantidade.setBounds(330, 100, 110, 22);

        jFTFIDProduto.setEditable(false);
        jFTFIDProduto.setBorder(null);
        jFTFIDProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFIDProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFIDProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFIDProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTFIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFIDProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jFTFIDProduto);
        jFTFIDProduto.setBounds(330, 100, 110, 22);

        jLbEscondeLinha1.setBackground(new java.awt.Color(255, 255, 255));
        jLbEscondeLinha1.setOpaque(true);
        getContentPane().add(jLbEscondeLinha1);
        jLbEscondeLinha1.setBounds(550, 120, 120, 20);
        getContentPane().add(jLbEscondeLinha2);
        jLbEscondeLinha2.setBounds(470, 80, 60, 20);
        getContentPane().add(jLbEscondeLinha3);
        jLbEscondeLinha3.setBounds(470, 80, 60, 30);
        getContentPane().add(jLbEscondeLinha4);
        jLbEscondeLinha4.setBounds(470, 80, 60, 30);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setToolTipText("");
        jTextAreaDescricao.setBorder(null);
        jTextAreaDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFDescricao.setViewportView(jTextAreaDescricao);

        getContentPane().add(jTFDescricao);
        jTFDescricao.setBounds(20, 20, 310, 240);

        jLbMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMedida.setText("  Medida:");
        getContentPane().add(jLbMedida);
        jLbMedida.setBounds(240, 300, 80, 22);

        jLbMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMarca.setText("  Marca:");
        getContentPane().add(jLbMarca);
        jLbMarca.setBounds(270, 320, 70, 30);

        jLbQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbQuantidade.setText("  Quantidade:");
        getContentPane().add(jLbQuantidade);
        jLbQuantidade.setBounds(700, 300, 120, 22);

        jLbValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorVenda.setText("  Preço:");
        getContentPane().add(jLbValorVenda);
        jLbValorVenda.setBounds(140, 270, 70, 22);

        jLbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(460, 70, 70, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("PRODUTO");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(170, -30, 550, 60);

        jLbDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbDescricao.setText("  Descrição:");
        getContentPane().add(jLbDescricao);
        jLbDescricao.setBounds(90, 370, 100, 22);

        jLbAtivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbAtivo.setText("  Ativo:");
        getContentPane().add(jLbAtivo);
        jLbAtivo.setBounds(570, 60, 70, 22);

        jLbIDProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbIDProduto.setText("  ID:");
        getContentPane().add(jLbIDProduto);
        jLbIDProduto.setBounds(500, 80, 50, 22);

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
        jBntAlterar.setBounds(460, 630, 150, 40);

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

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMarcaActionPerformed

    private void jFTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFQuantidadeActionPerformed

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
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jBntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntAlterarActionPerformed
        
        //try {
            TelaProdutoAlterar alterProduto = new TelaProdutoAlterar();
            //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            alterProduto.setSize(d.width + 8, d.height - 37);
            alterProduto.setResizable(false);

           //alterProduto.PegarDados(numero);

            alterProduto.show();
            dispose();
        //} catch (SQLException ex) {
            //Logger.getLogger(TelaProdutoAlterar.class.getName()).log(Level.SEVERE, null, ex);
        //}

    }//GEN-LAST:event_jBntAlterarActionPerformed

    private void jFTFIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFIDProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFIDProdutoActionPerformed

    private void jTFAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAtivoActionPerformed

    private void jTFValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorVendaActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutoInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntAlterar;
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JFormattedTextField jFTFIDProduto;
    private javax.swing.JFormattedTextField jFTFQuantidade;
    private javax.swing.JLabel jLbAtivo;
    private javax.swing.JLabel jLbDescricao;
    private javax.swing.JLabel jLbEscondeLinha1;
    private javax.swing.JLabel jLbEscondeLinha2;
    private javax.swing.JLabel jLbEscondeLinha3;
    private javax.swing.JLabel jLbEscondeLinha4;
    private javax.swing.JLabel jLbIDProduto;
    private javax.swing.JLabel jLbMarca;
    private javax.swing.JLabel jLbMedida;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbQuantidade;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFAtivo;
    private javax.swing.JScrollPane jTFDescricao;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFNome;
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
        
        jLbTitulo.setBounds(CentralizarLargura(550, 2, 1),CentralizarAltura(55, 18, 1),550,55);
        jLbTitulo.setForeground(corFundo3);
        jLbTitulo.setBackground(corFundo4);
         
        
        jLbIDProduto.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 30, 9),45 + 15 + 70 + 4,30);
        jFTFIDProduto.setBounds(CentralizarLargura(116, 18,2)+ 45 + 15,CentralizarAltura(30, 30, 9),70,30);
        jLbIDProduto.setBackground(corFundo4);
        jLbIDProduto.setOpaque(true);
        jFTFIDProduto.setBackground(corFundo4);
        jFTFIDProduto.setOpaque(true);
        
        // conta prara saber aonde deve colocar a nome para q fique centralizado entre o produto e marca
        int espacoNome = (((largura - CentralizarLargura(116, 18, 2) - 70 - 15 - 390 - 4)- (CentralizarLargura(116, 18,2)+ 45 + 15 + 70 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 45 + 15 + 70 + 4)) - (70 + 15 + 390 + 4)/2;
        
        jLbNome.setBounds(espacoNome,CentralizarAltura(30, 30, 9), 70 + 15 + 390 + 4, 30);
        jTFNome.setBounds(espacoNome + 70 + 15,CentralizarAltura(30, 30, 9), 390, 30);
        jLbNome.setBackground(corFundo4);
        jLbNome.setOpaque(true);
        jTFNome.setBackground(corFundo4);
        jTFNome.setOpaque(true);
        
        
        jLbMarca.setBounds(largura - CentralizarLargura(116, 18,2) - 70 - 15 - 390 - 4, CentralizarAltura(30, 30, 9),70 + 15 + 390 + 4,30);
        jTFMarca.setBounds(largura - CentralizarLargura(116, 18,2) - 390 - 4, CentralizarAltura(30, 30, 9),390,30); 
        jLbMarca.setBackground(corFundo4);
        jLbMarca.setOpaque(true);
        jTFMarca.setBackground(corFundo4);
        jTFMarca.setOpaque(true);
        
        jLbMedida.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 30, 12),80 + 15 + 190 + 4,30);
        jTFMedida.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15,CentralizarAltura(30, 30, 12),190,30);
        jLbMedida.setBackground(corFundo4);
        jLbMedida.setOpaque(true);
        jTFMedida.setBackground(corFundo4);
        jTFMedida.setOpaque(true);
        
        // conta prara saber aonde deve colocar a ValorVenda para q fique centralizado entre o medida e quantidade
        int espacoValorVenda = (((largura - CentralizarLargura(116, 18, 2) - 70 - 15 - 100 - 4)- (CentralizarLargura(116, 18,2)+ 80 + 15 + 190 + 4)) - (115 + 15 + 150 + 4) - (70 + 15 + 180 + 4))/3;
        
        jLbValorVenda.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15 + 190 + 4 + espacoValorVenda, CentralizarAltura(30, 30, 12),70 + 15 + 180 + 4,30);
        jTFValorVenda.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15 + 190 + 4 + espacoValorVenda + 70 + 15, CentralizarAltura(30, 30, 12),180,30);
        jLbValorVenda.setBackground(corFundo4);
        jLbValorVenda.setOpaque(true);
        jTFValorVenda.setBackground(corFundo4);
        jTFValorVenda.setOpaque(true);
        
        jLbQuantidade.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15 + 190 + 4 + espacoValorVenda+70+15+180+4 + espacoValorVenda, CentralizarAltura(30, 30, 12),115 + 15 + 150 + 4,30);
        jFTFQuantidade.setBounds(CentralizarLargura(116, 18,2)+ 80 + 15 + 190 + 4 + espacoValorVenda+70+15+180+4 + espacoValorVenda +115+15, CentralizarAltura(30, 30, 12),150,30);
        jLbQuantidade.setBackground(corFundo4);
        jLbQuantidade.setOpaque(true);
        jFTFQuantidade.setBackground(corFundo4);
        jFTFQuantidade.setOpaque(true);
        
        jLbAtivo.setBounds(largura - CentralizarLargura(116, 18,2) - 70 - 15 - 100 - 4, CentralizarAltura(30, 30, 12),70 + 15 + 100 + 4,30);
        jTFAtivo.setBounds(largura - CentralizarLargura(116, 18,2)- 105 - 4, CentralizarAltura(30, 30, 12),105,30);
        jLbAtivo.setBackground(corFundo4);
        jLbAtivo.setOpaque(true);
        jTFAtivo.setBackground(corFundo4);
        jTFAtivo.setOpaque(true);
        
        jLbDescricao.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 30, 15), 100,30);
        jTFDescricao.setBounds(CentralizarLargura(116, 18,2)+ 100 + 15,CentralizarAltura(30, 30, 15),largura-CentralizarLargura(116, 18, 2)-CentralizarLargura(116, 18, 2) - 100-15, CentralizarAltura(30, 30, 22) - CentralizarAltura(30, 30, 15));
        jLbDescricao.setBackground(corFundo4);
        jLbDescricao.setOpaque(true);
        jTextAreaDescricao.setBackground(corFundo4);
        jTextAreaDescricao.setOpaque(true);
        
        jLbEscondeLinha1.setBounds(CentralizarLargura(116, 18,2)+ 100 + 15,CentralizarAltura(30, 30, 15),largura-CentralizarLargura(116, 18, 2)-CentralizarLargura(116, 18, 2) - 100-15, 2);
        jLbEscondeLinha1.setBackground(corFundo4);
        jLbEscondeLinha1.setOpaque(true);
        jLbEscondeLinha2.setBounds(CentralizarLargura(116, 18,2)+ 100 + 15,CentralizarAltura(30, 30, 22)-2,largura-CentralizarLargura(116, 18, 2)-CentralizarLargura(116, 18, 2) - 100-15, 2);
        jLbEscondeLinha2.setBackground(corFundo4);
        jLbEscondeLinha2.setOpaque(true);
        jLbEscondeLinha3.setBounds(CentralizarLargura(116, 18,2)+ 100 + 15, CentralizarAltura(30, 30, 15), 2, CentralizarAltura(30, 30, 22) - CentralizarAltura(30, 30, 15));
        jLbEscondeLinha3.setBackground(corFundo4);
        jLbEscondeLinha3.setOpaque(true);
        jLbEscondeLinha4.setBounds(largura-CentralizarLargura(116, 18, 2)-2, CentralizarAltura(30, 30, 15), 2, CentralizarAltura(30, 30, 22) - CentralizarAltura(30, 30, 15));
        jLbEscondeLinha4.setBackground(corFundo4);
        jLbEscondeLinha4.setOpaque(true);
        
        
        jBntAlterar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntAlterar.setBackground(corFundo5);
        jBntAlterar.setOpaque(true);
        jBntAlterar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }

    public void PegarDados(int num) throws SQLException {
        numero = num;
                
        Produtos produto = new Produtos();
        
        produto.ConsultarProdutos();
        
        jFTFIDProduto.setText(produto.getIDProduto().get(num) + "");
        jTFNome.setText(produto.getNome().get(num));
        jTFMarca.setText(produto.getMarca().get(num));
        
        jTFMedida.setText(produto.getMedida().get(num));
        jTFValorVenda.setText("R$      " + produto.getValorVenda().get(num));
        jFTFQuantidade.setText(produto.getQuantidade().get(num) + "");
        jTFAtivo.setText(produto.getAtivo().get(num) == 0 ? "Inativo" : "Ativo");
        
        jTextAreaDescricao.setText(produto.getDescricao().get(num));
        
    }
    
}
