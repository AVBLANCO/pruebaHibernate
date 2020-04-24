/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Pc-Victor
 */

@Entity
@Table (name = "usuario")
public class Usuario implements Serializable {
	
	@Id @GeneratedValue 
	@Column (name = "usuario")
	private String usuario;
	
	private String clave;
	
	private String nombre;
	
	private String telefono;
	
	private String direccion;
	
	private String correo;
	
	@ManyToOne
	@JoinColumn(name = "tipo")
	private Tipousuario tipousuario;
	
	@OneToOne (fetch = FetchType.LAZY, mappedBy = "usuario", 
			cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
	
	
	
	public void Usuario(){
		
	}
	
	public void Usuario(String usuario, String clave, String nombre, String telefono, 
			String direccion, String correo, Tipousuario tipousuario){
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.tipousuario = tipousuario;
			
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Tipousuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(Tipousuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	
	
	
	
	
}
