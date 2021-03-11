package Gerenciador_De_Estoque;

public class Compras {
    // lembrar de deixar privado depois
    int IDCompra;
    int IDFornecedor;
    String DataHoraDaCompra;
    float ValorTotal;
    byte[] NotaFiscal;
    
    //-------------------------------------------------------//
    
    void CadastrarCompras(){
        
    }
    
    void AtualizarProdutos(){
        
    }
    
    void ConsultarCompras(){
        
    }
    
    void ConsultarComprasPorFornecedor(){
        
    }
    
    void ConsultarComprasPorPeriodo(){
        
    }
    
    void ConsultarComprasPorProduto(){
        
    }
    
    //-----------------------------------------------------//

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public String getDataHoraDaCompra() {
        return DataHoraDaCompra;
    }

    public void setDataHoraDaCompra(String DataHoraDaCompra) {
        this.DataHoraDaCompra = DataHoraDaCompra;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public byte[] getNotaFiscal() {
        return NotaFiscal;
    }

    public void setNotaFiscal(byte[] NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }
    
    
}
