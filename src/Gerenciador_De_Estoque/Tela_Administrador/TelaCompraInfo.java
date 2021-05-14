
package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TelaCompraInfo extends javax.swing.JFrame {
    
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
    Produtos produto = new Produtos();
    Fornecedores fornecedor = new Fornecedores();
    Compras compra = new Compras();

    public TelaCompraInfo() throws SQLException {
        initComponents();
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
        criarTabelaItensCompra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFValorTotal = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jTFHora = new javax.swing.JTextField();
        jTFFornecedor = new javax.swing.JTextField();
        jScrollPaneItensComprado = new javax.swing.JScrollPane();
        jTItensComprado = new javax.swing.JTable();
        jLbValorTotal = new javax.swing.JLabel();
        jLbData = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbFornecedor = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jBntAlterar = new javax.swing.JButton();
        jBntVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFValorTotal.setEditable(false);
        jTFValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFValorTotal.setBorder(null);
        jTFValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFValorTotal.setOpaque(false);
        getContentPane().add(jTFValorTotal);
        jTFValorTotal.setBounds(40, 40, 0, 22);

        jTFData.setEditable(false);
        jTFData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData.setBorder(null);
        jTFData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData.setOpaque(false);
        getContentPane().add(jTFData);
        jTFData.setBounds(40, 40, 0, 22);

        jTFHora.setEditable(false);
        jTFHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFHora.setBorder(null);
        jTFHora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFHora.setOpaque(false);
        getContentPane().add(jTFHora);
        jTFHora.setBounds(40, 40, 0, 22);

        jTFFornecedor.setEditable(false);
        jTFFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFFornecedor.setBorder(null);
        jTFFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFFornecedor);
        jTFFornecedor.setBounds(40, 40, 0, 22);

        jScrollPaneItensComprado.setBackground(new java.awt.Color(207, 220, 212));
        jScrollPaneItensComprado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneItensComprado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTItensComprado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTItensComprado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PRODUTO", "NOME", "MARCA", "MEDIDA", "QUANTIDADE", "PREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTItensComprado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTItensComprado.setDragEnabled(true);
        jTItensComprado.setGridColor(new java.awt.Color(204, 204, 204));
        jTItensComprado.setRowHeight(25);
        jTItensComprado.getTableHeader().setReorderingAllowed(false);
        jScrollPaneItensComprado.setViewportView(jTItensComprado);

        getContentPane().add(jScrollPaneItensComprado);
        jScrollPaneItensComprado.setBounds(50, 280, 910, 340);

        jLbValorTotal.setBackground(new java.awt.Color(51, 255, 153));
        jLbValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorTotal.setText("  Total:   R$");
        getContentPane().add(jLbValorTotal);
        jLbValorTotal.setBounds(340, 150, 110, 22);

        jLbData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData.setText("  Data:");
        getContentPane().add(jLbData);
        jLbData.setBounds(340, 150, 60, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("COMPRA");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(212, 11, 750, 60);

        jLbFornecedor.setBackground(new java.awt.Color(51, 255, 153));
        jLbFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbFornecedor.setText("  Fornecedor:");
        getContentPane().add(jLbFornecedor);
        jLbFornecedor.setBounds(230, 130, 110, 22);

        jLbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora.setText("  Hora:");
        getContentPane().add(jLbHora);
        jLbHora.setBounds(540, 110, 60, 22);

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

    private void jBntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarActionPerformed
        try {
            TelaAdministrador Janela = new TelaAdministrador();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(1);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarActionPerformed

    private void jBntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntAlterarActionPerformed
        try {
            TelaCompraAlterar alterCompra = new TelaCompraAlterar();

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            alterCompra.setSize(d.width + 8, d.height - 37);
            alterCompra.setResizable(false);

            alterCompra.criarTabelaItensCompra(numero);

            alterCompra.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBntAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCompraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCompraInfo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCompraInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntAlterar;
    private javax.swing.JButton jBntVoltar;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbFornecedor;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneItensComprado;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTextField jTFValorTotal;
    private javax.swing.JTable jTItensComprado;
    // End of variables declaration//GEN-END:variables

    public void corDeFundo() {
        
        getContentPane().setBackground(corFundo1);
        jPanel1.setBackground(corFundo2);
        jPanel2.setBackground(corFundo3);
        
    }

    public void TamanhoDoFundo() {

        jPanel1.setSize(largura - 40, altura - 200);
        jPanel1.setLocation(20, 110);

        jPanel2.setPreferredSize(new Dimension ((largura - 40)-30, (altura - 200)-40)); 
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        
    }
    
    public int CentralizarLargura(int tamanhoObjeto, int posicao, int muti) { 
        return (largura/posicao)*muti - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao, int muti) { 
        return (altura/posicao)* muti - (tamanhoObjeto/2);
    }
    
    public void AlinhamentoDosItens() {
        
        jLbTitulo.setBounds(CentralizarLargura(750, 2, 1),CentralizarAltura(55, 18, 1),550,55);
        jLbTitulo.setForeground(corFundo3);
        jLbTitulo.setBackground(corFundo4);
        
        
        jLbFornecedor.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 3),110 + 15 + 300 + 4,30);
        jTFFornecedor.setBounds(CentralizarLargura(116, 18,2)+ 110 + 15,CentralizarAltura(30, 15, 3),300,30);
        jLbFornecedor.setBackground(corFundo4);
        jLbFornecedor.setOpaque(true);
        jTFFornecedor.setBackground(corFundo4);
        jTFFornecedor.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((largura - CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4)- (CentralizarLargura(116, 18,2)+ 110 + 15 + 300 + 4)) - (60 + 15 + 20 + 10 + 20 + 20) - (60 + 15 + 20 + 10 + 20 + 10 + 40 + 20))/3;
       
        
        jLbData.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData,CentralizarAltura(30, 15, 3),60 + 15 + 100 + 20,30);
        jTFData.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15,CentralizarAltura(30, 15, 3),100,30);
        jLbData.setBackground(corFundo4);
        jLbData.setOpaque(true);
        jTFData.setBackground(corFundo4);
        jTFData.setOpaque(true);
        
        
        jLbHora.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 100 + 20 + espacoData,CentralizarAltura(30, 15, 3),60 + 15 + 50 + 20,30);
        jTFHora.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 100 + 20 + espacoData + 60 + 15,CentralizarAltura(30, 15, 3),50,30);
        jLbHora.setBackground(corFundo4);
        jLbHora.setOpaque(true);
        jTFHora.setBackground(corFundo4);
        jTFHora.setOpaque(true);
        
        jLbValorTotal.setBounds(largura - CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4,CentralizarAltura(30, 15, 3),110 + 15 + 150 + 4,30);
        jTFValorTotal.setBounds(largura - CentralizarLargura(116, 18,2)- 150 - 4,CentralizarAltura(30, 15, 3),150,30);
        jLbValorTotal.setBackground(corFundo4);
        jLbValorTotal.setOpaque(true);
        jTFValorTotal.setBackground(corFundo4);
        jTFValorTotal.setOpaque(true);
        
        
        jScrollPaneItensComprado.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),largura - (CentralizarLargura(116, 18,2)*2),CentralizarAltura(30, 30, 23) - CentralizarAltura(30, 15, 4));

        
        jBntAlterar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntAlterar.setBackground(corFundo5);
        jBntAlterar.setOpaque(true);
        jBntAlterar.setForeground(corFundo3);
        
        jBntVoltar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntVoltar.setBackground(corFundo6);
        jBntVoltar.setOpaque(true);
        jBntVoltar.setForeground(corFundo3);
        
    }
    
    public void criarTabelaItensCompra() throws SQLException{
        
        produto.ConsultarProdutos();
        
        jTItensComprado.setFont(new java.awt.Font("Tahoma", 0, 18));

        JTableHeader cabecalho = jTItensComprado.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", 0, 18));
        cabecalho.setBackground(corFundo4);

        jTItensComprado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "NOME", "MARCA", "MEDIDA", "QUANT.", "PREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });

        jTItensComprado.setRowHeight(25);
        jTItensComprado.getTableHeader().setReorderingAllowed(false);

        jScrollPaneItensComprado.setViewportView(jTItensComprado);

        if (jTItensComprado.getColumnModel().getColumnCount() > 0) {
            jTItensComprado.getColumnModel().getColumn(0).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(1).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(2).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(3).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(4).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(5).setResizable(false);
            jTItensComprado.getColumnModel().getColumn(0).setMinWidth(100);
            jTItensComprado.getColumnModel().getColumn(0).setMaxWidth(100);
            jTItensComprado.getColumnModel().getColumn(3).setMinWidth(160);
            jTItensComprado.getColumnModel().getColumn(3).setMaxWidth(160);
            jTItensComprado.getColumnModel().getColumn(4).setMinWidth(100);
            jTItensComprado.getColumnModel().getColumn(4).setMaxWidth(100);
            jTItensComprado.getColumnModel().getColumn(5).setMinWidth(150);
            jTItensComprado.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTItensComprado.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTItensComprado.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTItensComprado.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTItensComprado.getColumnModel().getColumn(3).setCellRenderer(direita);
        jTItensComprado.getColumnModel().getColumn(4).setCellRenderer(centro);
        jTItensComprado.getColumnModel().getColumn(5).setCellRenderer(direita);
        
    } 
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
        
        fornecedor.ConsultarFornecedor();
        compra.ConsultarCompras();
        produto.ConsultarProdutos();
        compra.ConsultarItem(compra.getIDCompra().get(num));
        
        jTFFornecedor.setText("" + fornecedor.getNomeFantasia().get(fornecedor.getIDFornecedor().indexOf(compra.getIDFornecedor().get(num))));
        jTFData.setText(compra.getDataHoraDaCompra().get(num).substring(8, 10) + "/" + compra.getDataHoraDaCompra().get(num).substring(5, 7) + "/" + compra.getDataHoraDaCompra().get(num).substring(0, 4));
        jTFHora.setText(compra.getDataHoraDaCompra().get(num).substring(11, 16));
        jTFValorTotal.setText((FormataFloat(compra.getValorTotal().get(num))).replace(".",","));
        
        for(int i=0; i< compra.getIDItemComprado().size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTItensComprado.getModel();
            model.addRow(new Object[]{""+compra.getIDProduto().get(i), " "+produto.getNome().get(produto.getIDProduto().indexOf(compra.getIDProduto().get(i))), " "+produto.getMarca().get(produto.getIDProduto().indexOf(compra.getIDProduto().get(i))), produto.getMedida().get(produto.getIDProduto().indexOf(compra.getIDProduto().get(i)))+" ", compra.getQuantidade().get(i), FormataFloat(compra.getValorUnitario().get(i)) + " "});
        }
        
    }
    
    public String FormataFloat(float num){
        
        NumberFormat formatter = new DecimalFormat("0.00");
        return (formatter.format(num));
        
    }

}
