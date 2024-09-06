package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Rol;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class UtilizatorRolOtm {
	
	private Integer id;	
	private String username;	
	private String parola;	
	private String email;	
	private String nume;	
	private String prenume;	
	private String telefon;	
	private ArrayList<Rol> rol;	

// getters
	public Integer getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getParola() {
		return parola;
	}
	public String getEmail() {
		return email;
	}
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public String getTelefon() {
		return telefon;
	}

	public ArrayList<Rol> getRol() {
		return rol;
	}
		
// setters
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setRol(ArrayList<Rol> rol) {
		this.rol = rol;
	} 		
}

