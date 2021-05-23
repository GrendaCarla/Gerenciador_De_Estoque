
package Gerenciador_De_Estoque.Tela_Administrador;


import Design.Design;
import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public final class TelaCompraCadastro extends javax.swing.JFrame {

    int linhaSelecionada;
    int colunaSelecionada;
    
    Produtos produto = new Produtos();
    Fornecedores fornecedor = new Fornecedores();
    Compras compra = new Compras();
    Design design = new Design();
    
    public TelaCompraCadastro(){
        initComponents();
        
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFTFValorTotal = new javax.swing.JFormattedTextField();
        jTFHora2 = new javax.swing.JFormattedTextField();
        jTFHora1 = new javax.swing.JFormattedTextField();
        jTFData3 = new javax.swing.JFormattedTextField();
        jTFData2 = new javax.swing.JFormattedTextField();
        jTFData1 = new javax.swing.JFormattedTextField();
        jCBFornecedor = new javax.swing.JComboBox<>();
        jLbValorTotal = new javax.swing.JLabel();
        jLbData2 = new javax.swing.JLabel();
        jLbData1 = new javax.swing.JLabel();
        jLbData = new javax.swing.JLabel();
        jLbFornecedor = new javax.swing.JLabel();
        jLbHora1 = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jScrollPaneItensComprado = new javax.swing.JScrollPane();
        jTItensComprado = new javax.swing.JTable();
        jLbFundoTabela = new javax.swing.JLabel();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFTFQuantidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jFTFValorTotal.setEditable(false);
        jFTFValorTotal.setBorder(null);
        jFTFValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTFValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFValorTotal.setText("0,00");
        jFTFValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFValorTotal);
        jFTFValorTotal.setBounds(450, 90, 110, 22);

        jTFHora2.setBorder(null);
        jTFHora2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm"))));
        jTFHora2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFHora2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFHora2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTFHora2);
        jTFHora2.setBounds(430, 90, 110, 22);

        jTFHora1.setBorder(null);
        jTFHora1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH"))));
        jTFHora1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFHora1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFHora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFHora1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFHora1KeyReleased(evt);
            }
        });
        getContentPane().add(jTFHora1);
        jTFHora1.setBounds(430, 90, 110, 22);

        jTFData3.setBorder(null);
        jTFData3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        jTFData3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTFData3);
        jTFData3.setBounds(810, 130, 110, 22);

        jTFData2.setBorder(null);
        jTFData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM"))));
        jTFData2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFData2KeyReleased(evt);
            }
        });
        getContentPane().add(jTFData2);
        jTFData2.setBounds(810, 130, 110, 22);

        jTFData1.setBorder(null);
        jTFData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd"))));
        jTFData1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFData1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFData1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFData1KeyReleased(evt);
            }
        });
        getContentPane().add(jTFData1);
        jTFData1.setBounds(810, 130, 110, 22);

        jCBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jCBFornecedor);
        jCBFornecedor.setBounds(40, 60, 110, 30);

        jLbValorTotal.setBackground(new java.awt.Color(51, 255, 153));
        jLbValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorTotal.setText("  Total:   R$");
        getContentPane().add(jLbValorTotal);
        jLbValorTotal.setBounds(340, 150, 110, 22);

        jLbData2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbData2.setText("/");
        jLbData2.setToolTipText("");
        getContentPane().add(jLbData2);
        jLbData2.setBounds(340, 150, 60, 22);

        jLbData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbData1.setText("/");
        jLbData1.setToolTipText("");
        getContentPane().add(jLbData1);
        jLbData1.setBounds(340, 150, 60, 22);

        jLbData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData.setText("  Data:");
        getContentPane().add(jLbData);
        jLbData.setBounds(340, 150, 60, 22);

        jLbFornecedor.setBackground(new java.awt.Color(51, 255, 153));
        jLbFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbFornecedor.setText("  Fornecedor:");
        getContentPane().add(jLbFornecedor);
        jLbFornecedor.setBounds(230, 130, 110, 22);

        jLbHora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbHora1.setText(":");
        getContentPane().add(jLbHora1);
        jLbHora1.setBounds(440, 100, 40, 22);

        jLbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora.setText("  Hora:");
        getContentPane().add(jLbHora);
        jLbHora.setBounds(540, 110, 60, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("CADASTRAR  COMPRA");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
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

        jScrollPaneItensComprado.setBackground(new java.awt.Color(207, 220, 212));
        jScrollPaneItensComprado.setBorder(null);
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
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true
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
        jTItensComprado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTItensCompradoMouseClicked(evt);
            }
        });
        jScrollPaneItensComprado.setViewportView(jTItensComprado);

        getContentPane().add(jScrollPaneItensComprado);
        jScrollPaneItensComprado.setBounds(50, 280, 910, 340);

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

        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 450, 80, 20);

        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(390, 450, 80, 20);

        jFTFQuantidade.setBorder(null);
        jFTFQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFTFQuantidade.setOpaque(false);
        jFTFQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTFQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFQuantidadeFocusLost(evt);
            }
        });
        getContentPane().add(jFTFQuantidade);
        jFTFQuantidade.setBounds(430, 360, 20, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        try {
            produto.ConsultarProdutos();
            int caso = 0;
            int cont = 0;
            
            for(; cont<100; cont++){
                if(jTItensComprado.getValueAt(cont, 0) != null && (jTItensComprado.getValueAt(cont, 4) == null || jTItensComprado.getValueAt(cont, 4) == "")){
                    caso = 1; // nao colocou a quantidade

                    break;
                }
                else if(jTItensComprado.getValueAt(cont, 0) != null && jTItensComprado.getValueAt(cont, 4) != null){
                    
                    if(jTItensComprado.getValueAt(cont, 0) != null && jTItensComprado.getValueAt(cont, 4) != null){
                        caso = 2; // pelomenos um item comprado
                    }
                }
                if(cont == 99 && caso != 2){
                    caso = 3;
                }
            }
        
            if(jCBFornecedor.getSelectedIndex() == -1 || jTFData1.getText().isEmpty() == true || jTFData2.getText().isEmpty() == true || jTFData3.getText().isEmpty() == true || jTFHora1.getText().isEmpty() == true || jTFHora2.getText().isEmpty() == true || jFTFValorTotal.getText().isEmpty() == true){

                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "É obrigatório o preenchimento de todos os campos da parte superior.\n \n\n\n\n");
            }else if(Integer.parseInt(jTFData3.getText()) < 1753 || Integer.parseInt(jTFData3.getText()) > 9999){

                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "O ano digitado está fora do intervalo de tempo (1753 a 9999) que pode ser armazenado. \n\n\n\n");
            }else if(caso == 1){

                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "Coloque a quantidade do item comprado.\n\n\n\n");
            }else if(caso == 3){

                UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
                JOptionPane.showMessageDialog(null, "Preencha no mínimo uma linha da tabela.\n\n\n\n");
            }else{
        
                try{
                    compra.ConsultarCompras();

                    int idCompra = compra.CadastrarCompras(fornecedor.getIDFornecedor().get(jCBFornecedor.getSelectedIndex()-1), ("'"+jTFData3.getText()+"-" + jTFData1.getText() + "-" + jTFData2.getText()+ " " + jTFHora1.getText() + ":" + jTFHora2.getText() + ":20.3'"), Float.parseFloat(jFTFValorTotal.getText().replaceAll(",",".")));

                    for(int i=0; i<100; i++){
                        if(jTItensComprado.getValueAt(i, 0) != null && jTItensComprado.getValueAt(i, 4) != null){
                            compra.CadastrarItem(idCompra, Integer.parseInt(jTItensComprado.getValueAt(i, 0)+""), Integer.parseInt(jTItensComprado.getValueAt(i, 4)+""), Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
                            produto.AlterarProduto(produto.getNome().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), produto.getMarca().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), produto.getMedida().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), produto.getValorVenda().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), (produto.getQuantidade().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))) + Integer.parseInt(jTItensComprado.getValueAt(i, 4) + "")), produto.getDescricao().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), produto.getAtivo().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0))), produto.getIDProduto().indexOf(jTItensComprado.getValueAt(i, 0)));
                        }
                    }
                }catch (SQLException ex) {
                    Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }

                TelaAdministrador Janela;
                try {
                    Janela = new TelaAdministrador();
                    //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

                    Toolkit tk = Toolkit.getDefaultToolkit();
                    Dimension d = tk.getScreenSize();

                    Janela.setSize(d.width + 8, d.height - 37);
                    Janela.setResizable(false);
                    Janela.MudarAba(1);

                    Janela.show();
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaVendaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntSalvarActionPerformed

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        try {
            TelaAdministrador Janela = new TelaAdministrador();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(1);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jTFData1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData1KeyReleased
        if (jTFData1.getText().length() == 2) {
            jTFData2.requestFocus();
        }
    }//GEN-LAST:event_jTFData1KeyReleased

    private void jTFData2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData2KeyReleased
        if (jTFData2.getText().length() == 2) {
            jTFData3.requestFocus();
        }
    }//GEN-LAST:event_jTFData2KeyReleased

    private void jTFHora1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFHora1KeyReleased
        if (jTFHora1.getText().length() == 2) {
            jTFHora2.requestFocus();
        }
    }//GEN-LAST:event_jTFHora1KeyReleased

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        PegarLinha();
                
        if(jTItensComprado.getSelectedColumn() == 1){

            if(jComboBox1.getSelectedIndex() == -1){
                
                jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") - Float.parseFloat((jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 5) == null ? 0 : jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 5))+""));
                
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 0);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 1);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 2);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 3);
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 4);
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 5);
            }else{
                jTItensComprado.setValueAt(produto.getIDProduto().get(jComboBox1.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 0);
                jTItensComprado.setValueAt(produto.getNome().get(jComboBox1.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 1);
                jTItensComprado.setValueAt(produto.getMarca().get(jComboBox1.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 2);
                jTItensComprado.setValueAt(produto.getMedida().get(jComboBox1.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 3);
                
                if(jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 4) == null){
                    
                    jTItensComprado.setValueAt(produto.getValorVenda().get(jComboBox1.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 5);
                }
                else{
                    jTItensComprado.setValueAt((produto.getValorVenda().get(jComboBox1.getSelectedIndex()-1) * Integer.parseInt(jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 4)+"")), jTItensComprado.getSelectedRow(), 5);
                    
                    jFTFValorTotal.setValue(0);
            
                    for(int i=0; i<100; i++){
                        jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") + Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        PegarLinha();
        
        if(jTItensComprado.getSelectedColumn() == 0){

            if(jComboBox2.getSelectedIndex() == -1){
                
                jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") - Float.parseFloat((jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 5) == null ? 0 : jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 5))+""));
                
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 0);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 1);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 2);
                jTItensComprado.setValueAt("", jTItensComprado.getSelectedRow(), 3);
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 4);
                jTItensComprado.setValueAt(null, jTItensComprado.getSelectedRow(), 5);
            }else{
                jTItensComprado.setValueAt(produto.getIDProduto().get(jComboBox2.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 0);
                jTItensComprado.setValueAt(produto.getNome().get(jComboBox2.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 1);
                jTItensComprado.setValueAt(produto.getMarca().get(jComboBox2.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 2);
                jTItensComprado.setValueAt(produto.getMedida().get(jComboBox2.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 3);
                
                if(jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 4) == null){
                   
                    jTItensComprado.setValueAt(produto.getValorVenda().get(jComboBox2.getSelectedIndex()-1), jTItensComprado.getSelectedRow(), 5);
                }
                else{
                    jTItensComprado.setValueAt((produto.getValorVenda().get(jComboBox2.getSelectedIndex()-1) * Integer.parseInt(jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 4)+"")), jTItensComprado.getSelectedRow(), 5);
                    
                    jFTFValorTotal.setValue(0);
            
                    for(int i=0; i<100; i++){
                        jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") + Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox2FocusLost

    private void jFTFQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFQuantidadeFocusGained
        PegarLinha();
    }//GEN-LAST:event_jFTFQuantidadeFocusGained

    private void jFTFQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFQuantidadeFocusLost
        if(jTItensComprado.getValueAt(linhaSelecionada, 0) != null && jTItensComprado.getValueAt(linhaSelecionada, 4) != null){
            jTItensComprado.setValueAt((produto.getValorVenda().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(linhaSelecionada, 0))) * Integer.parseInt(jTItensComprado.getValueAt(linhaSelecionada, 4)+"")), linhaSelecionada, 5);

            jFTFValorTotal.setValue(0);
            
            for(int i=0; i<100; i++){
                jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") + Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
            }
        }
    }//GEN-LAST:event_jFTFQuantidadeFocusLost

    private void jTItensCompradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTItensCompradoMouseClicked
        if(linhaSelecionada != -1 && colunaSelecionada != -1 && jTItensComprado.getValueAt(linhaSelecionada, colunaSelecionada) != null){
            
            jTItensComprado.setValueAt((produto.getValorVenda().get(produto.getIDProduto().indexOf(jTItensComprado.getValueAt(linhaSelecionada, 0))) * Integer.parseInt((jTItensComprado.getValueAt(linhaSelecionada, 4) == null ? 0 : jTItensComprado.getValueAt(linhaSelecionada, 4))+"")), linhaSelecionada, 5);
            
            jFTFValorTotal.setValue(0);
            
            for(int i=0; i<100; i++){
                jFTFValorTotal.setValue(Float.parseFloat(jFTFValorTotal.getValue()+"") + Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
            }
        }
        
        if(evt.getClickCount() == 1 && jTItensComprado.getSelectedColumn() == 4 && jTItensComprado.getValueAt(jTItensComprado.getSelectedRow(), 0) != null){
            
            PegarLinha();
            
        } else{
            linhaSelecionada = -1;
            colunaSelecionada = -1;
        }
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
    private javax.swing.JComboBox<String> jCBFornecedor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFTFQuantidade;
    private javax.swing.JFormattedTextField jFTFValorTotal;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbData1;
    private javax.swing.JLabel jLbData2;
    private javax.swing.JLabel jLbFornecedor;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbFundoTabela;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbHora1;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorTotal;
    private javax.swing.JScrollPane jScrollPaneItensComprado;
    private javax.swing.JFormattedTextField jTFData1;
    private javax.swing.JFormattedTextField jTFData2;
    private javax.swing.JFormattedTextField jTFData3;
    private javax.swing.JFormattedTextField jTFHora1;
    private javax.swing.JFormattedTextField jTFHora2;
    private javax.swing.JTable jTItensComprado;
    // End of variables declaration//GEN-END:variables

    public void AlinhamentoDosItens() {
        
        getContentPane().setBackground(design.getCorFundo1());
        
        jLbFundo1.setBounds(20, 110,design.getLargura() - 40, design.getAltura() - 200);
        
        jLbFundo2.setBounds(20+15 , 110+10, (design.getLargura() - 40)-30, (design.getAltura() - 200)-40);
        jLbFundo2.setBackground(design.getCorFundo3());
        
        jScrollPaneItensComprado.setBounds(design.CentralizarLargura(116, 18,2) + 8,design.CentralizarAltura(30, 15, 4) + 8,design.getLargura() - (design.CentralizarLargura(116, 18,2)*2) - 16,design.CentralizarAltura(30, 30, 23) - design.CentralizarAltura(30, 15, 4)-25);
        jScrollPaneItensComprado.setBackground(design.getCorTituloTabela());
        
        jLbFundoTabela.setBounds(design.CentralizarLargura(116, 18,2), design.CentralizarAltura(30, 15, 4), design.getLargura() - (design.CentralizarLargura(116, 18,2)*2), design.CentralizarAltura(30, 30, 23) - design.CentralizarAltura(30, 15, 4));
        jLbFundoTabela.setBackground(design.getCorFundo2());
        
        
        
        jLbTitulo.setBounds(design.CentralizarLargura(750, 2, 1),design.CentralizarAltura(55, 18, 1),750,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
        
        jLbFornecedor.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 3),110 + 15 + 300 + 4,30);
        jCBFornecedor.setBounds(design.CentralizarLargura(116, 18,2)+ 110 + 15,design.CentralizarAltura(30, 15, 3),300,30);
        jLbFornecedor.setBackground(design.getCorCampoTexto());
        jLbFornecedor.setOpaque(true);
        jCBFornecedor.setBackground(design.getCorCampoTexto());
        jCBFornecedor.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((design.getLargura() - design.CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4)- (design.CentralizarLargura(116, 18,2)+ 110 + 15 + 300 + 4)) - (60 + 15 + 20 + 20 + 20 + 20) - (60 + 15 + 20 + 20 + 20 + 20 + 45 + 20))/3;
       
        
        jLbData.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20 + 45 + 20,30);
        jTFData1.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),20,30);
        jLbData1.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15 + 20 ,design.CentralizarAltura(30, 15, 3),20,30);
        jTFData2.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jLbData2.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jTFData3.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20,design.CentralizarAltura(30, 15, 3),45,30);
        jLbData.setBackground(design.getCorCampoTexto());
        jLbData.setOpaque(true);
        jLbData1.setBackground(design.getCorCampoTexto());
        jLbData1.setOpaque(true);
        jLbData2.setBackground(design.getCorCampoTexto());
        jLbData2.setOpaque(true);
        jTFData1.setBackground(design.getCorCampoTexto());
        jTFData1.setOpaque(true);
        jTFData2.setBackground(design.getCorCampoTexto());
        jTFData2.setOpaque(true);
        jTFData3.setBackground(design.getCorCampoTexto());
        jTFData3.setOpaque(true);
        
        jLbHora.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20,30);
        jTFHora1.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),20,30);
        jLbHora1.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jTFHora2.setBounds(design.CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jLbHora.setBackground(design.getCorCampoTexto());
        jLbHora.setOpaque(true);
        jTFHora1.setBackground(design.getCorCampoTexto());
        jTFHora1.setOpaque(true);
        jTFHora2.setBackground(design.getCorCampoTexto());
        jTFHora2.setOpaque(true);
        
        jLbValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4,design.CentralizarAltura(30, 15, 3),110 + 15 + 150 + 4,30);
        jFTFValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)- 150 - 4,design.CentralizarAltura(30, 15, 3),150,30);
        jLbValorTotal.setBackground(design.getCorCampoTexto());
        jLbValorTotal.setOpaque(true);
        jFTFValorTotal.setBackground(design.getCorCampoTexto());
        jFTFValorTotal.setOpaque(true);
        
        jBntSalvar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(design.getCorBotaoSalvar());
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(design.getCorLetra1());
        
        jBntCancelar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 150,design.CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(design.getCorLetra1());
        
    }
    
    public void criarTabelaItensCompra() throws SQLException{
        
        produto.ConsultarProdutos();
        
        jTItensComprado.setFont(new java.awt.Font("Tahoma", 0, 18));

        JTableHeader cabecalho = jTItensComprado.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());

        jTItensComprado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "NOME", "MARCA", "MEDIDA", "QUANT.", "PREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, false
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
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTItensComprado.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTItensComprado.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTItensComprado.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTItensComprado.getColumnModel().getColumn(3).setCellRenderer(direita);

        for(int i=0; i< 100; i++){

            DefaultTableModel model = (DefaultTableModel) jTItensComprado.getModel();
            model.addRow(new Object[]{null, "", "", "", null, null});
        }

        TableColumn idColumn = jTItensComprado.getColumnModel().getColumn(0);
        TableColumn nomeColumn = jTItensComprado.getColumnModel().getColumn(1);
        TableColumn quantidadeColumn = jTItensComprado.getColumnModel().getColumn(4);
        
        
        jComboBox2.addItem(null);
        jComboBox1.addItem(null);
        
        for(int i=0; i<produto.getIDProduto().size(); i++){
            jComboBox2.addItem(produto.getIDProduto().get(i) + "");
            jComboBox1.addItem(produto.getNome().get(i) + "  /  " + produto.getMarca().get(i) + "  /  " + produto.getMedida().get(i));  
        }

        idColumn.setCellEditor(new DefaultCellEditor(jComboBox2));
        nomeColumn.setCellEditor(new DefaultCellEditor(jComboBox1));
        quantidadeColumn.setCellEditor(new DefaultCellEditor(jFTFQuantidade));
        
        fornecedor.ConsultarFornecedor();
        
        jCBFornecedor.addItem(null);
        
        for(int i=0; i<fornecedor.getIDFornecedor().size(); i++){
            jCBFornecedor.addItem(fornecedor.getNomeFantasia().get(i) + "");
        }
    } 
    
    public void PegarLinha(){
        linhaSelecionada = jTItensComprado.getSelectedRow();
        colunaSelecionada = jTItensComprado.getSelectedColumn();
    }
}

