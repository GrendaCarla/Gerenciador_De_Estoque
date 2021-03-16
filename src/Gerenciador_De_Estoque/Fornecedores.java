package Gerenciador_De_Estoque;

public class Fornecedores extends EnderecosContatos{
    // lembrar de deixar privado depois
    private int IDFornecedor;
    private String CNPJ;
    private String RazaoSocial;
    private String NomeFantasia;
    String sql;
    //-----------------------------------------------//
    void CadastrarEnderecoContato(){
        sql = "INSERT INTO Enderecos (Pais, Estado, Cidade, Bairro, Rua, Numero) VALUES('" + Pais +  "', '" + Estado + "', '" + Cidade + "', '" + Bairro + "', '" + Rua + "', '" + Numero + "') "
                + "INSERT INTO Contatos (Telefone1, Telefone2, Email1, Email1) VALUES('" + Telefone1 + "', '" + Telefone2 + "', '" + Email1 + "', '" + Email1 +"')";
    }
    
    void CadastrarFornecedor(){
        sql = "INSERT INTO Fornecedores (IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) VALUES(" + IDEndereco + ", " + IDContato + ", '" + CNPJ + "', '" + RazaoSocial + "', '" + NomeFantasia +"')";
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
