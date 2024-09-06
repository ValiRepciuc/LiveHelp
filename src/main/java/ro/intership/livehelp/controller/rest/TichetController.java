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
import ro.intership.livehelp.service.TichetService;
import ro.intership.livehelp.model.Tichet;
import ro.intership.livehelp.param.TichetParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/tichet/")
public class TichetController {

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
	TichetService tichetService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Tichet> showAll(HttpSession httpSession){		
		ArrayList<Tichet> ret_s = tichetService.getAllTichet();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Tichet> showSome(HttpSession httpSession, @RequestBody(required=false) TichetParam tichetParam){
		ArrayList<Tichet> ret_s = tichetService.getTichetByParam(tichetParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Tichet> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		TichetParam tichetParam = new TichetParam();

		String id = requestParams.get("id");
		if(id!=null) tichetParam.setId(new Integer(requestParams.get("id")));
		String id_categorie = requestParams.get("id_categorie");
		if(id_categorie!=null) tichetParam.setId_categorie(new Integer(requestParams.get("id_categorie")));
		
		ArrayList<Tichet> ret_s = tichetService.getTichetByParam(tichetParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Tichet getTichetById(HttpSession httpSession, @RequestParam("id") int id){
		return tichetService.getTichetById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Tichet tichet){
		tichetService.insertTichet(tichet);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Tichet tichetTemp = new Tichet();

		String id = requestParams.get("id");
		if(id!=null) tichetTemp.setId(new Integer(requestParams.get("id")));
		String id_categorie = requestParams.get("id_categorie");
		if(id_categorie!=null) tichetTemp.setId_categorie(new Integer(requestParams.get("id_categorie")));
		
		tichetService.insertTichet(tichetTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Tichet tichet){
		tichetService.updateTichetById(id, tichet);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		tichetService.deleteTichetById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody TichetParam tichetParam){
		tichetService.deleteTichetByParam(tichetParam);
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
