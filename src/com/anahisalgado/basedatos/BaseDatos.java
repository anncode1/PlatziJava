package com.anahisalgado.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
	
	private final String URL 		= "jdbc:mysql://localhost:3306/";
	private final String DB 			= "platzijava";
	private final String USUARIO		= "platzijava";
	private final String PASSWORD 	= "platzijava";
	
	public Connection conexion = null;
	
	public Connection conectar() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
			if (conexion != null) {
				System.out.println("La conexión se ejecutó exitosamente");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return conexion;
		}
	}
	
	public void desconectar() throws SQLException{
		conexion.close();
	}

}
