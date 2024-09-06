package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.RolParam;
import ro.intership.livehelp.model.oto.RolUtilizatorOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface RolUtilizatorOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract RolUtilizatorOto selectRol(@Param("id") int id);
	
	abstract ArrayList<RolUtilizatorOto> selectRolAsArray(@Param("rolParam") RolParam rolParam, @Param("order") String order);

}
