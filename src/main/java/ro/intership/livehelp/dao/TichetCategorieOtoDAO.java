package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.oto.TichetCategorieOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface TichetCategorieOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract TichetCategorieOto selectTichet(@Param("id") int id);
	
	abstract ArrayList<TichetCategorieOto> selectTichetAsArray(@Param("tichetParam") TichetParam tichetParam, @Param("order") String order);

}
