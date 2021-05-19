
package Gerenciador_De_Estoque.Tela_Administrador;

import Design.Design;
import Gerenciador_De_Estoque.Vendas;
import Gerenciador_De_Estoque.Clientes;
import Gerenciador_De_Estoque.Produtos;
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


public class TelaVendaAlterar extends javax.swing.JFrame {
    
    int numero;
    Produtos produto = new Produtos();
    Clientes cliente = new Clientes();
    Vendas venda = new Vendas();
    Design design = new Design();
    
    public TelaVendaAlterar() {
        initComponents();
        
        corDeFundo();
        TamanhoDoFundo();
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbData2 = new javax.swing.JLabel();
        jLbData1 = new javax.swing.JLabel();
        jFTFValorTotal = new javax.swing.JFormattedTextField();
        jTFHora2 = new javax.swing.JFormattedTextField();
        jTFHora1 = new javax.swing.JFormattedTextField();
        jTFData3 = new javax.swing.JFormattedTextField();
        jTFData2 = new javax.swing.JFormattedTextField();
        jTFData1 = new javax.swing.JFormattedTextField();
        jTFFormaDePagamento = new javax.swing.JTextField();
        jCBCliente = new javax.swing.JComboBox<>();
        jLbFormaDePagamento = new javax.swing.JLabel();
        jLbValorTotal = new javax.swing.JLabel();
        jLbData = new javax.swing.JLabel();
        jLbCliente = new javax.swing.JLabel();
        jLbHora1 = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jScrollPaneItensVendido = new javax.swing.JScrollPane();
        jTItensVendido = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFTFValorUnitario = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        jTFFormaDePagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFFormaDePagamento.setBorder(null);
        jTFFormaDePagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFFormaDePagamento);
        jTFFormaDePagamento.setBounds(430, 120, 0, 22);

        jCBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jCBCliente);
        jCBCliente.setBounds(40, 60, 110, 30);

        jLbFormaDePagamento.setBackground(new java.awt.Color(51, 255, 153));
        jLbFormaDePagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbFormaDePagamento.setText("  Pagamento:");
        getContentPane().add(jLbFormaDePagamento);
        jLbFormaDePagamento.setBounds(110, 290, 110, 22);

        jLbValorTotal.setBackground(new java.awt.Color(51, 255, 153));
        jLbValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorTotal.setText("  Total:  R$");
        getContentPane().add(jLbValorTotal);
        jLbValorTotal.setBounds(180, 90, 100, 20);

        jLbData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbData.setText("  Data:");
        getContentPane().add(jLbData);
        jLbData.setBounds(340, 150, 60, 22);

        jLbCliente.setBackground(new java.awt.Color(51, 255, 153));
        jLbCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbCliente.setText("  Cliente:");
        getContentPane().add(jLbCliente);
        jLbCliente.setBounds(230, 130, 80, 22);

        jLbHora1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbHora1.setText(":");
        getContentPane().add(jLbHora1);
        jLbHora1.setBounds(540, 110, 10, 22);

        jLbHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbHora.setText("  Hora:");
        getContentPane().add(jLbHora);
        jLbHora.setBounds(540, 110, 60, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText(" CADASTRAR  VENDA");
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

        jScrollPaneItensVendido.setBackground(new java.awt.Color(207, 220, 212));
        jScrollPaneItensVendido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 152, 158), 15));
        jScrollPaneItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTItensVendido.setModel(new javax.swing.table.DefaultTableModel(
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
        jTItensVendido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTItensVendido.setDragEnabled(true);
        jTItensVendido.setGridColor(new java.awt.Color(204, 204, 204));
        jTItensVendido.setRowHeight(25);
        jTItensVendido.getTableHeader().setReorderingAllowed(false);
        jScrollPaneItensVendido.setViewportView(jTItensVendido);

        getContentPane().add(jScrollPaneItensVendido);
        jScrollPaneItensVendido.setBounds(50, 280, 910, 340);

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

    private void jTFHora1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFHora1KeyReleased
        if (jTFHora1.getText().length() == 2) {
            jTFHora2.requestFocus();
        }
    }//GEN-LAST:event_jTFHora1KeyReleased

    private void jTFData2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData2KeyReleased
        if (jTFData2.getText().length() == 2) {
            jTFData3.requestFocus();
        }
    }//GEN-LAST:event_jTFData2KeyReleased

    private void jTFData1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFData1KeyReleased
        if (jTFData1.getText().length() == 2) {
            jTFData2.requestFocus();
        }
    }//GEN-LAST:event_jTFData1KeyReleased

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        try {
            TelaAdministrador Janela = new TelaAdministrador();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(4);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        if(jTItensVendido.getSelectedColumn() == 1){

            if(jComboBox1.getSelectedIndex() == -1){
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 0);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 1);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 2);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 3);
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 4);
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 5);
            }else{
                jTItensVendido.setValueAt(produto.getIDProduto().get(jComboBox1.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 0);
                jTItensVendido.setValueAt(produto.getNome().get(jComboBox1.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 1);
                jTItensVendido.setValueAt(produto.getMarca().get(jComboBox1.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 2);
                jTItensVendido.setValueAt(produto.getMedida().get(jComboBox1.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 3);
            }
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        if(jTItensVendido.getSelectedColumn() == 0){

            if(jComboBox2.getSelectedIndex() == -1){
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 0);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 1);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 2);
                jTItensVendido.setValueAt("", jTItensVendido.getSelectedRow(), 3);
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 4);
                jTItensVendido.setValueAt(null, jTItensVendido.getSelectedRow(), 5);
            }else{
                jTItensVendido.setValueAt(produto.getIDProduto().get(jComboBox2.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 0);
                jTItensVendido.setValueAt(produto.getNome().get(jComboBox2.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 1);
                jTItensVendido.setValueAt(produto.getMarca().get(jComboBox2.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 2);
                jTItensVendido.setValueAt(produto.getMedida().get(jComboBox2.getSelectedIndex()-1), jTItensVendido.getSelectedRow(), 3);
            }
        }
    }//GEN-LAST:event_jComboBox2FocusLost

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        int cel = 0;
        for(int i=0; i<100; i++){
            if(jTItensVendido.getValueAt(i, 0) != null && jTItensVendido.getValueAt(i, 4) != null){
                cel = 1;
                break;
            }
        }

        if(jCBCliente.getSelectedIndex() == -1 || jTFData1.getText().isEmpty() == true || jTFData2.getText().isEmpty() == true || jTFData3.getText().isEmpty() == true || jTFHora1.getText().isEmpty() == true || jTFHora2.getText().isEmpty() == true || jFTFValorTotal.getText().isEmpty() == true || jTFFormaDePagamento.getText().isEmpty() == true || cel == 0){

            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "É obrigatório o preenchimento de todos os campos.\nA tabela de itens vendidos necessita de no mínimo\numa linha preenchida, exceto o campo preço. \n\n\n\n");
        }else if(Integer.parseInt(jTFData3.getText()) < 1753 || Integer.parseInt(jTFData3.getText()) > 9999){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "O ano digitado está fora do intervalo de tempo (1753 a 9999) que podemos armazenar. \n\n\n\n");
        }else{

            try{
                venda.ConsultarVendas();
                
                venda.AtualizarVenda(venda.getIDVenda().get(numero), cliente.getIDCliente().get(jCBCliente.getSelectedIndex()-1), ("'"+jTFData3.getText()+"-" + jTFData1.getText() + "-" + jTFData2.getText()+ " " + jTFHora1.getText() + ":" + jTFHora2.getText() + ":20.3'"), Float.parseFloat(jFTFValorTotal.getText().replaceAll(",",".")), jTFFormaDePagamento.getText());

                venda.DeletarItem(venda.getIDVenda().get(numero));

                
                for(int i=0; i<100; i++){
                    if(jTItensVendido.getValueAt(i, 0) != null && jTItensVendido.getValueAt(i, 4) != null){
                        venda.CadastrarItem(venda.getIDVenda().get(numero), Integer.parseInt(jTItensVendido.getValueAt(i, 0)+""), Integer.parseInt(jTItensVendido.getValueAt(i, 4)+""), Float.parseFloat((jTItensVendido.getValueAt(i, 5) == null ? 0 : jTItensVendido.getValueAt(i, 5))+""));
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
                Janela.MudarAba(4);

                Janela.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntSalvarActionPerformed

    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendaAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JComboBox<String> jCBCliente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFTFValorTotal;
    private javax.swing.JFormattedTextField jFTFValorUnitario;
    private javax.swing.JLabel jLbCliente;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbData1;
    private javax.swing.JLabel jLbData2;
    private javax.swing.JLabel jLbFormaDePagamento;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbHora1;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneItensVendido;
    private javax.swing.JFormattedTextField jTFData1;
    private javax.swing.JFormattedTextField jTFData2;
    private javax.swing.JFormattedTextField jTFData3;
    private javax.swing.JTextField jTFFormaDePagamento;
    private javax.swing.JFormattedTextField jTFHora1;
    private javax.swing.JFormattedTextField jTFHora2;
    private javax.swing.JTable jTItensVendido;
    // End of variables declaration//GEN-END:variables

    public void corDeFundo() {
        
        getContentPane().setBackground(design.getCorFundo1());
        jPanel1.setBackground(design.getCorFundo2());
        jPanel2.setBackground(design.getCorFundo3());
        
    }

    public void TamanhoDoFundo() {

        jPanel1.setSize(design.getLargura() - 20, design.getAltura() - 200);
        jPanel1.setLocation(10, 110);

        jPanel2.setPreferredSize(new Dimension ((design.getLargura() - 20)-20, (design.getAltura() - 200)-40)); 
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
    }
    
    public void AlinhamentoDosItens() {
        
        jLbTitulo.setBounds(design.CentralizarLargura(750, 2, 1),design.CentralizarAltura(55, 18, 1),750,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorCampoTexto());
        
        
        jLbCliente.setBounds(design.CentralizarLargura(116, 44,3),design.CentralizarAltura(30, 15, 3),80 + 15 + 250 + 4,30);
        jCBCliente.setBounds(design.CentralizarLargura(116, 44,3)+ 80 + 15,design.CentralizarAltura(30, 15, 3),250,30);
        jLbCliente.setBackground(design.getCorCampoTexto());
        jLbCliente.setOpaque(true);
        jCBCliente.setBackground(design.getCorCampoTexto());
        jCBCliente.setOpaque(true);
        
        // conta prara saber aonde deve colocar a data para q fique centralizado entre o fornecedor e a hora
        int espacoData = (((design.getLargura() - design.CentralizarLargura(116, 44,3) - 100 - 15 - 130 - 4)- (design.CentralizarLargura(116, 44,3)+ 80 + 15 + 250 + 4)) - (110 + 15 + 120 + 4) - (60 + 15 + 20 + 20 + 20 + 20) - (60 + 15 + 20 + 20 + 20 + 20 + 45 + 4))/4;
       
        
        jLbData.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20 + 45 + 4,30);
        jTFData1.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),20,30);
        jLbData1.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 20 ,design.CentralizarAltura(30, 15, 3),20,30);
        jTFData2.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jLbData2.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jTFData3.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20,design.CentralizarAltura(30, 15, 3),45,30);
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
        
        jLbHora.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData,design.CentralizarAltura(30, 15, 3),60 + 15 + 20 + 20 + 20 + 20,30);
        jTFHora1.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData + 60 + 15,design.CentralizarAltura(30, 15, 3),20,30);
        jLbHora1.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData + 60 + 15 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jTFHora2.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData + 60 + 15 + 20 + 20,design.CentralizarAltura(30, 15, 3),20,30);
        jLbHora.setBackground(design.getCorCampoTexto());
        jLbHora.setOpaque(true);
        jTFHora1.setBackground(design.getCorCampoTexto());
        jTFHora1.setOpaque(true);
        jTFHora2.setBackground(design.getCorCampoTexto());
        jTFHora2.setOpaque(true);
        
        jLbFormaDePagamento.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData  + 60 + 15 + 20 + 20 + 20 + 20 + espacoData, design.CentralizarAltura(30, 15, 3),110 + 15 + 120 + 4,30);
        jTFFormaDePagamento.setBounds(design.CentralizarLargura(116, 44,3) + 80 + 15 + 250 + 4 + espacoData + 60 + 15  + 20 + 20 + 20 + 20 + 45 + 4 + espacoData  + 60 + 15 + 20 + 20 + 20 + 20 + espacoData + 110 + 15, design.CentralizarAltura(30, 15, 3), 120, 30);
        jLbFormaDePagamento.setBackground(design.getCorCampoTexto());
        jLbFormaDePagamento.setOpaque(true);
        jTFFormaDePagamento.setBackground(design.getCorCampoTexto());
        jTFFormaDePagamento.setOpaque(true);
                
        jLbValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 44,3) - 100 - 15 - 130 - 4,design.CentralizarAltura(30, 15, 3),100 + 15 + 130 + 4,30);
        jFTFValorTotal.setBounds(design.getLargura() - design.CentralizarLargura(116, 44,3)- 130 - 4,design.CentralizarAltura(30, 15, 3),130,30);
        jLbValorTotal.setBackground(design.getCorCampoTexto());
        jLbValorTotal.setOpaque(true);
        jFTFValorTotal.setBackground(design.getCorCampoTexto());
        jFTFValorTotal.setOpaque(true);
        
        
        jScrollPaneItensVendido.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 15, 4),design.getLargura() - (design.CentralizarLargura(116, 18,2)*2),design.CentralizarAltura(30, 30, 23) - design.CentralizarAltura(30, 15, 4));
        jScrollPaneItensVendido.setBackground(design.getCorTituloTabela());
        
        jBntSalvar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(design.getCorBotaoSalvar());
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(design.getCorLetra1());
        
        jBntCancelar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 150,design.CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(design.getCorLetra1());
        
    }
    
     public void criarTabelaItensVenda(int num) throws SQLException{
        
        produto.ConsultarProdutos();
        
        jTItensVendido.setFont(new java.awt.Font("Tahoma", 0, 18));

        JTableHeader cabecalho = jTItensVendido.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18));
        cabecalho.setBackground(design.getCorTituloTabela());
        cabecalho.setForeground(design.getCorLetra1());

        jTItensVendido.setModel(new javax.swing.table.DefaultTableModel(
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

        jTItensVendido.setRowHeight(25);
        jTItensVendido.getTableHeader().setReorderingAllowed(false);

        jScrollPaneItensVendido.setViewportView(jTItensVendido);

        if (jTItensVendido.getColumnModel().getColumnCount() > 0) {
            jTItensVendido.getColumnModel().getColumn(0).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(1).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(2).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(3).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(4).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(5).setResizable(false);
            jTItensVendido.getColumnModel().getColumn(0).setMinWidth(100);
            jTItensVendido.getColumnModel().getColumn(0).setMaxWidth(100);
            jTItensVendido.getColumnModel().getColumn(3).setMinWidth(160);
            jTItensVendido.getColumnModel().getColumn(3).setMaxWidth(160);
            jTItensVendido.getColumnModel().getColumn(4).setMinWidth(100);
            jTItensVendido.getColumnModel().getColumn(4).setMaxWidth(100);
            jTItensVendido.getColumnModel().getColumn(5).setMinWidth(150);
            jTItensVendido.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        jTItensVendido.getColumnModel().getColumn(0).setCellRenderer(centro);
        jTItensVendido.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jTItensVendido.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jTItensVendido.getColumnModel().getColumn(3).setCellRenderer(direita);
        
        
        cliente.ConsultarClientes();
        venda.ConsultarVendas();
        produto.ConsultarProdutos();
        venda.ConsultarItem(venda.getIDVenda().get(num));

        
        for(int i=0; i< 100; i++){

            if(i< venda.getIDItemVendido().size()){

                DefaultTableModel model = (DefaultTableModel) jTItensVendido.getModel();
                model.addRow(new Object[]{""+venda.getIDProduto().get(i), ""+produto.getNome().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i))), ""+produto.getMarca().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i))), produto.getMedida().get(produto.getIDProduto().indexOf(venda.getIDProduto().get(i)))+"", venda.getQuantidade().get(i), venda.getValorUnitario().get(i)});
            }else{
                DefaultTableModel model = (DefaultTableModel) jTItensVendido.getModel();
                model.addRow(new Object[]{null, "", "", "", null, null});
            }
            
        }

        TableColumn idColumn = jTItensVendido.getColumnModel().getColumn(0);
        TableColumn nomeColumn = jTItensVendido.getColumnModel().getColumn(1);
        
        
        jComboBox2.addItem(null);
        jComboBox1.addItem(null);
        
        for(int i=0; i<produto.getIDProduto().size(); i++){
            jComboBox2.addItem(produto.getIDProduto().get(i) + "");
            jComboBox1.addItem(produto.getNome().get(i) + "  /  " + produto.getMarca().get(i) + "  /  " + produto.getMedida().get(i));  
        }
        
        
        idColumn.setCellEditor(new DefaultCellEditor(jComboBox2));
        nomeColumn.setCellEditor(new DefaultCellEditor(jComboBox1));
        
        
        jCBCliente.addItem(null);
        
        for(int i=0; i<cliente.getIDCliente().size(); i++){
            jCBCliente.addItem(cliente.getNome().get(i) + "");
        }
        
        PegarDados(num);
    } 
    
    public void PegarDados(int num) throws SQLException {
        numero = num;
        
        cliente.ConsultarClientes();
        venda.ConsultarVendas();
        produto.ConsultarProdutos();
        venda.ConsultarItem(venda.getIDVenda().get(num));
        
        
        jCBCliente.setSelectedIndex(cliente.getIDCliente().indexOf(venda.getIDCliente().get(num))+1);
        jTFData1.setText(venda.getDataHoraDaVenda().get(num).substring(8, 10));
        jTFData2.setText(venda.getDataHoraDaVenda().get(num).substring(5, 7));
        jTFData3.setText(venda.getDataHoraDaVenda().get(num).substring(0, 4));
        jTFHora1.setText(venda.getDataHoraDaVenda().get(num).substring(11, 13));
        jTFHora2.setText(venda.getDataHoraDaVenda().get(num).substring(14, 16));
        jFTFValorTotal.setText((design.FormataFloat(venda.getValorTotal().get(num))).replace(".",","));
        jTFFormaDePagamento.setText("" + venda.getFormaDePagamento().get(num));
        
    }
    
}
