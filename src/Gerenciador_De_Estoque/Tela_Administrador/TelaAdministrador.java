package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Clientes;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTable;

public class TelaAdministrador extends javax.swing.JFrame {

    public TelaAdministrador() {
        initComponents();
        
        criarTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        JP_Fornecedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jBntFornecedorInicialSair = new javax.swing.JButton();
        jBntFornecedorInicialCadastrar = new javax.swing.JButton();
        JP_Compras = new javax.swing.JPanel();
        JP_Estoque = new javax.swing.JPanel();
        JP_Clientes = new javax.swing.JPanel();
        JP_Vendas = new javax.swing.JPanel();
        JP_Entregas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        JTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        JP_Fornecedores.setPreferredSize(new java.awt.Dimension(300, 500));
        JP_Fornecedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Contato", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Fornecedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 210, 230));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 920, 30));

        jBntFornecedorInicialSair.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBntFornecedorInicialSair.setText("Sair");
        jBntFornecedorInicialSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntFornecedorInicialSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntFornecedorInicialSairActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntFornecedorInicialSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 560, 150, 60));

        jBntFornecedorInicialCadastrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBntFornecedorInicialCadastrar.setText("Cadastrar");
        jBntFornecedorInicialCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntFornecedorInicialCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntFornecedorInicialCadastrarActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntFornecedorInicialCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 210, 60));

        JTabbedPane.addTab("Fornecedores", JP_Fornecedores);

        javax.swing.GroupLayout JP_ComprasLayout = new javax.swing.GroupLayout(JP_Compras);
        JP_Compras.setLayout(JP_ComprasLayout);
        JP_ComprasLayout.setHorizontalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_ComprasLayout.setVerticalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Compras", JP_Compras);

        javax.swing.GroupLayout JP_EstoqueLayout = new javax.swing.GroupLayout(JP_Estoque);
        JP_Estoque.setLayout(JP_EstoqueLayout);
        JP_EstoqueLayout.setHorizontalGroup(
            JP_EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_EstoqueLayout.setVerticalGroup(
            JP_EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Estoque", JP_Estoque);

        javax.swing.GroupLayout JP_ClientesLayout = new javax.swing.GroupLayout(JP_Clientes);
        JP_Clientes.setLayout(JP_ClientesLayout);
        JP_ClientesLayout.setHorizontalGroup(
            JP_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_ClientesLayout.setVerticalGroup(
            JP_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Clientes", JP_Clientes);

        javax.swing.GroupLayout JP_VendasLayout = new javax.swing.GroupLayout(JP_Vendas);
        JP_Vendas.setLayout(JP_VendasLayout);
        JP_VendasLayout.setHorizontalGroup(
            JP_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_VendasLayout.setVerticalGroup(
            JP_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Vendas", JP_Vendas);

        javax.swing.GroupLayout JP_EntregasLayout = new javax.swing.GroupLayout(JP_Entregas);
        JP_Entregas.setLayout(JP_EntregasLayout);
        JP_EntregasLayout.setHorizontalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_EntregasLayout.setVerticalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Entregas", JP_Entregas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jBntFornecedorInicialSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntFornecedorInicialSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntFornecedorInicialSairActionPerformed

    private void jBntFornecedorInicialCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntFornecedorInicialCadastrarActionPerformed
        TelaFornecedorCadastro principalFornededor = new TelaFornecedorCadastro();
        //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        principalFornededor.setSize(d.width + 8, d.height - 37);
        principalFornededor.setResizable(false);
           
        principalFornededor.show();
        dispose();
    }//GEN-LAST:event_jBntFornecedorInicialCadastrarActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Clientes;
    private javax.swing.JPanel JP_Compras;
    private javax.swing.JPanel JP_Entregas;
    private javax.swing.JPanel JP_Estoque;
    private javax.swing.JPanel JP_Fornecedores;
    private javax.swing.JPanel JP_Vendas;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton jBntFornecedorInicialCadastrar;
    private javax.swing.JButton jBntFornecedorInicialSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void criarTabela() {
        
        Object [][] dados = {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        };
        
        String [] colunas = {"Nome", "Contato", "Endereço"};
        
                    
        JTable tabela1 = new JTable(dados, colunas);
        
        /*tabela1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Contato", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false,false, false, false,false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.setRowHeight(25);
        tabela1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela1);
        if (tabela1.getColumnModel().getColumnCount() > 0) {
            tabela1.getColumnModel().getColumn(0).setResizable(false);
            tabela1.getColumnModel().getColumn(1).setResizable(false);
            tabela1.getColumnModel().getColumn(2).setResizable(false);
            tabela1.getColumnModel().getColumn(3).setResizable(false);
            tabela1.getColumnModel().getColumn(4).setResizable(false);
            tabela1.getColumnModel().getColumn(5).setResizable(false);
            tabela1.getColumnModel().getColumn(6).setResizable(false);
            tabela1.getColumnModel().getColumn(7).setResizable(false);
            tabela1.getColumnModel().getColumn(8).setResizable(false);
        }*/
    }

    public void PegarListaClientes(){
        
    }
    
}
