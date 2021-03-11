package Gerenciador_De_Estoque;

// extends de contatos é uma gambiarra para clientes e fornecedores extender de duas classes
public class Enderecos extends Contatos{
    // lembrar de deixar privado depois
    int IDEndereco;
    String Pais;
    String Estado;
    String Cidade;
    String Bairro;
    String Rua;
    String Numero;

    //---------------------------------------------------------//
    
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
    
    
    
}
