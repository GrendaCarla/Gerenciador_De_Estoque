package Gerenciador_De_Estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    
    public static void main(String[] args) {
        
        String serverName = "LAPTOP-7SC7R0SE";
        String portNumber = "1433";
        String sid = "Teste";
        //String url = "jdbc:jtds:sqlserver://LAPTOP-7SC7R0SE:1433/Teste";
        String url = "jdbc:jtds:sqlserver://" + serverName + ":" + portNumber + "/" + sid;
        String usuario = "TestLogin";
        String senha = "senha";
        String driverName = "net.sourceforge.jtds.jdbc.Driver";
        
        try {
            Class.forName(driverName);
            //Class.forName("net.sourceforge.jtds.jdbc.Driver"); // se der erro por causa disso vai em servidor/ banco de dados/ ve a parada q parece um circuito, vai em propriedades e ve a classe drive
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("foi");
            // se der erro em inserir coisas na tabela ve se o usuario tem permisao pra isso
            
            /*
            //inserir dados
            Statement stmt = conexao.createStatement();
            String sql; // = "INSERT INTO Produto (IDProduto, Nome, Preco) VALUES(1, 'Desodorante', 12.50)";
            //stmt.executeUpdate(sql);
            
            // atualizar dado
            sql = "UPDATE Produto\n" + "SET Nome = 'Perfume'\n" + "WHERE Nome = 'Desodorante'";
            stmt.executeUpdate(sql);
            */
            
            Statement stmt = conexao.createStatement();
            String sql = 
            "CREATE TABLE Departamento"
            + "("
                    +"IDDepartamento smallint IDENTITY (1,1) NOT NULL,"
                    +"Nome varchar(60) NOT NULL,"
                    +"Ativo char (1) CHECK (Ativo ='S' OR Ativo ='N') DEFAULT ('S')  NOT NULL,"
                    +"Observacao varchar (1000) NULL,"

                    +"CONSTRAINT PK_IDDepartamento PRIMARY KEY (IDDepartamento)"
            +");";
            
            stmt.executeUpdate(sql);
            
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            System.out.println("nao foi1");
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            System.out.println("nao foi2");
            e.printStackTrace();
        }
    }
    
}
