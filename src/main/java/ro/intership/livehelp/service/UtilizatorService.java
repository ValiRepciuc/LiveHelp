package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.UtilizatorDAO;
import ro.intership.livehelp.model.Utilizator;
import ro.intership.livehelp.param.UtilizatorParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class UtilizatorService {


	@Autowired
	UtilizatorDAO utilizatorDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Utilizator> getAllUtilizator(){
		return utilizatorDAO.getAllUtilizator();
	}
	public ArrayList<Utilizator> getUtilizatorByParam(UtilizatorParam utilizatorParam){
		return utilizatorDAO.getUtilizatorByParam(utilizatorParam);
	}
	public ArrayList<Utilizator> getUtilizatorByParamWithOrder(UtilizatorParam utilizatorParam, String order){
		return utilizatorDAO.getUtilizatorByParamWithOrder(utilizatorParam, order);
	}		
	public Utilizator getUtilizatorById(int id){
		return utilizatorDAO.getUtilizatorById(id);
	}
	
	
	// select LOV
	public ArrayList<Utilizator> getUtilizatorByIdLov(ArrayList<Integer> lov, String order){ 
		return utilizatorDAO.getUtilizatorByIdLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByIdLov(Integer[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByUsernameLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByUsernameLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByUsernameLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByUsernameLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByParolaLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByParolaLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByParolaLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByParolaLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByEmailLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByEmailLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByEmailLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByEmailLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByNumeLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByNumeLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByNumeLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByNumeLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByPrenumeLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByPrenumeLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByPrenumeLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByPrenumeLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Utilizator> getUtilizatorByTelefonLov(ArrayList<String> lov, String order){ 
		return utilizatorDAO.getUtilizatorByTelefonLov(lov, order);  
	}

	public ArrayList<Utilizator> getUtilizatorByTelefonLov(String[] lov, String order){ 
		return utilizatorDAO.getUtilizatorByTelefonLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Utilizator> getUtilizatorByIdLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByIdLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByIdLovNullWithOrder(UtilizatorParam utilizatorParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByIdLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByUsernameLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByUsernameLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByUsernameLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByUsernameLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByParolaLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByParolaLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByParolaLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByParolaLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByEmailLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByEmailLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByEmailLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByEmailLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByNumeLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByNumeLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByNumeLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByNumeLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByPrenumeLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByPrenumeLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByPrenumeLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByPrenumeLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Utilizator> getUtilizatorByTelefonLovNullWithOrderA(UtilizatorParam utilizatorParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByTelefonLovNullWithOrder(utilizatorParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Utilizator> getUtilizatorByTelefonLovNullWithOrder(UtilizatorParam utilizatorParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return utilizatorDAO.getUtilizatorByTelefonLovNullWithOrder(utilizatorParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertUtilizator(Utilizator utilizator){
		return utilizatorDAO.insertUtilizator(utilizator);
	}	

	// update
	public void updateUtilizatorByParam(UtilizatorParam utilizatorParam, Utilizator utilizator){
		utilizatorDAO.updateUtilizatorByParam(utilizatorParam,  utilizator);
	}
	public void updateUtilizatorExceptNullByParam(UtilizatorParam utilizatorParam, Utilizator utilizator){
		utilizatorDAO.updateUtilizatorExceptNullByParam(utilizatorParam,  utilizator);
	}
	public void updateUtilizatorById(int id, Utilizator utilizator){
		utilizatorDAO.updateUtilizatorById(id, utilizator);
	}
	public void updateUtilizatorByIdWithNull(int id, Utilizator utilizator){
		utilizatorDAO.updateUtilizatorById(id, utilizator);
	}
	
	
	// delete
	public void deleteUtilizatorByParam(UtilizatorParam utilizatorParam){
		utilizatorDAO.deleteUtilizatorByParam(utilizatorParam);
	}
	public void deleteUtilizatorById(int id){
		utilizatorDAO.deleteUtilizatorById(id);
	}

}
