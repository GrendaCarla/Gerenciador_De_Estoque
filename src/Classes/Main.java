package Classes;

import Telas.TelaPrincipal;
import Telas.TelaCadastroBanco;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        
        boolean exists = (new File("../Gerenciador_De_Estoque/banco.txt")).exists();
        
        if (!exists) {
            TelaCadastroBanco banco = new TelaCadastroBanco();

            banco.setSize(Math.round(d.width/1.5f), Math.round(d.height/1.7f));
            banco.setLocationRelativeTo(null);
            banco.setResizable(false);

            banco.show();
        }else{
        
            TelaPrincipal Janela = new TelaPrincipal();

            Janela.setSize(d.width + 8, d.height - 37);
            Janela.setResizable(false);

            Janela.show();
        }
        
    }
    
}
