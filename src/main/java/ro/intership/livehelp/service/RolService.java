package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.RolDAO;
import ro.intership.livehelp.model.Rol;
import ro.intership.livehelp.param.RolParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class RolService {


	@Autowired
	RolDAO rolDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Rol> getAllRol(){
		return rolDAO.getAllRol();
	}
	public ArrayList<Rol> getRolByParam(RolParam rolParam){
		return rolDAO.getRolByParam(rolParam);
	}
	public ArrayList<Rol> getRolByParamWithOrder(RolParam rolParam, String order){
		return rolDAO.getRolByParamWithOrder(rolParam, order);
	}		
	public Rol getRolById(int id){
		return rolDAO.getRolById(id);
	}
	
	
	// select LOV
	public ArrayList<Rol> getRolByIdLov(ArrayList<Integer> lov, String order){ 
		return rolDAO.getRolByIdLov(lov, order);  
	}

	public ArrayList<Rol> getRolByIdLov(Integer[] lov, String order){ 
		return rolDAO.getRolByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Rol> getRolById_utilizatorLov(ArrayList<Integer> lov, String order){ 
		return rolDAO.getRolById_utilizatorLov(lov, order);  
	}

	public ArrayList<Rol> getRolById_utilizatorLov(Integer[] lov, String order){ 
		return rolDAO.getRolById_utilizatorLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Rol> getRolByNumeLov(ArrayList<String> lov, String order){ 
		return rolDAO.getRolByNumeLov(lov, order);  
	}

	public ArrayList<Rol> getRolByNumeLov(String[] lov, String order){ 
		return rolDAO.getRolByNumeLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Rol> getRolByIdLovNullWithOrderA(RolParam rolParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return rolDAO.getRolByIdLovNullWithOrder(rolParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rol> getRolByIdLovNullWithOrder(RolParam rolParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return rolDAO.getRolByIdLovNullWithOrder(rolParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Rol> getRolById_utilizatorLovNullWithOrderA(RolParam rolParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return rolDAO.getRolById_utilizatorLovNullWithOrder(rolParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rol> getRolById_utilizatorLovNullWithOrder(RolParam rolParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return rolDAO.getRolById_utilizatorLovNullWithOrder(rolParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Rol> getRolByNumeLovNullWithOrderA(RolParam rolParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return rolDAO.getRolByNumeLovNullWithOrder(rolParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Rol> getRolByNumeLovNullWithOrder(RolParam rolParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return rolDAO.getRolByNumeLovNullWithOrder(rolParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertRol(Rol rol){
		return rolDAO.insertRol(rol);
	}	

	// update
	public void updateRolByParam(RolParam rolParam, Rol rol){
		rolDAO.updateRolByParam(rolParam,  rol);
	}
	public void updateRolExceptNullByParam(RolParam rolParam, Rol rol){
		rolDAO.updateRolExceptNullByParam(rolParam,  rol);
	}
	public void updateRolById(int id, Rol rol){
		rolDAO.updateRolById(id, rol);
	}
	public void updateRolByIdWithNull(int id, Rol rol){
		rolDAO.updateRolById(id, rol);
	}
	
	
	// delete
	public void deleteRolByParam(RolParam rolParam){
		rolDAO.deleteRolByParam(rolParam);
	}
	public void deleteRolById(int id){
		rolDAO.deleteRolById(id);
	}

}
