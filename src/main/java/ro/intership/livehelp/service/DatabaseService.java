package ro.intership.livehelp.service;

//import java.util.ArrayList;
//import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.intership.livehelp.dao.DatabaseDAO;
import java.util.Date;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE



@Service
public class DatabaseService {


	@Autowired
	DatabaseDAO databaseDAO;

// =================================== USED ========================================

// ================================= NOT USED ======================================

	// select
	public Date getServerDate(){
		return databaseDAO.getServerDate();
	}

}
