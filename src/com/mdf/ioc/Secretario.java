package com.mdf.ioc;

public class Secretario implements IEmpleado {

	private ICreacionInforme informeNuevo;
	
	public void setinformeNuevo(ICreacionInforme _informeNuevo) {
		this.informeNuevo = _informeNuevo;
	}

	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	public String getInforme() {
		return this.informeNuevo.getInforme();
	}
	
}
