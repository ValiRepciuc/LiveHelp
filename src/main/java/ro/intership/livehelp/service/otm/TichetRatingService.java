package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.otm.TichetRatingOtm;
import ro.intership.livehelp.dao.TichetRatingOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class TichetRatingService {
	
	
	@Autowired
	TichetRatingOtmDAO   tichetRatingOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public TichetRatingOtm selectTichet(int id){
		return tichetRatingOtmDAO.selectTichet(id);
	}
	
	public ArrayList<TichetRatingOtm> selectTichetAsArray(TichetParam tichetParam, String order){
		return tichetRatingOtmDAO.selectTichetAsArray(tichetParam, order);
	}	
	
}
