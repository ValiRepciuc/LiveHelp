package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.IstoricDAO;
import ro.intership.livehelp.model.Istoric;
import ro.intership.livehelp.param.IstoricParam;
import java.util.Date;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class IstoricService {


	@Autowired
	IstoricDAO istoricDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Istoric> getAllIstoric(){
		return istoricDAO.getAllIstoric();
	}
	public ArrayList<Istoric> getIstoricByParam(IstoricParam istoricParam){
		return istoricDAO.getIstoricByParam(istoricParam);
	}
	public ArrayList<Istoric> getIstoricByParamWithOrder(IstoricParam istoricParam, String order){
		return istoricDAO.getIstoricByParamWithOrder(istoricParam, order);
	}		
	public Istoric getIstoricById(int id){
		return istoricDAO.getIstoricById(id);
	}
	
	
	// select LOV
	public ArrayList<Istoric> getIstoricByIdLov(ArrayList<Integer> lov, String order){ 
		return istoricDAO.getIstoricByIdLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricByIdLov(Integer[] lov, String order){ 
		return istoricDAO.getIstoricByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Istoric> getIstoricById_tichetLov(ArrayList<Integer> lov, String order){ 
		return istoricDAO.getIstoricById_tichetLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricById_tichetLov(Integer[] lov, String order){ 
		return istoricDAO.getIstoricById_tichetLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Istoric> getIstoricById_utilizatorLov(ArrayList<Integer> lov, String order){ 
		return istoricDAO.getIstoricById_utilizatorLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricById_utilizatorLov(Integer[] lov, String order){ 
		return istoricDAO.getIstoricById_utilizatorLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Istoric> getIstoricByStadiuLov(ArrayList<String> lov, String order){ 
		return istoricDAO.getIstoricByStadiuLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricByStadiuLov(String[] lov, String order){ 
		return istoricDAO.getIstoricByStadiuLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Istoric> getIstoricByDataLov(ArrayList<Date> lov, String order){ 
		return istoricDAO.getIstoricByDataLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricByDataLov(Date[] lov, String order){ 
		return istoricDAO.getIstoricByDataLov(lov==null ? null : new ArrayList<Date>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Istoric> getIstoricByTextLov(ArrayList<String> lov, String order){ 
		return istoricDAO.getIstoricByTextLov(lov, order);  
	}

	public ArrayList<Istoric> getIstoricByTextLov(String[] lov, String order){ 
		return istoricDAO.getIstoricByTextLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Istoric> getIstoricByIdLovNullWithOrderA(IstoricParam istoricParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricByIdLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricByIdLovNullWithOrder(IstoricParam istoricParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricByIdLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Istoric> getIstoricById_tichetLovNullWithOrderA(IstoricParam istoricParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricById_tichetLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricById_tichetLovNullWithOrder(IstoricParam istoricParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricById_tichetLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Istoric> getIstoricById_utilizatorLovNullWithOrderA(IstoricParam istoricParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricById_utilizatorLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricById_utilizatorLovNullWithOrder(IstoricParam istoricParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricById_utilizatorLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Istoric> getIstoricByStadiuLovNullWithOrderA(IstoricParam istoricParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricByStadiuLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricByStadiuLovNullWithOrder(IstoricParam istoricParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricByStadiuLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Istoric> getIstoricByDataLovNullWithOrderA(IstoricParam istoricParam, ArrayList<Date> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricByDataLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricByDataLovNullWithOrder(IstoricParam istoricParam, Date[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricByDataLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<Date>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Istoric> getIstoricByTextLovNullWithOrderA(IstoricParam istoricParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return istoricDAO.getIstoricByTextLovNullWithOrder(istoricParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Istoric> getIstoricByTextLovNullWithOrder(IstoricParam istoricParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return istoricDAO.getIstoricByTextLovNullWithOrder(istoricParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertIstoric(Istoric istoric){
		return istoricDAO.insertIstoric(istoric);
	}	

	// update
	public void updateIstoricByParam(IstoricParam istoricParam, Istoric istoric){
		istoricDAO.updateIstoricByParam(istoricParam,  istoric);
	}
	public void updateIstoricExceptNullByParam(IstoricParam istoricParam, Istoric istoric){
		istoricDAO.updateIstoricExceptNullByParam(istoricParam,  istoric);
	}
	public void updateIstoricById(int id, Istoric istoric){
		istoricDAO.updateIstoricById(id, istoric);
	}
	public void updateIstoricByIdWithNull(int id, Istoric istoric){
		istoricDAO.updateIstoricById(id, istoric);
	}
	
	
	// delete
	public void deleteIstoricByParam(IstoricParam istoricParam){
		istoricDAO.deleteIstoricByParam(istoricParam);
	}
	public void deleteIstoricById(int id){
		istoricDAO.deleteIstoricById(id);
	}

}
