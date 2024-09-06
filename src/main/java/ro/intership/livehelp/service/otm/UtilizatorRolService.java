package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.UtilizatorParam;
import ro.intership.livehelp.model.otm.UtilizatorRolOtm;
import ro.intership.livehelp.dao.UtilizatorRolOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class UtilizatorRolService {
	
	
	@Autowired
	UtilizatorRolOtmDAO   utilizatorRolOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public UtilizatorRolOtm selectUtilizator(int id){
		return utilizatorRolOtmDAO.selectUtilizator(id);
	}
	
	public ArrayList<UtilizatorRolOtm> selectUtilizatorAsArray(UtilizatorParam utilizatorParam, String order){
		return utilizatorRolOtmDAO.selectUtilizatorAsArray(utilizatorParam, order);
	}	
	
}
