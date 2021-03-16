package Gerenciador_De_Estoque;

public class Produtos {
    // lembrar de deixar privado depois
    private  int IDProduto;
    private  String Nome;
    private  String Marca;
    private  String Medida;
    private  float ValorVenda;
    private  int Quantidade;
    private  boolean Ativo;
    private  String Descricao;
    
    //------------------------------------------------//
    
    void CadastrarProduto(){
        
    }
    
    void AlterarProduto(){
        
    }
    
    void ConsultarProdutos(){
        
    }
    
    //-----------------------------------------------------//

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
}
