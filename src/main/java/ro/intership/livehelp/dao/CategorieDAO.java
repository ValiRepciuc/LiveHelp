package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Categorie;
import ro.intership.livehelp.param.CategorieParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface CategorieDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Categorie> getAllCategorie();
	abstract ArrayList<Categorie> getCategorieByParam(@Param("categorieParam") CategorieParam categorieParam);	
	abstract ArrayList<Categorie> getCategorieByParamWithOrder(@Param("categorieParam") CategorieParam categorieParam, @Param("order") String order);	
	abstract Categorie getCategorieById(int id);
	
	// select LOV
	abstract ArrayList<Categorie> getCategorieByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Categorie> getCategorieByNumeLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Categorie> getCategorieByIdLovNullWithOrder(@Param("categorieParam") CategorieParam categorieParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Categorie> getCategorieByNumeLovNullWithOrder(@Param("categorieParam") CategorieParam categorieParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertCategorie(Categorie categorie);	

	// update
	abstract void updateCategorieByParam(@Param("categorieParam") CategorieParam categorieParam, @Param("categorie") Categorie categorie);
	abstract void updateCategorieExceptNullByParam(@Param("categorieParam") CategorieParam categorieParam, @Param("categorie") Categorie categorie);
	abstract void updateCategorieById(@Param("id") int id, @Param("categorie") Categorie categorie);
	abstract void updateCategorieByIdWithNull(@Param("id") int id, @Param("categorie") Categorie categorie);
	
	
	// delete
	abstract void deleteCategorieByParam(@Param("categorieParam") CategorieParam categorieParam);
	abstract void deleteCategorieById(int id);

}
