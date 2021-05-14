package Gerenciador_De_Estoque;

import Gerenciador_De_Estoque.Tela_Administrador.TelaAdministrador;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        
        TelaAdministrador Janela = new TelaAdministrador();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        Janela.setSize(d.width + 8, d.height - 37);
        Janela.setResizable(false);
           
        Janela.show();
        
    }
    
}
