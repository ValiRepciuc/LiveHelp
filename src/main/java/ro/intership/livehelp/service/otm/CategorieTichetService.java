package ro.intership.livehelp.service.otm;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.CategorieParam;
import ro.intership.livehelp.model.otm.CategorieTichetOtm;
import ro.intership.livehelp.dao.CategorieTichetOtmDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class CategorieTichetService {
	
	
	@Autowired
	CategorieTichetOtmDAO   categorieTichetOtmDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public CategorieTichetOtm selectCategorie(int id){
		return categorieTichetOtmDAO.selectCategorie(id);
	}
	
	public ArrayList<CategorieTichetOtm> selectCategorieAsArray(CategorieParam categorieParam, String order){
		return categorieTichetOtmDAO.selectCategorieAsArray(categorieParam, order);
	}	
	
}
