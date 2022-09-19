package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection openConnection() throws Exception {

		//Nome do DRIVER JDBC para conexão com o banco de dados
		Class.forName("org.postgresql.Driver");

		//abrindo conexão com o banco de dados
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula04", "postgres", "coti");
		
	
	
	return connection;
	}
}
