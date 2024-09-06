package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.otm.TichetNotificareOtm;
import ro.intership.livehelp.dao.TichetNotificareOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class TichetNotificareService {
	
	
	@Autowired
	TichetNotificareOtmDAO   tichetNotificareOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public TichetNotificareOtm selectTichet(int id){
		return tichetNotificareOtmDAO.selectTichet(id);
	}
	
	public ArrayList<TichetNotificareOtm> selectTichetAsArray(TichetParam tichetParam, String order){
		return tichetNotificareOtmDAO.selectTichetAsArray(tichetParam, order);
	}	
	
}
