package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class ItensComprados {
    private ArrayList<ArrayList<Integer>> IDItemComprado = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> IDProduto = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Integer>> Quantidade = new ArrayList<ArrayList<Integer>>();
    private ArrayList<ArrayList<Float>> ValorUnitario = new ArrayList<ArrayList<Float>>();
    
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

    public ArrayList<ArrayList<Integer>> getIDItemComprado() {
        return IDItemComprado;
    }

    public void setIDItemComprado(int num, ArrayList<Integer> IDItemComprado) {
        this.IDItemComprado.add(num, IDItemComprado);
    }

    public ArrayList<ArrayList<Integer>> getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int num, ArrayList<Integer> IDProduto) {
        this.IDProduto.add(num, IDProduto);
    }

    public ArrayList<ArrayList<Integer>> getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int num, ArrayList<Integer> Quantidade) {
        this.Quantidade.add(num, Quantidade);
    }

    public ArrayList<ArrayList<Float>> getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(int num, ArrayList<Float> ValorUnitario) {
        this.ValorUnitario.add(num, ValorUnitario);
    }
    
}
