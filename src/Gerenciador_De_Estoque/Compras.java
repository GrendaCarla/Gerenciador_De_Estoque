package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Compras extends ItensComprados{
    
    private List<Integer> IDCompra = new ArrayList<Integer>();
    private List<Integer> IDFornecedor = new ArrayList<Integer>();
    private List<String> DataHoraDaCompra = new ArrayList<String>();
    private List<Float> ValorTotal = new ArrayList<Float>();
    
    String sql;
    ResultSet resultado;
    
    //-------------------------------------------------------//
    
    public void CadastrarCompras(int idFornecedor, String DataHoraDaCompra, float ValorTotal)throws SQLException{
                
        sql = "INSERT INTO Compras (IDFornecedor, DataHoraDaCompra, ValorTotal) VALUES(" + idFornecedor +  ", " + DataHoraDaCompra + ", " + ValorTotal+ ") ";
           
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
    }
    
    public void CadastrarItem(int qntLinha, int idProduto, int quantidade, float valorUnitario)throws SQLException{
        int idCompra = 0;
        
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select TOP 1 IDCompra FROM Compras ORDER BY IDCompra DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            idCompra = resultado.getInt(1);
            break;
        }
        
        for(int i = 0; i < qntLinha; i++){
            
            sql = "INSERT INTO ItensComprados (IDCompra, IDProduto, Quantidade, ValorUnitario) VALUES(" + idCompra +  ", " + idProduto + ", " + quantidade  + ", " + valorUnitario  + ") ";
            conect.sql = this.sql;
            conect.inserir();
        }
    }
    
    /*public void AtualizarProdutos()throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
       for(int i = 0; i < getIDProduto().size(); i++){
            sql = "select Quantidade FROM Produtos where IDProduto = " + getIDProduto().get(i);
            conect.sql = this.sql;
            resultado = conect.retirar();
            int valor = 0;
                    
            while (resultado.next()){
                valor = resultado.getInt(1);
            }
            
            sql = "UPDATE Produtos\n" + "SET Quantidade = " + (getQuantidade().get(i) + valor) + "\n" + "WHERE IDProduto = " + getIDProduto().get(i) + "\n";
            conect.sql = this.sql;
            conect.inserir();
       }
    }*/
    
    public void ConsultarCompras()throws SQLException{
        
        sql = "select * from Compras";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDCompra(resultado.getInt(1));
            setIDFornecedor(resultado.getInt(2));
            setDataHoraDaCompra(resultado.getString(3));
            setValorTotal(resultado.getFloat(4));
        }
        
        //ConsultarItem();
    }
  
    public void LimparCompra(){
       
        this.IDCompra.clear();
        this.IDFornecedor.clear();
        this.DataHoraDaCompra.clear();
        this.ValorTotal.clear();
        
        LimparItensComprados();
    }
    
    
     
    /*public void ConsultarItem(int idCompra)throws SQLException{
        
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select * from ItensComprados c\n"
        + "where IDCompra = " + idCompra;
        
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDItemComprado(resultado.getInt(1));
            setIDProduto(resultado.getInt(3));
            setQuantidade(resultado.getInt(4));
            setValorUnitario(resultado.getFloat(5));
        }
    }*/
    
    
    //-----------------------------------------------------//

    public List<Integer> getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int idCompra) {
        this.IDCompra.add(idCompra);
    }
    
    public List<Integer> getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int idFornecedor) {
        this.IDFornecedor.add(idFornecedor);
    }
    
    public List<String> getDataHoraDaCompra() {
        return DataHoraDaCompra;
    }

    public void setDataHoraDaCompra(String dataHoraDaCompra) {
        this.DataHoraDaCompra.add(dataHoraDaCompra);
    }

    public List<Float> getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.ValorTotal.add(valorTotal);
    }

}
