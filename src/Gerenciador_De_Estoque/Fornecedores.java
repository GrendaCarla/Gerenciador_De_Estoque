package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Fornecedores extends EnderecosContatos{
    private List<Integer> IDFornecedor = new ArrayList<Integer>();
    private List<String> CNPJ = new ArrayList<String>();
    private List<String> RazaoSocial = new ArrayList<String>();
    private List<String> NomeFantasia = new ArrayList<String>();
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    String sql;
    ResultSet resultado;
    
    //-----------------------------------------------//
    
    public void CadastrarFornecedor(String pais, String estado, String cidade, String bairro, String rua, String numero, String telefone1, String telefone2, String email1, String email2, String cnpj, String razaoSocial, String nomeFantasia)throws SQLException{
        
        sql = "INSERT INTO Enderecos (Pais, Estado, Cidade, Bairro, Rua, Numero) VALUES('" + pais +  "', '" + estado + "', '" + cidade + "', '" + bairro + "', '" + rua + "', '" + numero + "') "
              + "INSERT INTO Contatos (Telefone1, Telefone2, Email1, Email2) VALUES('" + telefone1 + "', '" + telefone2 + "', '" + email1 + "', '" + email2 + "')";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        sql = "select TOP 1 IDEndereco FROM Enderecos ORDER BY IDEndereco DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        resultado.next();
        
        int idEndereco = resultado.getInt(1);
        
        
        sql = "select TOP 1 IDContato FROM Contatos ORDER BY IDContato  DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        resultado.next();
        
        int idContato = resultado.getInt(1);
        
        
        sql = "INSERT INTO Fornecedores (IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) VALUES(" + idEndereco + ", " + idContato + ", '" + cnpj + "', '" + razaoSocial + "', '" + nomeFantasia +"')";
       
        conect.sql = this.sql;
        conect.inserir();
    }
    
    public void AlterarFornecedor(String pais, String estado, String cidade, String bairro, String rua, String numero, String telefone1, String telefone2, String email1, String email2, String cnpj, String razaoSocial, String nomeFantasia, int num)throws SQLException{
    
       sql = "UPDATE Enderecos\n" + "SET Pais = '" + pais + "', Estado = '" + estado + "', Cidade = '" + cidade + "', Bairro = '" + bairro + "', Rua = '" + rua + "', Numero = '" + numero + "'\n" + "WHERE IDEndereco = " + getIDEndereco().get(num) + "\n"
        + "UPDATE Contatos\n" + "SET Telefone1 = '" + telefone1 + "', Telefone2 = '" + telefone2 + "', Email1 = '" + email1 + "', Email2 = '" + email2 + "'\n" + "WHERE IDContato = " + getIDContato().get(num) + "\n"
        + "UPDATE Fornecedores\n" + "SET CNPJ = '" + cnpj + "', RazaoSocial = '" + razaoSocial + "', NomeFantasia = '" + nomeFantasia + "'\n" + "WHERE IDFornecedor = " + getIDFornecedor().get(num) + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    public void ConsultarFornecedor()throws SQLException{
        
        sql = "select * from Enderecos e\n" +
        "INNER JOIN Fornecedores f ON e.IDEndereco = f.IDEndereco\n" +
        "INNER JOIN Contatos c ON c.IDContato = f.IDContato\n";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
      
        while (resultado.next()){
            setIDEndereco(resultado.getInt(1));
            setPais(resultado.getString(2));
            setEstado(resultado.getString(3));
            setCidade(resultado.getString(4));
            setBairro(resultado.getString(5));
            setRua(resultado.getString(6));
            setNumero(resultado.getString(7));
            
            setIDFornecedor(resultado.getInt(8));
            setCNPJ(resultado.getString(11));
            setRazaoSocial(resultado.getString(12));
            setNomeFantasia(resultado.getString(13));
            
            setIDContato(resultado.getInt(14));
            setTelefone1(resultado.getString(15));
            setTelefone2(resultado.getString(16));
            setEmail1(resultado.getString(17));
            setEmail2(resultado.getString(18));
        }
    }
    
    public void ConsultarComprasPorFornecedor(){
        
    }
    
    public void LimparFornecedor(){
       
        this.IDFornecedor.clear();
        this.CNPJ.clear();
        this.RazaoSocial.clear();
        this.NomeFantasia.clear();
        
        LimparEnderecosContatos();
    }
    
    //---------------------------------------------------//

    public List<Integer> getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int IDFornecedor) {
        this.IDFornecedor.add(IDFornecedor);
    }

    public List<String> getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ.add(CNPJ);
    }

    public List<String> getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial.add(RazaoSocial);
    }

    public List<String> getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia.add(NomeFantasia);
    }
    
}
