package com.example.demo.models;

public class Usuario {

	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String grado;
	private String correoElectronico;
	private double CIP;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nombres, String apellidoPaterno, String apellidoMaterno, String grado, String correoElectronico, double cIP) {
		super();
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.grado = grado;
		this.correoElectronico = correoElectronico;
		CIP = cIP;
	}
	
	
		
	@Override
	public String toString() {
		return "Usuario ["
				+ "nombres=" + nombres + ", "
				+ "apellidoPaterno=" + apellidoPaterno + ", "
				+ "apellidoMaterno=" + apellidoMaterno + ", "
				+ "grado=" + grado + ", "
				+ "correoElectronico=" + correoElectronico + ", "
				+ "CIP=" + CIP 
				+ "]";
	}

	public void setNombres(String nombres) {	this.nombres = nombres;		}
	public void setApellidoPaterno(String apellidoPaterno) {	this.apellidoPaterno = apellidoPaterno;		}
	public void setApellidoMaterno(String apellidoMaterno) {	this.apellidoMaterno = apellidoMaterno;		}
	public void setGrado(String grado) {	this.grado = grado;		}
	public void setCorreoElectronico(String correoElectronico) {		this.correoElectronico = correoElectronico;		}
	public void setCIP(double CIP) {	this.CIP = CIP;		}
	
	public String getNombres() {  	return nombres;		}
	public String getApellidoPaterno() {	return apellidoPaterno;		}
	public String getApellidoMaterno() {	return apellidoMaterno;		}
	public String getGrado() {		return grado;	}
	public String getCorreoElectronico() {		return correoElectronico;		}	
	public double getCIP() {	return CIP;		}
	
	
	public String getNombresApellidos(double CIP) {		
		
		return (this.CIP == CIP) ? getNombres() + getApellidoPaterno() + getApellidoMaterno(): "Usuario no existe en la Base de Datos";  
			
	}
	
	
}
