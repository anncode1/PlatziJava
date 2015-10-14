package com.anahisalgado.vehiculo;

import java.sql.SQLException;
import java.sql.Statement;

import com.anahisalgado.basedatos.BaseDatos;


public class TaxiCRUD {

	private final String TIPO = "1";
	
	public void agregar(Taxi taxi) throws SQLException{
		String query = "";
		Statement sentencia = null;
		
		query = "INSERT INTO vehiculo "
				+ "(matricula, marca, modelo, anio, id_tipo_vehiculo) "
				+ "VALUES ('"+taxi.getMatricula()+"','"+taxi.getMarca()+"', '"+taxi.getModelo()+"', "
						+ "'"+taxi.getAnio()+"','"+TIPO+"')";
		BaseDatos baseDatos = new BaseDatos();
		sentencia = baseDatos.conectar().createStatement();
		
		if (sentencia.executeUpdate(query)  > 0) {
			System.out.println("El registro se insertó existosamente");
 		}else{
 			System.out.println("No se pudo insertar el registro");
 			System.out.println(query);
 		}
		
		baseDatos.desconectar();
		
	}
	
	public void editar(Taxi taxi){}
	
	public void eliminar(Taxi taxi){}

}
