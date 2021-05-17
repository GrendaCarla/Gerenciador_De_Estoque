
package Gerenciador_De_Estoque.Tela_Administrador;


import Gerenciador_De_Estoque.Compras;
import Gerenciador_De_Estoque.Fornecedores;
import Gerenciador_De_Estoque.Produtos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
    
    Produtos produto = new Produtos();
    Fornecedores fornecedor = new Fornecedores();
    Compras compra = new Compras();
    
    public TelaCompraCadastro(){
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFTFValorUnitario = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jFTFValorTotal.setBorder(null);
        jFTFValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTFValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
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

        jScrollPaneItensComprado.setBackground(new java.awt.Color(207, 220, 212));
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
        jScrollPaneItensComprado.setViewportView(jTItensComprado);

        getContentPane().add(jScrollPaneItensComprado);
        jScrollPaneItensComprado.setBounds(50, 280, 910, 340);

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

        jFTFValorUnitario.setBorder(null);
        jFTFValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTFValorUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFValorUnitario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFValorUnitario);
        jFTFValorUnitario.setBounds(450, 490, 110, 22);

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
        int cel = 0;
        for(int i=0; i<100; i++){
            if(jTItensComprado.getValueAt(i, 0) != null && jTItensComprado.getValueAt(i, 4) != null){
                cel = 1;
                break;
            }
        }
        
       if(jCBFornecedor.getSelectedIndex() == -1 || jTFData1.getText().isEmpty() == true || jTFData2.getText().isEmpty() == true || jTFData3.getText().isEmpty() == true || jTFHora1.getText().isEmpty() == true || jTFHora2.getText().isEmpty() == true || jFTFValorTotal.getText().isEmpty() == true || cel == 0){
            
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "É obrigatório o preenchimento de todos os campos.\nA tabela de itens comprados necessita de no mínimo\numa linha preenchida, exceto o campo preço. \n\n\n\n");
        }else if(Integer.parseInt(jTFData3.getText()) < 1753 || Integer.parseInt(jTFData3.getText()) > 9999){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "O ano digitado está fora do intervalo de tempo (1753 a 9999) que podemos armazenar. \n\n\n\n");
        }else{
        
            try{
                compra.ConsultarCompras();
                
                int idCompra = compra.CadastrarCompras(fornecedor.getIDFornecedor().get(jCBFornecedor.getSelectedIndex()-1), ("'"+jTFData3.getText()+"-" + jTFData1.getText() + "-" + jTFData2.getText()+ " " + jTFHora1.getText() + ":" + jTFHora2.getText() + ":20.3'"), Float.parseFloat(jFTFValorTotal.getText().replaceAll(",",".")));
                
                for(int i=0; i<100; i++){
                    if(jTItensComprado.getValueAt(i, 0) != null && jTItensComprado.getValueAt(i, 4) != null){
                        compra.CadastrarItem(idCompra, Integer.parseInt(jTItensComprado.getValueAt(i, 0)+""), Integer.parseInt(jTItensComprado.getValueAt(i, 4)+""), Float.parseFloat((jTItensComprado.getValueAt(i, 5) == null ? 0 : jTItensComprado.getValueAt(i, 5))+""));
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
        if(jTItensComprado.getSelectedColumn() == 1){

            if(jComboBox1.getSelectedIndex() == -1){
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
            }
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        if(jTItensComprado.getSelectedColumn() == 0){
            
            if(jComboBox2.getSelectedIndex() == -1){
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
            }
        }
    }//GEN-LAST:event_jComboBox2FocusLost

    
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
    private javax.swing.JFormattedTextField jFTFValorTotal;
    private javax.swing.JFormattedTextField jFTFValorUnitario;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbData1;
    private javax.swing.JLabel jLbData2;
    private javax.swing.JLabel jLbFornecedor;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbHora1;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneItensComprado;
    private javax.swing.JFormattedTextField jTFData1;
    private javax.swing.JFormattedTextField jTFData2;
    private javax.swing.JFormattedTextField jTFData3;
    private javax.swing.JFormattedTextField jTFHora1;
    private javax.swing.JFormattedTextField jTFHora2;
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

        jPanel2.setPreferredSize(new Dimension ((largura - 40)-30, (altura - 200)-40)); 
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
        
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
        
        
        jLbFornecedor.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 3),110 + 15 + 300 + 4,30);
        jCBFornecedor.setBounds(CentralizarLargura(116, 18,2)+ 110 + 15,CentralizarAltura(30, 15, 3),300,30);
        jLbFornecedor.setBackground(corFundo4);
        jLbFornecedor.setOpaque(true);
        jCBFornecedor.setBackground(corFundo4);
        jCBFornecedor.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((largura - CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4)- (CentralizarLargura(116, 18,2)+ 110 + 15 + 300 + 4)) - (60 + 15 + 20 + 20 + 20 + 20) - (60 + 15 + 20 + 20 + 20 + 20 + 45 + 20))/3;
       
        
        jLbData.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData,CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20 + 45 + 20,30);
        jTFData1.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15,CentralizarAltura(30, 15, 3),20,30);
        jLbData1.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15 + 20 ,CentralizarAltura(30, 15, 3),20,30);
        jTFData2.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15 + 20 + 20,CentralizarAltura(30, 15, 3),20,30);
        jLbData2.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20,CentralizarAltura(30, 15, 3),20,30);
        jTFData3.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20,CentralizarAltura(30, 15, 3),45,30);
        jLbData.setBackground(corFundo4);
        jLbData.setOpaque(true);
        jLbData1.setBackground(corFundo4);
        jLbData1.setOpaque(true);
        jLbData2.setBackground(corFundo4);
        jLbData2.setOpaque(true);
        jTFData1.setBackground(corFundo4);
        jTFData1.setOpaque(true);
        jTFData2.setBackground(corFundo4);
        jTFData2.setOpaque(true);
        jTFData3.setBackground(corFundo4);
        jTFData3.setOpaque(true);
        
        jLbHora.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData,CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20,30);
        jTFHora1.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15,CentralizarAltura(30, 15, 3),20,30);
        jLbHora1.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15 + 20,CentralizarAltura(30, 15, 3),20,30);
        jTFHora2.setBounds(CentralizarLargura(116, 18,2) + 110 + 15 + 300 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 20 + espacoData + 60 + 15 + 20 + 20,CentralizarAltura(30, 15, 3),20,30);
        jLbHora.setBackground(corFundo4);
        jLbHora.setOpaque(true);
        jTFHora1.setBackground(corFundo4);
        jTFHora1.setOpaque(true);
        jTFHora2.setBackground(corFundo4);
        jTFHora2.setOpaque(true);
        
        jLbValorTotal.setBounds(largura - CentralizarLargura(116, 18,2) - 110 - 15 - 150 - 4,CentralizarAltura(30, 15, 3),110 + 15 + 150 + 4,30);
        jFTFValorTotal.setBounds(largura - CentralizarLargura(116, 18,2)- 150 - 4,CentralizarAltura(30, 15, 3),150,30);
        jLbValorTotal.setBackground(corFundo4);
        jLbValorTotal.setOpaque(true);
        jFTFValorTotal.setBackground(corFundo4);
        jFTFValorTotal.setOpaque(true);
        
        
        jScrollPaneItensComprado.setBounds(CentralizarLargura(116, 18,2),CentralizarAltura(30, 15, 4),largura - (CentralizarLargura(116, 18,2)*2),CentralizarAltura(30, 30, 23) - CentralizarAltura(30, 15, 4));

        
        jBntSalvar.setBounds(CentralizarLargura(116, 18,3),CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(corFundo5);
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(corFundo3);
        
        jBntCancelar.setBounds(largura - CentralizarLargura(116, 18,3) - 150,CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(corFundo6);
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(corFundo3);
        
    }
    
    public void criarTabelaItensCompra() throws SQLException{
        
        produto.ConsultarProdutos();
        
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
        
        
        jComboBox2.addItem(null);
        jComboBox1.addItem(null);
        
        for(int i=0; i<produto.getIDProduto().size(); i++){
            jComboBox2.addItem(produto.getIDProduto().get(i) + "");
            jComboBox1.addItem(produto.getNome().get(i) + "  /  " + produto.getMarca().get(i) + "  /  " + produto.getMedida().get(i));  
        }

        idColumn.setCellEditor(new DefaultCellEditor(jComboBox2));
        nomeColumn.setCellEditor(new DefaultCellEditor(jComboBox1));
        
        fornecedor.ConsultarFornecedor();
        
        jCBFornecedor.addItem(null);
        
        for(int i=0; i<fornecedor.getIDFornecedor().size(); i++){
            jCBFornecedor.addItem(fornecedor.getNomeFantasia().get(i) + "");
        }
    } 
}

