package Gerenciador_De_Estoque;

public class Vendas {
    // lembrar de deixar privado depois
    private int IDVenda;
    private int IDCliente;
    private String DataHoraDaVenda;
    private float ValorTotal;
    private String FormaDePagamento;
    private boolean Entrega;
    
    //-----------------------------------------------//
    
    void CadastrarVenda(){
        
    }
    
    void AtualizarProdutos(){
        
    }
    
    void ConsultarVendas(){
        
    }
    
    void ConsultarVendasPorPeriodo(){
        
    }
    
    //-----------------------------------------------//

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getDataHoraDaVenda() {
        return DataHoraDaVenda;
    }

    public void setDataHoraDaVenda(String DataHoraDaVenda) {
        this.DataHoraDaVenda = DataHoraDaVenda;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getFormaDePagamento() {
        return FormaDePagamento;
    }

    public void setFormaDePagamento(String FormaDePagamento) {
        this.FormaDePagamento = FormaDePagamento;
    }

    public boolean isEntrega() {
        return Entrega;
    }

    public void setEntrega(boolean Entrega) {
        this.Entrega = Entrega;
    }
    
    
}
