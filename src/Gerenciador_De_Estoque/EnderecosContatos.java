package Gerenciador_De_Estoque;

import java.util.ArrayList;
import java.util.List;

public abstract class EnderecosContatos {
    private List<Integer> IDEndereco = new ArrayList<Integer>();
    private List<String> Pais = new ArrayList<String>();
    private List<String> Estado = new ArrayList<String>();
    private List<String> Cidade = new ArrayList<String>();
    private List<String> Bairro = new ArrayList<String>();
    private List<String> Rua = new ArrayList<String>();
    private List<String> Numero = new ArrayList<String>();
    //--------------------
    private List<Integer> IDContato = new ArrayList<Integer>();
    private List<String> Telefone1 = new ArrayList<String>();
    private List<String> Telefone2 = new ArrayList<String>();
    private List<String> Email1 = new ArrayList<String>();
    private List<String> Email2 = new ArrayList<String>();
    
    //-----------------------------------------
    
    public void LimparEnderecosContatos(){
       
        this.IDEndereco.clear();
        this.Pais.clear();
        this.Estado.clear();
        this.Cidade.clear();
        this.Bairro.clear();
        this.Rua.clear();
        this.Numero.clear();
        //--------------------
        this.IDContato.clear();
        this.Telefone1.clear();
        this.Telefone2.clear();
        this.Email1.clear();
        this.Email2.clear();
    }
    
    //-----------------------------------------------

    public List<Integer> getIDEndereco() {
        return IDEndereco;
    }

    public void setIDEndereco(int IDEndereco) {
        this.IDEndereco.add(IDEndereco);
    }

    public List<String> getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais.add(Pais);
    }

    public List<String> getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado.add(Estado);
    }

    public List<String> getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade.add(Cidade);
    }

    public List<String> getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro.add(Bairro);
    }

    public List<String> getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua.add(Rua);
    }

    public List<String> getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero.add(Numero);
    }

    //------------------------------------------------------------
    
    public List<Integer> getIDContato() {
        return IDContato;
    }

    public void setIDContato(int IDContato) {
        this.IDContato.add(IDContato);
    }

    public List<String> getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1.add(Telefone1);
    }

    public List<String> getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2.add(Telefone2);
    }

    public List<String> getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1.add(Email1);
    }

    public List<String> getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2.add(Email2);
    }
    
}
