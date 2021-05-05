package Gerenciador_De_Estoque;

import Gerenciador_De_Estoque.Tela_Administrador.TelaAdministrador;
import Gerenciador_De_Estoque.Tela_Administrador.TelaCadastroCompras;
import Gerenciador_De_Estoque.Tela_Administrador.TelaClienteCadastro;
import Gerenciador_De_Estoque.Tela_Administrador.TelaFornecedorCadastro;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JFrame;



public class Main {

    public static void main(String[] args) throws SQLException {
        
        TelaAdministrador Janela = new TelaAdministrador();
        //TelaClienteCadastro Janela = new TelaClienteCadastro();
        //TelaFornecedorCadastro Janela = new TelaFornecedorCadastro();
        //Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        Janela.setSize(d.width + 8, d.height - 37);
        Janela.setResizable(false);
           
        Janela.show();
        
        
        
        /*Fornecedores forn = new Fornecedores();
        
        forn.setPais("Brasil");
        forn.setEstado("SP");
        forn.setCidade("campinas");
        forn.setBairro("Bairro Rico");
        forn.setRua("Ladrilho de Ouro");
        forn.setNumero("123");
        forn.setTelefone1("1111111111");
        forn.setTelefone2("");
        forn.setEmail1("adjnfkdkd@dnd.com");
        forn.setEmail2("");
        
        forn.setCNPJ("384757758892");
        forn.setRazaoSocial("CEO");
        forn.setNomeFantasia("empresa fantasma");
        
        forn.setIDFornecedor(3);  //<------- OLHA NO BANCO ANTES
        forn.setIDEndereco(5);    //<------- OLHA NO BANCO ANTES
        forn.setIDContato(5);    //<------- OLHA NO BANCO ANTES
        
        
        forn.CadastrarFornecedor();
        forn.ConsultarFornecedor();
        //forn.AlterarFornecedor();*/
        
        
        
         
         
        //---------------------------------------
        
        
        
        
        /*Clientes forn = new Clientes();
        
        forn.setPais("Brasil");
        forn.setEstado("SP");
        forn.setCidade("campinas");
        forn.setBairro("swift");
        forn.setRua("seila");
        forn.setNumero("123");
        forn.setTelefone1("1111111111");
        forn.setTelefone2("");
        forn.setEmail1("UniversidadeSaoFrancisco@mail.usf.edu.com");
        forn.setEmail2("");
        
        forn.setCPF("2222222222");
        forn.setNome("Gabriela Geovana");
        forn.setDataDeNascimento("1996-03-17");
        
        forn.setIDCliente(3);  //<------- OLHA NO BANCO ANTES
        forn.setIDEndereco(6); //<------- OLHA NO BANCO ANTES
        forn.setIDContato(6);  //<------- OLHA NO BANCO ANTES
        
        
        forn.CadastrarCliente();
        forn.ConsultarClientes();
        //forn.AlterarCliente();*/
        
        
        
        
        
        //----------------------------------------------------
        
        
        
        
        
        /*Produtos forn = new Produtos();
        
        forn.setNome("rapadura");
        forn.setMarca("Doces Nordestino");
        forn.setMedida("1,5kg");
        forn.setValorVenda(25.00f);
        forn.setQuantidade(4);
        forn.setAtivo(1);
        forn.setDescricao("");
        
        
            
        forn.CadastrarProduto();
        //forn.AlterarProduto();*/
        
        
        
        //---------------------------------------
       
       
        
        
        /*Compras forn = new Compras();
        
        forn.setIDFornecedor(3);     //<------- OLHA NO BANCO ANTES
        //forn.setDataHoraDaCompra("2021-03-17");
        forn.setDataHoraDaCompra("17/03/2021");
        forn.setValorTotal(0f);       //<------- SEMPRE 0
        
   
        forn.setIDProduto(2);        //<------- OLHA NO BANCO ANTES
        forn.setQuantidade(3);
        forn.setValorUnitario(25.00f);
 
        
        
        forn.CadastrarCompras();
        forn.ConsultarCompras();
        //forn.AtualizarProdutos();*/
        
        
        
        
        //---------------------------------------
        
       
        
        
        /*Vendas forn = new Vendas();
        
        forn.setIDCliente(3);   //<------- OLHA NO BANCO ANTES
        forn.setDataHoraDaVenda("19/03/2021 15:30:00");
        forn.setValorTotal(0f);      //<------- SEMPRE 0
        forn.setFormaDePagamento("Debito");
                
        forn.setIDProduto(2);         //<------- OLHA NO BANCO ANTES
        forn.setQuantidade(1);
        forn.setValorUnitario(25.00f);
        
        
        forn.CadastrarVendas();
        forn.ConsultarVendas();
        //forn.AtualizarProdutos();*/
        
    }
    
}
