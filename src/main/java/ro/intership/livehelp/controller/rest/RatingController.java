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
import ro.intership.livehelp.service.RatingService;
import ro.intership.livehelp.model.Rating;
import ro.intership.livehelp.param.RatingParam;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE


@RestController
@RequestMapping("/rest/rating/")
public class RatingController {

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
	RatingService ratingService;


// =================================== USED ========================================

// ================================= NOT USED ======================================


// select
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public ArrayList<Rating> showAll(HttpSession httpSession){		
		ArrayList<Rating> ret_s = ratingService.getAllRating();
		return ret_s;		
	}

	//{"id":"51", "id_user":"1"}
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)	
	@RequestMapping(value="/getbyparam")
	public ArrayList<Rating> showSome(HttpSession httpSession, @RequestBody(required=false) RatingParam ratingParam){
		ArrayList<Rating> ret_s = ratingService.getRatingByParam(ratingParam);
		return ret_s;
	}

	//getparamfromuri?id=12&id_user=1
	//@RequestMapping(value="/getbyparam", method = RequestMethod.GET)
	@RequestMapping(value="/getbyparamfromuri")	
	public ArrayList<Rating> showSome(HttpSession httpSession, @RequestParam Map<String, String> requestParams){
		
		RatingParam ratingParam = new RatingParam();

		String id = requestParams.get("id");
		if(id!=null) ratingParam.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) ratingParam.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String valoare = requestParams.get("valoare");
		if(valoare!=null) ratingParam.setValoare(new Integer(requestParams.get("valoare")));
		
		ArrayList<Rating> ret_s = ratingService.getRatingByParam(ratingParam);
		return ret_s;
	}
	
	//@RequestMapping(value="/getbyid", method = RequestMethod.GET)
	@RequestMapping(value="/getbyid")	
	public Rating getRatingById(HttpSession httpSession, @RequestParam("id") int id){
		return ratingService.getRatingById(id);
	}
	
// insert	
	//@RequestMapping(value="/insert", method = RequestMethod.POST)
	@RequestMapping(value="/insert")
	public void insert(HttpSession httpSession, @RequestBody Rating rating){
		ratingService.insertRating(rating);
	}	
	
	//@RequestMapping(value="/insertfromuri", method = RequestMethod.POST)
	@RequestMapping(value="/insertfromuri")
	public void insertFromUri(HttpSession httpSession,  @RequestParam Map<String, String> requestParams){
		
		Rating ratingTemp = new Rating();

		String id = requestParams.get("id");
		if(id!=null) ratingTemp.setId(new Integer(requestParams.get("id")));
		String id_tichet = requestParams.get("id_tichet");
		if(id_tichet!=null) ratingTemp.setId_tichet(new Integer(requestParams.get("id_tichet")));
		String valoare = requestParams.get("valoare");
		if(valoare!=null) ratingTemp.setValoare(new Integer(requestParams.get("valoare")));
		
		ratingService.insertRating(ratingTemp);
	}


// update
	//@RequestMapping(value="/updatebyid", method = RequestMethod.PUT)
	@RequestMapping(value="/updatebyid")
	public void update(HttpSession httpSession, @RequestParam("id") int id, @RequestBody Rating rating){
		ratingService.updateRatingById(id, rating);
	}
	
// delete
	//@RequestMapping(value="/deletebyid", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyid")
	public void deleteById(HttpSession httpSession, @RequestParam("id") int id){
		ratingService.deleteRatingById(id);
	}
	
	//@RequestMapping(value="/deletebyparam", method = RequestMethod.DELETE)
	@RequestMapping(value="/deletebyparam")
	public void deleteByParam(HttpSession httpSession, @RequestBody RatingParam ratingParam){
		ratingService.deleteRatingByParam(ratingParam);
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
