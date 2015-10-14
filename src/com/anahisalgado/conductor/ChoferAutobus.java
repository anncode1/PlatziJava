package com.anahisalgado.conductor;

import com.anahisalgado.vehiculo.Bus;

public class ChoferAutobus extends Conductor{
	
	private Bus bus;

	public ChoferAutobus(String nombre, String tipoLicencia, Bus bus) {
		super(nombre, tipoLicencia);
		this.bus = bus;
		// TODO Auto-generated constructor stub
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
