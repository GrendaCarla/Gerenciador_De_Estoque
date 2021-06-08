package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public abstract class ItensComprados {
    private List<Integer> IDItemComprado = new ArrayList<Integer>();
    private List<Integer> IDProduto = new ArrayList<Integer>();
    private List<Integer> Quantidade = new ArrayList<Integer>();
    private List<Float> ValorUnitario = new ArrayList<Float>();
    
    String sql;
    ResultSet resultado;
    
    //--------------------------------------------------------//
    
    public void LimparItensComprados(){
        this.IDItemComprado.clear();
        this.IDProduto.clear();
        this.Quantidade.clear();
        this.ValorUnitario.clear();
    }
    
    //--------------------------------------------------------//

    public List<Integer> getIDItemComprado() {
        return IDItemComprado;
    }

    public void setIDItemComprado(int IDItemComprado) {
        this.IDItemComprado.add(IDItemComprado);
    }

    public List<Integer> getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto.add(IDProduto);
    }

    public List<Integer> getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade.add(Quantidade);
    }

    public List<Float> getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario.add(ValorUnitario);
    }
    
}
