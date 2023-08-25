import java.sql.*;

public class BancoDeDados {
	static String url = "jdbc:mysql://localhost:3306/pfgdhaabd";
	static String user = "root";
	static String pass = "#Wiccan13#";
	static Connection conexao = null;
	
	public BancoDeDados() {
		if(conexao==null) conecta();
	}
		
	public static boolean conecta() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			return true;
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}