package Gerenciador_De_Estoque;

import java.sql.SQLException;
import javax.swing.JFrame;



public class Main {

    public static void main(String[] args) throws SQLException {
        
        TelaAdministrador Janela = new TelaAdministrador();
        Janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Janela.show();
        
        Fornecedores forn = new Fornecedores();
        forn.setPais("Brasil");
        forn.setEstado("SP");
        forn.setCidade("campinas");
        forn.setBairro("swift");
        forn.setRua("seila");
        forn.setNumero("123");
        forn.setTelefone1("1234234533");
        forn.setTelefone2("");
        forn.setEmail1("adjnfkdkd@dnd.com");
        forn.setEmail2("");
        forn.setCNPJ("384757758892");
        forn.setRazaoSocial("CEO");
        forn.setNomeFantasia("empresa fantasma");
        
        forn.ConsultarFornecedor();
        //forn.AlterarFornecedor();
        //forn.CadastrarFornecedor();
                
    }
    
}
