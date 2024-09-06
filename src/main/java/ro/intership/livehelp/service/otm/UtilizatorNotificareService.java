package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.UtilizatorParam;
import ro.intership.livehelp.model.otm.UtilizatorNotificareOtm;
import ro.intership.livehelp.dao.UtilizatorNotificareOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class UtilizatorNotificareService {
	
	
	@Autowired
	UtilizatorNotificareOtmDAO   utilizatorNotificareOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public UtilizatorNotificareOtm selectUtilizator(int id){
		return utilizatorNotificareOtmDAO.selectUtilizator(id);
	}
	
	public ArrayList<UtilizatorNotificareOtm> selectUtilizatorAsArray(UtilizatorParam utilizatorParam, String order){
		return utilizatorNotificareOtmDAO.selectUtilizatorAsArray(utilizatorParam, order);
	}	
	
}
