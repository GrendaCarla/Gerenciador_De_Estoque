package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Fornecedores;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotoh;
        
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
    
    List<Integer> pesquisa = new ArrayList<Integer>();
    Fornecedores fornecedor = new Fornecedores();

    public TelaAdministrador() throws SQLException {
        initComponents();
        corDeFundo();
        TamanhoDoFundo();
        iniciarPesquisaFornecedor();
        AlinhamentoDosItensFornecedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        JP_Fornecedores = new javax.swing.JPanel();
        jScrollPaneFornecedor = new javax.swing.JScrollPane();
        jTFornecedor = new javax.swing.JTable();
        jBntLupaFornecedor = new javax.swing.JButton();
        jTFBarraDeBuscaFornecedor = new javax.swing.JTextField();
        jBntSairFornecedor = new javax.swing.JButton();
        jBntCadastrarFornecedor = new javax.swing.JButton();
        jLbBarraDeBuscaFornecedor = new javax.swing.JLabel();
        jBntVoltarFornecedor = new javax.swing.JButton();
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

        jScrollPaneFornecedor.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME FANTARIA", "E-MAIL", "ENDEREÇO"
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
        jTFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTFornecedor.setDragEnabled(true);
        jTFornecedor.setGridColor(new java.awt.Color(204, 204, 204));
        jTFornecedor.setRowHeight(25);
        jTFornecedor.getTableHeader().setReorderingAllowed(false);
        jTFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFornecedorFocusGained(evt);
            }
        });
        jTFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFornecedorMouseClicked(evt);
            }
        });
        jScrollPaneFornecedor.setViewportView(jTFornecedor);
        if (jTFornecedor.getColumnModel().getColumnCount() > 0) {
            jTFornecedor.getColumnModel().getColumn(0).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(1).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Fornecedores.add(jScrollPaneFornecedor);
        jScrollPaneFornecedor.setBounds(40, 80, 920, 540);

        jBntLupaFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jBntLupaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupaFornecedor.setBorder(null);
        jBntLupaFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntLupaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLupaFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntLupaFornecedor);
        jBntLupaFornecedor.setBounds(980, 110, 20, 19);

        jTFBarraDeBuscaFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaFornecedor.setToolTipText("");
        jTFBarraDeBuscaFornecedor.setBorder(null);
        jTFBarraDeBuscaFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaFornecedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaFornecedorFocusLost(evt);
            }
        });
        jTFBarraDeBuscaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBarraDeBuscaFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jTFBarraDeBuscaFornecedor);
        jTFBarraDeBuscaFornecedor.setBounds(40, 30, 920, 30);

        jBntSairFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairFornecedor.setText("Sair");
        jBntSairFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntSairFornecedor);
        jBntSairFornecedor.setBounds(1090, 560, 150, 60);

        jBntCadastrarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jBntCadastrarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jBntCadastrarFornecedor.setText("CADASTRAR");
        jBntCadastrarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntCadastrarFornecedor);
        jBntCadastrarFornecedor.setBounds(1050, 230, 210, 60);

        jLbBarraDeBuscaFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaFornecedor.setOpaque(true);
        JP_Fornecedores.add(jLbBarraDeBuscaFornecedor);
        jLbBarraDeBuscaFornecedor.setBounds(30, 10, 120, 20);

        jBntVoltarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarFornecedor.setBorder(null);
        jBntVoltarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntVoltarFornecedor);
        jBntVoltarFornecedor.setBounds(1170, 40, 30, 24);

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

    private void jTFBarraDeBuscaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFornecedorActionPerformed
        
    }//GEN-LAST:event_jTFBarraDeBuscaFornecedorActionPerformed

    private void jBntSairFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSairFornecedorActionPerformed

    }//GEN-LAST:event_jBntSairFornecedorActionPerformed

    private void jBntCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarFornecedorActionPerformed
        TelaFornecedorCadastro principalFornededor = new TelaFornecedorCadastro();
        //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        principalFornededor.setSize(d.width + 8, d.height - 37);
        principalFornededor.setResizable(false);
           
        principalFornededor.show();
        dispose();
    }//GEN-LAST:event_jBntCadastrarFornecedorActionPerformed

    private void jTFBarraDeBuscaFornecedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFornecedorFocusGained
       
    }//GEN-LAST:event_jTFBarraDeBuscaFornecedorFocusGained

    private void jTFBarraDeBuscaFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFornecedorFocusLost
    
    }//GEN-LAST:event_jTFBarraDeBuscaFornecedorFocusLost

    private void jTFornecedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFornecedorFocusGained
        
    }//GEN-LAST:event_jTFornecedorFocusGained

    private void jTFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFornecedorMouseClicked
        if (evt.getClickCount() == 2) {
            
            try {
                TelaFornecedorInfo infoFornededor = new TelaFornecedorInfo();
                //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoFornededor.setSize(d.width + 8, d.height - 37);
                infoFornededor.setResizable(false);

                infoFornededor.PegarDados(pesquisa.get(jTFornecedor.getSelectedRow()));

                infoFornededor.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTFornecedorMouseClicked

    private void jBntLupaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLupaFornecedorActionPerformed
        if(jTFBarraDeBuscaFornecedor.getText() != ""){
            try {
                pesquisa.clear();

                for(int i=0; i< fornecedor.getNomeFantasia().size(); i++){

                    if(comparaStrings(fornecedor.getNomeFantasia().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getEmail1().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getEstado().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getCidade().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getBairro().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65){

                       pesquisa.add(i);
                    }

                }

                criarTabelaFornecedor();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaFornecedorActionPerformed

    private void jBntVoltarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarFornecedorActionPerformed
        try {
            iniciarPesquisaFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarFornecedorActionPerformed

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
                try {
                    new TelaAdministrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JButton jBntCadastrarFornecedor;
    private javax.swing.JButton jBntLupaFornecedor;
    private javax.swing.JButton jBntSairFornecedor;
    private javax.swing.JButton jBntVoltarFornecedor;
    private javax.swing.JLabel jLbBarraDeBuscaFornecedor;
    private javax.swing.JScrollPane jScrollPaneFornecedor;
    private javax.swing.JTextField jTFBarraDeBuscaFornecedor;
    private javax.swing.JTable jTFornecedor;
    // End of variables declaration//GEN-END:variables

    public double comparaStrings(String stringA, String stringB) {
        SmithWatermanGotoh algorithm = new SmithWatermanGotoh();
        return algorithm.getSimilarity(stringA, stringB);
    }
    
    public void iniciarPesquisaFornecedor() throws SQLException{
        fornecedor.LimparFornecedor();
        
        fornecedor.ConsultarFornecedor();
        pesquisa.clear();
        
        for(int i=0; i< fornecedor.getIDFornecedor().size(); i++){
            pesquisa.add(i);
        }
        
        criarTabelaFornecedor();
    }
    
    public void criarTabelaFornecedor() throws SQLException {
        
        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTFornecedor.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", 0, 18));
        cabecalho.setBackground(corFundo4);
        
        jTFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "NOME FANTASIA", "E-MAIL", "ENDEREÇO"
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
        jTFornecedor.setRowHeight(25);
        jTFornecedor.getTableHeader().setReorderingAllowed(false);
        
        jScrollPaneFornecedor.setViewportView(jTFornecedor);
        if (jTFornecedor.getColumnModel().getColumnCount() > 0) {
            jTFornecedor.getColumnModel().getColumn(0).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(1).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(2).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(0).setMinWidth(280);
            jTFornecedor.getColumnModel().getColumn(0).setMaxWidth(280);
            jTFornecedor.getColumnModel().getColumn(1).setMinWidth(350);
            jTFornecedor.getColumnModel().getColumn(1).setMaxWidth(350);
        }
        
        for(int i=0; i< pesquisa.size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTFornecedor.getModel();
            model.addRow(new Object[]{" " + fornecedor.getNomeFantasia().get(pesquisa.get(i)), " " + fornecedor.getEmail1().get(pesquisa.get(i)), " " +fornecedor.getCidade().get(pesquisa.get(i)) + ", " + fornecedor.getBairro().get(pesquisa.get(i)) + ", " + fornecedor.getEstado().get(pesquisa.get(i))});
        }
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
    
    public void AlinhamentoDosItensFornecedor() {
        
        jTFBarraDeBuscaFornecedor.setBounds(20 + 8+ 8,CentralizarAltura(28, 20, 2),largura - 40 - 180 - 55 - 50 - 8-8 - 30 - 10,28);
        jLbBarraDeBuscaFornecedor.setBounds(20,CentralizarAltura(28, 20, 2)-8,largura - 40 - 180 - 55 - 30 -10,44);
        jLbBarraDeBuscaFornecedor.setBackground(corFundo3);
        jLbBarraDeBuscaFornecedor.setOpaque(true);
        
        jBntLupaFornecedor.setBounds(largura - 40 - 180 - 55 - 12 - 30 - 10 - 2,CentralizarAltura(24, 20, 2),24,23);
        
        jBntVoltarFornecedor.setBounds(largura - 40 - 180 - 55 - 12,CentralizarAltura(34, 20, 2),34,34);
        jBntVoltarFornecedor.setBackground(corFundo1);
        jBntVoltarFornecedor.setOpaque(true);
        
        jScrollPaneFornecedor.setBounds(20,CentralizarAltura(28, 40,7),largura - 40 - 180 - 55,altura - 37 - CentralizarAltura(28, 40,7) - 80);
        jScrollPaneFornecedor.setBackground(corFundo4);
        
        jTFornecedor.setGridColor(corFundo2);
        jTFornecedor.setSelectionBackground(corFundo1);
        
        
        int espacoBNTCadastrar = (largura - (largura - 40 - 180 - 55+20))/2 + (largura - 40 - 180 - 55+20) - 180/2;
        
        jBntCadastrarFornecedor.setBounds(espacoBNTCadastrar,CentralizarAltura(60, 15, 5)+10,180,60);
        jBntCadastrarFornecedor.setBackground(corFundo2);
        
        int espacoBNTSair = (largura - (largura - 40 - 180 - 55+20))/2 + (largura - 40 - 180 - 55+20) - 120/2;
        
        jBntSairFornecedor.setBounds(espacoBNTSair,CentralizarAltura(60, 15, 12),120,40);
        jBntSairFornecedor.setBackground(corFundo6);

    }
    
}
