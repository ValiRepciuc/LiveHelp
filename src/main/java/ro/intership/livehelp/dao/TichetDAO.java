package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Tichet;
import ro.intership.livehelp.param.TichetParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface TichetDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Tichet> getAllTichet();
	abstract ArrayList<Tichet> getTichetByParam(@Param("tichetParam") TichetParam tichetParam);	
	abstract ArrayList<Tichet> getTichetByParamWithOrder(@Param("tichetParam") TichetParam tichetParam, @Param("order") String order);	
	abstract Tichet getTichetById(int id);
	
	// select LOV
	abstract ArrayList<Tichet> getTichetByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Tichet> getTichetById_categorieLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Tichet> getTichetByIdLovNullWithOrder(@Param("tichetParam") TichetParam tichetParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Tichet> getTichetById_categorieLovNullWithOrder(@Param("tichetParam") TichetParam tichetParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertTichet(Tichet tichet);	

	// update
	abstract void updateTichetByParam(@Param("tichetParam") TichetParam tichetParam, @Param("tichet") Tichet tichet);
	abstract void updateTichetExceptNullByParam(@Param("tichetParam") TichetParam tichetParam, @Param("tichet") Tichet tichet);
	abstract void updateTichetById(@Param("id") int id, @Param("tichet") Tichet tichet);
	abstract void updateTichetByIdWithNull(@Param("id") int id, @Param("tichet") Tichet tichet);
	
	
	// delete
	abstract void deleteTichetByParam(@Param("tichetParam") TichetParam tichetParam);
	abstract void deleteTichetById(int id);

}
