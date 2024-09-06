package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.UtilizatorParam;
import ro.intership.livehelp.model.otm.UtilizatorNotificareOtm;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface UtilizatorNotificareOtmDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract UtilizatorNotificareOtm selectUtilizator(@Param("id") int id);
	
	abstract ArrayList<UtilizatorNotificareOtm> selectUtilizatorAsArray(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("order") String order);

}
