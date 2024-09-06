package ro.intership.livehelp.service.oto;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.param.NotificareParam;
import ro.intership.livehelp.model.oto.NotificareTichetOto;
import ro.intership.livehelp.dao.NotificareTichetOtoDAO;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@Service
public class NotificareTichetService {
	
	
	@Autowired
	NotificareTichetOtoDAO notificareTichetOtoDAO;
	
	
	
// =================================== USED ========================================

// ================================= NOT USED ======================================
	
	
	public NotificareTichetOto selectNotificare(int id){
		return notificareTichetOtoDAO.selectNotificare(id);
	}
	
	public ArrayList<NotificareTichetOto> selectNotificareAsArray(NotificareParam notificareParam, String order){
		return notificareTichetOtoDAO.selectNotificareAsArray(notificareParam, order);
	}	
	
}
