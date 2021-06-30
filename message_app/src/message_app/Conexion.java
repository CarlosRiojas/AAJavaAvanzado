package message_app;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Conexion {
	public Connection get_connection() {
		 Connection conection = null;
		 
		 try {
			 connection ) DriverManager.getConnection("jdbc:mysql://localhost:3307/menaje")
		 }catch{}
	}
}
