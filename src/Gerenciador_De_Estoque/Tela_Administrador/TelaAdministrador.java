package Gerenciador_De_Estoque.Tela_Administrador;

import Design.Design;
import Gerenciador_De_Estoque.Clientes;
import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import Gerenciador_De_Estoque.Vendas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWatermanGotoh;
        
public class TelaAdministrador extends javax.swing.JFrame {

    List<Integer> pesquisaFornecedor = new ArrayList<Integer>();
    List<Integer> pesquisaProduto = new ArrayList<Integer>();
    List<Integer> pesquisaCompra = new ArrayList<Integer>();
    List<Integer> pesquisaCliente = new ArrayList<Integer>();
    List<Integer> pesquisaVenda = new ArrayList<Integer>();
    
    Design design = new Design();
    Fornecedores fornecedor = new Fornecedores();
    Produtos produto = new Produtos();
    Compras compra = new Compras();
    Clientes cliente = new Clientes();
    Vendas venda = new Vendas();
    
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
        
        iniciarPesquisaCliente();
        AlinhamentoDosItensCliente();
        
        iniciarPesquisaVenda();
        AlinhamentoDosItensVenda();
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
        JP_Produtos = new javax.swing.JPanel();
        jTFBarraDeBuscaProduto = new javax.swing.JTextField();
        jBntVoltarProduto = new javax.swing.JButton();
        jBntLupaProduto = new javax.swing.JButton();
        jBntCadastrarProduto = new javax.swing.JButton();
        jBntSairProduto = new javax.swing.JButton();
        jLbBarraDeBuscaProduto = new javax.swing.JLabel();
        jScrollPaneProduto = new javax.swing.JScrollPane();
        jTProduto = new javax.swing.JTable();
        JP_Clientes = new javax.swing.JPanel();
        jBntSairCliente = new javax.swing.JButton();
        jScrollPaneCliente = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jBntLupaCliente = new javax.swing.JButton();
        jTFBarraDeBuscaCliente = new javax.swing.JTextField();
        jBntCadastrarCliente = new javax.swing.JButton();
        jLbBarraDeBuscaCliente = new javax.swing.JLabel();
        jBntVoltarCliente = new javax.swing.JButton();
        JP_Vendas = new javax.swing.JPanel();
        jBntLupaVenda = new javax.swing.JButton();
        jBntSairVenda = new javax.swing.JButton();
        jScrollPaneVenda = new javax.swing.JScrollPane();
        jTVenda = new javax.swing.JTable();
        jTFBarraDeBuscaVenda = new javax.swing.JTextField();
        jLbBarraDeBuscaVenda = new javax.swing.JLabel();
        jBntCadastrarVenda = new javax.swing.JButton();
        jBntVoltarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        JTabbedPane.setBackground(new java.awt.Color(204, 204, 204));
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

        JP_Produtos.setLayout(null);

        jTFBarraDeBuscaProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaProduto.setToolTipText("");
        jTFBarraDeBuscaProduto.setBorder(null);
        jTFBarraDeBuscaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFBarraDeBuscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaProdutoKeyPressed(evt);
            }
        });
        JP_Produtos.add(jTFBarraDeBuscaProduto);
        jTFBarraDeBuscaProduto.setBounds(40, 30, 920, 30);

        jBntVoltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarProduto.setBorder(null);
        jBntVoltarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarProdutoActionPerformed(evt);
            }
        });
        JP_Produtos.add(jBntVoltarProduto);
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
        JP_Produtos.add(jBntLupaProduto);
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
        JP_Produtos.add(jBntCadastrarProduto);
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
        JP_Produtos.add(jBntSairProduto);
        jBntSairProduto.setBounds(1090, 560, 150, 60);

        jLbBarraDeBuscaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaProduto.setOpaque(true);
        JP_Produtos.add(jLbBarraDeBuscaProduto);
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

        JP_Produtos.add(jScrollPaneProduto);
        jScrollPaneProduto.setBounds(40, 80, 920, 540);

        JTabbedPane.addTab("Estoque", JP_Produtos);

        JP_Clientes.setLayout(null);

        jBntSairCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairCliente.setText("SAIR");
        jBntSairCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairClienteActionPerformed(evt);
            }
        });
        JP_Clientes.add(jBntSairCliente);
        jBntSairCliente.setBounds(1090, 560, 150, 60);

        jScrollPaneCliente.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "NASCIMENTO", "CPF"
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
        jTCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTCliente.setDragEnabled(true);
        jTCliente.setGridColor(new java.awt.Color(204, 204, 204));
        jTCliente.setRowHeight(25);
        jTCliente.getTableHeader().setReorderingAllowed(false);
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jScrollPaneCliente.setViewportView(jTCliente);
        if (jTCliente.getColumnModel().getColumnCount() > 0) {
            jTCliente.getColumnModel().getColumn(0).setResizable(false);
            jTCliente.getColumnModel().getColumn(1).setResizable(false);
            jTCliente.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Clientes.add(jScrollPaneCliente);
        jScrollPaneCliente.setBounds(40, 80, 920, 540);

        jBntLupaCliente.setBackground(new java.awt.Color(255, 255, 255));
        jBntLupaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupaCliente.setBorder(null);
        jBntLupaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntLupaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLupaClienteActionPerformed(evt);
            }
        });
        JP_Clientes.add(jBntLupaCliente);
        jBntLupaCliente.setBounds(980, 110, 20, 19);

        jTFBarraDeBuscaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaCliente.setToolTipText("");
        jTFBarraDeBuscaCliente.setBorder(null);
        jTFBarraDeBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaClienteKeyPressed(evt);
            }
        });
        JP_Clientes.add(jTFBarraDeBuscaCliente);
        jTFBarraDeBuscaCliente.setBounds(40, 30, 920, 30);

        jBntCadastrarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBntCadastrarCliente.setText("CADASTRAR");
        jBntCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarClienteActionPerformed(evt);
            }
        });
        JP_Clientes.add(jBntCadastrarCliente);
        jBntCadastrarCliente.setBounds(1050, 230, 210, 60);

        jLbBarraDeBuscaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaCliente.setOpaque(true);
        JP_Clientes.add(jLbBarraDeBuscaCliente);
        jLbBarraDeBuscaCliente.setBounds(30, 10, 120, 20);

        jBntVoltarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarCliente.setBorder(null);
        jBntVoltarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarClienteActionPerformed(evt);
            }
        });
        JP_Clientes.add(jBntVoltarCliente);
        jBntVoltarCliente.setBounds(1170, 40, 30, 24);

        JTabbedPane.addTab("Clientes", JP_Clientes);

        JP_Vendas.setLayout(null);

        jBntLupaVenda.setBackground(new java.awt.Color(255, 255, 255));
        jBntLupaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.PNG"))); // NOI18N
        jBntLupaVenda.setBorder(null);
        jBntLupaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntLupaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntLupaVendaActionPerformed(evt);
            }
        });
        JP_Vendas.add(jBntLupaVenda);
        jBntLupaVenda.setBounds(980, 110, 20, 19);

        jBntSairVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntSairVenda.setForeground(new java.awt.Color(255, 255, 255));
        jBntSairVenda.setText("SAIR");
        jBntSairVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntSairVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntSairVendaActionPerformed(evt);
            }
        });
        JP_Vendas.add(jBntSairVenda);
        jBntSairVenda.setBounds(1090, 560, 150, 60);

        jScrollPaneVenda.setBackground(new java.awt.Color(102, 255, 51));
        jScrollPaneVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTVenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jTVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTVenda.setDragEnabled(true);
        jTVenda.setGridColor(new java.awt.Color(204, 204, 204));
        jTVenda.setRowHeight(25);
        jTVenda.getTableHeader().setReorderingAllowed(false);
        jTVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVendaMouseClicked(evt);
            }
        });
        jScrollPaneVenda.setViewportView(jTVenda);
        if (jTVenda.getColumnModel().getColumnCount() > 0) {
            jTVenda.getColumnModel().getColumn(0).setResizable(false);
            jTVenda.getColumnModel().getColumn(1).setResizable(false);
            jTVenda.getColumnModel().getColumn(2).setResizable(false);
        }

        JP_Vendas.add(jScrollPaneVenda);
        jScrollPaneVenda.setBounds(40, 80, 920, 540);

        jTFBarraDeBuscaVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFBarraDeBuscaVenda.setToolTipText("");
        jTFBarraDeBuscaVenda.setBorder(null);
        jTFBarraDeBuscaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFBarraDeBuscaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFBarraDeBuscaVendaKeyPressed(evt);
            }
        });
        JP_Vendas.add(jTFBarraDeBuscaVenda);
        jTFBarraDeBuscaVenda.setBounds(40, 30, 920, 30);

        jLbBarraDeBuscaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 8));
        jLbBarraDeBuscaVenda.setOpaque(true);
        JP_Vendas.add(jLbBarraDeBuscaVenda);
        jLbBarraDeBuscaVenda.setBounds(30, 10, 120, 20);

        jBntCadastrarVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBntCadastrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        jBntCadastrarVenda.setText("CADASTRAR");
        jBntCadastrarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCadastrarVendaActionPerformed(evt);
            }
        });
        JP_Vendas.add(jBntCadastrarVenda);
        jBntCadastrarVenda.setBounds(1050, 230, 210, 60);

        jBntVoltarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.PNG"))); // NOI18N
        jBntVoltarVenda.setBorder(null);
        jBntVoltarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntVoltarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVoltarVendaActionPerformed(evt);
            }
        });
        JP_Vendas.add(jBntVoltarVenda);
        jBntVoltarVenda.setBounds(1170, 40, 30, 24);

        JTabbedPane.addTab("Vendas", JP_Vendas);

        getContentPane().add(JTabbedPane);
        JTabbedPane.setBounds(0, 0, 1300, 560);

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
                       comparaStrings(fornecedor.getRazaoSocial().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
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
                           comparaStrings(fornecedor.getRazaoSocial().get(i).toLowerCase(), jTFBarraDeBuscaFornecedor.getText().toLowerCase()) >= 0.65 || 
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

    private void jTCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCompraMouseClicked
        
        if (evt.getClickCount() == 2) {
            
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

        }
    }//GEN-LAST:event_jTCompraMouseClicked

    private void jTFBarraDeBuscaCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaCompraKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaCompra.getText() != ""){
                try {
                    pesquisaCompra.clear();

                    for(int i=0; i< compra.getIDCompra().size(); i++){

                        if((("" + compra.getIDCompra().get(i)).equals(jTFBarraDeBuscaCompra.getText().toLowerCase()) && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) || 
                           comparaStrings(fornecedor.getNomeFantasia().get(fornecedor.getIDFornecedor().indexOf(compra.getIDFornecedor().get(i))).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.65 || 
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaCompra.getText().length() == 4 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 8 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 10 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                           (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaCompra.getText().length() == 14 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false)){

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
                    
                    if((("" + compra.getIDCompra().get(i)).equals(jTFBarraDeBuscaCompra.getText().toLowerCase()) && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) || 
                       comparaStrings(fornecedor.getNomeFantasia().get(fornecedor.getIDFornecedor().indexOf(compra.getIDFornecedor().get(i))).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.65 || 
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaCompra.getText().length() == 5 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaCompra.getText().length() == 4 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 7 && jTFBarraDeBuscaCompra.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaCompra.getText().length() == 8 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaCompra.getText().length() == 9 && jTFBarraDeBuscaCompra.getText().substring(3,4).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaCompra.getText().length() == 10 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false) ||
                       (comparaStrings((compra.getDataHoraDaCompra().get(i).substring(8,10) + " / " + compra.getDataHoraDaCompra().get(i).substring(5,7) + " / " + compra.getDataHoraDaCompra().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaCompra.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaCompra.getText().length() == 14 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCompra.getText()) == false)){

                       pesquisaCompra.add(i);
                    }

                }

                criarTabelaCompra();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaCompraActionPerformed

    private void jBntVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarClienteActionPerformed
        try {
            jTFBarraDeBuscaCliente.setText("");
            iniciarPesquisaCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarClienteActionPerformed

    private void jBntCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarClienteActionPerformed
        TelaClienteCadastro cadastroCliente = new TelaClienteCadastro();
        //cadastroCliente.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        cadastroCliente.setSize(d.width + 8, d.height - 37);
        cadastroCliente.setResizable(false);
           
        cadastroCliente.show();
        dispose();
    }//GEN-LAST:event_jBntCadastrarClienteActionPerformed

    private void jTFBarraDeBuscaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaCliente.getText() != ""){
                try {
                    pesquisaCliente.clear();

                    for(int i=0; i< cliente.getNome().size(); i++){

                        if(comparaStrings(cliente.getNome().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                          (comparaStrings(cliente.getCPF().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCliente.getText()) == false) ||
                           comparaStrings(cliente.getEmail1().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(cliente.getEstado().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(cliente.getCidade().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                           comparaStrings(cliente.getBairro().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65){

                           pesquisaCliente.add(i);
                        }

                    }

                    criarTabelaCliente();

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFBarraDeBuscaClienteKeyPressed

    private void jBntLupaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLupaClienteActionPerformed
        if(jTFBarraDeBuscaCliente.getText() != ""){
            try {
                pesquisaCliente.clear();

                for(int i=0; i< cliente.getNome().size(); i++){

                    if(comparaStrings(cliente.getNome().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                      (comparaStrings(cliente.getCPF().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaCliente.getText()) == false) ||
                       comparaStrings(cliente.getEmail1().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(cliente.getEstado().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(cliente.getCidade().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65 || 
                       comparaStrings(cliente.getBairro().get(i).toLowerCase(), jTFBarraDeBuscaCliente.getText().toLowerCase()) >= 0.65){

                       pesquisaCliente.add(i);
                    }

                }

                criarTabelaCliente();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaClienteActionPerformed

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked
        if (evt.getClickCount() == 2) {
            
            try {
                TelaClienteInfo infoCliente = new TelaClienteInfo();
                //infoCliente.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoCliente.setSize(d.width + 8, d.height - 37);
                infoCliente.setResizable(false);

                infoCliente.PegarDados(pesquisaCliente.get(jTCliente.getSelectedRow()));

                infoCliente.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTClienteMouseClicked

    private void jBntSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSairClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntSairClienteActionPerformed

    private void jBntLupaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntLupaVendaActionPerformed
        if(jTFBarraDeBuscaVenda.getText() != ""){
            try {
                pesquisaVenda.clear();
                
                for(int i=0; i< venda.getIDVenda().size(); i++){
                    System.out.println(Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false);
                    
                    if((("" + venda.getIDVenda().get(i)).equals(jTFBarraDeBuscaVenda.getText().toLowerCase()) && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) || 
                       comparaStrings(cliente.getNome().get(cliente.getIDCliente().indexOf(venda.getIDCliente().get(i))).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.65 || 
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaVenda.getText().length() == 4 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaVenda.getText().length() == 8 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 10 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                       (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaVenda.getText().length() == 14 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false)){

                       pesquisaVenda.add(i);
                    }

                }

                criarTabelaVenda();

            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntLupaVendaActionPerformed

    private void jBntSairVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSairVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntSairVendaActionPerformed

    private void jTVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVendaMouseClicked
        if (evt.getClickCount() == 2) {
            
            try {
                TelaVendaInfo infoVenda = new TelaVendaInfo();
                //infoVenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                infoVenda.setSize(d.width + 8, d.height - 37);
                infoVenda.setResizable(false);

                infoVenda.PegarDados(pesquisaVenda.get(jTVenda.getSelectedRow()));

                infoVenda.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTVendaMouseClicked

    private void jTFBarraDeBuscaVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBarraDeBuscaVendaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(jTFBarraDeBuscaVenda.getText() != ""){
                try {
                    pesquisaVenda.clear();

                    for(int i=0; i< venda.getIDVenda().size(); i++){
                        System.out.println(Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false);

                        if((("" + venda.getIDVenda().get(i)).equals(jTFBarraDeBuscaVenda.getText().toLowerCase()) && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) || 
                           comparaStrings(cliente.getNome().get(cliente.getIDCliente().indexOf(venda.getIDCliente().get(i))).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.65 || 
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.7 && jTFBarraDeBuscaVenda.getText().length() == 5 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 1 && jTFBarraDeBuscaVenda.getText().length() == 4 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaVenda.getText().length() == 7 && jTFBarraDeBuscaVenda.getText().substring(2,3).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.4 && jTFBarraDeBuscaVenda.getText().length() == 8 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.71 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals("/") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals("-") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.8 && jTFBarraDeBuscaVenda.getText().length() == 9 && jTFBarraDeBuscaVenda.getText().substring(3,4).equals(" ") && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.6 && jTFBarraDeBuscaVenda.getText().length() == 10 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false) ||
                           (comparaStrings((venda.getDataHoraDaVenda().get(i).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(i).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(i).substring(0,4)).toLowerCase(), jTFBarraDeBuscaVenda.getText().toLowerCase()) >= 0.77 && jTFBarraDeBuscaVenda.getText().length() == 14 && Pattern.matches("[a-zA-Z]+", jTFBarraDeBuscaVenda.getText()) == false)){

                           pesquisaVenda.add(i);
                        }

                    }

                    criarTabelaVenda();

                } catch (SQLException ex) {
                    Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTFBarraDeBuscaVendaKeyPressed

    private void jBntCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCadastrarVendaActionPerformed
        try {
            TelaVendaCadastro cadastroVenda = new TelaVendaCadastro();
            //cadastroVenda.setExtendedState(JFrame.MAXIMIZED_BOTH);

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            cadastroVenda.setSize(d.width + 8, d.height - 37);
            cadastroVenda.setResizable(false);
        
            cadastroVenda.criarTabelaItensVendido();
            
            cadastroVenda.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCadastrarVendaActionPerformed

    private void jBntVoltarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVoltarVendaActionPerformed
        try {
            jTFBarraDeBuscaVenda.setText("");
            iniciarPesquisaVenda();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntVoltarVendaActionPerformed

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
    private javax.swing.JPanel JP_Produtos;
    private javax.swing.JPanel JP_Vendas;
    private javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton jBntCadastrarCliente;
    private javax.swing.JButton jBntCadastrarCompra;
    private javax.swing.JButton jBntCadastrarFornecedor;
    private javax.swing.JButton jBntCadastrarProduto;
    private javax.swing.JButton jBntCadastrarVenda;
    private javax.swing.JButton jBntLupaCliente;
    private javax.swing.JButton jBntLupaCompra;
    private javax.swing.JButton jBntLupaFornecedor;
    private javax.swing.JButton jBntLupaProduto;
    private javax.swing.JButton jBntLupaVenda;
    private javax.swing.JButton jBntSairCliente;
    private javax.swing.JButton jBntSairCompra;
    private javax.swing.JButton jBntSairFornecedor;
    private javax.swing.JButton jBntSairProduto;
    private javax.swing.JButton jBntSairVenda;
    private javax.swing.JButton jBntVoltarCliente;
    private javax.swing.JButton jBntVoltarCompra;
    private javax.swing.JButton jBntVoltarFornecedor;
    private javax.swing.JButton jBntVoltarProduto;
    private javax.swing.JButton jBntVoltarVenda;
    private javax.swing.JLabel jLbBarraDeBuscaCliente;
    private javax.swing.JLabel jLbBarraDeBuscaCompra;
    private javax.swing.JLabel jLbBarraDeBuscaFornecedor;
    private javax.swing.JLabel jLbBarraDeBuscaProduto;
    private javax.swing.JLabel jLbBarraDeBuscaVenda;
    private javax.swing.JScrollPane jScrollPaneCliente;
    private javax.swing.JScrollPane jScrollPaneCompra;
    private javax.swing.JScrollPane jScrollPaneFornecedor;
    private javax.swing.JScrollPane jScrollPaneProduto;
    private javax.swing.JScrollPane jScrollPaneVenda;
    private javax.swing.JTable jTCliente;
    private javax.swing.JTable jTCompra;
    private javax.swing.JTextField jTFBarraDeBuscaCliente;
    private javax.swing.JTextField jTFBarraDeBuscaCompra;
    private javax.swing.JTextField jTFBarraDeBuscaFornecedor;
    private javax.swing.JTextField jTFBarraDeBuscaProduto;
    private javax.swing.JTextField jTFBarraDeBuscaVenda;
    private javax.swing.JTable jTFornecedor;
    private javax.swing.JTable jTProduto;
    private javax.swing.JTable jTVenda;
    // End of variables declaration//GEN-END:variables

    public double comparaStrings(String stringA, String stringB) {
        SmithWatermanGotoh algorithm = new SmithWatermanGotoh();
        return algorithm.getSimilarity(stringA, stringB);
    }
   
    public void MudarAba(int num){
         JTabbedPane.setSelectedIndex(num);
    }
    
    public void corDeFundo() {
        
       getContentPane().setBackground(design.getCorFundo3());
       JTabbedPane.setBackground(design.getCorFundo2());
       
       // ---------------------------- FORNECEDOR ---------------------------------
       
       JP_Fornecedores.setBackground(design.getCorFundo1());
       
       // ---------------------------- PRODUTO ---------------------------------
               
       JP_Produtos.setBackground(design.getCorFundo1());
       
       // ---------------------------- COMPRA ---------------------------------
       
       JP_Compras.setBackground(design.getCorFundo1());
       
       // ---------------------------- CLIENTE ---------------------------------
       
       JP_Clientes.setBackground(design.getCorFundo1());
       
        // ---------------------------- VENDA ---------------------------------
       
       JP_Vendas.setBackground(design.getCorFundo1());
       
    }
    
    public void TamanhoDoFundo() {

        JTabbedPane.setBounds(0, 0, design.getLargura(), design.getAltura());
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
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());
        
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
        
        jTFBarraDeBuscaFornecedor.setBounds(30 + 8+ 8,design.CentralizarAltura(28, 20, 1) + 6, design.getLargura() - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaFornecedor.setBounds(30,design.CentralizarAltura(28, 20, 1)-8  + 6,design.getLargura() - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaFornecedor.setBackground(design.getCorFundo3());
        jLbBarraDeBuscaFornecedor.setOpaque(true);
        
        jBntLupaFornecedor.setBounds(design.getLargura() - 60 - 31 - 4 - 12 - 8 - 2 - 24,design.CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarFornecedor.setBounds(design.getLargura() - 25 - 34 - 2 - 30,design.CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarFornecedor.setBackground(design.getCorFundo1());
        jBntVoltarFornecedor.setOpaque(true);
        
        jScrollPaneFornecedor.setBounds(30,design.CentralizarAltura(28, 40,5) + 6,design.getLargura() - 46 - 20, design.getAltura() - 37 - design.CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneFornecedor.setBackground(design.getCorTituloTabela());
        
        jTFornecedor.setGridColor(design.getCorFundo2());
        jTFornecedor.setSelectionBackground(design.getCorFundo1());
        
        
        jBntCadastrarFornecedor.setBounds(design.CentralizarLargura(116, 18,3), design.getAltura() - 120 - 50,140,50);
        jBntCadastrarFornecedor.setBackground(design.getCorFundo2());
        
        jBntSairFornecedor.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 140, design.getAltura() - 120 - 50,140,50);
        jBntSairFornecedor.setBackground(design.getCorBotaoSairCancelarVoltar());

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
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());
        
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
            model.addRow(new Object[]{"" + produto.getIDProduto().get(pesquisaProduto.get(i)), " " + produto.getNome().get(pesquisaProduto.get(i)), " " + produto.getMarca().get(pesquisaProduto.get(i)), produto.getMedida().get(pesquisaProduto.get(i)) + " ", "" + produto.getQuantidade().get(pesquisaProduto.get(i)), design.FormataFloat(produto.getValorVenda().get(pesquisaProduto.get(i))) + " ", "" + ativo});
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
        
        jTFBarraDeBuscaProduto.setBounds(30 + 8+ 8,design.CentralizarAltura(28, 20, 1) + 6,design.getLargura() - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaProduto.setBounds(30,design.CentralizarAltura(28, 20, 1)-8  + 6,design.getLargura() - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaProduto.setBackground(design.getCorFundo3());
        jLbBarraDeBuscaProduto.setOpaque(true);
        
        jBntLupaProduto.setBounds(design.getLargura() - 60 - 31 - 4 - 12 - 8 - 2 - 24,design.CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarProduto.setBounds(design.getLargura() - 25 - 34 - 2 - 30,design.CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarProduto.setBackground(design.getCorFundo1());
        jBntVoltarProduto.setOpaque(true);
        
        jScrollPaneProduto.setBounds(30,design.CentralizarAltura(28, 40,5) + 6,design.getLargura() - 46 - 20, design.getAltura() - 37 - design.CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneProduto.setBackground(design.getCorTituloTabela());
        
        jTProduto.setGridColor(design.getCorFundo2());
        jTProduto.setSelectionBackground(design.getCorFundo1());
        
        
        jBntCadastrarProduto.setBounds(design.CentralizarLargura(116, 18,3), design.getAltura() - 120 - 50,140,50);
        jBntCadastrarProduto.setBackground(design.getCorFundo2());
        
        jBntSairProduto.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 140, design.getAltura() - 120 - 50,140,50);
        jBntSairProduto.setBackground(design.getCorBotaoSairCancelarVoltar());

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
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());
        
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
        
        jTFBarraDeBuscaCompra.setBounds(30 + 8+ 8,design.CentralizarAltura(28, 20, 1) + 6,design.getLargura() - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaCompra.setBounds(30,design.CentralizarAltura(28, 20, 1)-8  + 6,design.getLargura() - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaCompra.setBackground(design.getCorFundo3());
        jLbBarraDeBuscaCompra.setOpaque(true);
        
        jBntLupaCompra.setBounds(design.getLargura() - 60 - 31 - 4 - 12 - 8 - 2 - 24,design.CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarCompra.setBounds(design.getLargura() - 25 - 34 - 2 - 30,design.CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarCompra.setBackground(design.getCorFundo1());
        jBntVoltarCompra.setOpaque(true);
        
        jScrollPaneCompra.setBounds(30,design.CentralizarAltura(28, 40,5) + 6,design.getLargura() - 46 - 20, design.getAltura() - 37 - design.CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneCompra.setBackground(design.getCorTituloTabela());
        
        jTCompra.setGridColor(design.getCorFundo2());
        jTCompra.setSelectionBackground(design.getCorFundo1());
        
        
        jBntCadastrarCompra.setBounds(design.CentralizarLargura(116, 18,3), design.getAltura() - 120 - 50,140,50);
        jBntCadastrarCompra.setBackground(design.getCorFundo2());
        
        jBntSairCompra.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 140, design.getAltura() - 120 - 50,140,50);
        jBntSairCompra.setBackground(design.getCorBotaoSairCancelarVoltar());

    }
    
    //------------------------------------------- CLIENTE -----------------------------------------------
    
    public void iniciarPesquisaCliente() throws SQLException{
        cliente.LimparCliente();
        
        cliente.ConsultarClientes();
        pesquisaCliente.clear();
        
        for(int i=0; i< cliente.getIDCliente().size(); i++){
            pesquisaCliente.add(i);
        }
        
        criarTabelaCliente();
    }
    
    public void criarTabelaCliente() throws SQLException {
        
        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTCliente.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());
        
        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "NOME", "CPF", "E-MAIL", "ENDEREÇO"
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
        jTCliente.setRowHeight(25);
        jTCliente.getTableHeader().setReorderingAllowed(false);
        
        jScrollPaneCliente.setViewportView(jTCliente);
        if (jTCliente.getColumnModel().getColumnCount() > 0) {
            jTCliente.getColumnModel().getColumn(0).setResizable(false);
            jTCliente.getColumnModel().getColumn(1).setResizable(false);
            jTCliente.getColumnModel().getColumn(2).setResizable(false);
            jTCliente.getColumnModel().getColumn(3).setResizable(false);
            jTCliente.getColumnModel().getColumn(4).setResizable(false);
            jTCliente.getColumnModel().getColumn(0).setMinWidth(100);
            jTCliente.getColumnModel().getColumn(0).setMaxWidth(100);
            jTCliente.getColumnModel().getColumn(1).setMinWidth(290);
            jTCliente.getColumnModel().getColumn(1).setMaxWidth(290);
            jTCliente.getColumnModel().getColumn(2).setMinWidth(170);
            jTCliente.getColumnModel().getColumn(2).setMaxWidth(170);
            jTCliente.getColumnModel().getColumn(3).setMinWidth(310);
            jTCliente.getColumnModel().getColumn(3).setMaxWidth(310);
        }
        
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        jTCliente.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTCliente.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTCliente.getColumnModel().getColumn(2).setCellRenderer(centro);
        jTCliente.getColumnModel().getColumn(3).setCellRenderer(esquerda);
        
        for(int i=0; i< pesquisaCliente.size(); i++){

            DefaultTableModel model = (DefaultTableModel) jTCliente.getModel();
            model.addRow(new Object[]{ "" + cliente.getIDCliente().get(pesquisaCliente.get(i))," " + cliente.getNome().get(pesquisaCliente.get(i)), "" + (cliente.getCPF().get(pesquisaCliente.get(i)).substring(0, 3) + "." + cliente.getCPF().get(pesquisaCliente.get(i)).substring(3, 6) + "." + cliente.getCPF().get(pesquisaCliente.get(i)).substring(6, 9) + "-" + cliente.getCPF().get(pesquisaCliente.get(i)).substring(9, 11)), " " + cliente.getEmail1().get(pesquisaCliente.get(i)), " " + cliente.getCidade().get(pesquisaCliente.get(i)) + ", " + cliente.getBairro().get(pesquisaCliente.get(i)) + ", " + cliente.getEstado().get(pesquisaCliente.get(i))});
        }
       
    }

    
    public void AlinhamentoDosItensCliente() {
        
        jTFBarraDeBuscaCliente.setBounds(30 + 8+ 8,design.CentralizarAltura(28, 20, 1) + 6,design.getLargura() - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaCliente.setBounds(30,design.CentralizarAltura(28, 20, 1)-8  + 6,design.getLargura() - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaCliente.setBackground(design.getCorFundo3());
        jLbBarraDeBuscaCliente.setOpaque(true);
        
        jBntLupaCliente.setBounds(design.getLargura() - 60 - 31 - 4 - 12 - 8 - 2 - 24,design.CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarCliente.setBounds(design.getLargura() - 25 - 34 - 2 - 30,design.CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarCliente.setBackground(design.getCorFundo1());
        jBntVoltarCliente.setOpaque(true);
        
        jScrollPaneCliente.setBounds(30,design.CentralizarAltura(28, 40,5) + 6,design.getLargura() - 46 - 20, design.getAltura() - 37 - design.CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneCliente.setBackground(design.getCorTituloTabela());
        
        jTCliente.setGridColor(design.getCorFundo2());
        jTCliente.setSelectionBackground(design.getCorFundo1());
        
        
        jBntCadastrarCliente.setBounds(design.CentralizarLargura(116, 18,3), design.getAltura() - 120 - 50,140,50);
        jBntCadastrarCliente.setBackground(design.getCorFundo2());
        
        jBntSairCliente.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 140, design.getAltura() - 120 - 50,140,50);
        jBntSairCliente.setBackground(design.getCorBotaoSairCancelarVoltar());

    }
    
    //------------------------------------------- VENDA -----------------------------------------------
    
    
    public void iniciarPesquisaVenda() throws SQLException{
        venda.LimparVenda();
        
        venda.ConsultarVendas();
        pesquisaVenda.clear();
        
        for(int i=0; i< venda.getIDVenda().size(); i++){
            pesquisaVenda.add(i);
        }
        
        criarTabelaVenda();
    }
    
    public void criarTabelaVenda() throws SQLException {
        
        jTVenda.setFont(new java.awt.Font("Tahoma", 0, 18));
        
        JTableHeader cabecalho = jTVenda.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());
        
        jTVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "CLIENTE", "DATA", "HORA"
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
        
        
        jTVenda.setRowHeight(25);
        jTVenda.getTableHeader().setReorderingAllowed(false);
        
        jScrollPaneVenda.setViewportView(jTVenda);
        
        if (jTVenda.getColumnModel().getColumnCount() > 0) {
            jTVenda.getColumnModel().getColumn(0).setResizable(false);
            jTVenda.getColumnModel().getColumn(1).setResizable(false);
            jTVenda.getColumnModel().getColumn(2).setResizable(false);
            jTVenda.getColumnModel().getColumn(3).setResizable(false);
            jTVenda.getColumnModel().getColumn(0).setMinWidth(100);
            jTVenda.getColumnModel().getColumn(0).setMaxWidth(100);
            jTVenda.getColumnModel().getColumn(2).setMinWidth(200);
            jTVenda.getColumnModel().getColumn(2).setMaxWidth(200);
            jTVenda.getColumnModel().getColumn(3).setMinWidth(200);
            jTVenda.getColumnModel().getColumn(3).setMaxWidth(200);
        }
        
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        
        jTVenda.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTVenda.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTVenda.getColumnModel().getColumn(2).setCellRenderer(centro);
        jTVenda.getColumnModel().getColumn(3).setCellRenderer(centro);
        
        for(int i=0; i< pesquisaVenda.size(); i++){
            
            DefaultTableModel model = (DefaultTableModel) jTVenda.getModel();
            model.addRow(new Object[]{"" + venda.getIDVenda().get(pesquisaVenda.get(i)), " " + cliente.getNome().get(cliente.getIDCliente().indexOf(venda.getIDCliente().get(pesquisaVenda.get(i)))), " " +  venda.getDataHoraDaVenda().get(pesquisaVenda.get(i)).substring(8,10) + " / " + venda.getDataHoraDaVenda().get(pesquisaVenda.get(i)).substring(5,7) + " / " + venda.getDataHoraDaVenda().get(pesquisaVenda.get(i)).substring(0,4), venda.getDataHoraDaVenda().get(pesquisaVenda.get(i)).substring(11, 13) + " : " + venda.getDataHoraDaVenda().get(pesquisaVenda.get(i)).substring(14, 16)});
        }
        
    } 
    
    public void AlinhamentoDosItensVenda() {
        
        jTFBarraDeBuscaVenda.setBounds(30 + 8+ 8,design.CentralizarAltura(28, 20, 1) + 6,design.getLargura() - 25 - 34 - 4 - 12 - 8 - 8 - 24 - 60 - 8 - 8 - 8,28);
        jLbBarraDeBuscaVenda.setBounds(30,design.CentralizarAltura(28, 20, 1)-8  + 6,design.getLargura() - 60 - 25 - 34 - 14,44);
        jLbBarraDeBuscaVenda.setBackground(design.getCorFundo3());
        jLbBarraDeBuscaVenda.setOpaque(true);
        
        jBntLupaVenda.setBounds(design.getLargura() - 60 - 31 - 4 - 12 - 8 - 2 - 24,design.CentralizarAltura(24, 20, 1) + 6,24,23);
        
        jBntVoltarVenda.setBounds(design.getLargura() - 25 - 34 - 2 - 30,design.CentralizarAltura(34, 20, 1) + 6,34,34);
        jBntVoltarVenda.setBackground(design.getCorFundo1());
        jBntVoltarVenda.setOpaque(true);
        
        jScrollPaneVenda.setBounds(30,design.CentralizarAltura(28, 40,5) + 6,design.getLargura() - 46 - 20, design.getAltura() - 37 - design.CentralizarAltura(28, 40,5) - 80 - 70 - 6);
        jScrollPaneVenda.setBackground(design.getCorTituloTabela());
        
        jTVenda.setGridColor(design.getCorFundo2());
        jTVenda.setSelectionBackground(design.getCorFundo1());
        
        
        jBntCadastrarVenda.setBounds(design.CentralizarLargura(116, 18,3), design.getAltura() - 120 - 50,140,50);
        jBntCadastrarVenda.setBackground(design.getCorFundo2());
        
        jBntSairVenda.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 140, design.getAltura() - 120 - 50,140,50);
        jBntSairVenda.setBackground(design.getCorBotaoSairCancelarVoltar());

    }
  
}
