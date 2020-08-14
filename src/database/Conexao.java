package database;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

	private static Connection conexao;
	
	public Conexao() {
		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:/Users/Eliseu/Desktop/MoneyTracker/database/sqlite.db";
			
			conexao = DriverManager.getConnection(url);
			
		} catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
	}
	
	public static Connection getConexao()
    {
        return conexao;
       
    }
	
}
