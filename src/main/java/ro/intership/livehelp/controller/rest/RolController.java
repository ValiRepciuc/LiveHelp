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
import ro.intership.livehelp.service.RolService;
import ro.intership.livehelp.model.Rol;
import ro.intership.livehelp.param.RolParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/rol/")
public class RolController {

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
	RolService rolService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Rol> showAll(HttpSession httpSession){		
		ArrayList<Rol> ret_s = rolService.getAllRol();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Rol> showSome(HttpSession httpSession, @RequestBody(required=false) RolParam rolParam){
		ArrayList<Rol> ret_s = rolService.getRolByParam(rolParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Rol> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		RolParam rolParam = new RolParam();

		String id = requestParams.get("id");
		if(id!=null) rolParam.setId(new Integer(requestParams.get("id")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) rolParam.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String nume = requestParams.get("nume");
		if(nume!=null) rolParam.setNume(new String(requestParams.get("nume")));
		
		ArrayList<Rol> ret_s = rolService.getRolByParam(rolParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Rol getRolById(HttpSession httpSession, @RequestParam("id") int id){
		return rolService.getRolById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Rol rol){
		rolService.insertRol(rol);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Rol rolTemp = new Rol();

		String id = requestParams.get("id");
		if(id!=null) rolTemp.setId(new Integer(requestParams.get("id")));
		String id_utilizator = requestParams.get("id_utilizator");
		if(id_utilizator!=null) rolTemp.setId_utilizator(new Integer(requestParams.get("id_utilizator")));
		String nume = requestParams.get("nume");
		if(nume!=null) rolTemp.setNume(new String(requestParams.get("nume")));
		
		rolService.insertRol(rolTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Rol rol){
		rolService.updateRolById(id, rol);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		rolService.deleteRolById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody RolParam rolParam){
		rolService.deleteRolByParam(rolParam);
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
