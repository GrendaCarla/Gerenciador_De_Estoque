package Gerenciador_De_Estoque.Tela_Administrador;

import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
    List<Integer> pesquisaCompra = new ArrayList<Integer>();
    
    Fornecedores fornecedor = new Fornecedores();
    Produtos produto = new Produtos();
    Compras compra = new Compras();
    
    public TelaAdministrador() throws SQLException {
        initComponents();
        corDeFundo();
        TamanhoDoFundo();
        
        iniciarPesquisaFornecedor();
        AlinhamentoDosItensFornecedor();
        
        iniciarPesquisaProduto();
        AlinhamentoDosItensProduto();
        
        iniciarPesquisaCompra();
        AlinhamentoDosItensCompra();
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
        jBntLupaCompra = new javax.swing.JButton();
        jBntSairCompra = new javax.swing.JButton();
        jScrollPaneCompra = new javax.swing.JScrollPane();
        jTCompra = new javax.swing.JTable();
        jTFBarraDeBuscaCompra = new javax.swing.JTextField();
        jLbBarraDeBuscaCompra = new javax.swing.JLabel();
        jBntCadastrarCompra = new javax.swing.JButton();
        jBntVoltarCompra = new javax.swing.JButton();
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
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME FANTASIA", "RAZÃO SOCIAL", "E-MAIL", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        JP_Compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JP_ComprasMouseClicked(evt);
            }
        });
        JP_Compras.setLayout(null);

        jBntLupaCompra.setBackground(new java.awt.Color(255, 255, 255));
        jBntLupaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupaCompra.setBorder(null);
        jBntLupaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntLupaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLupaCompraActionPerformed(evt);
            }
        });
        JP_Compras.add(jBntLupaCompra);
        jBntLupaCompra.setBounds(980, 110, 20, 19);

        jBntSairCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairCompra.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairCompra.setText("SAIR");
        jBntSairCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairCompraActionPerformed(evt);
            }
        });
        JP_Compras.add(jBntSairCompra);
        jBntSairCompra.setBounds(1090, 560, 150, 60);

        jScrollPaneCompra.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID PRODUTO", "NOME", "MARCA", "MEDIDA", "QUANTIDADE", "PREÇO", "ATIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTCompra.setDragEnabled(true);
        jTCompra.setGridColor(new java.awt.Color(204, 204, 204));
        jTCompra.setRowHeight(25);
        jTCompra.getTableHeader().setReorderingAllowed(false);
        jTCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTCompraFocusGained(evt);
            }
        });
        jTCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCompraMouseClicked(evt);
            }
        });
        jScrollPaneCompra.setViewportView(jTCompra);
        if (jTCompra.getColumnModel().getColumnCount() > 0) {
            jTCompra.getColumnModel().getColumn(0).setResizable(false);
            jTCompra.getColumnModel().getColumn(1).setResizable(false);
            jTCompra.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Compras.add(jScrollPaneCompra);
        jScrollPaneCompra.setBounds(40, 80, 920, 540);

        jTFBarraDeBuscaCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaCompra.setToolTipText("");
        jTFBarraDeBuscaCompra.setBorder(null);
        jTFBarraDeBuscaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFBarraDeBuscaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBarraDeBuscaCompraActionPerformed(evt);
            }
        });
        jTFBarraDeBuscaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaCompraKeyPressed(evt);
            }
        });
        JP_Compras.add(jTFBarraDeBuscaCompra);
        jTFBarraDeBuscaCompra.setBounds(40, 30, 920, 30);

        jLbBarraDeBuscaCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaCompra.setOpaque(true);
        JP_Compras.add(jLbBarraDeBuscaCompra);
        jLbBarraDeBuscaCompra.setBounds(30, 10, 120, 20);

        jBntCadastrarCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jBntCadastrarCompra.setText("CADASTRAR");
        jBntCadastrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarCompraActionPerformed(evt);
            }
        });
        JP_Compras.add(jBntCadastrarCompra);
        jBntCadastrarCompra.setBounds(1050, 230, 210, 60);

        jBntVoltarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarCompra.setBorder(null);
        jBntVoltarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarCompraActionPerformed(evt);
            }
        });
        JP_Compras.add(jBntVoltarCompra);
        jBntVoltarCompra.setBounds(1170, 40, 30, 24);

        JTabbedPane.addTab("Compras", JP_Compras);

        JP_Produto.setLayout(null);

        jTFBarraDeBuscaProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaProduto.setToolTipText("");
        jTFBarraDeBuscaProduto.setBorder(null);
        jTFBarraDeBuscaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "FORNECEDOR", "DATA", "HORA"
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

        getContentPane().add(JTabbedPane);
        JTabbedPane.setBounds(0, 0, 1296, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

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
            jTFBarraDeBuscaFornecedor.setText("");
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
            jTFBarraDeBuscaProduto.setText("");
            iniciarPesquisaProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarProdutoActionPerformed

    private void jBntSairCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSairCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntSairCompraActionPerformed

    private void jTCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCompraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCompraFocusGained

    private void jTCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCompraMouseClicked

    private void jTFBarraDeBuscaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBarraDeBuscaCompraActionPerformed

    private void jTFBarraDeBuscaCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaCompraKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaCompra.getText() != ""){
                try {
                    pesquisaCompra.clear();

                    for(int i=0; i< compra.getIDCompra().size(); i++){

                        if(("" + compra.getIDCompra().get(i)).equals(jTFBarraDeBuscaCompra.getText().toLowerCase()) || 
                           comparaStrings(fornecedor.getNomeFantasia().get(compra.getIDFornecedor().get(i)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.65 || 
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaCompra.getText().length() == 4) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 8) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("/")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("-")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals(" ")) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 10) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaCompra.getText().length() == 14)){

                           pesquisaCompra.add(i);
                        }

                    }

                    criarTabelaCompra();

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFBarraDeBuscaCompraKeyPressed

    private void jBntCadastrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarCompraActionPerformed
        try {
            TelaCompraCadastro cadastroCompra = new TelaCompraCadastro();
            //cadastroFornededor.setExtendedState(JFrame.MAXIMIZED_BOTH);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            cadastroCompra.setSize(d.width + 8, d.height - 37);
            cadastroCompra.setResizable(false);
        
            cadastroCompra.criarTabelaItensCompra();
            
            cadastroCompra.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCadastrarCompraActionPerformed

    private void jBntVoltarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarCompraActionPerformed
        try {
            jTFBarraDeBuscaCompra.setText("");
            iniciarPesquisaCompra();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarCompraActionPerformed

    private void jBntLupaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLupaCompraActionPerformed
        if(jTFBarraDeBuscaCompra.getText() != ""){
            try {
                pesquisaCompra.clear();
                
                for(int i=0; i< compra.getIDCompra().size(); i++){
                    
                    if(("" + compra.getIDCompra().get(i)).equals(jTFBarraDeBuscaCompra.getText().toLowerCase()) || 
                       comparaStrings(fornecedor.getNomeFantasia().get(compra.getIDFornecedor().get(i)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.65 || 
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaCompra.getText().length() == 4) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 8) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("/")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("-")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals(" ")) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 10) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaCompra.getText().length() == 14)){

                       pesquisaCompra.add(i);
                    }

                }

                criarTabelaCompra();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaCompraActionPerformed

    private void JP_ComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_ComprasMouseClicked
        /*if (evt.getClickCount() == 2) {
            
            try {
                TelaCompraInfo infoCompra = new TelaCompraInfo();
                //infoCompra.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoCompra.setSize(d.width + 8, d.height - 37);
                infoCompra.setResizable(false);

                infoCompra.PegarDados(pesquisaCompra.get(jTCompra.getSelectedRow()));

                infoCompra.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }*/
    }//GEN-LAST:event_JP_ComprasMouseClicked

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
    private javax.swing.JPanel JP_Fornecedores;
    private javax.swing.JPanel JP_Produto;
    private javax.swing.JPanel JP_Vendas;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton jBntCadastrarCompra;
    private javax.swing.JButton jBntCadastrarFornecedor;
    private javax.swing.JButton jBntCadastrarProduto;
    private javax.swing.JButton jBntLupaCompra;
    private javax.swing.JButton jBntLupaFornecedor;
    private javax.swing.JButton jBntLupaProduto;
    private javax.swing.JButton jBntSairCompra;
    private javax.swing.JButton jBntSairFornecedor;
    private javax.swing.JButton jBntSairProduto;
    private javax.swing.JButton jBntVoltarCompra;
    private javax.swing.JButton jBntVoltarFornecedor;
    private javax.swing.JButton jBntVoltarProduto;
    private javax.swing.JLabel jLbBarraDeBuscaCompra;
    private javax.swing.JLabel jLbBarraDeBuscaFornecedor;
    private javax.swing.JLabel jLbBarraDeBuscaProduto;
    private javax.swing.JScrollPane jScrollPaneCompra;
    private javax.swing.JScrollPane jScrollPaneFornecedor;
    private javax.swing.JScrollPane jScrollPaneProduto;
    private javax.swing.JTable jTCompra;
    private javax.swing.JTextField jTFBarraDeBuscaCompra;
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
       
       // ---------------------------- PRODUTO ---------------------------------
       
       JP_Compras.setBackground(corFundo1);
       
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
                "ID", "NOME FANTASIA", "RAZÃO SOCIAL", "E-MAIL", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false,false, false, false, false
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
            jTFornecedor.getColumnModel().getColumn(4).setResizable(false);
            jTFornecedor.getColumnModel().getColumn(0).setMinWidth(100);
            jTFornecedor.getColumnModel().getColumn(0).setMaxWidth(100);
            jTFornecedor.getColumnModel().getColumn(1).setMinWidth(290);
            jTFornecedor.getColumnModel().getColumn(1).setMaxWidth(290);
            jTFornecedor.getColumnModel().getColumn(2).setMinWidth(290);
            jTFornecedor.getColumnModel().getColumn(2).setMaxWidth(290);
            jTFornecedor.getColumnModel().getColumn(3).setMinWidth(310);
            jTFornecedor.getColumnModel().getColumn(3).setMaxWidth(310);
        }
        
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        jTFornecedor.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTFornecedor.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTFornecedor.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTFornecedor.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        
        for(int i=0; i< pesquisaFornecedor.size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTFornecedor.getModel();
            model.addRow(new Object[]{ "" + fornecedor.getIDFornecedor().get(pesquisaFornecedor.get(i))," " + fornecedor.getNomeFantasia().get(pesquisaFornecedor.get(i)), " " + fornecedor.getRazaoSocial().get(pesquisaFornecedor.get(i)), " " + fornecedor.getEmail1().get(pesquisaFornecedor.get(i)), " " +fornecedor.getCidade().get(pesquisaFornecedor.get(i)) + ", " + fornecedor.getBairro().get(pesquisaFornecedor.get(i)) + ", " + fornecedor.getEstado().get(pesquisaFornecedor.get(i))});
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
        
        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTProduto.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", 0, 18));
        cabecalho.setBackground(corFundo4);
        
        jTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "NOME", "MARCA", "MEDIDA", "QUANT.", "PREÇO", "ATIVO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            jTProduto.getColumnModel().getColumn(0).setMinWidth(100);
            jTProduto.getColumnModel().getColumn(0).setMaxWidth(100);
            jTProduto.getColumnModel().getColumn(3).setMinWidth(160);
            jTProduto.getColumnModel().getColumn(3).setMaxWidth(160);
            jTProduto.getColumnModel().getColumn(4).setMinWidth(100);
            jTProduto.getColumnModel().getColumn(4).setMaxWidth(100);
            jTProduto.getColumnModel().getColumn(5).setMinWidth(150);
            jTProduto.getColumnModel().getColumn(5).setMaxWidth(150);
            jTProduto.getColumnModel().getColumn(6).setMinWidth(100);
            jTProduto.getColumnModel().getColumn(6).setMaxWidth(100);
        }
        
        String ativo;
        
        for(int i=0; i< pesquisaProduto.size(); i++){
            
            ativo = produto.getAtivo().get(pesquisaProduto.get(i)) == 1 ? "Ativo" : "Inativo";

            DefaultTableModel model = (DefaultTableModel) jTProduto.getModel();
            model.addRow(new Object[]{"" + produto.getIDProduto().get(pesquisaProduto.get(i)), " " + produto.getNome().get(pesquisaProduto.get(i)), " " + produto.getMarca().get(pesquisaProduto.get(i)), " " + produto.getMedida().get(pesquisaProduto.get(i)), " " + produto.getQuantidade().get(pesquisaProduto.get(i)), " " + produto.getValorVenda().get(pesquisaProduto.get(i)), " " + ativo});
        }
        
        
        jTProduto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            
            public DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
            
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                Color background;
                if ( produto.getAtivo().get(pesquisaProduto.get(row)) == 0) {
                    background = Color.GRAY;
                } else {
                    background = Color.BLACK;
                }
                renderer.setForeground(background);

                if (column == 0 || column == 4 || column == 6) {
                    DEFAULT_RENDERER.setHorizontalAlignment(SwingConstants.CENTER);
                }
                else if(column == 1 || column == 2){
                    DEFAULT_RENDERER.setHorizontalAlignment(SwingConstants.LEFT);
                }
                else{
                    DEFAULT_RENDERER.setHorizontalAlignment(SwingConstants.RIGHT);
                }
                
                return renderer;
            }
        }); 
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
    
    //------------------------------------------- COMPRA -----------------------------------------------
    
    
    public void iniciarPesquisaCompra() throws SQLException{
        compra.LimparCompra();
        
        compra.ConsultarCompras();
        pesquisaCompra.clear();
        
        for(int i=0; i< compra.getIDCompra().size(); i++){
            pesquisaCompra.add(i);
        }
        
        criarTabelaCompra();
    }
    
    public void criarTabelaCompra() throws SQLException {
        
        jTCompra.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTCompra.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", 0, 18));
        cabecalho.setBackground(corFundo4);
        
        jTCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "FORNECEDOR", "DATA", "HORA"
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
        
        
        jTCompra.setRowHeight(25);
        jTCompra.getTableHeader().setReorderingAllowed(false);
        
        jScrollPaneCompra.setViewportView(jTCompra);
        
        if (jTCompra.getColumnModel().getColumnCount() > 0) {
            jTCompra.getColumnModel().getColumn(0).setResizable(false);
            jTCompra.getColumnModel().getColumn(1).setResizable(false);
            jTCompra.getColumnModel().getColumn(2).setResizable(false);
            jTCompra.getColumnModel().getColumn(3).setResizable(false);
            jTCompra.getColumnModel().getColumn(0).setMinWidth(100);
            jTCompra.getColumnModel().getColumn(0).setMaxWidth(100);
            jTCompra.getColumnModel().getColumn(2).setMinWidth(200);
            jTCompra.getColumnModel().getColumn(2).setMaxWidth(200);
            jTCompra.getColumnModel().getColumn(3).setMinWidth(200);
            jTCompra.getColumnModel().getColumn(3).setMaxWidth(200);
        }
        
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        jTCompra.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTCompra.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTCompra.getColumnModel().getColumn(2).setCellRenderer(centro);
        jTCompra.getColumnModel().getColumn(3).setCellRenderer(centro);
        
        for(int i=0; i< pesquisaCompra.size(); i++){
            
            DefaultTableModel model = (DefaultTableModel) jTCompra.getModel();
            model.addRow(new Object[]{"" + compra.getIDCompra().get(pesquisaCompra.get(i)), " " + fornecedor.getNomeFantasia().get(fornecedor.getIDFornecedor().indexOf(compra.getIDFornecedor().get(pesquisaCompra.get(i)))), " " +  compra.getDataHoraDaCompra().get(pesquisaCompra.get(i)).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(pesquisaCompra.get(i)).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(pesquisaCompra.get(i)).substring(0,4), compra.getDataHoraDaCompra().get(pesquisaCompra.get(i)).substring(11, 13) + " : " + compra.getDataHoraDaCompra().get(pesquisaCompra.get(i)).substring(14, 16)});
        }
        
    } 
    
   

    
    public void AlinhamentoDosItensCompra() {
        
        jTFBarraDeBuscaCompra.setBounds(30 + 8+ 8,CentralizarAltura(28, 20, 1) + 6,largura - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaCompra.setBounds(30,CentralizarAltura(28, 20, 1)-8  + 6,largura - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaCompra.setBackground(corFundo3);
        jLbBarraDeBuscaCompra.setOpaque(true);
        
        jBntLupaCompra.setBounds(largura - 60 - 31 - 4 - 12 - 8 - 2 - 24,CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarCompra.setBounds(largura - 25 - 34 - 2 - 30,CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarCompra.setBackground(corFundo1);
        jBntVoltarCompra.setOpaque(true);
        
        jScrollPaneCompra.setBounds(30,CentralizarAltura(28, 40,5) + 6,largura - 46 - 20, altura - 37 - CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneCompra.setBackground(corFundo4);
        
        jTCompra.setGridColor(corFundo2);
        jTCompra.setSelectionBackground(corFundo1);
        
        
        jBntCadastrarCompra.setBounds(CentralizarLargura(116, 18,3), altura - 120 - 50,140,50);
        jBntCadastrarCompra.setBackground(corFundo2);
        
        jBntSairCompra.setBounds(largura - CentralizarLargura(116, 18,3) - 140, altura - 120 - 50,140,50);
        jBntSairCompra.setBackground(corFundo6);

    }
    
    public void MudarAba(int num){
         JTabbedPane.setSelectedIndex(num);
    }
    
}
