package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Istoric;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class TichetIstoricOtm {
	
	private Integer id;	
	private Integer id_categorie;	
	private ArrayList<Istoric> istoric;	

// getters
	public Integer getId() {
		return id;
	}
	public Integer getId_categorie() {
		return id_categorie;
	}

	public ArrayList<Istoric> getIstoric() {
		return istoric;
	}
		
// setters
	public void setId(Integer id) {
		this.id = id;
	}
	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}
	public void setIstoric(ArrayList<Istoric> istoric) {
		this.istoric = istoric;
	} 		
}

