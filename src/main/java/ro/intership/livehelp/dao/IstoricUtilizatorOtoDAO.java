package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.IstoricParam;
import ro.intership.livehelp.model.oto.IstoricUtilizatorOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface IstoricUtilizatorOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract IstoricUtilizatorOto selectIstoric(@Param("id") int id);
	
	abstract ArrayList<IstoricUtilizatorOto> selectIstoricAsArray(@Param("istoricParam") IstoricParam istoricParam, @Param("order") String order);

}
