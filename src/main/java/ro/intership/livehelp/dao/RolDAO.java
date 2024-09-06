package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Rol;
import ro.intership.livehelp.param.RolParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface RolDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Rol> getAllRol();
	abstract ArrayList<Rol> getRolByParam(@Param("rolParam") RolParam rolParam);	
	abstract ArrayList<Rol> getRolByParamWithOrder(@Param("rolParam") RolParam rolParam, @Param("order") String order);	
	abstract Rol getRolById(int id);
	
	// select LOV
	abstract ArrayList<Rol> getRolByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Rol> getRolById_utilizatorLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Rol> getRolByNumeLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Rol> getRolByIdLovNullWithOrder(@Param("rolParam") RolParam rolParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Rol> getRolById_utilizatorLovNullWithOrder(@Param("rolParam") RolParam rolParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Rol> getRolByNumeLovNullWithOrder(@Param("rolParam") RolParam rolParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertRol(Rol rol);	

	// update
	abstract void updateRolByParam(@Param("rolParam") RolParam rolParam, @Param("rol") Rol rol);
	abstract void updateRolExceptNullByParam(@Param("rolParam") RolParam rolParam, @Param("rol") Rol rol);
	abstract void updateRolById(@Param("id") int id, @Param("rol") Rol rol);
	abstract void updateRolByIdWithNull(@Param("id") int id, @Param("rol") Rol rol);
	
	
	// delete
	abstract void deleteRolByParam(@Param("rolParam") RolParam rolParam);
	abstract void deleteRolById(int id);

}
