package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users") 
public class Usuario implements Serializable { 
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="nombresPersonalPNP")
	private String nombres;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE) 
	private Date createAt;
	 
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String jerarquia;
	private String grado;
	private String correoElectronico;
	private String unidad_division;
	private Integer CIP;
	
	@Column(nullable=true, name="num_DNI")
	private Integer DNI;
	
	@Column(nullable=true, name="num_Celular")
	private Integer celular;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nombres, String apellidoPaterno, String apellidoMaterno, String jerarquia, String grado,   
					String correoElectronico, int CIP, int DNI, int celular) 
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


	public void setId(Long id) {	this.id = id;	}	
	public void setNombres(String nombres) {	this.nombres = nombres;		}
	public void setApellidoPaterno(String apellidoPaterno) {	this.apellidoPaterno = apellidoPaterno;		}
	public void setApellidoMaterno(String apellidoMaterno) {	this.apellidoMaterno = apellidoMaterno;		}
	public void setGrado(String grado) {	this.grado = grado;		}
	public void setJerarquia(String jerarquia) {	this.jerarquia = jerarquia;		}
	public void setCorreoElectronico(String correoElectronico) {		this.correoElectronico = correoElectronico;		}
	public void setCIP(Integer CIP) {	this.CIP = CIP;		}
	public void setDNI(Integer DNI) {	this.DNI = DNI;		}
	public void setCelular(Integer celular) {	this.celular = celular;	 }
	public void setUnidad_division(String unidad_division) {	this.unidad_division = unidad_division;		}

	
	public Long getId() {		return id;		}
	public String getNombres() {  	return nombres;		}
	public String getApellidoPaterno() {	return apellidoPaterno;		}
	public String getApellidoMaterno() {	return apellidoMaterno;		}
	public String getGrado() {		return grado;	}
	public String getCorreoElectronico() {		return correoElectronico;		}	
	public double getCIP() {	return CIP;		}
	public double getDNI() {	return DNI;		}
	public double getCelular() {	return celular;		}
	public String getUnidad_division() {	return unidad_division;		}

	
	public String getNombresApellidos(double CIP) {		
		
		return (this.CIP == CIP) ? getNombres() + getApellidoPaterno() + getApellidoMaterno(): "Usuario no existe en la Base de Datos";  
			
	}
	
	
}
