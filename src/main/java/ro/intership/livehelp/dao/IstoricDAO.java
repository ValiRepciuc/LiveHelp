package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Istoric;
import ro.intership.livehelp.param.IstoricParam;
import java.util.Date;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface IstoricDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Istoric> getAllIstoric();
	abstract ArrayList<Istoric> getIstoricByParam(@Param("istoricParam") IstoricParam istoricParam);	
	abstract ArrayList<Istoric> getIstoricByParamWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("order") String order);	
	abstract Istoric getIstoricById(int id);
	
	// select LOV
	abstract ArrayList<Istoric> getIstoricByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Istoric> getIstoricById_tichetLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Istoric> getIstoricById_utilizatorLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Istoric> getIstoricByStadiuLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Istoric> getIstoricByDataLov(@Param("list") ArrayList<Date> list, @Param("order") String order);  
	abstract ArrayList<Istoric> getIstoricByTextLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Istoric> getIstoricByIdLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Istoric> getIstoricById_tichetLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Istoric> getIstoricById_utilizatorLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Istoric> getIstoricByStadiuLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Istoric> getIstoricByDataLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<Date> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Istoric> getIstoricByTextLovNullWithOrder(@Param("istoricParam") IstoricParam istoricParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertIstoric(Istoric istoric);	

	// update
	abstract void updateIstoricByParam(@Param("istoricParam") IstoricParam istoricParam, @Param("istoric") Istoric istoric);
	abstract void updateIstoricExceptNullByParam(@Param("istoricParam") IstoricParam istoricParam, @Param("istoric") Istoric istoric);
	abstract void updateIstoricById(@Param("id") int id, @Param("istoric") Istoric istoric);
	abstract void updateIstoricByIdWithNull(@Param("id") int id, @Param("istoric") Istoric istoric);
	
	
	// delete
	abstract void deleteIstoricByParam(@Param("istoricParam") IstoricParam istoricParam);
	abstract void deleteIstoricById(int id);

}
