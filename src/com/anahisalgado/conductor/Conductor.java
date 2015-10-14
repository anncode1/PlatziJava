package com.anahisalgado.conductor;

public class Conductor {
	
	private int id;
	private String nombre;
	private String tipoLicencia;
	
	public Conductor(String nombre, String tipoLicencia) {
		super();
		this.nombre = nombre;
		this.tipoLicencia = tipoLicencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	
	public void mostrarVehiculo(){
		System.out.println("Datos Vehiculo");
	}
	
	

}
