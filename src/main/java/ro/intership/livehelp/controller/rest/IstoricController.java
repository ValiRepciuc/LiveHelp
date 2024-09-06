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
import ro.intership.livehelp.service.IstoricService;
import ro.intership.livehelp.model.Istoric;
import ro.intership.livehelp.param.IstoricParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/istoric/")
public class IstoricController {

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
	IstoricService istoricService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Istoric> showAll(HttpSession httpSession){		
		ArrayList<Istoric> ret_s = istoricService.getAllIstoric();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Istoric> showSome(HttpSession httpSession, @RequestBody(required=false) IstoricParam istoricParam){
		ArrayList<Istoric> ret_s = istoricService.getIstoricByParam(istoricParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Istoric> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		IstoricParam istoricParam = new IstoricParam();

		String id = requestParams.get("id");
		if(id!=null) istoricParam.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) istoricParam.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) istoricParam.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String stadiu = requestParams.get("stadiu");
		if(stadiu!=null) istoricParam.setStadiu(new String(requestParams.get("stadiu")));
		String data = requestParams.get("data");
		if(data!=null) istoricParam.setData(getDateFromString(requestParams.get("data")));
		String text = requestParams.get("text");
		if(text!=null) istoricParam.setText(new String(requestParams.get("text")));
		
		ArrayList<Istoric> ret_s = istoricService.getIstoricByParam(istoricParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Istoric getIstoricById(HttpSession httpSession, @RequestParam("id") int id){
		return istoricService.getIstoricById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Istoric istoric){
		istoricService.insertIstoric(istoric);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Istoric istoricTemp = new Istoric();

		String id = requestParams.get("id");
		if(id!=null) istoricTemp.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) istoricTemp.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) istoricTemp.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String stadiu = requestParams.get("stadiu");
		if(stadiu!=null) istoricTemp.setStadiu(new String(requestParams.get("stadiu")));
		String data = requestParams.get("data");
		if(data!=null) istoricTemp.setData(getDateFromString(requestParams.get("data")));
		String text = requestParams.get("text");
		if(text!=null) istoricTemp.setText(new String(requestParams.get("text")));
		
		istoricService.insertIstoric(istoricTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Istoric istoric){
		istoricService.updateIstoricById(id, istoric);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		istoricService.deleteIstoricById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody IstoricParam istoricParam){
		istoricService.deleteIstoricByParam(istoricParam);
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
