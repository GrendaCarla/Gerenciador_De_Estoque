package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Compras extends ItensComprados{
    // lembrar de deixar privado depois
    private int IDFornecedor;
    private String DataHoraDaCompra;
    private float ValorTotal;
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    int i;
    
    //-------------------------------------------------------//
    
    void CadastrarCompras()throws SQLException{
        
        for(i = 0; i < getValorUnitario().size(); i++){
            setValorTotal(getValorTotal()+  (getValorUnitario().get(i) * getQuantidade().get(i)));
        }
        
        sql = "INSERT INTO Compras (IDFornecedor, DataHoraDaCompra, ValorTotal) VALUES(" + getIDFornecedor() +  ", convert(datetime,'" + getDataHoraDaCompra() + "',103)"  + ", " + getValorTotal() + ") ";
           
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        CadastrarItem();
    }
    
    void AtualizarProdutos()throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
       for(i = 0; i < getIDProduto().size(); i++){
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
      
        
       
    }
    
    void ConsultarCompras()throws SQLException{
        
        /*sql = "select * from Compras \n" +
        "where IDCompra = " + getIDCompra();
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDCompra(resultado.getInt(1));
            setIDFornecedor(resultado.getInt(2));
            setDataHoraDaCompra(resultado.getString(3));
            setValorTotal(resultado.getFloat(4));
        }*/
    }
    
    void ConsultarComprasPorFornecedor(){
        
    }
     
    void ConsultarComprasPorPeriodo(){
        
    }
    
    void ConsultarComprasPorProduto(){
        
    }
    
    //-----------------------------------------------------//

    public int getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int IDFornecedor) {
        this.IDFornecedor = IDFornecedor;
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

}
