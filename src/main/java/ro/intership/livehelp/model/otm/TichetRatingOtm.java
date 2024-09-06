package ro.intership.livehelp.model.otm;

import java.util.ArrayList;
import ro.intership.livehelp.model.Rating;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class TichetRatingOtm {
	
	private Integer id;	
	private Integer id_categorie;	
	private ArrayList<Rating> rating;	

// getters
	public Integer getId() {
		return id;
	}
	public Integer getId_categorie() {
		return id_categorie;
	}

	public ArrayList<Rating> getRating() {
		return rating;
	}
		
// setters
	public void setId(Integer id) {
		this.id = id;
	}
	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}
	public void setRating(ArrayList<Rating> rating) {
		this.rating = rating;
	} 		
}

