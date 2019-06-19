import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//StudyJam
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Dame el nombre del usuario");
		String name = sc.next();
		System.out.println("Dame el apellido");
		String surname = sc.next();
		System.out.println("Dame el password");
		String password = sc.next();
		System.out.println("Dame la fecha");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
		
		Usuari usuari = new Usuari(name, surname, password, date);
		
		
		
	}

}
