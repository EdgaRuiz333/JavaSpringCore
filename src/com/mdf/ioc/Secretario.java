package com.mdf.ioc;

public class Secretario implements IEmpleado {

	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	public String getInforme() {
		return null;
	}
	
}
