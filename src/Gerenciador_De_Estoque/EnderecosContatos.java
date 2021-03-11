package Gerenciador_De_Estoque;

public abstract class EnderecosContatos {
    // lembrar de deixar privado depois
    int IDEndereco;
    String Pais;
    String Estado;
    String Cidade;
    String Bairro;
    String Rua;
    String Numero;
    //--------------------
    int IDContato;
    String Telefone1;
    String Telefone2;
    String Email1;
    String Email2;
    
    //-----------------------------------------

    public int getIDEndereco() {
        return IDEndereco;
    }

    public void setIDEndereco(int IDEndereco) {
        this.IDEndereco = IDEndereco;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    //------------------------------------------------------------
    
    public int getIDContato() {
        return IDContato;
    }

    public void setIDContato(int IDContato) {
        this.IDContato = IDContato;
    }

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String Email1) {
        this.Email1 = Email1;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }
    
    
    
    
}
