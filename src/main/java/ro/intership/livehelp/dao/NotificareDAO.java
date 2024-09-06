package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.model.Notificare;
import ro.intership.livehelp.param.NotificareParam;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface NotificareDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	abstract ArrayList<Notificare> getAllNotificare();
	abstract ArrayList<Notificare> getNotificareByParam(@Param("notificareParam") NotificareParam notificareParam);	
	abstract ArrayList<Notificare> getNotificareByParamWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("order") String order);	
	abstract Notificare getNotificareById(int id);
	
	// select LOV
	abstract ArrayList<Notificare> getNotificareByIdLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Notificare> getNotificareById_tichetLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Notificare> getNotificareById_utilizatorLov(@Param("list") ArrayList<Integer> list, @Param("order") String order);  
	abstract ArrayList<Notificare> getNotificareByStadiuLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	abstract ArrayList<Notificare> getNotificareByTextLov(@Param("list") ArrayList<String> list, @Param("order") String order);  
	
	// select from param, LOV, null, not null and order
	abstract ArrayList<Notificare> getNotificareByIdLovNullWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Notificare> getNotificareById_tichetLovNullWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Notificare> getNotificareById_utilizatorLovNullWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("list") ArrayList<Integer> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Notificare> getNotificareByStadiuLovNullWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	abstract ArrayList<Notificare> getNotificareByTextLovNullWithOrder(@Param("notificareParam") NotificareParam notificareParam, @Param("list") ArrayList<String> list, @Param("nullList") ArrayList<String> nullList, @Param("notNullList") ArrayList<String> notNullList, @Param("order") String order);
	
	
	// insert	
	abstract int insertNotificare(Notificare notificare);	

	// update
	abstract void updateNotificareByParam(@Param("notificareParam") NotificareParam notificareParam, @Param("notificare") Notificare notificare);
	abstract void updateNotificareExceptNullByParam(@Param("notificareParam") NotificareParam notificareParam, @Param("notificare") Notificare notificare);
	abstract void updateNotificareById(@Param("id") int id, @Param("notificare") Notificare notificare);
	abstract void updateNotificareByIdWithNull(@Param("id") int id, @Param("notificare") Notificare notificare);
	
	
	// delete
	abstract void deleteNotificareByParam(@Param("notificareParam") NotificareParam notificareParam);
	abstract void deleteNotificareById(int id);

}
