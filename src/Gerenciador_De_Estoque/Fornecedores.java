package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Fornecedores extends EnderecosContatos{
    private int IDFornecedor;
    private String CNPJ;
    private String RazaoSocial;
    private String NomeFantasia;
    String sql;
    ResultSet resultado;
    
    //-----------------------------------------------//
    
    void CadastrarFornecedor()throws SQLException{
        
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
    
        sql = "INSERT INTO Fornecedores (IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) VALUES(" + getIDEndereco() + ", " + getIDContato() + ", '" + getCNPJ() + "', '" + getRazaoSocial() + "', '" + getNomeFantasia() +"')";
       
        conect.sql = this.sql;
        conect.inserir();
    }
    
    void AlterarFornecedor()throws SQLException{
        
       sql = "UPDATE Enderecos\n" + "SET Pais = '" + getPais() + "', Estado = '" + getEstado() + "', Cidade = '" + getCidade() + "', Bairro = '" + getBairro() + "', Rua = '" + getRua() + "', Numero = '" + getNumero() + "'\n" + "WHERE IDEndereco = " + getIDEndereco() + "\n"
        + "UPDATE Contatos\n" + "SET Telefone1 = '" + getTelefone1() + "', Telefone2 = '" + getTelefone2() + "', Email1 = '" + getEmail1() + "', Email2 = '" + getEmail2() + "'\n" + "WHERE IDContato = " + getIDContato() + "\n"
        + "UPDATE Fornecedores\n" + "SET CNPJ = '" + getCNPJ() + "', RazaoSocial = '" + getRazaoSocial() + "', NomeFantasia = '" + getNomeFantasia() + "'\n" + "WHERE IDFornecedor = " + getIDFornecedor() + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    void ConsultarFornecedor()throws SQLException{
        
        sql = "select * from Enderecos e\n" +
        "INNER JOIN Fornecedores f ON e.IDEndereco = f.IDEndereco\n" +
        "INNER JOIN Contatos c ON c.IDContato = f.IDContato\n" +
        "where IDFornecedor = 4"; //+ getIDFornecedor();
        
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
    
    void ConsultarComprasPorFornecedor(){
        
    }
    
    //---------------------------------------------------//

    public int getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int IDFornecedor) {
        this.IDFornecedor = IDFornecedor;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }
    
    
    
    
}
