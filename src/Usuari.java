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
		System.out.println("Cliente dado de alta ");
		checkdata(name);

	}

	public void checkdata(String data) throws Exception {
		if (data != null) {
			System.out.println("Datos correctos ");
		} else {

			throw new Exception("Campo vacio ");
		}

	}

	public boolean verifyClient(String name2) throws Exception {
		boolean isUsuari = false;
// Se asigna al this.name como contante para simular un usuario en la DB	
		this.name = "Julio";
		if (this.name.equals(name2)) {
			System.out.println("Cliente existente en la BD");
			isUsuari = true;
		} else {
			System.out.println("Cliente no encontrado ");
			isUsuari = false;
		}
		return isUsuari;
	}
}
