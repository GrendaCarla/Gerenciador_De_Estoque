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
        JP_Clientes = new javax.swing.JPanel();
        JP_Estoque = new javax.swing.JPanel();
        JP_Vendas = new javax.swing.JPanel();
        JP_Entregas = new javax.swing.JPanel();
        JP_Fornecedores = new javax.swing.JPanel();
        JP_Compras = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        JTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout JP_ClientesLayout = new javax.swing.GroupLayout(JP_Clientes);
        JP_Clientes.setLayout(JP_ClientesLayout);
        JP_ClientesLayout.setHorizontalGroup(
            JP_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_ClientesLayout.setVerticalGroup(
            JP_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Clientes", JP_Clientes);

        javax.swing.GroupLayout JP_EstoqueLayout = new javax.swing.GroupLayout(JP_Estoque);
        JP_Estoque.setLayout(JP_EstoqueLayout);
        JP_EstoqueLayout.setHorizontalGroup(
            JP_EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_EstoqueLayout.setVerticalGroup(
            JP_EstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Estoque", JP_Estoque);

        javax.swing.GroupLayout JP_VendasLayout = new javax.swing.GroupLayout(JP_Vendas);
        JP_Vendas.setLayout(JP_VendasLayout);
        JP_VendasLayout.setHorizontalGroup(
            JP_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_VendasLayout.setVerticalGroup(
            JP_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Vendas", JP_Vendas);

        javax.swing.GroupLayout JP_EntregasLayout = new javax.swing.GroupLayout(JP_Entregas);
        JP_Entregas.setLayout(JP_EntregasLayout);
        JP_EntregasLayout.setHorizontalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_EntregasLayout.setVerticalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Entregas", JP_Entregas);

        javax.swing.GroupLayout JP_FornecedoresLayout = new javax.swing.GroupLayout(JP_Fornecedores);
        JP_Fornecedores.setLayout(JP_FornecedoresLayout);
        JP_FornecedoresLayout.setHorizontalGroup(
            JP_FornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_FornecedoresLayout.setVerticalGroup(
            JP_FornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Fornecedores", JP_Fornecedores);

        javax.swing.GroupLayout JP_ComprasLayout = new javax.swing.GroupLayout(JP_Compras);
        JP_Compras.setLayout(JP_ComprasLayout);
        JP_ComprasLayout.setHorizontalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        JP_ComprasLayout.setVerticalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Compras", JP_Compras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    
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
    // End of variables declaration//GEN-END:variables

    Clientes cliente = new Clientes();
    
    public void CadastrarCliente()throws SQLException{
        cliente.setPais(Pais);
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
    }

    public void PegarListaClientes(){
        
    }
    
}
