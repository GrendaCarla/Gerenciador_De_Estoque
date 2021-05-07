package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
    
    List<Integer> pesquisaFornecedor = new ArrayList<Integer>();
    List<Integer> pesquisaProduto = new ArrayList<Integer>();
    
    Fornecedores fornecedor = new Fornecedores();
    Produtos produto = new Produtos();

    public TelaAdministrador() throws SQLException {
        initComponents();
        corDeFundo();
        TamanhoDoFundo();
        iniciarPesquisaFornecedor();
        AlinhamentoDosItensFornecedor();
        
        iniciarPesquisaProduto();
        AlinhamentoDosItensProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane = new javax.swing.JTabbedPane();
        JP_Fornecedores = new javax.swing.JPanel();
        jBntSairFornecedor = new javax.swing.JButton();
        jScrollPaneFornecedor = new javax.swing.JScrollPane();
        jTFornecedor = new javax.swing.JTable();
        jBntLupaFornecedor = new javax.swing.JButton();
        jTFBarraDeBuscaFornecedor = new javax.swing.JTextField();
        jBntCadastrarFornecedor = new javax.swing.JButton();
        jLbBarraDeBuscaFornecedor = new javax.swing.JLabel();
        jBntVoltarFornecedor = new javax.swing.JButton();
        JP_Compras = new javax.swing.JPanel();
        JP_Produto = new javax.swing.JPanel();
        jTFBarraDeBuscaProduto = new javax.swing.JTextField();
        jBntVoltarProduto = new javax.swing.JButton();
        jBntLupaProduto = new javax.swing.JButton();
        jBntCadastrarProduto = new javax.swing.JButton();
        jBntSairProduto = new javax.swing.JButton();
        jLbBarraDeBuscaProduto = new javax.swing.JLabel();
        jScrollPaneProduto = new javax.swing.JScrollPane();
        jTProduto = new javax.swing.JTable();
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

        jBntSairFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairFornecedor.setText("SAIR");
        jBntSairFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairFornecedorActionPerformed(evt);
            }
        });
        JP_Fornecedores.add(jBntSairFornecedor);
        jBntSairFornecedor.setBounds(1090, 560, 150, 60);

        jScrollPaneFornecedor.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneFornecedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME FANTASIA", "RAZÃO SOCIAL", "E-MAIL", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jTFBarraDeBuscaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaFornecedorKeyPressed(evt);
            }
        });
        JP_Fornecedores.add(jTFBarraDeBuscaFornecedor);
        jTFBarraDeBuscaFornecedor.setBounds(40, 30, 920, 30);

        jBntCadastrarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        JP_Produto.setLayout(null);

        jTFBarraDeBuscaProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaProduto.setToolTipText("");
        jTFBarraDeBuscaProduto.setBorder(null);
        jTFBarraDeBuscaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFBarraDeBuscaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFBarraDeBuscaProdutoFocusLost(evt);
            }
        });
        jTFBarraDeBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBarraDeBuscaProdutoActionPerformed(evt);
            }
        });
        jTFBarraDeBuscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaProdutoKeyPressed(evt);
            }
        });
        JP_Produto.add(jTFBarraDeBuscaProduto);
        jTFBarraDeBuscaProduto.setBounds(40, 30, 920, 30);

        jBntVoltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarProduto.setBorder(null);
        jBntVoltarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarProdutoActionPerformed(evt);
            }
        });
        JP_Produto.add(jBntVoltarProduto);
        jBntVoltarProduto.setBounds(1170, 40, 30, 24);

        jBntLupaProduto.setBackground(new java.awt.Color(255, 255, 255));
        jBntLupaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupaProduto.setBorder(null);
        jBntLupaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntLupaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLupaProdutoActionPerformed(evt);
            }
        });
        JP_Produto.add(jBntLupaProduto);
        jBntLupaProduto.setBounds(980, 110, 20, 19);

        jBntCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jBntCadastrarProduto.setText("CADASTRAR");
        jBntCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarProdutoActionPerformed(evt);
            }
        });
        JP_Produto.add(jBntCadastrarProduto);
        jBntCadastrarProduto.setBounds(1050, 230, 210, 60);

        jBntSairProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairProduto.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairProduto.setText("SAIR");
        jBntSairProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairProdutoActionPerformed(evt);
            }
        });
        JP_Produto.add(jBntSairProduto);
        jBntSairProduto.setBounds(1090, 560, 150, 60);

        jLbBarraDeBuscaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaProduto.setOpaque(true);
        JP_Produto.add(jLbBarraDeBuscaProduto);
        jLbBarraDeBuscaProduto.setBounds(30, 10, 120, 20);

        jScrollPaneProduto.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID PRODUTO", "NOME", "MARCA", "MEDIDA", "QUANTIDADE", "PREÇO", "ATIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTProduto.setDragEnabled(true);
        jTProduto.setGridColor(new java.awt.Color(204, 204, 204));
        jTProduto.setRowHeight(25);
        jTProduto.getTableHeader().setReorderingAllowed(false);
        jTProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTProdutoFocusGained(evt);
            }
        });
        jTProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutoMouseClicked(evt);
            }
        });
        jScrollPaneProduto.setViewportView(jTProduto);
        if (jTProduto.getColumnModel().getColumnCount() > 0) {
            jTProduto.getColumnModel().getColumn(0).setResizable(false);
            jTProduto.getColumnModel().getColumn(1).setResizable(false);
            jTProduto.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Produto.add(jScrollPaneProduto);
        jScrollPaneProduto.setBounds(40, 80, 920, 540);

        JTabbedPane.addTab("Estoque", JP_Produto);

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
        TelaFornecedorCadastro cadastroFornededor = new TelaFornecedorCadastro();
        //cadastroFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        cadastroFornededor.setSize(d.width + 8, d.height - 37);
        cadastroFornededor.setResizable(false);
           
        cadastroFornededor.show();
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
                //infoFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoFornededor.setSize(d.width + 8, d.height - 37);
                infoFornededor.setResizable(false);

                infoFornededor.PegarDados(pesquisaFornecedor.get(jTFornecedor.getSelectedRow()));

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
                pesquisaFornecedor.clear();

                for(int i=0; i< fornecedor.getNomeFantasia().size(); i++){

                    if(comparaStrings(fornecedor.getNomeFantasia().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getEmail1().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getEstado().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getCidade().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(fornecedor.getBairro().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65){

                       pesquisaFornecedor.add(i);
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

    private void jTFBarraDeBuscaFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaFornecedorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaFornecedor.getText() != ""){
                try {
                    pesquisaFornecedor.clear();

                    for(int i=0; i< fornecedor.getNomeFantasia().size(); i++){

                        if(comparaStrings(fornecedor.getNomeFantasia().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(fornecedor.getEmail1().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(fornecedor.getEstado().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(fornecedor.getCidade().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(fornecedor.getBairro().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65){

                           pesquisaFornecedor.add(i);
                        }

                    }

                    criarTabelaFornecedor();

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFBarraDeBuscaFornecedorKeyPressed

    private void jBntSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSairProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntSairProdutoActionPerformed

    private void jTProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTProdutoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProdutoFocusGained

    private void jTProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutoMouseClicked
        if (evt.getClickCount() == 2) {
            
            try {
                TelaProdutoInfo infoProduto = new TelaProdutoInfo();
                //infoProduto.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoProduto.setSize(d.width + 8, d.height - 37);
                infoProduto.setResizable(false);

                infoProduto.PegarDados(pesquisaProduto.get(jTProduto.getSelectedRow()));

                infoProduto.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTProdutoMouseClicked

    private void jBntLupaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLupaProdutoActionPerformed
        if(jTFBarraDeBuscaProduto.getText() != ""){
            try {
                pesquisaProduto.clear();

                for(int i=0; i< produto.getIDProduto().size(); i++){

                    if(comparaStrings(("" + produto.getIDProduto().get(i)).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(produto.getNome().get(i).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(produto.getMarca().get(i).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(("" + produto.getAtivo().get(i)).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65){

                       pesquisaProduto.add(i);
                    }

                }

                criarTabelaProduto();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaProdutoActionPerformed

    private void jTFBarraDeBuscaProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaProdutoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBarraDeBuscaProdutoFocusGained

    private void jTFBarraDeBuscaProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaProdutoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBarraDeBuscaProdutoFocusLost

    private void jTFBarraDeBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBarraDeBuscaProdutoActionPerformed

    private void jTFBarraDeBuscaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaProduto.getText() != ""){
                try {
                    pesquisaProduto.clear();

                    for(int i=0; i< produto.getIDProduto().size(); i++){

                        if(comparaStrings(("" + produto.getIDProduto().get(i)).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(produto.getNome().get(i).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(produto.getMarca().get(i).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(("" + produto.getAtivo().get(i)).toLowerCase(), jTFBarraDeBuscaProduto.getText().toLowerCase()) >= 0.65){

                           pesquisaProduto.add(i);
                        }

                    }

                    criarTabelaProduto();

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFBarraDeBuscaProdutoKeyPressed

    private void jBntCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarProdutoActionPerformed
        TelaProdutoCadastro cadastroProduto = new TelaProdutoCadastro();
        //principalFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        cadastroProduto.setSize(d.width + 8, d.height - 37);
        cadastroProduto.setResizable(false);
           
        cadastroProduto.show();
        dispose();
    }//GEN-LAST:event_jBntCadastrarProdutoActionPerformed

    private void jBntVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarProdutoActionPerformed
        try {
            iniciarPesquisaProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarProdutoActionPerformed

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
    private javax.swing.JPanel JP_Fornecedores;
    private javax.swing.JPanel JP_Produto;
    private javax.swing.JPanel JP_Vendas;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton jBntCadastrarFornecedor;
    private javax.swing.JButton jBntCadastrarProduto;
    private javax.swing.JButton jBntLupaFornecedor;
    private javax.swing.JButton jBntLupaProduto;
    private javax.swing.JButton jBntSairFornecedor;
    private javax.swing.JButton jBntSairProduto;
    private javax.swing.JButton jBntVoltarFornecedor;
    private javax.swing.JButton jBntVoltarProduto;
    private javax.swing.JLabel jLbBarraDeBuscaFornecedor;
    private javax.swing.JLabel jLbBarraDeBuscaProduto;
    private javax.swing.JScrollPane jScrollPaneFornecedor;
    private javax.swing.JScrollPane jScrollPaneProduto;
    private javax.swing.JTextField jTFBarraDeBuscaFornecedor;
    private javax.swing.JTextField jTFBarraDeBuscaProduto;
    private javax.swing.JTable jTFornecedor;
    private javax.swing.JTable jTProduto;
    // End of variables declaration//GEN-END:variables

    public double comparaStrings(String stringA, String stringB) {
        SmithWatermanGotoh algorithm = new SmithWatermanGotoh();
        return algorithm.getSimilarity(stringA, stringB);
    }
    
    public void corDeFundo() {
        
       getContentPane().setBackground(corFundo3);
       JTabbedPane.setBackground(corFundo2);
       
       // ---------------------------- FORNECEDOR ---------------------------------
       
       JP_Fornecedores.setBackground(corFundo1);
       
       // ---------------------------- PRODUTO ---------------------------------
               
       JP_Produto.setBackground(corFundo1);
       
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
    
    //------------------------------------------- FORNECEDOR -----------------------------------------------
    
    public void iniciarPesquisaFornecedor() throws SQLException{
        fornecedor.LimparFornecedor();
        
        fornecedor.ConsultarFornecedor();
        pesquisaFornecedor.clear();
        
        for(int i=0; i< fornecedor.getIDFornecedor().size(); i++){
            pesquisaFornecedor.add(i);
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
                "NOME FANTASIA", "RAZÃO SOCIAL", "E-MAIL", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            jTFornecedor.getColumnModel().getColumn(3).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(0).setMinWidth(290);
            jTFornecedor.getColumnModel().getColumn(0).setMaxWidth(290);
            jTFornecedor.getColumnModel().getColumn(1).setMinWidth(290);
            jTFornecedor.getColumnModel().getColumn(1).setMaxWidth(290);
            jTFornecedor.getColumnModel().getColumn(2).setMinWidth(310);
            jTFornecedor.getColumnModel().getColumn(2).setMaxWidth(310);
        }
        
        for(int i=0; i< pesquisaFornecedor.size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTFornecedor.getModel();
            model.addRow(new Object[]{" " + fornecedor.getNomeFantasia().get(pesquisaFornecedor.get(i)), " " + fornecedor.getRazaoSocial().get(pesquisaFornecedor.get(i)), " " + fornecedor.getEmail1().get(pesquisaFornecedor.get(i)), " " +fornecedor.getCidade().get(pesquisaFornecedor.get(i)) + ", " + fornecedor.getBairro().get(pesquisaFornecedor.get(i)) + ", " + fornecedor.getEstado().get(pesquisaFornecedor.get(i))});
        }
    }

    
    
    public void AlinhamentoDosItensFornecedor() {
        
        jTFBarraDeBuscaFornecedor.setBounds(30 + 8+ 8,CentralizarAltura(28, 20, 1) + 6,largura - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaFornecedor.setBounds(30,CentralizarAltura(28, 20, 1)-8  + 6,largura - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaFornecedor.setBackground(corFundo3);
        jLbBarraDeBuscaFornecedor.setOpaque(true);
        
        jBntLupaFornecedor.setBounds(largura - 60 - 31 - 4 - 12 - 8 - 2 - 24,CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarFornecedor.setBounds(largura - 25 - 34 - 2 - 30,CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarFornecedor.setBackground(corFundo1);
        jBntVoltarFornecedor.setOpaque(true);
        
        jScrollPaneFornecedor.setBounds(30,CentralizarAltura(28, 40,5) + 6,largura - 46 - 20, altura - 37 - CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneFornecedor.setBackground(corFundo4);
        
        jTFornecedor.setGridColor(corFundo2);
        jTFornecedor.setSelectionBackground(corFundo1);
        
        
        jBntCadastrarFornecedor.setBounds(CentralizarLargura(116, 18,3), altura - 120 - 50,140,50);
        jBntCadastrarFornecedor.setBackground(corFundo2);
        
        jBntSairFornecedor.setBounds(largura - CentralizarLargura(116, 18,3) - 140, altura - 120 - 50,140,50);
        jBntSairFornecedor.setBackground(corFundo6);

    }
    
    
    //------------------------------------------- PRODUTO -----------------------------------------------
    
    
    public void iniciarPesquisaProduto() throws SQLException{
        produto.LimparProduto();
        
        produto.ConsultarProdutos();
        pesquisaProduto.clear();
        
        for(int i=0; i< produto.getIDProduto().size(); i++){
            pesquisaProduto.add(i);
        }
        
        criarTabelaProduto();
    }
    
    public void criarTabelaProduto() throws SQLException {
        
        jTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID PRODUTO", "NOME", "MARCA", "MEDIDA", "QUANTIDADE", "PREÇO", "ATIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        
        });
        
        
        jTProduto.setRowHeight(25);
        jTProduto.getTableHeader().setReorderingAllowed(false);
        
        jScrollPaneProduto.setViewportView(jTProduto);
        if (jTProduto.getColumnModel().getColumnCount() > 0) {
            jTProduto.getColumnModel().getColumn(0).setResizable(false);
            jTProduto.getColumnModel().getColumn(1).setResizable(false);
            jTProduto.getColumnModel().getColumn(2).setResizable(false);
            jTProduto.getColumnModel().getColumn(3).setResizable(false);
            jTProduto.getColumnModel().getColumn(4).setResizable(false);
            jTProduto.getColumnModel().getColumn(5).setResizable(false);
            jTProduto.getColumnModel().getColumn(6).setResizable(false);
            /*jTProduto.getColumnModel().getColumn(0).setMinWidth(290);
            jTProduto.getColumnModel().getColumn(0).setMaxWidth(290);
            jTProduto.getColumnModel().getColumn(1).setMinWidth(290);
            jTProduto.getColumnModel().getColumn(1).setMaxWidth(290);
            jTProduto.getColumnModel().getColumn(2).setMinWidth(310);
            jTProduto.getColumnModel().getColumn(2).setMaxWidth(310);*/
        }
        
        for(int i=0; i< pesquisaProduto.size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTProduto.getModel();
            model.addRow(new Object[]{" " + produto.getIDProduto().get(pesquisaProduto.get(i)), " " + produto.getNome().get(pesquisaProduto.get(i)), " " + produto.getMarca().get(pesquisaProduto.get(i)), " " + produto.getMedida().get(pesquisaProduto.get(i)), " " + produto.getQuantidade().get(pesquisaProduto.get(i)), " " + produto.getValorVenda().get(pesquisaProduto.get(i)), " " + produto.getAtivo().get(pesquisaProduto.get(i))});
        }
    }

    
    
    public void AlinhamentoDosItensProduto() {
        
        jTFBarraDeBuscaProduto.setBounds(30 + 8+ 8,CentralizarAltura(28, 20, 1) + 6,largura - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaProduto.setBounds(30,CentralizarAltura(28, 20, 1)-8  + 6,largura - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaProduto.setBackground(corFundo3);
        jLbBarraDeBuscaProduto.setOpaque(true);
        
        jBntLupaProduto.setBounds(largura - 60 - 31 - 4 - 12 - 8 - 2 - 24,CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarProduto.setBounds(largura - 25 - 34 - 2 - 30,CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarProduto.setBackground(corFundo1);
        jBntVoltarProduto.setOpaque(true);
        
        jScrollPaneProduto.setBounds(30,CentralizarAltura(28, 40,5) + 6,largura - 46 - 20, altura - 37 - CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneProduto.setBackground(corFundo4);
        
        jTProduto.setGridColor(corFundo2);
        jTProduto.setSelectionBackground(corFundo1);
        
        
        jBntCadastrarProduto.setBounds(CentralizarLargura(116, 18,3), altura - 120 - 50,140,50);
        jBntCadastrarProduto.setBackground(corFundo2);
        
        jBntSairProduto.setBounds(largura - CentralizarLargura(116, 18,3) - 140, altura - 120 - 50,140,50);
        jBntSairProduto.setBackground(corFundo6);

    }
    
}
