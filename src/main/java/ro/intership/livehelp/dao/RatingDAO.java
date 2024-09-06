package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Rating;
import ro.intership.livehelp.param.RatingParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface RatingDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Rating> getAllRating();
	abstract ArrayList<Rating> getRatingByParam(@Param("ratingParam") RatingParam ratingParam);	
	abstract ArrayList<Rating> getRatingByParamWithOrder(@Param("ratingParam") RatingParam ratingParam, @Param("order") String order);	
	abstract Rating getRatingById(int id);
	
	// select LOV
	abstract ArrayList<Rating> getRatingByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Rating> getRatingById_tichetLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Rating> getRatingByValoareLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Rating> getRatingByIdLovNullWithOrder(@Param("ratingParam") RatingParam ratingParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Rating> getRatingById_tichetLovNullWithOrder(@Param("ratingParam") RatingParam ratingParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Rating> getRatingByValoareLovNullWithOrder(@Param("ratingParam") RatingParam ratingParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertRating(Rating rating);	

	// update
	abstract void updateRatingByParam(@Param("ratingParam") RatingParam ratingParam, @Param("rating") Rating rating);
	abstract void updateRatingExceptNullByParam(@Param("ratingParam") RatingParam ratingParam, @Param("rating") Rating rating);
	abstract void updateRatingById(@Param("id") int id, @Param("rating") Rating rating);
	abstract void updateRatingByIdWithNull(@Param("id") int id, @Param("rating") Rating rating);
	
	
	// delete
	abstract void deleteRatingByParam(@Param("ratingParam") RatingParam ratingParam);
	abstract void deleteRatingById(int id);

}
