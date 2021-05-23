package Telas;

import Design.Design;
import Classes.Vendas;
import Classes.Clientes;
import Classes.Produtos;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class TelaVendaInfo extends javax.swing.JFrame {
    
    int numero;
    
    Produtos produto = new Produtos();
    Clientes cliente = new Clientes();
    Vendas venda = new Vendas();
    Design design = new Design();
    
    

    public TelaVendaInfo() throws SQLException {
        initComponents();
        
        AlinhamentoDosItens();
        criarTabelaItensVenda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFTFValorTotal = new javax.swing.JFormattedTextField();
        jTFFormaDePagamento = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jTFCliente = new javax.swing.JTextField();
        jTFHora = new javax.swing.JTextField();
        jLbValorTotal = new javax.swing.JLabel();
        jLbData = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbCliente = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jLbFormaDePagamento = new javax.swing.JLabel();
        jBntAlterar = new javax.swing.JButton();
        jBntVoltar = new javax.swing.JButton();
        jScrollPaneItensVendido = new javax.swing.JScrollPane();
        jTItensVendido = new javax.swing.JTable();
        jLbFundoTabela = new javax.swing.JLabel();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jFTFValorTotal.setEditable(false);
        jFTFValorTotal.setBorder(null);
        jFTFValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        jFTFValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFValorTotal);
        jFTFValorTotal.setBounds(100, 20, 90, 22);

        jTFFormaDePagamento.setEditable(false);
        jTFFormaDePagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFFormaDePagamento.setBorder(null);
        jTFFormaDePagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFFormaDePagamento);
        jTFFormaDePagamento.setBounds(430, 120, 0, 22);

        jTFData.setEditable(false);
        jTFData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData.setBorder(null);
        jTFData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData.setOpaque(false);
        getContentPane().add(jTFData);
        jTFData.setBounds(40, 40, 0, 22);

        jTFCliente.setEditable(false);
        jTFCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCliente.setBorder(null);
        jTFCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFCliente);
        jTFCliente.setBounds(40, 40, 0, 22);

        jTFHora.setEditable(false);
        jTFHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFHora.setBorder(null);
        jTFHora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFHora.setOpaque(false);
        getContentPane().add(jTFHora);
        jTFHora.setBounds(40, 40, 0, 22);

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
        jLbTitulo.setText("VENDA");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(212, 11, 550, 60);

        jLbCliente.setBackground(new java.awt.Color(51, 255, 153));
        jLbCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCliente.setText("  Cliente:");
        getContentPane().add(jLbCliente);
        jLbCliente.setBounds(230, 130, 110, 22);

        jLbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora.setText("  Hora:");
        getContentPane().add(jLbHora);
        jLbHora.setBounds(540, 110, 60, 22);

        jLbFormaDePagamento.setBackground(new java.awt.Color(51, 255, 153));
        jLbFormaDePagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbFormaDePagamento.setText("  Pagamento:");
        getContentPane().add(jLbFormaDePagamento);
        jLbFormaDePagamento.setBounds(110, 290, 110, 22);

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

        jScrollPaneItensVendido.setBackground(new java.awt.Color(207, 220, 212));
        jScrollPaneItensVendido.setBorder(null);
        jScrollPaneItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTItensVendido.setModel(new javax.swing.table.DefaultTableModel(
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
        jTItensVendido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTItensVendido.setDragEnabled(true);
        jTItensVendido.setGridColor(new java.awt.Color(204, 204, 204));
        jTItensVendido.setRowHeight(25);
        jTItensVendido.getTableHeader().setReorderingAllowed(false);
        jScrollPaneItensVendido.setViewportView(jTItensVendido);

        getContentPane().add(jScrollPaneItensVendido);
        jScrollPaneItensVendido.setBounds(50, 280, 910, 340);

        jLbFundoTabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbFundoTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoTabela.png"))); // NOI18N
        jLbFundoTabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLbFundoTabela.setOpaque(true);
        getContentPane().add(jLbFundoTabela);
        jLbFundoTabela.setBounds(60, 80, 850, 430);

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
            TelaVendaAlterar alterVenda = new TelaVendaAlterar();

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            alterVenda.setSize(d.width + 8, d.height - 37);
            alterVenda.setResizable(false);

            alterVenda.criarTabelaItensVenda(numero);

            alterVenda.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntAlterarActionPerformed

    private void jBntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarActionPerformed
        try {
            TelaPrincipal Janela = new TelaPrincipal();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(3);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(TelaVendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaVendaInfo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaVendaInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntAlterar;
    private javax.swing.JButton jBntVoltar;
    private javax.swing.JFormattedTextField jFTFValorTotal;
    private javax.swing.JLabel jLbCliente;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbFormaDePagamento;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbFundoTabela;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorTotal;
    private javax.swing.JScrollPane jScrollPaneItensVendido;
    private javax.swing.JTextField jTFCliente;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFFormaDePagamento;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTable jTItensVendido;
    // End of variables declaration//GEN-END:variables

    public void AlinhamentoDosItens() {
        
        getContentPane().setBackground(design.getCorFundo1());
        
        jLbFundo1.setBounds(10, 110,design.getLargura() - 20, design.getAltura() - 200);
        
        jLbFundo2.setBounds(10+10 , 110+10, (design.getLargura() - 20)-20, (design.getAltura() - 200)-40);
        jLbFundo2.setBackground(design.getCorFundo3());
        
        jScrollPaneItensVendido.setBounds(design.CentralizarLargura(116, 18,2) + 8,design.CentralizarAltura(30, 15, 4) + 8,design.getLargura() - (design.CentralizarLargura(116, 18,2)*2) - 16,design.CentralizarAltura(30, 30, 23) - design.CentralizarAltura(30, 15, 4)-25);
        jScrollPaneItensVendido.setBackground(design.getCorTituloTabela());
        
        jLbFundoTabela.setBounds(design.CentralizarLargura(116, 18,2), design.CentralizarAltura(30, 15, 4), design.getLargura() - (design.CentralizarLargura(116, 18,2)*2), design.CentralizarAltura(30, 30, 23) - design.CentralizarAltura(30, 15, 4));
        jLbFundoTabela.setBackground(design.getCorFundo2());
       
        
        
        jLbTitulo.setBounds(design.CentralizarLargura(550, 2, 1),design.CentralizarAltura(55, 18, 1),550,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
        
        
        jLbCliente.setBounds(design.CentralizarLargura(116, 44,3),design.CentralizarAltura(30, 15, 3),80 + 15 + 250 + 4,30);
        jTFCliente.setBounds(design.CentralizarLargura(116, 44,3)+ 80 + 15,design.CentralizarAltura(30, 15, 3),250,30);
        jLbCliente.setBackground(design.getCorCampoTexto());
        jLbCliente.setOpaque(true);
        jTFCliente.setBackground(design.getCorCampoTexto());
        jTFCliente.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((design.getLargura() - design.CentralizarLargura(116, 44,3) - 100 - 15 - 130 - 4)- (design.CentralizarLargura(116, 44,3)+ 80 + 15 + 250 + 4)) - (110 + 15 + 120 + 4) - (60 + 15 + 60 + 20) - (60 + 15 + 125 + 4))/4;
       
        
        jLbData.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 125 + 4,30);
        jTFData.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),125,30);
        jLbData.setBackground(design.getCorCampoTexto());
        jLbData.setOpaque(true);
        jTFData.setBackground(design.getCorCampoTexto());
        jTFData.setOpaque(true);
        
        jLbHora.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 125 + 4 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 60 + 20,30);
        jTFHora.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 125 + 4 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),60,30);
        jLbHora.setBackground(design.getCorCampoTexto());
        jLbHora.setOpaque(true);
        jTFHora.setBackground(design.getCorCampoTexto());
        jTFHora.setOpaque(true);
        
        jLbFormaDePagamento.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 125 + 4 + espacoData  + 60 + 15 + 60 + 20 + espacoData, design.CentralizarAltura(30, 15, 3),110 + 15 + 120 + 4,30);
        jTFFormaDePagamento.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 125 + 4 + espacoData  + 60 + 15 + 60 + 20 + espacoData + 110 + 15, design.CentralizarAltura(30, 15, 3), 120, 30);
        jLbFormaDePagamento.setBackground(design.getCorCampoTexto());
        jLbFormaDePagamento.setOpaque(true);
        jTFFormaDePagamento.setBackground(design.getCorCampoTexto());
        jTFFormaDePagamento.setOpaque(true);
                
        jLbValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 44,3) - 100 - 15 - 130 - 4,design.CentralizarAltura(30, 15, 3),100 + 15 + 130 + 4,30);
        jFTFValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 44,3)- 130 - 4,design.CentralizarAltura(30, 15, 3),130,30);
        jLbValorTotal.setBackground(design.getCorCampoTexto());
        jLbValorTotal.setOpaque(true);
        jFTFValorTotal.setBackground(design.getCorCampoTexto());
        jFTFValorTotal.setOpaque(true);
        
        
        jBntAlterar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntAlterar.setBackground(design.getCorBotaoSalvar());
        jBntAlterar.setOpaque(true);
        jBntAlterar.setForeground(design.getCorLetra1());
        
        jBntVoltar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 150,design.CentralizarAltura(30, 30, 24),150,40);
        jBntVoltar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntVoltar.setOpaque(true);
        jBntVoltar.setForeground(design.getCorLetra1());
        
    }
    
    public void criarTabelaItensVenda() throws SQLException{
        
        produto.ConsultarProdutos();
        
        jTItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18));

        JTableHeader cabecalho = jTItensVendido.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());

        jTItensVendido.setModel(new javax.swing.table.DefaultTableModel(
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

        jTItensVendido.setRowHeight(25);
        jTItensVendido.getTableHeader().setReorderingAllowed(false);

        jScrollPaneItensVendido.setViewportView(jTItensVendido);

        if (jTItensVendido.getColumnModel().getColumnCount() > 0) {
            jTItensVendido.getColumnModel().getColumn(0).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(1).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(2).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(3).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(4).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(5).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(0).setMinWidth(100);
            jTItensVendido.getColumnModel().getColumn(0).setMaxWidth(100);
            jTItensVendido.getColumnModel().getColumn(3).setMinWidth(160);
            jTItensVendido.getColumnModel().getColumn(3).setMaxWidth(160);
            jTItensVendido.getColumnModel().getColumn(4).setMinWidth(100);
            jTItensVendido.getColumnModel().getColumn(4).setMaxWidth(100);
            jTItensVendido.getColumnModel().getColumn(5).setMinWidth(150);
            jTItensVendido.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTItensVendido.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTItensVendido.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTItensVendido.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTItensVendido.getColumnModel().getColumn(3).setCellRenderer(direita);
        jTItensVendido.getColumnModel().getColumn(4).setCellRenderer(centro);
        jTItensVendido.getColumnModel().getColumn(5).setCellRenderer(direita);
        
    } 
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
        
        cliente.ConsultarClientes();
        venda.ConsultarVendas();
        produto.ConsultarProdutos();
        venda.ConsultarItem(venda.getIDVenda().get(num));
       
        jTFCliente.setText("" + cliente.getNome().get(cliente.getIDCliente().indexOf(venda.getIDCliente().get(num))));
        jTFData.setText(venda.getDataHoraDaVenda().get(num).substring(8, 10) + " / " + venda.getDataHoraDaVenda().get(num).substring(5, 7) + " / " + venda.getDataHoraDaVenda().get(num).substring(0, 4));
        jTFHora.setText(venda.getDataHoraDaVenda().get(num).substring(11, 13) + " : " + venda.getDataHoraDaVenda().get(num).substring(14, 16));
        jFTFValorTotal.setText((design.FormataFloat(venda.getValorTotal().get(num))).replace(".",","));
        jTFFormaDePagamento.setText("" + venda.getFormaDePagamento().get(num));
        
        for(int i=0; i< venda.getIDItemVendido().size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTItensVendido.getModel();
            model.addRow(new Object[]{""+venda.getIDProduto().get(i), " "+produto.getNome().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i))), " "+produto.getMarca().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i))), produto.getMedida().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i)))+" ", venda.getQuantidade().get(i), design.FormataFloat(venda.getValorUnitario().get(i)) + " "});
        }
        
    }

}
