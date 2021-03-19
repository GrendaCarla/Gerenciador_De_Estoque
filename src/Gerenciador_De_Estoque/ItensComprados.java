package Gerenciador_De_Estoque;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ItensComprados {
    // lembrar de deixar privado depois
    private ArrayList<Integer> IDItemComprado = new ArrayList<>();
    private ArrayList<Integer> IDProduto = new ArrayList<>();
    private ArrayList<Integer> Quantidade = new ArrayList<>();
    private ArrayList<Float> ValorUnitario = new ArrayList<>();
    // um vetor com as informações q seram exibidas na pagina principal pro administrador escolher qual quer clicar
    String sql;
    ResultSet resultado;
    
    //-----------------------------------------------------//
    
    void CadastrarItem()throws SQLException{
        
        /*sql = "INSERT INTO ItensComprados (Pais, Estado, Cidade, Bairro, Rua, Numero) VALUES('" + getPais() +  "', '" + getEstado() + "', '" + getCidade() + "', '" + getBairro() + "', '" + getRua() + "', '" + getNumero() + "') "
              + "INSERT INTO Contatos (Telefone1, Telefone2, Email1, Email2) VALUES('" + getTelefone1() + "', '" + getTelefone2() + "', '" + getEmail1() + "', '" + getEmail2() + "')";
        
        ConnectionFactory conect = new ConnectionFactory();
        conect.sql = this.sql;
        conect.inserir();*/
        
    }
    
    void AlterarItem(){
        
    }
    
    void ConsultarItens(){
        
    }
    
    //--------------------------------------------------------//

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
