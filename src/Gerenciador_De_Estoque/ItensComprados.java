package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ItensComprados {
    private int IDCompra;
    private ArrayList<Integer> IDItemComprado = new ArrayList<>();
    private ArrayList<Integer> IDProduto = new ArrayList<>();
    private ArrayList<Integer> Quantidade = new ArrayList<>();
    private ArrayList<Float> ValorUnitario = new ArrayList<>();
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    String sql;
    ResultSet resultado;
    int i;
    
    //-----------------------------------------------------//
    
    void CadastrarItem()throws SQLException{
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select TOP 1 IDCompra FROM Compras ORDER BY IDCompra DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            setIDCompra(resultado.getInt(1));
            break;
        }
        
        for(i = 0; i < getIDProduto().size(); i++){
            
            sql = "INSERT INTO ItensComprados (IDCompra, IDProduto, Quantidade, ValorUnitario) VALUES(" + getIDCompra() +  ", " + getIDProduto().get(i) + ", " + getQuantidade().get(i)  + ", " + getValorUnitario().get(i)  + ") ";
            conect.sql = this.sql;
            conect.inserir();
        }
    }
    
    void AlterarItem(){
        
        
    }
    
    void ConsultarItem()throws SQLException{
        
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select * from ItensComprados c\n"
        + "where IDCompra = " + getIDCompra();
        
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDItemComprado(resultado.getInt(1));
            setIDProduto(resultado.getInt(3));
            setQuantidade(resultado.getInt(4));
            setValorUnitario(resultado.getFloat(5));
        }
    }
    
    //--------------------------------------------------------//

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public ArrayList<Integer> getIDItemComprado() {
        return IDItemComprado;
    }

    public void setIDItemComprado(int IDItemComprado) {
        this.IDItemComprado.add(IDItemComprado);
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

    public void setValorUnitario( float ValorUnitario) {
        this.ValorUnitario.add(ValorUnitario);
    }
    
}
