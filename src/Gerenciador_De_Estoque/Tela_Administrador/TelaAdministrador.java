package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Clientes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.JTableHeader;

public class TelaAdministrador extends javax.swing.JFrame {
    
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
    Color corFont1 = new Color(0,0,0);
    Color corFont2 = new Color(195,195,195);

    public TelaAdministrador() {
        initComponents();
        corDeFundo();
        TamanhoDoFundo();
        criarTabela();
        AlinhamentoDosItens();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        JP_Fornecedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBntLupa = new javax.swing.JButton();
        jTFBarraDeBusca = new javax.swing.JTextField();
        jBntFornecedorInicialSair = new javax.swing.JButton();
        jBntFornecedorInicialCadastrar = new javax.swing.JButton();
        jLbBarraDeBusca = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        JTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        JTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JP_Fornecedores.setPreferredSize(new java.awt.Dimension(300, 500));
        JP_Fornecedores.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Fornecedores.add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 920, 540);

        jBntLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupa.setBorder(null);
        jBntLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JP_Fornecedores.add(jBntLupa);
        jBntLupa.setBounds(980, 110, 20, 19);

        jTFBarraDeBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBusca.setForeground(new java.awt.Color(195, 195, 195));
        jTFBarraDeBusca.setText("Fornecedor"); // NOI18N
        jTFBarraDeBusca.setToolTipText("");
        jTFBarraDeBusca.setBorder(null);
        jTFBarraDeBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaFocusLost(evt);
            }
        });
        jTFBarraDeBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBarraDeBuscaActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jTFBarraDeBusca);
        jTFBarraDeBusca.setBounds(40, 30, 920, 30);

        jBntFornecedorInicialSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntFornecedorInicialSair.setForeground(new java.awt.Color(255, 255, 255));
        jBntFornecedorInicialSair.setText("Sair");
        jBntFornecedorInicialSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntFornecedorInicialSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntFornecedorInicialSairActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntFornecedorInicialSair);
        jBntFornecedorInicialSair.setBounds(1090, 560, 150, 60);

        jBntFornecedorInicialCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBntFornecedorInicialCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jBntFornecedorInicialCadastrar.setText("CADASTRAR");
        jBntFornecedorInicialCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntFornecedorInicialCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntFornecedorInicialCadastrarActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntFornecedorInicialCadastrar);
        jBntFornecedorInicialCadastrar.setBounds(1050, 230, 210, 60);

        jLbBarraDeBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBusca.setOpaque(true);
        JP_Fornecedores.add(jLbBarraDeBusca);
        jLbBarraDeBusca.setBounds(30, 10, 120, 20);

        JTabbedPane.addTab("Fornecedores", JP_Fornecedores);

        javax.swing.GroupLayout JP_ComprasLayout = new javax.swing.GroupLayout(JP_Compras);
        JP_Compras.setLayout(JP_ComprasLayout);
        JP_ComprasLayout.setHorizontalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_ComprasLayout.setVerticalGroup(
            JP_ComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
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
            .addGap(0, 654, Short.MAX_VALUE)
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
            .addGap(0, 654, Short.MAX_VALUE)
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
            .addGap(0, 654, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Vendas", JP_Vendas);

        JP_Entregas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout JP_EntregasLayout = new javax.swing.GroupLayout(JP_Entregas);
        JP_Entregas.setLayout(JP_EntregasLayout);
        JP_EntregasLayout.setHorizontalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        JP_EntregasLayout.setVerticalGroup(
            JP_EntregasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        JTabbedPane.addTab("Entregas", JP_Entregas);

        getContentPane().add(JTabbedPane);
        JTabbedPane.setBounds(0, 0, 1296, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jTFBarraDeBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaActionPerformed
        
    }//GEN-LAST:event_jTFBarraDeBuscaActionPerformed

    private void jBntFornecedorInicialSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntFornecedorInicialSairActionPerformed

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

    private void jTFBarraDeBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFocusGained
        if(jTFBarraDeBusca.getText().equals("Fornecedor")){
            jTFBarraDeBusca.setText("");
            jTFBarraDeBusca.setForeground(corFont1);
        }
    }//GEN-LAST:event_jTFBarraDeBuscaFocusGained

    private void jTFBarraDeBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFocusLost
        if(jTFBarraDeBusca.getText().equals("")){
            jTFBarraDeBusca.setText("Fornecedor");
            jTFBarraDeBusca.setForeground(corFont2);
        }
    }//GEN-LAST:event_jTFBarraDeBuscaFocusLost

    
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
    private javax.swing.JButton jBntLupa;
    private javax.swing.JLabel jLbBarraDeBusca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBarraDeBusca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void criarTabela() {
        
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTable1.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", 0, 18));
        cabecalho.setBackground(corFundo4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                /*{null, null, null},
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
                {null, null, null}*/
            },
            new String [] {
                "NOME", "CONTATO", "ENDEREÇO"
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
        
    }

    public void PegarListaClientes(){
        
    }
    
    public void corDeFundo() {
        
       getContentPane().setBackground(corFundo3);
       JTabbedPane.setBackground(corFundo2);
       
       JP_Fornecedores.setBackground(corFundo1);
       
        
    }
    
    public void TamanhoDoFundo() {

        JTabbedPane.setBounds(0, 0, largura, altura);
    }
    
    public int CentralizarLargura(int tamanhoObjeto, int posicao, int muti) { 
        return (largura/posicao)*muti - (tamanhoObjeto/2);
    }
    
    public int CentralizarAltura(int tamanhoObjeto, int posicao, int muti) { 
        return (altura/posicao)* muti - (tamanhoObjeto/2);
    }
    
    public void AlinhamentoDosItens() {
        
        jTFBarraDeBusca.setBounds(20 + 8+ 8,CentralizarAltura(28, 20, 2),largura - 40 - 180 - 55 - 50 - 8-8,28);
        jLbBarraDeBusca.setBounds(20,CentralizarAltura(28, 20, 2)-8,largura - 40 - 180 - 55,44);
        jLbBarraDeBusca.setBackground(corFundo3);
        jLbBarraDeBusca.setOpaque(true);
        
        jBntLupa.setBounds(largura - 40 - 180 - 55 - 12,CentralizarAltura(28, 20, 2)+5,20,19);
        
        jScrollPane1.setBounds(20,CentralizarAltura(28, 40,7),largura - 40 - 180 - 55,altura - 37 - CentralizarAltura(28, 40,7) - 80);
        jScrollPane1.setBackground(corFundo4);
        
        jTable1.setGridColor(corFundo2);
        jTable1.setSelectionBackground(corFundo1);
        
        
        int espacoBNTCadastrar = (largura - (largura - 40 - 180 - 55+20))/2 + (largura - 40 - 180 - 55+20) - 180/2;
        
        jBntFornecedorInicialCadastrar.setBounds(espacoBNTCadastrar,CentralizarAltura(60, 15, 5)+10,180,60);
        jBntFornecedorInicialCadastrar.setBackground(corFundo2);
        
        int espacoBNTSair = (largura - (largura - 40 - 180 - 55+20))/2 + (largura - 40 - 180 - 55+20) - 120/2;
        
        jBntFornecedorInicialSair.setBounds(espacoBNTSair,CentralizarAltura(60, 15, 12),120,40);
        jBntFornecedorInicialSair.setBackground(corFundo6);

    }
    
}
