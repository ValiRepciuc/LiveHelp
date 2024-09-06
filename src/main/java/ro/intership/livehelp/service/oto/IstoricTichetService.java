package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.IstoricParam;
import ro.intership.livehelp.model.oto.IstoricTichetOto;
import ro.intership.livehelp.dao.IstoricTichetOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class IstoricTichetService {
	
	
	@Autowired
	IstoricTichetOtoDAO istoricTichetOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public IstoricTichetOto selectIstoric(int id){
		return istoricTichetOtoDAO.selectIstoric(id);
	}
	
	public ArrayList<IstoricTichetOto> selectIstoricAsArray(IstoricParam istoricParam, String order){
		return istoricTichetOtoDAO.selectIstoricAsArray(istoricParam, order);
	}	
	
}
