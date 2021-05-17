package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Vendas extends ItensVendidos {
    
    private List<Integer> IDVenda = new ArrayList<Integer>();
    private List<Integer> IDCliente = new ArrayList<Integer>();
    private List<String> DataHoraDaVenda = new ArrayList<String>();
    private List<Float> ValorTotal = new ArrayList<Float>();
    private List<String> FormaDePagamento = new ArrayList<String>();
    
    String sql;
    ResultSet resultado;
    
    //-----------------------------------------------//
    
    public int CadastrarVendas(int idCliente, String DataHoraDaVenda, float ValorTotal, String formaDePagamento)throws SQLException{
 
        sql = "INSERT INTO Vendas (IDCliente, DataHoraDaVenda, ValorTotal, FormaDePagamento) VALUES(" + idCliente +  ", " + DataHoraDaVenda + ", " + ValorTotal+ ", '" +  formaDePagamento +"') ";
           
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        sql = "select TOP 1 IDVenda FROM Vendas ORDER BY IDVenda DESC";
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        resultado.next();
        return resultado.getInt(1);
         
    }
    
    public void CadastrarItem(int idVenda, int idProduto, int quantidade, float valorUnitario)throws SQLException{

        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "INSERT INTO ItensVendidos (IDVenda, IDProduto, Quantidade, ValorUnitario) VALUES(" + idVenda +  ", " + idProduto + ", " + quantidade  + ", " + valorUnitario  + ") ";
        conect.sql = this.sql;
        conect.inserir();
        
    }
    
    public void AtualizarVenda(int idVenda, int idCliente, String dataHoraDaVenda , float valorTotal, String formaDePagamento)throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
        sql = "UPDATE Vendas\n" + "SET IDCliente = " + idCliente + ", DataHoraDaVenda = " + dataHoraDaVenda + ", ValorTotal = " + valorTotal + ", FormaDePagamento = " + formaDePagamento + "\n" + "WHERE IDVenda = " + idVenda + "\n";
        conect.sql = this.sql;
        conect.inserir();
       
    }
    

    public void ConsultarVendas()throws SQLException{
        
        sql = "select * from Vendas";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDVenda(resultado.getInt(1));
            setIDCliente(resultado.getInt(2));
            setDataHoraDaVenda(resultado.getString(3));
            setValorTotal(resultado.getFloat(4));
            setFormaDePagamento(resultado.getString(5));
        }
        
    }
    
    public void ConsultarItem(int idVenda)throws SQLException{
        
        ConnectionFactory conect = new ConnectionFactory();
        
        sql = "select * from ItensVendidos c\n"
        + "where IDVenda = " + idVenda;
        
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDItemVendido(resultado.getInt(1));
            setIDProduto(resultado.getInt(3));
            setQuantidade(resultado.getInt(4));
            setValorUnitario(resultado.getFloat(5));
        }
    }
    
    public void DeletarItem(int idVenda)throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
        sql = "DELETE FROM ItensVendidos \n" + "WHERE IDCompra = " + idVenda + "\n";
        
        conect.sql = this.sql;
        conect.inserir();
       
    }
  
    public void LimparVenda(){
       
        this.IDVenda.clear();
        this.IDCliente.clear();
        this.DataHoraDaVenda.clear();
        this.ValorTotal.clear();
        this.FormaDePagamento.clear();
        
        LimparItensVendidos();
    }
    
    //-----------------------------------------------//

    public List<Integer> getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int idVenda) {
        this.IDVenda.add(idVenda);
    }
    
    public List<Integer> getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int idCliente) {
        this.IDCliente.add(idCliente);
    }
    
    public List<String> getDataHoraDaVenda() {
        return DataHoraDaVenda;
    }

    public void setDataHoraDaVenda(String dataHoraDaVenda) {
        this.DataHoraDaVenda.add(dataHoraDaVenda);
    }

    public List<Float> getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.ValorTotal.add(valorTotal);
    }

    public List<String> getFormaDePagamento() {
        return FormaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.FormaDePagamento.add(formaDePagamento);
    }

    
    
}
