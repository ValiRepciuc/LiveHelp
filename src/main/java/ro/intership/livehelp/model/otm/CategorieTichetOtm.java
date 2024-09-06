package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Tichet;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class CategorieTichetOtm {
	
	private Integer id;	
	private String nume;	
	private ArrayList<Tichet> tichet;	

// getters
	public Integer getId() {
		return id;
	}
	public String getNume() {
		return nume;
	}

	public ArrayList<Tichet> getTichet() {
		return tichet;
	}
		
// setters
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setTichet(ArrayList<Tichet> tichet) {
		this.tichet = tichet;
	} 		
}

