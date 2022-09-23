package com.mdf.ioc;

public class Jefe implements IEmpleado{
	
private ICreacionInforme informeNuevo;
	
	public void setinformeNuevo(ICreacionInforme _informeNuevo) {
		this.informeNuevo = _informeNuevo;
	}

	public String getTareas() {
		return "Mi tarea principal es supervisar los empleados";
	}

	public String getInforme() {
		return this.informeNuevo.getInforme();
	}

}
