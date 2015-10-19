package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static final Conexion miConexion=new Conexion();
	public Connection conexion;
	private Conexion(){
		conexion=conectar();
		
	}
	
	public static Conexion getConexion(){		
		return miConexion;
	}
	
	
	public Connection conectar(){
		Connection conexion=null;
		String driver="org.postgresql.Driver";
		String nombreDb="singleton";
		String url="jdbc:postgresql://localhost:5432/"+nombreDb;		
		String user="desarrollo";
		String password="desarrollo";		
		try {
			conexion=DriverManager.getConnection(url, user, password);
			System.out.println("Conexion Exitosa!");
		} catch (SQLException e) {			
			System.out.println("ERROR AL CONECTAR: "+e);
			conexion=null;			
		}finally{
			return conexion;
		}
		
		
		
		
	}
	
	

}
