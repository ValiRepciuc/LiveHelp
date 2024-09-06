package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.CategorieDAO;
import ro.intership.livehelp.model.Categorie;
import ro.intership.livehelp.param.CategorieParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class CategorieService {


	@Autowired
	CategorieDAO categorieDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Categorie> getAllCategorie(){
		return categorieDAO.getAllCategorie();
	}
	public ArrayList<Categorie> getCategorieByParam(CategorieParam categorieParam){
		return categorieDAO.getCategorieByParam(categorieParam);
	}
	public ArrayList<Categorie> getCategorieByParamWithOrder(CategorieParam categorieParam, String order){
		return categorieDAO.getCategorieByParamWithOrder(categorieParam, order);
	}		
	public Categorie getCategorieById(int id){
		return categorieDAO.getCategorieById(id);
	}
	
	
	// select LOV
	public ArrayList<Categorie> getCategorieByIdLov(ArrayList<Integer> lov, String order){ 
		return categorieDAO.getCategorieByIdLov(lov, order);  
	}

	public ArrayList<Categorie> getCategorieByIdLov(Integer[] lov, String order){ 
		return categorieDAO.getCategorieByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Categorie> getCategorieByNumeLov(ArrayList<String> lov, String order){ 
		return categorieDAO.getCategorieByNumeLov(lov, order);  
	}

	public ArrayList<Categorie> getCategorieByNumeLov(String[] lov, String order){ 
		return categorieDAO.getCategorieByNumeLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Categorie> getCategorieByIdLovNullWithOrderA(CategorieParam categorieParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return categorieDAO.getCategorieByIdLovNullWithOrder(categorieParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Categorie> getCategorieByIdLovNullWithOrder(CategorieParam categorieParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return categorieDAO.getCategorieByIdLovNullWithOrder(categorieParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Categorie> getCategorieByNumeLovNullWithOrderA(CategorieParam categorieParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return categorieDAO.getCategorieByNumeLovNullWithOrder(categorieParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Categorie> getCategorieByNumeLovNullWithOrder(CategorieParam categorieParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return categorieDAO.getCategorieByNumeLovNullWithOrder(categorieParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertCategorie(Categorie categorie){
		return categorieDAO.insertCategorie(categorie);
	}	

	// update
	public void updateCategorieByParam(CategorieParam categorieParam, Categorie categorie){
		categorieDAO.updateCategorieByParam(categorieParam,  categorie);
	}
	public void updateCategorieExceptNullByParam(CategorieParam categorieParam, Categorie categorie){
		categorieDAO.updateCategorieExceptNullByParam(categorieParam,  categorie);
	}
	public void updateCategorieById(int id, Categorie categorie){
		categorieDAO.updateCategorieById(id, categorie);
	}
	public void updateCategorieByIdWithNull(int id, Categorie categorie){
		categorieDAO.updateCategorieById(id, categorie);
	}
	
	
	// delete
	public void deleteCategorieByParam(CategorieParam categorieParam){
		categorieDAO.deleteCategorieByParam(categorieParam);
	}
	public void deleteCategorieById(int id){
		categorieDAO.deleteCategorieById(id);
	}

}
