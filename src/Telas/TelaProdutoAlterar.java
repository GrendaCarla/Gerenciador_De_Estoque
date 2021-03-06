
package Telas;

import Design.Design;
import Classes.Produtos;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class TelaProdutoAlterar extends javax.swing.JFrame {
    
    int numero;
    
    Design design = new Design();

    public TelaProdutoAlterar() {
        initComponents();
        
        AlinhamentoDosItens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMedida = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jFTFValorVenda = new javax.swing.JFormattedTextField();
        jFTFQuantidade = new javax.swing.JFormattedTextField();
        jCBAtivo = new javax.swing.JComboBox<>();
        jLbEscondeLinha1 = new javax.swing.JLabel();
        jLbEscondeLinha2 = new javax.swing.JLabel();
        jLbEscondeLinha3 = new javax.swing.JLabel();
        jLbEscondeLinha4 = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLbMedida = new javax.swing.JLabel();
        jLbMarca = new javax.swing.JLabel();
        jLbQuantidade = new javax.swing.JLabel();
        jLbValorVenda = new javax.swing.JLabel();
        jLbNome = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jLbDescricao = new javax.swing.JLabel();
        jLbAtivo = new javax.swing.JLabel();
        jBntSalvar = new javax.swing.JButton();
        jBntCancelar = new javax.swing.JButton();
        jLbFundo2 = new javax.swing.JLabel();
        jLbFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTFMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMedida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMedida.setBorder(null);
        jTFMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFMedida);
        jTFMedida.setBounds(340, 300, 258, 22);

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNome.setBorder(null);
        jTFNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFNome);
        jTFNome.setBounds(690, 30, 280, 30);

        jTFMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFMarca.setBorder(null);
        jTFMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTFMarca);
        jTFMarca.setBounds(140, 20, 308, 30);

        jFTFValorVenda.setBorder(null);
        jFTFValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTFValorVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFValorVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFValorVenda);
        jFTFValorVenda.setBounds(330, 100, 110, 22);

        jFTFQuantidade.setBorder(null);
        jFTFQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jFTFQuantidade);
        jFTFQuantidade.setBounds(330, 100, 110, 22);

        jCBAtivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBAtivo.setForeground(new java.awt.Color(255, 255, 255));
        jCBAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Inativo", "  Ativo" }));
        jCBAtivo.setSelectedIndex(1);
        jCBAtivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBAtivoFocusLost(evt);
            }
        });
        getContentPane().add(jCBAtivo);
        jCBAtivo.setBounds(380, 130, 100, 30);

        jLbEscondeLinha1.setBackground(new java.awt.Color(255, 255, 255));
        jLbEscondeLinha1.setOpaque(true);
        getContentPane().add(jLbEscondeLinha1);
        jLbEscondeLinha1.setBounds(550, 120, 120, 20);
        getContentPane().add(jLbEscondeLinha2);
        jLbEscondeLinha2.setBounds(470, 80, 60, 20);
        getContentPane().add(jLbEscondeLinha3);
        jLbEscondeLinha3.setBounds(470, 80, 60, 30);
        getContentPane().add(jLbEscondeLinha4);
        jLbEscondeLinha4.setBounds(470, 80, 60, 30);

        jTFDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 220, 212), 4));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setToolTipText("");
        jTextAreaDescricao.setBorder(null);
        jTextAreaDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFDescricao.setViewportView(jTextAreaDescricao);

        getContentPane().add(jTFDescricao);
        jTFDescricao.setBounds(20, 20, 310, 240);

        jLbMedida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMedida.setText("  Medida:");
        getContentPane().add(jLbMedida);
        jLbMedida.setBounds(240, 300, 80, 22);

        jLbMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbMarca.setText("  Marca:");
        getContentPane().add(jLbMarca);
        jLbMarca.setBounds(270, 320, 70, 30);

        jLbQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbQuantidade.setText("  Quantidade:");
        getContentPane().add(jLbQuantidade);
        jLbQuantidade.setBounds(700, 300, 120, 22);

        jLbValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbValorVenda.setText("  Pre??o:   R$");
        getContentPane().add(jLbValorVenda);
        jLbValorVenda.setBounds(140, 270, 110, 22);

        jLbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbNome.setText("  Nome:");
        getContentPane().add(jLbNome);
        jLbNome.setBounds(460, 70, 70, 22);

        jLbTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLbTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("ALTERAR  PRODUTO");
        jLbTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jLbTitulo.setOpaque(true);
        getContentPane().add(jLbTitulo);
        jLbTitulo.setBounds(170, -30, 550, 60);

        jLbDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbDescricao.setText("  Descri????o:");
        getContentPane().add(jLbDescricao);
        jLbDescricao.setBounds(90, 370, 100, 22);

        jLbAtivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbAtivo.setText("  Ativo?:");
        getContentPane().add(jLbAtivo);
        jLbAtivo.setBounds(570, 60, 80, 22);

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

        jLbFundo2.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo2.setOpaque(true);
        getContentPane().add(jLbFundo2);
        jLbFundo2.setBounds(0, 250, 0, 0);

        jLbFundo1.setBackground(new java.awt.Color(255, 255, 255));
        jLbFundo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoTabela.png"))); // NOI18N
        getContentPane().add(jLbFundo1);
        jLbFundo1.setBounds(60, 370, 170, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed

        try {
            TelaPrincipal Janela = new TelaPrincipal();
            //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);
            Janela.MudarAba(2);

            Janela.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProdutoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBntCancelarActionPerformed

    private void jBntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntSalvarActionPerformed
        if(jTFNome.getText().isEmpty() == true || jTFMarca.getText().isEmpty() == true || jTFMedida.getText().isEmpty() == true || jFTFValorVenda.getText().isEmpty() == true){
            
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 18)));
            JOptionPane.showMessageDialog(null, "?? obrigat??rio o preenchimento de todos os campos.\nExceto: Descri????o\n\n\n\n");
  
        }else{
            try {
                Produtos produto = new Produtos();
                produto.ConsultarProdutos();

                produto.AlterarProduto(jTFNome.getText(), jTFMarca.getText(), jTFMedida.getText(), Float.parseFloat(jFTFValorVenda.getText().replaceAll(",",".")), Integer.parseInt(jFTFQuantidade.getText()), jTextAreaDescricao.getText(), jCBAtivo.getSelectedIndex(), numero);

                TelaPrincipal Janela = new TelaPrincipal();
                //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();

                Janela.setSize(d.width + 8, d.height - 37);
                Janela.setResizable(false);
                Janela.MudarAba(2);

                Janela.show();
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFornecedorCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBntSalvarActionPerformed

    private void jCBAtivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBAtivoFocusLost
        if(jCBAtivo.getSelectedIndex() == 1){
            jCBAtivo.setForeground(design.getCorBotaoSalvar());
        }
        else{
            jCBAtivo.setForeground(design.getCorBotaoSairCancelarVoltar());
        }
    }//GEN-LAST:event_jCBAtivoFocusLost

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutoAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JButton jBntSalvar;
    private javax.swing.JComboBox<String> jCBAtivo;
    private javax.swing.JFormattedTextField jFTFQuantidade;
    private javax.swing.JFormattedTextField jFTFValorVenda;
    private javax.swing.JLabel jLbAtivo;
    private javax.swing.JLabel jLbDescricao;
    private javax.swing.JLabel jLbEscondeLinha1;
    private javax.swing.JLabel jLbEscondeLinha2;
    private javax.swing.JLabel jLbEscondeLinha3;
    private javax.swing.JLabel jLbEscondeLinha4;
    private javax.swing.JLabel jLbFundo1;
    private javax.swing.JLabel jLbFundo2;
    private javax.swing.JLabel jLbMarca;
    private javax.swing.JLabel jLbMedida;
    private javax.swing.JLabel jLbNome;
    private javax.swing.JLabel jLbQuantidade;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JLabel jLbValorVenda;
    private javax.swing.JScrollPane jTFDescricao;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFMedida;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextArea jTextAreaDescricao;
    // End of variables declaration//GEN-END:variables

    public void AlinhamentoDosItens() {
        
        getContentPane().setBackground(design.getCorFundo1());
        
        jLbFundo1.setBounds(20, 110,design.getLargura() - 40, design.getAltura() - 200);
        
        jLbFundo2.setBounds(20+15 , 110+50, (design.getLargura() - 40)-30, (design.getAltura() - 200)-80);
        jLbFundo2.setBackground(design.getCorFundo3());
        
        
        
        jLbTitulo.setBounds(design.CentralizarLargura(550, 2, 1),design.CentralizarAltura(55, 18, 1),550,55);
        jLbTitulo.setForeground(design.getCorLetra1());
        jLbTitulo.setBackground(design.getCorFundo2());
         
        
        jLbNome.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 30, 9),140 + 370 + 15 + 4,30);
        jTFNome.setBounds(design.CentralizarLargura(116, 18,2)+ 70 + 15,design.CentralizarAltura(30, 30, 9),440,30);
        jLbNome.setBackground(design.getCorCampoTexto());
        jLbNome.setOpaque(true);
        jTFNome.setBackground(design.getCorCampoTexto());
        jTFNome.setOpaque(true);
        
        
        jLbMarca.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2, design.CentralizarAltura(30, 30, 9),140 + 370 + 15 + 4,30);
        jTFMarca.setBounds((design.getLargura()/2 -(design.CentralizarLargura(116, 18, 2) + 529)) + design.getLargura()/2 + 70 + 15, design.CentralizarAltura(30, 30, 9),440,30); 
        jLbMarca.setBackground(design.getCorCampoTexto());
        jLbMarca.setOpaque(true);
        jTFMarca.setBackground(design.getCorCampoTexto());
        jTFMarca.setOpaque(true);
        
        jLbMedida.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 30, 12),80 + 15 + 160 + 4,30);
        jTFMedida.setBounds(design.CentralizarLargura(116, 18,2)+ 80 + 15,design.CentralizarAltura(30, 30, 12),160,30);
        jLbMedida.setBackground(design.getCorCampoTexto());
        jLbMedida.setOpaque(true);
        jTFMedida.setBackground(design.getCorCampoTexto());
        jTFMedida.setOpaque(true);
        
        // conta prara saber aonde deve colocar a ValorVenda para q fique centralizado entre o medida e quantidade
        int espacoValorVenda = (((design.getLargura() - design.CentralizarLargura(116, 18, 2) - 80 - 15 - 100 - 4)- (design.CentralizarLargura(116, 18,2)+ 80 + 15 + 160 + 4)) - (110 + 15 + 150 + 4) - (110 + 15 + 130 + 4))/3;
        
        jLbValorVenda.setBounds(design.CentralizarLargura(116, 18,2)+ 80 + 15 + 160 + 4 + espacoValorVenda, design.CentralizarAltura(30, 30, 12),110 + 15 + 150 + 4,30);
        jFTFValorVenda.setBounds(design.CentralizarLargura(116, 18,2)+ 80 + 15 + 160 + 4 + espacoValorVenda + 110 + 15, design.CentralizarAltura(30, 30, 12),150,30);
        jLbValorVenda.setBackground(design.getCorCampoTexto());
        jLbValorVenda.setOpaque(true);
        jFTFValorVenda.setBackground(design.getCorCampoTexto());
        jFTFValorVenda.setOpaque(true);
        
        jLbQuantidade.setBounds(design.CentralizarLargura(116, 18,2)+ 80 + 15 + 160 + 4 + espacoValorVenda+110+15+150+4 + espacoValorVenda, design.CentralizarAltura(30, 30, 12),115 + 15 + 130 + 4,30);
        jFTFQuantidade.setBounds(design.CentralizarLargura(116, 18,2)+ 80 + 15 + 160 + 4 + espacoValorVenda+110+15+150+4 + espacoValorVenda +115+15, design.CentralizarAltura(30, 30, 12),130,30);
        jLbQuantidade.setBackground(design.getCorCampoTexto());
        jLbQuantidade.setOpaque(true);
        jFTFQuantidade.setBackground(design.getCorCampoTexto());
        jFTFQuantidade.setOpaque(true);
        
        jLbAtivo.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2) - 80 - 15 - 90 - 4, design.CentralizarAltura(30, 30, 12),80 + 15 + 90 + 4,30);
        jCBAtivo.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,2)- 95 - 4, design.CentralizarAltura(30, 30, 12),95,30);
        jLbAtivo.setBackground(design.getCorCampoTexto());
        jLbAtivo.setOpaque(true);
        jCBAtivo.setBackground(design.getCorCampoTexto());
        jCBAtivo.setOpaque(true);
        
        jLbDescricao.setBounds(design.CentralizarLargura(116, 18,2),design.CentralizarAltura(30, 30, 15), 100,30);
        jTFDescricao.setBounds(design.CentralizarLargura(116, 18,2)+ 100 + 15,design.CentralizarAltura(30, 30, 15),design.getLargura()-design.CentralizarLargura(116, 18, 2)-design.CentralizarLargura(116, 18, 2) - 100-15, design.CentralizarAltura(30, 30, 22) - design.CentralizarAltura(30, 30, 15));
        jLbDescricao.setBackground(design.getCorCampoTexto());
        jLbDescricao.setOpaque(true);
        jTextAreaDescricao.setBackground(design.getCorCampoTexto());
        jTextAreaDescricao.setOpaque(true);
        
        jLbEscondeLinha1.setBounds(design.CentralizarLargura(116, 18,2)+ 100 + 15,design.CentralizarAltura(30, 30, 15),design.getLargura()-design.CentralizarLargura(116, 18, 2)-design.CentralizarLargura(116, 18, 2) - 100-15, 2);
        jLbEscondeLinha1.setBackground(design.getCorCampoTexto());
        jLbEscondeLinha1.setOpaque(true);
        jLbEscondeLinha2.setBounds(design.CentralizarLargura(116, 18,2)+ 100 + 15,design.CentralizarAltura(30, 30, 22)-2,design.getLargura()-design.CentralizarLargura(116, 18, 2)-design.CentralizarLargura(116, 18, 2) - 100-15, 2);
        jLbEscondeLinha2.setBackground(design.getCorCampoTexto());
        jLbEscondeLinha2.setOpaque(true);
        jLbEscondeLinha3.setBounds(design.CentralizarLargura(116, 18,2)+ 100 + 15, design.CentralizarAltura(30, 30, 15), 2, design.CentralizarAltura(30, 30, 22) - design.CentralizarAltura(30, 30, 15));
        jLbEscondeLinha3.setBackground(design.getCorCampoTexto());
        jLbEscondeLinha3.setOpaque(true);
        jLbEscondeLinha4.setBounds(design.getLargura()-design.CentralizarLargura(116, 18, 2)-2, design.CentralizarAltura(30, 30, 15), 2, design.CentralizarAltura(30, 30, 22) - design.CentralizarAltura(30, 30, 15));
        jLbEscondeLinha4.setBackground(design.getCorCampoTexto());
        jLbEscondeLinha4.setOpaque(true);
        
        
        jBntSalvar.setBounds(design.CentralizarLargura(116, 18,3),design.CentralizarAltura(30, 30, 24),150,40);
        jBntSalvar.setBackground(design.getCorBotaoSalvar());
        jBntSalvar.setOpaque(true);
        jBntSalvar.setForeground(design.getCorLetra1());
        
        jBntCancelar.setBounds(design.getLargura() - design.CentralizarLargura(116, 18,3) - 150,design.CentralizarAltura(30, 30, 24),150,40);
        jBntCancelar.setBackground(design.getCorBotaoSairCancelarVoltar());
        jBntCancelar.setOpaque(true);
        jBntCancelar.setForeground(design.getCorLetra1());
        
    }

    public void PegarDados(int num) throws SQLException {
        numero = num;
                
        Produtos produto = new Produtos();
        
        produto.ConsultarProdutos();
        
        
        jTFNome.setText(produto.getNome().get(num));
        jTFMarca.setText(produto.getMarca().get(num));
        
        jTFMedida.setText(produto.getMedida().get(num));
        jFTFValorVenda.setText("" + design.FormataFloat(produto.getValorVenda().get(num)));
        jFTFQuantidade.setText(produto.getQuantidade().get(num) + "");
        jCBAtivo.setSelectedIndex(produto.getAtivo().get(num));
        if(produto.getAtivo().get(num) == 1){
            jCBAtivo.setForeground(design.getCorBotaoSalvar());
        }
        else{
            jCBAtivo.setForeground(design.getCorBotaoSairCancelarVoltar());
        }
        jTextAreaDescricao.setText(produto.getDescricao().get(num));
    }
    
}
