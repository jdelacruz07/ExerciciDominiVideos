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
	
	}
	
	public Usuari(String name) throws Exception {
		// TODO Auto-generated constructor stub
		System.out.println("Se crea un usuario ");
		checkdata(name);

	}

	public void checkdata(String data) throws Exception {
		if (data != null) {
			System.out.println("Campo no vacio ");
		} else {
			
				throw new Exception("Campo vacio ");
			} 
		
	}
	public boolean verifyClient(String name2) throws Exception {
		boolean isUsuari = false;
		this.name = name2;
//		this.name = null;
		if (this.name == name2) {
			System.out.println("Cliente firmado correctamente");
			isUsuari = true;
		} else {
			System.out.println("Cliente no encontrado ");
			isUsuari = false;
		} 
		return isUsuari;
	}
}
