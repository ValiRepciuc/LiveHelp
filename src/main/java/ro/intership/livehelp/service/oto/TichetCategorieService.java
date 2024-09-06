package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.oto.TichetCategorieOto;
import ro.intership.livehelp.dao.TichetCategorieOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class TichetCategorieService {
	
	
	@Autowired
	TichetCategorieOtoDAO tichetCategorieOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public TichetCategorieOto selectTichet(int id){
		return tichetCategorieOtoDAO.selectTichet(id);
	}
	
	public ArrayList<TichetCategorieOto> selectTichetAsArray(TichetParam tichetParam, String order){
		return tichetCategorieOtoDAO.selectTichetAsArray(tichetParam, order);
	}	
	
}
