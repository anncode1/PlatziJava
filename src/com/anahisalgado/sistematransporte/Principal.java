package com.anahisalgado.sistematransporte;

import java.sql.SQLException;

import com.anahisalgado.basedatos.BaseDatos;
import com.anahisalgado.vehiculo.Taxi;
import com.anahisalgado.vehiculo.TaxiCRUD;



public class Principal {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//BaseDatos baseDatos = new BaseDatos();
		//baseDatos.conectar();
		/*
		Taxi taxi = new Taxi("BBB456", "Chevrolet", "Aveo");
		taxi.setAnio(2015);
		
		TaxiCRUD taxiCRUD = new TaxiCRUD();
		taxiCRUD.agregar(taxi);*/
		
		int i=1; int j=2;int k=3; int m=2; System.out.println ((j >= i) || (k == m));
		int x = 1;  while (x <= 10)   System.out.println(++x);
	}

}
