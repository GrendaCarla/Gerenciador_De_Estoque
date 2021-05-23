package Classes;

import Telas.TelaPrincipal;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        
        TelaPrincipal Janela = new TelaPrincipal();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        Janela.setSize(d.width + 8, d.height - 37);
        Janela.setResizable(false);
           
        Janela.show();
        
    }
    
}
