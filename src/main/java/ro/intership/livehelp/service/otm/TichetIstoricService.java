package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.otm.TichetIstoricOtm;
import ro.intership.livehelp.dao.TichetIstoricOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class TichetIstoricService {
	
	
	@Autowired
	TichetIstoricOtmDAO   tichetIstoricOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public TichetIstoricOtm selectTichet(int id){
		return tichetIstoricOtmDAO.selectTichet(id);
	}
	
	public ArrayList<TichetIstoricOtm> selectTichetAsArray(TichetParam tichetParam, String order){
		return tichetIstoricOtmDAO.selectTichetAsArray(tichetParam, order);
	}	
	
}
