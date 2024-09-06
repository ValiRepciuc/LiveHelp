package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.RolParam;
import ro.intership.livehelp.model.oto.RolUtilizatorOto;
import ro.intership.livehelp.dao.RolUtilizatorOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class RolUtilizatorService {
	
	
	@Autowired
	RolUtilizatorOtoDAO rolUtilizatorOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public RolUtilizatorOto selectRol(int id){
		return rolUtilizatorOtoDAO.selectRol(id);
	}
	
	public ArrayList<RolUtilizatorOto> selectRolAsArray(RolParam rolParam, String order){
		return rolUtilizatorOtoDAO.selectRolAsArray(rolParam, order);
	}	
	
}
