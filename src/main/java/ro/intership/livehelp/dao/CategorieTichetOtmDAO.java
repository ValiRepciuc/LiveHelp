package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.CategorieParam;
import ro.intership.livehelp.model.otm.CategorieTichetOtm;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface CategorieTichetOtmDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract CategorieTichetOtm selectCategorie(@Param("id") int id);
	
	abstract ArrayList<CategorieTichetOtm> selectCategorieAsArray(@Param("categorieParam") CategorieParam categorieParam, @Param("order") String order);

}
