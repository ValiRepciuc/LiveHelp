package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.RatingParam;
import ro.intership.livehelp.model.oto.RatingTichetOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface RatingTichetOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract RatingTichetOto selectRating(@Param("id") int id);
	
	abstract ArrayList<RatingTichetOto> selectRatingAsArray(@Param("ratingParam") RatingParam ratingParam, @Param("order") String order);

}
