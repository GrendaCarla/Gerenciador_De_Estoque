package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ItensVendidos {
    private int IDVenda;
    private ArrayList<Integer> IDItemVendido = new ArrayList<>();
    private ArrayList<Integer> IDProduto = new ArrayList<>();
    private ArrayList<Integer> Quantidade = new ArrayList<>();
    private ArrayList<Float> ValorUnitario = new ArrayList<>();
    
    
    String sql;
    ResultSet resultado;
    int i;
    
    //-----------------------------------------------//
    
    public void CadastrarItem()throws SQLException{
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select TOP 1 IDVenda FROM Vendas ORDER BY IDVenda DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            setIDVenda(resultado.getInt(1));
            break;
        }
        
        for(i = 0; i < getIDProduto().size(); i++){
            
            sql = "INSERT INTO ItensVendidos (IDVenda, IDProduto, Quantidade, ValorUnitario) VALUES(" + getIDVenda() +  ", " + getIDProduto().get(i) + ", " + getQuantidade().get(i)  + ", " + getValorUnitarioProduto().get(i)  + ") ";
            conect.sql = this.sql;
            conect.inserir();
        }
    }
    
    public void AlterarItem(){
        
    }
    
    public void ConsultarItem()throws SQLException{
        
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select * from ItensVendidos c\n"
        + "where IDVenda = " + getIDVenda();
        
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDItemVendido(resultado.getInt(1));
            setIDProduto(resultado.getInt(3));
            setQuantidade(resultado.getInt(4));
            setValorUnitario(resultado.getFloat(5));
        }
    }
    
    //--------------------------------------------------//

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

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
    
    public ArrayList<Float> getValorUnitarioProduto() throws SQLException {
        
        setValorUnitarioProduto(getIDProduto().get(getIDProduto().size() - 1));
        return ValorUnitario;
    }
    
    public void setValorUnitarioProduto(int Idproduto) throws SQLException {
        Produtos produto = new Produtos();
        this.ValorUnitario.add(produto.PegarValorProduto(Idproduto));
    }

}
