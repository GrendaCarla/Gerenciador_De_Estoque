package Gerenciador_De_Estoque;

public class ItensComprados {
    // lembrar de deixar privado depois
    private int IDItemComprado;
    private int IDCompra;
    private int IDProduto;
    private int Quantidade;
    private float ValorUnitario;
    
    //-----------------------------------------------------//
    
    void CadastrarItem(){
        
    }
    
    void AlterarItem(){
        
    }
    
    void ConsultarItens(){
        
    }
    
    //--------------------------------------------------------//

    public int getIDItemComprado() {
        return IDItemComprado;
    }

    public void setIDItemComprado(int IDItemComprado) {
        this.IDItemComprado = IDItemComprado;
    }

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }
    
    
    
}
