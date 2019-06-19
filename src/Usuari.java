import java.util.Date;

public class Usuari {

	private String name = null;
	private String surname = null;
	private String password = null;
	private Date date = new Date();
	
	public Usuari(String name, String surname, String password, Date date) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.date = date;
	}

	public Usuari() {
		// TODO Auto-generated constructor stub
	}
}
