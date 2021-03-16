package Gerenciador_De_Estoque;

public class Fornecedores extends EnderecosContatos{
    private int IDFornecedor;
    private String CNPJ;
    private String RazaoSocial;
    private String NomeFantasia;
    String sql;
    //-----------------------------------------------//
    void CadastrarEnderecoContato(){
        /*sql = "INSERT INTO Enderecos (Pais, Estado, Cidade, Bairro, Rua, Numero) VALUES('" + getPais() +  "', '" + getEstado() + "', '" + getCidade() + "', '" + getBairro() + "', '" + getRua() + "', '" + getNumero() + "') "
              + "INSERT INTO Contatos (Telefone1, Telefone2, Email1, Email2) VALUES('" + getTelefone1() + "', '" + getTelefone2() + "', '" + getEmail1() + "', '" + getEmail2() + "')";
        */
        ConnectionFactory conect = new ConnectionFactory();
        /*conect.sql = this.sql;
        conect.conectar();*/
        // puxar a os ultimos endereços e contatos cadastrados
        sql = "select TOP 1 IDEndereco FROM Enderecos ORDER BY IDEndereco DESC";
        
        conect.sql = this.sql;
        //setIDEndereco(1); 
        conect.conectar();
        //CadastrarFornecedor();
    }
    
    void CadastrarFornecedor(){
        sql = "INSERT INTO Fornecedores (IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) VALUES(" + getIDEndereco() + ", " + getIDContato() + ", '" + getCNPJ() + "', '" + getRazaoSocial() + "', '" + getNomeFantasia() +"')";
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.conectar();
    }
    
    void AlterarFornecedor(){
        
    }
    
    void ConsultarFornecedor(){
        
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
