package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private List<Integer> IDProduto  = new ArrayList<Integer>();
    private List<String> Nome = new ArrayList<String>();
    private List<String> Marca = new ArrayList<String>();
    private List<String> Medida = new ArrayList<String>();
    private List<Float> ValorVenda = new ArrayList<Float>();
    private List<Integer> Quantidade = new ArrayList<Integer>();
    private List<Integer> Ativo = new ArrayList<Integer>();
    private List<String> Descricao = new ArrayList<String>();
    
    String sql;
    ResultSet resultado;
    
    //------------------------------------------------//
    
    public void CadastrarProduto(String nome, String marca, String medida, float valorVenda, int quantidade, String descricao)throws SQLException{
        
        sql = "INSERT INTO Produtos (Nome, Marca, Medida, ValorVenda, Quantidade, Ativo, Descricao) VALUES('" + nome +  "', '" + marca + "', '" + medida + "', " + valorVenda + ", " + quantidade + ", 1, '" + descricao +"') ";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();
        
    }
    
    public void AlterarProduto(String nome, String marca, String medida, float valorVenda, int quantidade, String descricao, int ativo, int num)throws SQLException{
        
       sql = "UPDATE Produtos\n" + "SET Nome = '" + nome + "', Marca = '" + marca + "', Medida = '" + medida + "', ValorVenda = " + valorVenda + ", Quantidade = " + quantidade + ", Ativo = " + ativo + ", Descricao = '" + descricao + "'\n" + "WHERE IDProduto = " + getIDProduto().get(num) + "\n";
       
       ConnectionFactory conect = new ConnectionFactory();
       conect.sql = this.sql;
       conect.inserir();
    }
    
    public void ConsultarProdutos()throws SQLException{
        
        LimparProduto();
        
        sql = "select * from Produtos";
        
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
            setAtivo(resultado.getInt(7));
            setDescricao(resultado.getString(8));
            
        }
    }
    
    public float PegarValorProduto(int idProduto)throws SQLException{
        
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
    
    public void LimparProduto(){
       
        this.IDProduto.clear();
        this.Nome.clear();
        this.Marca.clear();
        this.Medida.clear();
        this.ValorVenda.clear();
        this.Quantidade.clear();
        this.Ativo.clear();
        this.Descricao.clear();
        
    }
    
    //-----------------------------------------------------//

    public List<Integer> getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto.add(IDProduto);
    }

    public List<String> getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome.add(Nome);
    }

    public List<String> getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca.add(Marca);
    }

    public List<String> getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida.add(Medida);
    }

    public List<Float> getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda.add(ValorVenda);
    }

    public List<Integer> getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade.add(Quantidade);
    }

    public List<Integer> getAtivo() {
        return Ativo;
    }

    public void setAtivo(int Ativo) {
        this.Ativo.add(Ativo);
    }

    public List<String> getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao.add(Descricao);
    }
    
    
    
}
