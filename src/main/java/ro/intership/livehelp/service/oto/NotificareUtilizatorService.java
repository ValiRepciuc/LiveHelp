package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.NotificareParam;
import ro.intership.livehelp.model.oto.NotificareUtilizatorOto;
import ro.intership.livehelp.dao.NotificareUtilizatorOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class NotificareUtilizatorService {
	
	
	@Autowired
	NotificareUtilizatorOtoDAO notificareUtilizatorOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public NotificareUtilizatorOto selectNotificare(int id){
		return notificareUtilizatorOtoDAO.selectNotificare(id);
	}
	
	public ArrayList<NotificareUtilizatorOto> selectNotificareAsArray(NotificareParam notificareParam, String order){
		return notificareUtilizatorOtoDAO.selectNotificareAsArray(notificareParam, order);
	}	
	
}
