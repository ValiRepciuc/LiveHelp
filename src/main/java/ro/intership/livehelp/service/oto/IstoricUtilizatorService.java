package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.IstoricParam;
import ro.intership.livehelp.model.oto.IstoricUtilizatorOto;
import ro.intership.livehelp.dao.IstoricUtilizatorOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class IstoricUtilizatorService {
	
	
	@Autowired
	IstoricUtilizatorOtoDAO istoricUtilizatorOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public IstoricUtilizatorOto selectIstoric(int id){
		return istoricUtilizatorOtoDAO.selectIstoric(id);
	}
	
	public ArrayList<IstoricUtilizatorOto> selectIstoricAsArray(IstoricParam istoricParam, String order){
		return istoricUtilizatorOtoDAO.selectIstoricAsArray(istoricParam, order);
	}	
	
}
