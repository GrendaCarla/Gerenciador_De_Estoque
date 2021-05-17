package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class ItensVendidos {
    private ArrayList<Integer> IDItemVendido = new ArrayList<>();
    private ArrayList<Integer> IDProduto = new ArrayList<>();
    private ArrayList<Integer> Quantidade = new ArrayList<>();
    private ArrayList<Float> ValorUnitario = new ArrayList<>();
    
    
    String sql;
    ResultSet resultado;
    
    //-----------------------------------------------//
    
    public void LimparItensVendidos(){
        this.IDItemVendido.clear();
        this.IDProduto.clear();
        this.Quantidade.clear();
        this.ValorUnitario.clear();
    }
    
    //--------------------------------------------------//

    public ArrayList<Integer> getIDItemVendido() {
        return IDItemVendido;
    }

    public void setIDItemVendido(int IDItemVendido) {
        this.IDItemVendido.add(IDItemVendido);
    }

    public ArrayList<Integer> getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto.add(IDProduto);
    }

    public ArrayList<Integer> getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade.add(Quantidade);
    }

    public ArrayList<Float> getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario.add(ValorUnitario);
    }
}
