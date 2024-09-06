package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.IstoricParam;
import ro.intership.livehelp.model.oto.IstoricTichetOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface IstoricTichetOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract IstoricTichetOto selectIstoric(@Param("id") int id);
	
	abstract ArrayList<IstoricTichetOto> selectIstoricAsArray(@Param("istoricParam") IstoricParam istoricParam, @Param("order") String order);

}
