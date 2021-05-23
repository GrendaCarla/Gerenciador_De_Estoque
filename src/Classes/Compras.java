package Classes;

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
    
    public int CadastrarCompras(int idFornecedor, String DataHoraDaCompra, float ValorTotal)throws SQLException{
 
        sql = "INSERT INTO Compras (IDFornecedor, DataHoraDaCompra, ValorTotal) VALUES(" + idFornecedor +  ", " + DataHoraDaCompra + ", " + ValorTotal+ ") ";
           
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        sql = "select TOP 1 IDCompra FROM Compras ORDER BY IDCompra DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        resultado.next();
        return resultado.getInt(1);
         
    }
    
    public void CadastrarItem(int idCompra, int idProduto, int quantidade, float valorUnitario)throws SQLException{

        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "INSERT INTO ItensComprados (IDCompra, IDProduto, Quantidade, ValorUnitario) VALUES(" + idCompra +  ", " + idProduto + ", " + quantidade  + ", " + valorUnitario  + ") ";
        conect.sql = this.sql;
        conect.inserir();
        
    }
    
    public void AtualizarCompra(int idCompra, int idFornecedor, String dataHoraDaCompra , float valorTotal)throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
        sql = "UPDATE Compras\n" + "SET IDFornecedor = " + idFornecedor + ", DataHoraDaCompra = " + dataHoraDaCompra + ", ValorTotal = " + valorTotal + "\n" + "WHERE IDCompra = " + idCompra + "\n";
        conect.sql = this.sql;
        conect.inserir();
       
    }
    

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
        
    }
    
    public void ConsultarItem(int idCompra)throws SQLException{
        
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
    }
    
    public void DeletarItem(int idCompra)throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
        sql = "DELETE FROM ItensComprados \n" + "WHERE IDCompra = " + idCompra + "\n";
        
        conect.sql = this.sql;
        conect.inserir();
       
    }
  
    public void LimparCompra(){
       
        this.IDCompra.clear();
        this.IDFornecedor.clear();
        this.DataHoraDaCompra.clear();
        this.ValorTotal.clear();
        
        LimparItensComprados();
    }
    
    
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
