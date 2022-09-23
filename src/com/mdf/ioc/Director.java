package com.mdf.ioc;

public class Director implements IEmpleado {

	private ICreacionInforme informeNuevo;
		
	public Director(ICreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Mi tarea principal es supervisar la empresa";
	}
	
	public String getInforme() {
		return this.informeNuevo.getInforme();
	}
}
