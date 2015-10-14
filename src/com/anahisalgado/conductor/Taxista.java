package com.anahisalgado.conductor;

import com.anahisalgado.vehiculo.Taxi;

public class Taxista extends Conductor {
	
	private int id;
	private static int idContador = 1;
	private Taxi taxi;
	
	public Taxista(String nombre, String tipoLicencia, Taxi taxi) {
		super(nombre, tipoLicencia);
		this.taxi = taxi;
		this.id = idContador;
		idContador++;
		//System.out.println(this.id);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}


	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}
	
	@Override
	public void mostrarVehiculo() {
		// TODO Auto-generated method stub
		super.mostrarVehiculo();
		System.out.println(" DAtos del Taxi");
		System.out.println(getTaxi().getMarca());
	}


}
