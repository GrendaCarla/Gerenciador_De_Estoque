package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vendas extends ItensVendidos {
    private int IDCliente;
    private String DataHoraDaVenda;
    private float ValorTotal;
    private String FormaDePagamento;
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    int i;
    
    //-----------------------------------------------//
    
    public void CadastrarVendas()throws SQLException{
        for(i = 0; i < getIDProduto().size(); i++){
            getValorUnitarioProduto();
        }
        
        for(i = 0; i < getIDProduto().size(); i++){
            setValorTotal(getValorTotal()+ (getValorUnitario().get(i) * getQuantidade().get(i)));
        }
        
        sql = "INSERT INTO Vendas (IDCliente, DataHoraDaVenda, ValorTotal, FormaDePagamento) VALUES(" + getIDCliente() +  ", convert(datetime,'" + getDataHoraDaVenda() + "',103)"  + ", " + getValorTotal() + ", '" + getFormaDePagamento() + "') ";
           
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
        CadastrarItem();
    }
    
    public void AtualizarProdutos()throws SQLException{
        
       ConnectionFactory conect = new ConnectionFactory();
       
       for(i = 0; i < getIDProduto().size(); i++){
            sql = "select Quantidade FROM Produtos where IDProduto = " + getIDProduto().get(i);
            conect.sql = this.sql;
            resultado = conect.retirar();
            int valor = 0;
                    
            while (resultado.next()){
                valor = resultado.getInt(1);
            }
            
            sql = "UPDATE Produtos\n" + "SET Quantidade = " + (valor - getQuantidade().get(i)) + "\n" + "WHERE IDProduto = " + getIDProduto().get(i) + "\n";
            conect.sql = this.sql;
            conect.inserir();
       }
    }
    
    public void ConsultarVendas()throws SQLException{
        sql = "select * from Vendas c\n"
        + "where IDVenda = " + getIDVenda();
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDCliente(resultado.getInt(2));
            setDataHoraDaVenda(resultado.getString(3));
            setValorTotal(resultado.getFloat(4));
        }
            
        ConsultarItem();
    }
    
    public void ConsultarVendasPorPeriodo()throws SQLException{
        
    }
    
    //-----------------------------------------------//

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getDataHoraDaVenda() {
        return DataHoraDaVenda;
    }

    public void setDataHoraDaVenda(String DataHoraDaVenda) {
        this.DataHoraDaVenda = DataHoraDaVenda;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getFormaDePagamento() {
        return FormaDePagamento;
    }

    public void setFormaDePagamento(String FormaDePagamento) {
        this.FormaDePagamento = FormaDePagamento;
    }

    
    
}
