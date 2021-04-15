package Gerenciador_De_Estoque;

import java.sql.SQLException;

public class TelaAdministrador extends javax.swing.JFrame {

    public TelaAdministrador() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        JP_Fornecedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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

        JP_Fornecedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 920, 540));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 920, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Cadastrar");
        JP_Fornecedores.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 210, 60));

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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    Clientes cliente = new Clientes();
    
    public void CadastrarCliente()throws SQLException{
        /*cliente.setPais(Pais);
        cliente.setEstado(Estado);
        cliente.setCidade(Cidade);
        cliente.setBairro(Bairro);
        cliente.setRua(Rua);
        cliente.setNumero(Numero);
        
        cliente.setTelefone1(Telefone1);
        cliente.setTelefone2(Telefone2);
        cliente.setEmail1(Email1);
        cliente.setEmail2(Email2);
        
        cliente.setCPF(CPF);
        cliente.setDataDeNascimento(DataDeNascimento);
        cliente.setNome(Nome);
        
        cliente.CadastrarCliente();
        */
    }

    public void PegarListaClientes(){
        
    }
    
}
