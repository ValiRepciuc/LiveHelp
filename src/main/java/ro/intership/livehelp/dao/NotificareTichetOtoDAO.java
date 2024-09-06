package ro.intership.livehelp.dao;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param; // for @Param
import org.apache.ibatis.annotations.Mapper;
import ro.intership.livehelp.param.NotificareParam;
import ro.intership.livehelp.model.oto.NotificareTichetOto;


// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Mapper
public interface NotificareTichetOtoDAO {

// =================================== USED ========================================

// ================================= NOT USED ======================================


	abstract NotificareTichetOto selectNotificare(@Param("id") int id);
	
	abstract ArrayList<NotificareTichetOto> selectNotificareAsArray(@Param("notificareParam") NotificareParam notificareParam, @Param("order") String order);

}
