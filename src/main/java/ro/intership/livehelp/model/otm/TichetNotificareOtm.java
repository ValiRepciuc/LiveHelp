package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Notificare;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class TichetNotificareOtm {
	
	private Integer id;	
	private Integer id_categorie;	
	private ArrayList<Notificare> notificare;	

// getters
	public Integer getId() {
		return id;
	}
	public Integer getId_categorie() {
		return id_categorie;
	}

	public ArrayList<Notificare> getNotificare() {
		return notificare;
	}
		
// setters
	public void setId(Integer id) {
		this.id = id;
	}
	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}
	public void setNotificare(ArrayList<Notificare> notificare) {
		this.notificare = notificare;
	} 		
}

