package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    String serverName = "LAPTOP-7SC7R0SE";
    String portNumber = "1433";
    String banco = "db_Gerenciador_de_Estoque";
    //String url = "jdbc:jtds:sqlserver://LAPTOP-7SC7R0SE:1433/db_Gerenciador_de_Estoque";
    String url = "jdbc:jtds:sqlserver://" + serverName + ":" + portNumber + "/" + banco;
    String usuario = "Gerenciador_Generico";
    String senha = "EstoqueDeProduto1";
    String driverName = "net.sourceforge.jtds.jdbc.Driver";
    String sql;
    ResultSet resultado;
    
        
    public void inserir() {
        
        try {
            Class.forName(driverName);
            //Class.forName("net.sourceforge.jtds.jdbc.Driver"); // se der erro por causa disso vai em servidor/ banco de dados/ ve a parada q parece um circuito, vai em propriedades e ve a classe drive
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            // se der erro em inserir coisas na tabela ve se o usuario tem permisao pra isso
            
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(sql);
            conexao.close();
            
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
        }
    }
    
    public ResultSet retirar() {
        
        try {
            Class.forName(driverName);
            //Class.forName("net.sourceforge.jtds.jdbc.Driver"); // se der erro por causa disso vai em servidor/ banco de dados/ ve a parada q parece um circuito, vai em propriedades e ve a classe drive
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            // se der erro em inserir coisas na tabela ve se o usuario tem permisao pra isso
            
            Statement stmt = conexao.createStatement();
            resultado = stmt.executeQuery(sql);
            //conexao.close();
            
            return resultado;
            
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
        }
        
        return resultado;
    }
    
}
