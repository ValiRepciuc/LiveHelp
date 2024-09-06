package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Notificare;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class UtilizatorNotificareOtm {
	
	private Integer id;	
	private String username;	
	private String parola;	
	private String email;	
	private String nume;	
	private String prenume;	
	private String telefon;	
	private ArrayList<Notificare> notificare;	

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

	public ArrayList<Notificare> getNotificare() {
		return notificare;
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
	public void setNotificare(ArrayList<Notificare> notificare) {
		this.notificare = notificare;
	} 		
}

