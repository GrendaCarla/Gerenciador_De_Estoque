package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Clientes extends EnderecosContatos{
    // lembrar de deixar privado depois
    private int IDCliente;
    private String CPF;
    private String Nome;
    private String DataDeNascimento;
    // um vetor com as informações q seram exibidas na pagina principal pro atendente escolher qual quer clicar
    String sql;
    ResultSet resultado;
    
    //--------------------------------------------------------//
    
    void CadastrarCliente()throws SQLException{
        
        sql = "INSERT INTO Enderecos (Pais, Estado, Cidade, Bairro, Rua, Numero) VALUES('" + getPais() +  "', '" + getEstado() + "', '" + getCidade() + "', '" + getBairro() + "', '" + getRua() + "', '" + getNumero() + "') "
              + "INSERT INTO Contatos (Telefone1, Telefone2, Email1, Email2) VALUES('" + getTelefone1() + "', '" + getTelefone2() + "', '" + getEmail1() + "', '" + getEmail2() + "')";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        sql = "select TOP 1 IDEndereco FROM Enderecos ORDER BY IDEndereco DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            setIDEndereco(resultado.getInt(1));
            break;
        }
        
        sql = "select TOP 1 IDContato FROM Contatos ORDER BY IDContato  DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            setIDContato(resultado.getInt(1));
        }
    
        sql = "INSERT INTO Clientes (IDEndereco, IDContato, CPF, Nome, DataDeNascimento) VALUES(" + getIDEndereco() + ", " + getIDContato() + ", '" + getCPF() + "', '" + getNome() + "', '" + getDataDeNascimento() +"')";
       
        conect.sql = this.sql;
        conect.inserir();
    }
    
    void AlterarCliente()throws SQLException{
        
       sql = "UPDATE Enderecos\n" + "SET Pais = '" + getPais() + "', Estado = '" + getEstado() + "', Cidade = '" + getCidade() + "', Bairro = '" + getBairro() + "', Rua = '" + getRua() + "', Numero = '" + getNumero() + "'\n" + "WHERE IDEndereco = " + getIDEndereco() + "\n"
        + "UPDATE Contatos\n" + "SET Telefone1 = '" + getTelefone1() + "', Telefone2 = '" + getTelefone2() + "', Email1 = '" + getEmail1() + "', Email2 = '" + getEmail2() + "'\n" + "WHERE IDContato = " + getIDContato() + "\n"
        + "UPDATE Clientes\n" + "SET CPF = '" + getCPF() + "', Nome = '" + getNome() + "', DataDeNascimento = '" + getDataDeNascimento() + "'\n" + "WHERE IDCliente = " + getIDCliente() + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    void ConsultarClientes()throws SQLException{
        
        sql = "select * from Enderecos e\n" +
        "INNER JOIN Clientes cl ON e.IDEndereco = cl.IDEndereco\n" +
        "INNER JOIN Contatos c ON c.IDContato = cl.IDContato\n" +
        "where IDCliente = " + getIDCliente();
        
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
    
    void ConsultarClientesPorTelefone(){
        
    }
    
    void ConsultarClientesPorCPF(){
        
    }
    
    void ConsultarVendas(){
        
    }
    
    //------------------------------------------------------------//

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }
    
    
    
}
