package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    String serverName;
    String portNumber; //= "1433";
    String banco;
    String url = "jdbc:jtds:sqlserver://" + serverName + ":" + portNumber + "/" + banco;
    String usuario;
    String senha;
    String driverName = "net.sourceforge.jtds.jdbc.Driver";
    String sql;
    ResultSet resultado;
    
    public void ConnectionFactory() throws IOException{
        FileReader arq = new FileReader("../Gerenciador_De_Estoque/banco.txt");
        BufferedReader lerArq = new BufferedReader(arq);

        serverName = lerArq.readLine(); 
        usuario = lerArq.readLine(); 
        senha = lerArq.readLine(); 
        portNumber = lerArq.readLine();
        banco = lerArq.readLine();

        url = "jdbc:jtds:sqlserver://" + serverName + ":" + portNumber + "/" + banco;


        arq.close();
    }
    
    public boolean testeDeConexao() {
        
        try {
            ConnectionFactory();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName(driverName);
            Connection conexao = DriverManager.getConnection("jdbc:jtds:sqlserver://" + serverName + ":" + portNumber, usuario, senha);
            
            return true;
            
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean criarBanco (String banco){
        
        try {
            ConnectionFactory();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName(driverName);
            Connection conexao = DriverManager.getConnection("jdbc:jtds:sqlserver://" + serverName + ":" + portNumber, usuario, senha);
            
            Statement s = conexao.createStatement();
            
            s.executeUpdate("create database " + banco);
            s.close();
            
            Class.forName(driverName);
            Connection conexao2 = DriverManager.getConnection(url, usuario, senha);
            
            Statement stmt = conexao2.createStatement();
            stmt.executeUpdate( "use " + banco + "\n" +
                "\n" +
                "create table Enderecos(\n" +
                "	IDEndereco int IDENTITY(1,1) primary key not null,\n" +
                "	Pais varchar(50) not null,\n" +
                "	Estado varchar(50) not null,\n" +
                "	Cidade varchar(50) not null,\n" +
                "	Bairro varchar(50) not null,\n" +
                "	Rua varchar(50) not null,\n" +
                "	Numero varchar(10) not null\n" +
                ");\n" +
                "\n" +
                "create table Contatos(\n" +
                "	IDContato int IDENTITY(1,1) primary key not null,\n" +
                "	Telefone1 varchar(22) not null,\n" +
                "	Telefone2 varchar(22) null,\n" +
                "	Email1 varchar(50) null,\n" +
                "	Email2 varchar(50) null,\n" +
                ");\n" +
                "\n" +
                "create table Fornecedores(\n" +
                "	IDFornecedor int IDENTITY(1,1) primary key not null,\n" +
                "	IDEndereco int not null,\n" +
                "	IDContato int not null,\n" +
                "	CNPJ varchar(14) not null,\n" +
                "	RazaoSocial varchar(50) not null,\n" +
                "	NomeFantasia varchar(50) not null,\n" +
                "\n" +
                "	CONSTRAINT fkEndereco FOREIGN KEY (IDEndereco) REFERENCES Enderecos (IDEndereco),\n" +
                "	CONSTRAINT fkContato FOREIGN KEY (IDContato) REFERENCES Contatos (IDContato)\n" +
                ");\n" +
                "\n" +
                "create table Clientes(\n" +
                "	IDCliente int IDENTITY(1,1) primary key not null,\n" +
                "	IDEndereco int not null,\n" +
                "	IDContato int not null,\n" +
                "	CPF varchar(11) not null,\n" +
                "	Nome varchar(70) not null,\n" +
                "	DataDeNascimento date not null,\n" +
                "\n" +
                "	CONSTRAINT fkEndereco2 FOREIGN KEY (IDEndereco) REFERENCES Enderecos (IDEndereco),\n" +
                "	CONSTRAINT fkContato2 FOREIGN KEY (IDContato) REFERENCES Contatos (IDContato)\n" +
                ");\n" +
                "\n" +
                "create table Compras(\n" +
                "	IDCompra int IDENTITY(1,1) primary key not null,\n" +
                "	IDFornecedor int not null,\n" +
                "	DataHoraDaCompra datetime not null,\n" +
                "	ValorTotal float not null,\n" +
                "\n" +
                "	CONSTRAINT fkFornecedor FOREIGN KEY (IDFornecedor) REFERENCES Fornecedores (IDFornecedor)\n" +
                ");\n" +
                "\n" +
                "create table Produtos(\n" +
                "	IDProduto int IDENTITY(1,1) primary key not null,\n" +
                "	Nome varchar(70) not null,\n" +
                "	Marca varchar(70) not null,\n" +
                "	Medida varchar(70) not null,\n" +
                "	ValorVenda float not null,\n" +
                "	Quantidade int not null,\n" +
                "	Ativo bit not null,\n" +
                "	Descricao varchar(150) null,\n" +
                "\n" +
                ");\n" +
                "\n" +
                "create table ItensComprados(\n" +
                "	IDItemComprado int IDENTITY(1,1) primary key not null,\n" +
                "	IDCompra int not null,\n" +
                "	IDProduto int not null,\n" +
                "	Quantidade int not null,\n" +
                "	ValorUnitario float not null,\n" +
                "\n" +
                "	CONSTRAINT fkCompra FOREIGN KEY (IDCompra) REFERENCES Compras (IDCompra),\n" +
                "	CONSTRAINT fkProduto FOREIGN KEY (IDProduto) REFERENCES Produtos (IDProduto)\n" +
                ");\n" +
                "\n" +
                "create table Vendas(\n" +
                "	IDVenda int IDENTITY(1,1) primary key not null,\n" +
                "	IDCliente int not null,\n" +
                "	DataHoraDaVenda datetime not null,\n" +
                "	ValorTotal float not null,\n" +
                "	FormaDePagamento varchar(50) not null,\n" +
                "\n" +
                "	CONSTRAINT fkCliente FOREIGN KEY (IDCliente) REFERENCES Clientes (IDCliente)\n" +
                ");\n" +
                "\n" +
                "create table ItensVendidos(\n" +
                "	IDItemVendido int IDENTITY(1,1) primary key not null,\n" +
                "	IDVenda int not null,\n" +
                "	IDProduto int not null,\n" +
                "	Quantidade int not null,\n" +
                "	ValorUnitario float not null,\n" +
                "\n" +
                "	CONSTRAINT fkVenda FOREIGN KEY (IDVenda) REFERENCES Vendas (IDVenda),\n" +
                "	CONSTRAINT fkProduto2 FOREIGN KEY (IDProduto) REFERENCES Produtos (IDProduto)\n" +
                ");\n" +
                "\n" +
                "\n" +
                "------------------------ anonimos -----------------------------------\n" +
                "\n" +
                "insert into Enderecos(Pais, Estado, Cidade, Bairro, Rua, Numero) values ('Fornecedor Anônimo', 'xxxx', 'xxxx', 'xxxx', 'xxxx', '0000');\n" +
                "\n" +
                "insert into Contatos(Telefone1, Telefone2, Email1, Email2) values ('+00 (00) 0 0000-0000', '+00 (00) 0 0000-0000', 'Fornecedor_Anonimo@gmail.com.br', 'xxxxxxxx@gmail.com.br');\n" +
                "\n" +
                "insert into Fornecedores(IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) values (1, 1, '00000000000000', 'Fornecedor Anônimo', 'xxxxxxxx');\n" +
                "\n" +
                "insert into Clientes( IDEndereco, IDContato, CPF, Nome, DataDeNascimento) values (1, 1, '00000000000', 'Cliente Anônimo', '2000-01-01');\n");
        
            conexao2.close();
            
            return true;
            
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
            
        }
        
        return false;
    }
    
        
    public void inserir(){
        
        try {
            ConnectionFactory();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName(driverName);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
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
            ConnectionFactory();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Class.forName(driverName);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            Statement stmt = conexao.createStatement();
            resultado = stmt.executeQuery(sql);
            
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
