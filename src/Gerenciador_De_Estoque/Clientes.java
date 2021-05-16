package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Clientes extends EnderecosContatos{

    private List<Integer> IDCliente = new ArrayList<Integer>();
    private List<String> CPF = new ArrayList<String>();
    private List<String> Nome = new ArrayList<String>();
    private List<String> DataDeNascimento = new ArrayList<String>();

    String sql;
    ResultSet resultado;
    
    //--------------------------------------------------------//
    
    public void CadastrarCliente(String pais, String estado, String cidade, String bairro, String rua, String numero, String telefone1, String telefone2, String email1, String email2, String cpf, String dataDeNascimento, String nome)throws SQLException{
        
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
    
        sql = "INSERT INTO Clientes (IDEndereco, IDContato, CPF, Nome, DataDeNascimento) VALUES(" + idEndereco + ", " + idContato + ", '" + cpf + "', '" + nome + "', '" + dataDeNascimento +"')";
       
        conect.sql = this.sql;
        conect.inserir();
    }
    
    public void AlterarCliente(String pais, String estado, String cidade, String bairro, String rua, String numero, String telefone1, String telefone2, String email1, String email2, String cpf, String dataDeNascimento, String nome, int num)throws SQLException{
        
       sql = "UPDATE Enderecos\n" + "SET Pais = '" + pais + "', Estado = '" + estado + "', Cidade = '" + cidade + "', Bairro = '" + bairro + "', Rua = '" + rua + "', Numero = '" + numero + "'\n" + "WHERE IDEndereco = " + getIDEndereco().get(num) + "\n"
        + "UPDATE Contatos\n" + "SET Telefone1 = '" + telefone1 + "', Telefone2 = '" + telefone2 + "', Email1 = '" + email1 + "', Email2 = '" + email2 + "'\n" + "WHERE IDContato = " + getIDContato().get(num) + "\n"
        + "UPDATE Clientes\n" + "SET CPF = '" + cpf + "', Nome = '" + nome + "', DataDeNascimento = '" + dataDeNascimento + "'\n" + "WHERE IDCliente = " + getIDCliente().get(num) + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    public void ConsultarClientes()throws SQLException{
        
        sql = "select * from Enderecos e\n" +
        "INNER JOIN Clientes cl ON e.IDEndereco = cl.IDEndereco\n" +
        "INNER JOIN Contatos c ON c.IDContato = cl.IDContato\n";
        
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
            
            setIDCliente(resultado.getInt(8));
            setCPF(resultado.getString(11));
            setNome(resultado.getString(12));
            setDataDeNascimento(resultado.getString(13));
            
            setIDContato(resultado.getInt(14));
            setTelefone1(resultado.getString(15));
            setTelefone2(resultado.getString(16));
            setEmail1(resultado.getString(17));
            setEmail2(resultado.getString(18));
        }
    }

    public void LimparCliente(){
       
        this.IDCliente.clear();
        this.CPF.clear();
        this.DataDeNascimento.clear();
        this.Nome.clear();
        
        LimparEnderecosContatos();
    }
    
    //------------------------------------------------------------//

    public List<Integer> getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente.add(IDCliente);
    }

    public List<String> getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF.add(CPF);
    }

    public List<String> getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome.add(Nome);
    }

    public List<String> getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento.add(DataDeNascimento);
    }
    
}
