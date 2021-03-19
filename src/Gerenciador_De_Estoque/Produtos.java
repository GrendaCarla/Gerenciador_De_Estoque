package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Produtos {
    // lembrar de deixar privado depois
    private  int IDProduto;
    private  String Nome;
    private  String Marca;
    private  String Medida;
    private  float ValorVenda;
    private  int Quantidade;
    private  boolean Ativo;
    private  String Descricao;
     // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    String sql;
    ResultSet resultado;
    
    //------------------------------------------------//
    
    void CadastrarProduto()throws SQLException{
        
        sql = "INSERT INTO Produtos (Nome, Marca, Medida, ValorVenda, Quantidade, Ativo, Descricao) VALUES('" + getNome() +  "', '" + getMarca() + "', '" + getMedida() + "', " + getValorVenda() + ", " + getQuantidade() + ", " + (getAtivo() == true? 1 : 0) + ", '" + getDescricao()+"') ";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
    }
    
    void AlterarProduto()throws SQLException{
        
       sql = "UPDATE Produtos\n" + "SET Nome = '" + getNome() + "', Marca = '" + getMarca() + "', Medida = '" + getMedida() + "', ValorVenda = " + getValorVenda() + ", Quantidade = " + getQuantidade() + ", Ativo = " + (getAtivo() == true? 1 : 0) + ", Descricao = '" + getDescricao() + "'\n" + "WHERE IDProduto = " + getIDProduto() + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    void ConsultarProdutos()throws SQLException{
        
        sql = "select * from Produtos \n" + "where IDProduto = " + getIDProduto();
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        
        while (resultado.next()){
            
            setIDProduto(resultado.getInt(1));
            setNome(resultado.getString(2));
            setMarca(resultado.getString(3));
            setMedida(resultado.getString(4));
            setValorVenda(resultado.getFloat(5));
            setQuantidade(resultado.getInt(6));
            setAtivo(resultado.getBoolean(7));
            setDescricao(resultado.getString(8));
            
        }
    }
    
    float PegarValorProduto(int idProduto)throws SQLException{
        
        sql = "select ValorVenda from Produtos \n" + "where IDProduto = " + idProduto;
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        resultado = conect.retirar();
        float valor = 0; 
        
        while (resultado.next()){
            valor = resultado.getFloat(1);
        }
        
        return valor;
    }
    
    //-----------------------------------------------------//

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
}
