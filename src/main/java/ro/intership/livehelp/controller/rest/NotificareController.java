package ro.intership.livehelp.controller.rest;

import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.intership.livehelp.service.NotificareService;
import ro.intership.livehelp.model.Notificare;
import ro.intership.livehelp.param.NotificareParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/notificare/")
public class NotificareController {

		/*
		 	getall
		 	getbyparam
		 		getbyparamfromuri
			getbyid
		 	insert
		 		insertfromuri
		 		
		 	deletebyid
		 	deletebyparam
		
		 	updatebyid
		 	
		 	//updatebyparam
		 	//updatebyparamfromuri 	  	
		 	//deletebyparamfromuri   	  		
		*/

	String dateFormat = "yyyy-MM-dd HH:mm:ss";
 
	@Autowired
	NotificareService notificareService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Notificare> showAll(HttpSession httpSession){		
		ArrayList<Notificare> ret_s = notificareService.getAllNotificare();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Notificare> showSome(HttpSession httpSession, @RequestBody(required=false) NotificareParam notificareParam){
		ArrayList<Notificare> ret_s = notificareService.getNotificareByParam(notificareParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Notificare> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		NotificareParam notificareParam = new NotificareParam();

		String id = requestParams.get("id");
		if(id!=null) notificareParam.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) notificareParam.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) notificareParam.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String stadiu = requestParams.get("stadiu");
		if(stadiu!=null) notificareParam.setStadiu(new String(requestParams.get("stadiu")));
		String text = requestParams.get("text");
		if(text!=null) notificareParam.setText(new String(requestParams.get("text")));
		
		ArrayList<Notificare> ret_s = notificareService.getNotificareByParam(notificareParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Notificare getNotificareById(HttpSession httpSession, @RequestParam("id") int id){
		return notificareService.getNotificareById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Notificare notificare){
		notificareService.insertNotificare(notificare);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Notificare notificareTemp = new Notificare();

		String id = requestParams.get("id");
		if(id!=null) notificareTemp.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) notificareTemp.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) notificareTemp.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String stadiu = requestParams.get("stadiu");
		if(stadiu!=null) notificareTemp.setStadiu(new String(requestParams.get("stadiu")));
		String text = requestParams.get("text");
		if(text!=null) notificareTemp.setText(new String(requestParams.get("text")));
		
		notificareService.insertNotificare(notificareTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Notificare notificare){
		notificareService.updateNotificareById(id, notificare);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		notificareService.deleteNotificareById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody NotificareParam notificareParam){
		notificareService.deleteNotificareByParam(notificareParam);
	}

// utils	
	// "yyyy-MM-dd HH:mm:ss"
	public Date getDateFromString(String dateStr, String format) {

        DateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = (Date) formatter.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public String getStringFromDate(Date date, String dateFormat) {
        DateFormat formatter = new SimpleDateFormat(dateFormat);
        return formatter.format(date);
    }

	// "yyyy-MM-dd HH:mm:ss"
	public Date getDateFromString(String dateStr) {

        DateFormat formatter = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = (Date) formatter.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public String getStringFromDate(Date date) {
        DateFormat formatter = new SimpleDateFormat(dateFormat);
        return formatter.format(date);
    }

}
