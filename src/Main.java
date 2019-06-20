import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//StudyJam
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Usuari usuari = new Usuari();
//		Video video = new Video();
		int select = 0;
		do { 
		System.out.println("1) Eres cliente ");
		System.out.println("2) No eres cliente, hazte cliente! ");
		System.out.println("3) Salir ");
		
		select = sc.nextInt();
		} while  (select != 1 && select != 2 && select !=3);
		
		if (select == 1) {
			System.out.print("Dame el nombre del usuario");
			String name = sc.next();
			usuari.verifyClient(name);
			optionUser();
		} else if (select == 2){
			System.out.println("Darse de alta ");}
		else {System.out.println("Adeuuuuu");
		}
		  
	}
		
		private static void optionUser() {
		// TODO Auto-generated method stub
		System.out.println("1) Crear un nuevo video");
		System.out.println("2) Ver la lista de videos ");
	}

		public void watchVideo(){
		System.out.print("Dame el nombre del usuario");
		String name = sc.next();
		name = null;
//		name = null;
//		System.out.println("Dame el apellido");
//		String surname = sc.next();
//		System.out.println("Dame el password");
//		String password = sc.next();
//		System.out.println("Dame la fecha");
//		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
		
		try {
			Usuari usuari = new Usuari(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Video video = new Video();
		
		
		}
}
