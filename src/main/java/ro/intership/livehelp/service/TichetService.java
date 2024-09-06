package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.TichetDAO;
import ro.intership.livehelp.model.Tichet;
import ro.intership.livehelp.param.TichetParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class TichetService {


	@Autowired
	TichetDAO tichetDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Tichet> getAllTichet(){
		return tichetDAO.getAllTichet();
	}
	public ArrayList<Tichet> getTichetByParam(TichetParam tichetParam){
		return tichetDAO.getTichetByParam(tichetParam);
	}
	public ArrayList<Tichet> getTichetByParamWithOrder(TichetParam tichetParam, String order){
		return tichetDAO.getTichetByParamWithOrder(tichetParam, order);
	}		
	public Tichet getTichetById(int id){
		return tichetDAO.getTichetById(id);
	}
	
	
	// select LOV
	public ArrayList<Tichet> getTichetByIdLov(ArrayList<Integer> lov, String order){ 
		return tichetDAO.getTichetByIdLov(lov, order);  
	}

	public ArrayList<Tichet> getTichetByIdLov(Integer[] lov, String order){ 
		return tichetDAO.getTichetByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Tichet> getTichetById_categorieLov(ArrayList<Integer> lov, String order){ 
		return tichetDAO.getTichetById_categorieLov(lov, order);  
	}

	public ArrayList<Tichet> getTichetById_categorieLov(Integer[] lov, String order){ 
		return tichetDAO.getTichetById_categorieLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Tichet> getTichetByIdLovNullWithOrderA(TichetParam tichetParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return tichetDAO.getTichetByIdLovNullWithOrder(tichetParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Tichet> getTichetByIdLovNullWithOrder(TichetParam tichetParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return tichetDAO.getTichetByIdLovNullWithOrder(tichetParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Tichet> getTichetById_categorieLovNullWithOrderA(TichetParam tichetParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return tichetDAO.getTichetById_categorieLovNullWithOrder(tichetParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Tichet> getTichetById_categorieLovNullWithOrder(TichetParam tichetParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return tichetDAO.getTichetById_categorieLovNullWithOrder(tichetParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertTichet(Tichet tichet){
		return tichetDAO.insertTichet(tichet);
	}	

	// update
	public void updateTichetByParam(TichetParam tichetParam, Tichet tichet){
		tichetDAO.updateTichetByParam(tichetParam,  tichet);
	}
	public void updateTichetExceptNullByParam(TichetParam tichetParam, Tichet tichet){
		tichetDAO.updateTichetExceptNullByParam(tichetParam,  tichet);
	}
	public void updateTichetById(int id, Tichet tichet){
		tichetDAO.updateTichetById(id, tichet);
	}
	public void updateTichetByIdWithNull(int id, Tichet tichet){
		tichetDAO.updateTichetById(id, tichet);
	}
	
	
	// delete
	public void deleteTichetByParam(TichetParam tichetParam){
		tichetDAO.deleteTichetByParam(tichetParam);
	}
	public void deleteTichetById(int id){
		tichetDAO.deleteTichetById(id);
	}

}
