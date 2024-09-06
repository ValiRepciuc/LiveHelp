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
import ro.intership.livehelp.service.UtilizatorService;
import ro.intership.livehelp.model.Utilizator;
import ro.intership.livehelp.param.UtilizatorParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/utilizator/")
public class UtilizatorController {

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
	UtilizatorService utilizatorService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Utilizator> showAll(HttpSession httpSession){		
		ArrayList<Utilizator> ret_s = utilizatorService.getAllUtilizator();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Utilizator> showSome(HttpSession httpSession, @RequestBody(required=false) UtilizatorParam utilizatorParam){
		ArrayList<Utilizator> ret_s = utilizatorService.getUtilizatorByParam(utilizatorParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Utilizator> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		UtilizatorParam utilizatorParam = new UtilizatorParam();

		String id = requestParams.get("id");
		if(id!=null) utilizatorParam.setId(new Integer(requestParams.get("id")));
		String username = requestParams.get("username");
		if(username!=null) utilizatorParam.setUsername(new String(requestParams.get("username")));
		String parola = requestParams.get("parola");
		if(parola!=null) utilizatorParam.setParola(new String(requestParams.get("parola")));
		String email = requestParams.get("email");
		if(email!=null) utilizatorParam.setEmail(new String(requestParams.get("email")));
		String nume = requestParams.get("nume");
		if(nume!=null) utilizatorParam.setNume(new String(requestParams.get("nume")));
		String prenume = requestParams.get("prenume");
		if(prenume!=null) utilizatorParam.setPrenume(new String(requestParams.get("prenume")));
		String telefon = requestParams.get("telefon");
		if(telefon!=null) utilizatorParam.setTelefon(new String(requestParams.get("telefon")));
		
		ArrayList<Utilizator> ret_s = utilizatorService.getUtilizatorByParam(utilizatorParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Utilizator getUtilizatorById(HttpSession httpSession, @RequestParam("id") int id){
		return utilizatorService.getUtilizatorById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Utilizator utilizator){
		utilizatorService.insertUtilizator(utilizator);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Utilizator utilizatorTemp = new Utilizator();

		String id = requestParams.get("id");
		if(id!=null) utilizatorTemp.setId(new Integer(requestParams.get("id")));
		String username = requestParams.get("username");
		if(username!=null) utilizatorTemp.setUsername(new String(requestParams.get("username")));
		String parola = requestParams.get("parola");
		if(parola!=null) utilizatorTemp.setParola(new String(requestParams.get("parola")));
		String email = requestParams.get("email");
		if(email!=null) utilizatorTemp.setEmail(new String(requestParams.get("email")));
		String nume = requestParams.get("nume");
		if(nume!=null) utilizatorTemp.setNume(new String(requestParams.get("nume")));
		String prenume = requestParams.get("prenume");
		if(prenume!=null) utilizatorTemp.setPrenume(new String(requestParams.get("prenume")));
		String telefon = requestParams.get("telefon");
		if(telefon!=null) utilizatorTemp.setTelefon(new String(requestParams.get("telefon")));
		
		utilizatorService.insertUtilizator(utilizatorTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Utilizator utilizator){
		utilizatorService.updateUtilizatorById(id, utilizator);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		utilizatorService.deleteUtilizatorById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody UtilizatorParam utilizatorParam){
		utilizatorService.deleteUtilizatorByParam(utilizatorParam);
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
