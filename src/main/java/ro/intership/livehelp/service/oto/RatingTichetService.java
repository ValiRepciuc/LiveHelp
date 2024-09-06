package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.RatingParam;
import ro.intership.livehelp.model.oto.RatingTichetOto;
import ro.intership.livehelp.dao.RatingTichetOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class RatingTichetService {
	
	
	@Autowired
	RatingTichetOtoDAO ratingTichetOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public RatingTichetOto selectRating(int id){
		return ratingTichetOtoDAO.selectRating(id);
	}
	
	public ArrayList<RatingTichetOto> selectRatingAsArray(RatingParam ratingParam, String order){
		return ratingTichetOtoDAO.selectRatingAsArray(ratingParam, order);
	}	
	
}
