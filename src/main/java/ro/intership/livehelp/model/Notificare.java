package ro.intership.livehelp.model;


//import com.fasterxml.jackson.annotation.JsonFormat;

// MACHIME GENERATED. REMOVE THIS LINE IF YOU MODIFY THIS FILE

public class Notificare {
		
 		private Integer id;
 		private Integer id_tichet;
 		private Integer id_utilizator;
 		private String stadiu;
 		private String text;
		
		// getters
		public Integer getId() {
			return id;
		}
		public Integer getId_tichet() {
			return id_tichet;
		}
		public Integer getId_utilizator() {
			return id_utilizator;
		}
		public String getStadiu() {
			return stadiu;
		}
		public String getText() {
			return text;
		}
	
		// setters
		public void setId(Integer id) {
			this.id = id;
		}
		public void setId_tichet(Integer id_tichet) {
			this.id_tichet = id_tichet;
		}
		public void setId_utilizator(Integer id_utilizator) {
			this.id_utilizator = id_utilizator;
		}
		public void setStadiu(String stadiu) {
			this.stadiu = stadiu;
		}
		public void setText(String text) {
			this.text = text;
		}
}

