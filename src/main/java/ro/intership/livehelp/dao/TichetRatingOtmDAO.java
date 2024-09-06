package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.TichetParam;
import ro.intership.livehelp.model.otm.TichetRatingOtm;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface TichetRatingOtmDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract TichetRatingOtm selectTichet(@Param("id") int id);
	
	abstract ArrayList<TichetRatingOtm> selectTichetAsArray(@Param("tichetParam") TichetParam tichetParam, @Param("order") String order);

}
