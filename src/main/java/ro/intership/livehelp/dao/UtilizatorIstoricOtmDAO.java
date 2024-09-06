package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.UtilizatorParam;
import ro.intership.livehelp.model.otm.UtilizatorIstoricOtm;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface UtilizatorIstoricOtmDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract UtilizatorIstoricOtm selectUtilizator(@Param("id") int id);
	
	abstract ArrayList<UtilizatorIstoricOtm> selectUtilizatorAsArray(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("order") String order);

}
