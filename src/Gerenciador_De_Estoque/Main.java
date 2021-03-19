package Gerenciador_De_Estoque;

import java.sql.SQLException;
import javax.swing.JFrame;



public class Main {

    public static void main(String[] args) throws SQLException {
        
        /*TelaAdministrador Janela = new TelaAdministrador();
        Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Janela.show();*/
        
        //Fornecedores forn = new Fornecedores();
        /*Clientes forn = new Clientes();
        
        forn.setPais("Brasileiro");
        forn.setEstado("SP");
        forn.setCidade("campinas");
        forn.setBairro("swift");
        forn.setRua("seila");
        forn.setNumero("123");
        forn.setTelefone1("1111111111");
        forn.setTelefone2("");
        forn.setEmail1("adjnfkdkd@dnd.com");
        forn.setEmail2("");
        //forn.setCNPJ("384757758892");
        //forn.setRazaoSocial("CEO");
        //forn.setNomeFantasia("empresa fantasma");
        forn.setCPF("cjkdldkddd");
        forn.setNome("ajaaaaa");
        forn.setDataDeNascimento("1996-03-17");
        forn.setIDCliente(2);
        forn.setIDEndereco(14);
        forn.setIDContato(14);
        
        forn.ConsultarClientes();*/
        //forn.AlterarCliente();
        //forn.CadastrarCliente();
       //forn.ConsultarFornecedor();
        //forn.AlterarFornecedor();
        //forn.CadastrarFornecedor();
        
        /*Produtos forn = new Produtos();
        forn.setNome("rapadurassss");
        forn.setMarca("nordeste");
        forn.setMedida("cm");
        forn.setValorVenda(5.25f);
        forn.setQuantidade(2);
        forn.setAtivo(true);
        forn.setDescricao("");
        forn.setIDProduto(1);
            
        forn.AlterarProduto();*/
        //forn.CadastrarProduto();
        
        /*Compras forn = new Compras();
        
        forn.setIDFornecedor(0);
        forn.setDataHoraDaCompra("2021-03-17");
        forn.setValorTotal(0);
        
        forn.CadastrarCompras();*/
        
        Compras forn = new Compras();
        
        
        forn.setIDFornecedor(4);
        forn.setDataHoraDaCompra("19-03-2021 10:30:00");
        forn.setIDProduto(1);
        forn.setQuantidade(3);
        forn.setValorUnitario(5f);
        forn.setIDProduto(1);
        forn.setQuantidade(3);
        forn.setValorUnitario(3f);
        forn.setIDProduto(1);
        forn.setQuantidade(1);
        forn.setValorUnitario(7f);
        
        forn.CadastrarCompras();
        
    }
    
}
