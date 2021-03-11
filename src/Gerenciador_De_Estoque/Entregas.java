package Gerenciador_De_Estoque;

public class Entregas {
    
    int IDEntrega;
    int IDVenda;
    float Troco;
    boolean Entregue;
    
    //--------------------------------------------------//
    
    void ConsultarEntrega(){
        
    }
    
    void ConsultarEntregaPorPeriodo(){
        
    }
    
    void ConsultarEntregaRetornada(){
        
    }
    
    //--------------------------------------------------//

    public int getIDEntrega() {
        return IDEntrega;
    }

    public void setIDEntrega(int IDEntrega) {
        this.IDEntrega = IDEntrega;
    }

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public float getTroco() {
        return Troco;
    }

    public void setTroco(float Troco) {
        this.Troco = Troco;
    }

    public boolean isEntregue() {
        return Entregue;
    }

    public void setEntregue(boolean Entregue) {
        this.Entregue = Entregue;
    }
    
    
    
}
