package com.example.demo.models;

public class Usuario {

	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String jerarquia;
	private String grado;
	private String correoElectronico;
	private double CIP;
	private double DNI;
	private double celular;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nombres, String apellidoPaterno, String apellidoMaterno, String jerarquia, String grado,   
					String correoElectronico, double CIP, double DNI, double celular) 
	{
		super();
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.jerarquia = jerarquia;
		this.grado = grado;
		this.correoElectronico = correoElectronico;
		this.CIP = CIP;
		this.DNI = DNI;
		this.celular = celular; 
	}
	
	@Override
	public String toString() {
		return "Usuario [nombres=" + nombres + ", "
					   + "apellidoPaterno=" + apellidoPaterno + ", "
					   + "apellidoMaterno=" + apellidoMaterno + ","
					   + " jerarquia=" + jerarquia + ", "
					   + "grado=" + grado + ", "
					   + "correoElectronico=" + correoElectronico + ", "
					   + "CIP=" + CIP + ", "
					   + "DNI=" + DNI + ", "
					   + "celular=" + celular + "]";
	}

	public void setNombres(String nombres) {	this.nombres = nombres;		}
	public void setApellidoPaterno(String apellidoPaterno) {	this.apellidoPaterno = apellidoPaterno;		}
	public void setApellidoMaterno(String apellidoMaterno) {	this.apellidoMaterno = apellidoMaterno;		}
	public void setGrado(String grado) {	this.grado = grado;		}
	public void setJerarquia(String jerarquia) {	this.jerarquia = jerarquia;		}
	public void setCorreoElectronico(String correoElectronico) {		this.correoElectronico = correoElectronico;		}
	public void setCIP(double CIP) {	this.CIP = CIP;		}
	public void setDNI(double DNI) {	this.DNI = DNI;		}
	public void setCelular(double celular) {	this.celular = celular;	 }

	
	public String getNombres() {  	return nombres;		}
	public String getApellidoPaterno() {	return apellidoPaterno;		}
	public String getApellidoMaterno() {	return apellidoMaterno;		}
	public String getGrado() {		return grado;	}
	public String getCorreoElectronico() {		return correoElectronico;		}	
	public double getCIP() {	return CIP;		}
	public double getDNI() {	return DNI;		}
	public double getCelular() {	return celular;		}

	
	public String getNombresApellidos(double CIP) {		
		
		return (this.CIP == CIP) ? getNombres() + getApellidoPaterno() + getApellidoMaterno(): "Usuario no existe en la Base de Datos";  
			
	}
	
	
}
