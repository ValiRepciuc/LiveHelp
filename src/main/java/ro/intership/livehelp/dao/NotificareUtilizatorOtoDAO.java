package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.NotificareParam;
import ro.intership.livehelp.model.oto.NotificareUtilizatorOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface NotificareUtilizatorOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract NotificareUtilizatorOto selectNotificare(@Param("id") int id);
	
	abstract ArrayList<NotificareUtilizatorOto> selectNotificareAsArray(@Param("notificareParam") NotificareParam notificareParam, @Param("order") String order);

}
