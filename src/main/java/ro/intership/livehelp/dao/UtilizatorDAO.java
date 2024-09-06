package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Utilizator;
import ro.intership.livehelp.param.UtilizatorParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface UtilizatorDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Utilizator> getAllUtilizator();
	abstract ArrayList<Utilizator> getUtilizatorByParam(@Param("utilizatorParam") UtilizatorParam utilizatorParam);	
	abstract ArrayList<Utilizator> getUtilizatorByParamWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("order") String order);	
	abstract Utilizator getUtilizatorById(int id);
	
	// select LOV
	abstract ArrayList<Utilizator> getUtilizatorByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByUsernameLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByParolaLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByEmailLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByNumeLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByPrenumeLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Utilizator> getUtilizatorByTelefonLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Utilizator> getUtilizatorByIdLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByUsernameLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByParolaLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByEmailLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByNumeLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByPrenumeLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Utilizator> getUtilizatorByTelefonLovNullWithOrder(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertUtilizator(Utilizator utilizator);	

	// update
	abstract void updateUtilizatorByParam(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("utilizator") Utilizator utilizator);
	abstract void updateUtilizatorExceptNullByParam(@Param("utilizatorParam") UtilizatorParam utilizatorParam, @Param("utilizator") Utilizator utilizator);
	abstract void updateUtilizatorById(@Param("id") int id, @Param("utilizator") Utilizator utilizator);
	abstract void updateUtilizatorByIdWithNull(@Param("id") int id, @Param("utilizator") Utilizator utilizator);
	
	
	// delete
	abstract void deleteUtilizatorByParam(@Param("utilizatorParam") UtilizatorParam utilizatorParam);
	abstract void deleteUtilizatorById(int id);

}
