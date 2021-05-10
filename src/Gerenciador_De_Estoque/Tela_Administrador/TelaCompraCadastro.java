
package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.ItensComprados;
import java.awt.Color;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class TelaCompraCadastro extends javax.swing.JFrame {

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
    
    
    public TelaCompraCadastro() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFData = new javax.swing.JTextField();
        jTFFornecedor = new javax.swing.JTextField();
        jTFHora = new javax.swing.JTextField();
        jLbData = new javax.swing.JLabel();
        jLbFornecedor = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jScrollPaneItensComprado = new javax.swing.JScrollPane();
        jTItensComprado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData.setBorder(null);
        jTFData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataActionPerformed(evt);
            }
        });
        getContentPane().add(jTFData);
        jTFData.setBounds(690, 130, 308, 30);

        jTFFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFFornecedor.setBorder(null);
        jTFFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTFFornecedor);
        jTFFornecedor.setBounds(370, 130, 280, 30);

        jTFHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFHora.setBorder(null);
        jTFHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTFHora);
        jTFHora.setBounds(370, 170, 280, 30);

        jLbData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData.setText("  Data:");
        getContentPane().add(jLbData);
        jLbData.setBounds(340, 150, 60, 22);

        jLbFornecedor.setBackground(new java.awt.Color(51, 255, 153));
        jLbFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbFornecedor.setText("  Fornecedor:");
        getContentPane().add(jLbFornecedor);
        jLbFornecedor.setBounds(230, 130, 110, 22);

        jLbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora.setText("  Hora:");
        getContentPane().add(jLbHora);
        jLbHora.setBounds(540, 110, 60, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("CADASTRAR COMPRA");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 7));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(212, 11, 750, 60);

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

        jScrollPaneItensComprado.setBackground(new java.awt.Color(255, 255, 255));
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTItensComprado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTItensCompradoFocusGained(evt);
            }
        });
        jTItensComprado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTItensCompradoMouseClicked(evt);
            }
        });
        jScrollPaneItensComprado.setViewportView(jTItensComprado);

        getContentPane().add(jScrollPaneItensComprado);
        jScrollPaneItensComprado.setBounds(50, 280, 910, 340);

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

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        
    }//GEN-LAST:event_jBntSalvarActionPerformed

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed

    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jTFDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataActionPerformed

    private void jTFFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFornecedorActionPerformed

    private void jTFHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHoraActionPerformed

    private void jTItensCompradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTItensCompradoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTItensCompradoFocusGained

    private void jTItensCompradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTItensCompradoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTItensCompradoMouseClicked

    
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
            java.util.logging.Logger.getLogger(TelaCompraCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompraCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompraCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompraCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompraCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbFornecedor;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneItensComprado;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTFHora;
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
         
        
        jLbFornecedor.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),110 + 15 + 400 + 4,30);
        jTFFornecedor.setBounds(CentralizarLargura(116, 18,2)+ 110 + 15,CentralizarAltura(30, 15, 4),400,30);
        jLbFornecedor.setBackground(corFundo4);
        jLbFornecedor.setOpaque(true);
        jTFFornecedor.setBackground(corFundo4);
        jTFFornecedor.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((largura - CentralizarLargura(116, 18,2) - 60 - 15 - 110 - 4)- (CentralizarLargura(116, 18,2)+ 110 + 15 + 400 + 4)) / 2 + (CentralizarLargura(116, 18,2)+ 110 + 15 + 400 + 4)) - (60 + 15 + 160 + 4)/2;
        
        jLbData.setBounds(espacoData,CentralizarAltura(30, 15, 4),60 + 15 + 160 + 4,30);
        jTFData.setBounds(espacoData + 60 + 15,CentralizarAltura(30, 15, 4),160,30);
        jLbData.setBackground(corFundo4);
        jLbData.setOpaque(true);
        jTFData.setBackground(corFundo4);
        jTFData.setOpaque(true);
        
        jLbHora.setBounds(largura - CentralizarLargura(116, 18,2) - 60 - 15 - 110 - 4,CentralizarAltura(30, 15, 4),60 + 15 + 110 + 4,30);
        jTFHora.setBounds(largura - CentralizarLargura(116, 18,2) - 110 - 4,CentralizarAltura(30, 15, 4),110,30);
        jLbHora.setBackground(corFundo4);
        jLbHora.setOpaque(true);
        jTFHora.setBackground(corFundo4);
        jTFHora.setOpaque(true);
        
        jScrollPaneItensComprado.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 5),largura - (CentralizarLargura(116, 18,2)*2),CentralizarAltura(30, 30, 23) - CentralizarAltura(30, 15, 5));

        
        jBntSalvar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(corFundo5);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }
    
    public void criarTabelaItensCompra() throws SQLException {
        
        Compras itemComprado = new Compras();
        
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        jTItensComprado.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTItensComprado.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTItensComprado.getColumnModel().getColumn(2).setCellRenderer(centro);
        jTItensComprado.getColumnModel().getColumn(3).setCellRenderer(centro);
        
       
        
    } 
}

