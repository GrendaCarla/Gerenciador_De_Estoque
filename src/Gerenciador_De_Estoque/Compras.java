package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Compras {
    // lembrar de deixar privado depois
    private int IDCompra;
    private int IDFornecedor;
    private String DataHoraDaCompra;
    private float ValorTotal;
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    String sql;
    ResultSet resultado;
    
    //-------------------------------------------------------//
    
    void CadastrarCompras()throws SQLException{
        sql = "INSERT INTO Compras (IDFornecedor, DataHoraDaCompra, ValorTotal, NotaFiscal) VALUES(" + getIDFornecedor() +  ", " + getDataHoraDaCompra() + ", " + getValorTotal() + ") ";
           
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
    }
    
    void AtualizarProdutos(){
        
    }
    
    void ConsultarCompras(){
        
    }
    
    void ConsultarComprasPorFornecedor(){
        
    }
    
    void ConsultarComprasPorPeriodo(){
        
    }
    
    void ConsultarComprasPorProduto(){
        
    }
    
    //-----------------------------------------------------//

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

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
