package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.UtilizatorParam;
import ro.intership.livehelp.model.otm.UtilizatorIstoricOtm;
import ro.intership.livehelp.dao.UtilizatorIstoricOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class UtilizatorIstoricService {
	
	
	@Autowired
	UtilizatorIstoricOtmDAO   utilizatorIstoricOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public UtilizatorIstoricOtm selectUtilizator(int id){
		return utilizatorIstoricOtmDAO.selectUtilizator(id);
	}
	
	public ArrayList<UtilizatorIstoricOtm> selectUtilizatorAsArray(UtilizatorParam utilizatorParam, String order){
		return utilizatorIstoricOtmDAO.selectUtilizatorAsArray(utilizatorParam, order);
	}	
	
}
