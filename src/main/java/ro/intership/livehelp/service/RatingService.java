package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.RatingDAO;
import ro.intership.livehelp.model.Rating;
import ro.intership.livehelp.param.RatingParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class RatingService {


	@Autowired
	RatingDAO ratingDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Rating> getAllRating(){
		return ratingDAO.getAllRating();
	}
	public ArrayList<Rating> getRatingByParam(RatingParam ratingParam){
		return ratingDAO.getRatingByParam(ratingParam);
	}
	public ArrayList<Rating> getRatingByParamWithOrder(RatingParam ratingParam, String order){
		return ratingDAO.getRatingByParamWithOrder(ratingParam, order);
	}		
	public Rating getRatingById(int id){
		return ratingDAO.getRatingById(id);
	}
	
	
	// select LOV
	public ArrayList<Rating> getRatingByIdLov(ArrayList<Integer> lov, String order){ 
		return ratingDAO.getRatingByIdLov(lov, order);  
	}

	public ArrayList<Rating> getRatingByIdLov(Integer[] lov, String order){ 
		return ratingDAO.getRatingByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Rating> getRatingById_tichetLov(ArrayList<Integer> lov, String order){ 
		return ratingDAO.getRatingById_tichetLov(lov, order);  
	}

	public ArrayList<Rating> getRatingById_tichetLov(Integer[] lov, String order){ 
		return ratingDAO.getRatingById_tichetLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Rating> getRatingByValoareLov(ArrayList<Integer> lov, String order){ 
		return ratingDAO.getRatingByValoareLov(lov, order);  
	}

	public ArrayList<Rating> getRatingByValoareLov(Integer[] lov, String order){ 
		return ratingDAO.getRatingByValoareLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Rating> getRatingByIdLovNullWithOrderA(RatingParam ratingParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return ratingDAO.getRatingByIdLovNullWithOrder(ratingParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rating> getRatingByIdLovNullWithOrder(RatingParam ratingParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return ratingDAO.getRatingByIdLovNullWithOrder(ratingParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Rating> getRatingById_tichetLovNullWithOrderA(RatingParam ratingParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return ratingDAO.getRatingById_tichetLovNullWithOrder(ratingParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rating> getRatingById_tichetLovNullWithOrder(RatingParam ratingParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return ratingDAO.getRatingById_tichetLovNullWithOrder(ratingParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Rating> getRatingByValoareLovNullWithOrderA(RatingParam ratingParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return ratingDAO.getRatingByValoareLovNullWithOrder(ratingParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rating> getRatingByValoareLovNullWithOrder(RatingParam ratingParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return ratingDAO.getRatingByValoareLovNullWithOrder(ratingParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertRating(Rating rating){
		return ratingDAO.insertRating(rating);
	}	

	// update
	public void updateRatingByParam(RatingParam ratingParam, Rating rating){
		ratingDAO.updateRatingByParam(ratingParam,  rating);
	}
	public void updateRatingExceptNullByParam(RatingParam ratingParam, Rating rating){
		ratingDAO.updateRatingExceptNullByParam(ratingParam,  rating);
	}
	public void updateRatingById(int id, Rating rating){
		ratingDAO.updateRatingById(id, rating);
	}
	public void updateRatingByIdWithNull(int id, Rating rating){
		ratingDAO.updateRatingById(id, rating);
	}
	
	
	// delete
	public void deleteRatingByParam(RatingParam ratingParam){
		ratingDAO.deleteRatingByParam(ratingParam);
	}
	public void deleteRatingById(int id){
		ratingDAO.deleteRatingById(id);
	}

}
