package ro.intership.livehelp.service;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.NotificareDAO;
import ro.intership.livehelp.model.Notificare;
import ro.intership.livehelp.param.NotificareParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class NotificareService {


	@Autowired
	NotificareDAO notificareDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public ArrayList<Notificare> getAllNotificare(){
		return notificareDAO.getAllNotificare();
	}
	public ArrayList<Notificare> getNotificareByParam(NotificareParam notificareParam){
		return notificareDAO.getNotificareByParam(notificareParam);
	}
	public ArrayList<Notificare> getNotificareByParamWithOrder(NotificareParam notificareParam, String order){
		return notificareDAO.getNotificareByParamWithOrder(notificareParam, order);
	}		
	public Notificare getNotificareById(int id){
		return notificareDAO.getNotificareById(id);
	}
	
	
	// select LOV
	public ArrayList<Notificare> getNotificareByIdLov(ArrayList<Integer> lov, String order){ 
		return notificareDAO.getNotificareByIdLov(lov, order);  
	}

	public ArrayList<Notificare> getNotificareByIdLov(Integer[] lov, String order){ 
		return notificareDAO.getNotificareByIdLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Notificare> getNotificareById_tichetLov(ArrayList<Integer> lov, String order){ 
		return notificareDAO.getNotificareById_tichetLov(lov, order);  
	}

	public ArrayList<Notificare> getNotificareById_tichetLov(Integer[] lov, String order){ 
		return notificareDAO.getNotificareById_tichetLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Notificare> getNotificareById_utilizatorLov(ArrayList<Integer> lov, String order){ 
		return notificareDAO.getNotificareById_utilizatorLov(lov, order);  
	}

	public ArrayList<Notificare> getNotificareById_utilizatorLov(Integer[] lov, String order){ 
		return notificareDAO.getNotificareById_utilizatorLov(lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Notificare> getNotificareByStadiuLov(ArrayList<String> lov, String order){ 
		return notificareDAO.getNotificareByStadiuLov(lov, order);  
	}

	public ArrayList<Notificare> getNotificareByStadiuLov(String[] lov, String order){ 
		return notificareDAO.getNotificareByStadiuLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	public ArrayList<Notificare> getNotificareByTextLov(ArrayList<String> lov, String order){ 
		return notificareDAO.getNotificareByTextLov(lov, order);  
	}

	public ArrayList<Notificare> getNotificareByTextLov(String[] lov, String order){ 
		return notificareDAO.getNotificareByTextLov(lov==null ? null : new ArrayList<String>(Arrays.asList(lov)), order);  
	}
	

	// select from param, LOV, null, not null and order
	public ArrayList<Notificare> getNotificareByIdLovNullWithOrderA(NotificareParam notificareParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return notificareDAO.getNotificareByIdLovNullWithOrder(notificareParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Notificare> getNotificareByIdLovNullWithOrder(NotificareParam notificareParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return notificareDAO.getNotificareByIdLovNullWithOrder(notificareParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Notificare> getNotificareById_tichetLovNullWithOrderA(NotificareParam notificareParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return notificareDAO.getNotificareById_tichetLovNullWithOrder(notificareParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Notificare> getNotificareById_tichetLovNullWithOrder(NotificareParam notificareParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return notificareDAO.getNotificareById_tichetLovNullWithOrder(notificareParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Notificare> getNotificareById_utilizatorLovNullWithOrderA(NotificareParam notificareParam, ArrayList<Integer> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return notificareDAO.getNotificareById_utilizatorLovNullWithOrder(notificareParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Notificare> getNotificareById_utilizatorLovNullWithOrder(NotificareParam notificareParam, Integer[] lov, String[] nullList, String[] notNullList, String order){ 
		return notificareDAO.getNotificareById_utilizatorLovNullWithOrder(notificareParam,  lov==null ? null : new ArrayList<Integer>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Notificare> getNotificareByStadiuLovNullWithOrderA(NotificareParam notificareParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return notificareDAO.getNotificareByStadiuLovNullWithOrder(notificareParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Notificare> getNotificareByStadiuLovNullWithOrder(NotificareParam notificareParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return notificareDAO.getNotificareByStadiuLovNullWithOrder(notificareParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		

	public ArrayList<Notificare> getNotificareByTextLovNullWithOrderA(NotificareParam notificareParam, ArrayList<String> lov, ArrayList<String> nullList, ArrayList<String> notNullList, String order){ 
		return notificareDAO.getNotificareByTextLovNullWithOrder(notificareParam, lov, nullList, notNullList, order);  
	}
	
	public ArrayList<Notificare> getNotificareByTextLovNullWithOrder(NotificareParam notificareParam, String[] lov, String[] nullList, String[] notNullList, String order){ 
		return notificareDAO.getNotificareByTextLovNullWithOrder(notificareParam,  lov==null ? null : new ArrayList<String>(Arrays.asList(lov)),  nullList==null ? null : new ArrayList<String>(Arrays.asList(nullList)), notNullList==null ? null : new ArrayList<String>(Arrays.asList(notNullList)), order);  
	}		


	
	// insert	
	public int insertNotificare(Notificare notificare){
		return notificareDAO.insertNotificare(notificare);
	}	

	// update
	public void updateNotificareByParam(NotificareParam notificareParam, Notificare notificare){
		notificareDAO.updateNotificareByParam(notificareParam,  notificare);
	}
	public void updateNotificareExceptNullByParam(NotificareParam notificareParam, Notificare notificare){
		notificareDAO.updateNotificareExceptNullByParam(notificareParam,  notificare);
	}
	public void updateNotificareById(int id, Notificare notificare){
		notificareDAO.updateNotificareById(id, notificare);
	}
	public void updateNotificareByIdWithNull(int id, Notificare notificare){
		notificareDAO.updateNotificareById(id, notificare);
	}
	
	
	// delete
	public void deleteNotificareByParam(NotificareParam notificareParam){
		notificareDAO.deleteNotificareByParam(notificareParam);
	}
	public void deleteNotificareById(int id){
		notificareDAO.deleteNotificareById(id);
	}

}
