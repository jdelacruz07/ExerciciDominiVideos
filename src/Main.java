import java.util.Scanner;

//StudyJam
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Usuari usuari = new Usuari();
		int select = 0;
		do {
			System.out.println("1) Eres cliente ");
			System.out.println("2) No eres cliente, hazte cliente! ");
			System.out.println("3) Salir ");

			select = sc.nextInt();
		} while (select != 1 && select != 2 && select != 3);

		boolean isUser = false;
		String name = null;
		if (select == 1) {
			System.out.print("Dame el nombre del usuario");
			name = sc.next();
			isUser = usuari.verifyClient(name);
			if (isUser) {
				optionUser();
			} else {
				System.out.println("1) Darse de alta");
				System.out.println("2) Salir");
				int selectAlta = sc.nextInt();
				if (selectAlta == 1) {
					usuari = new Usuari(name);
					System.out.println("Alta Correcta");
				} else {
					System.out.println("Adeuuuuu");
				}
			}

		} else if (select == 2) {
			System.out.print("Dame el nombre del usuario");
			name = sc.next();
			isUser = usuari.verifyClient(name);
			if (isUser) {
				System.out.println("Error cliente ya dado de alta!");
			} else {
				usuari = new Usuari(name);
				System.out.println("Alta Correcta");
			}
		} else {
			System.out.println("Adeuuuuu");
		}

	}

	private static void optionUser() {
		// TODO Auto-generated method stub
		System.out.println("1) Crear un nuevo video");
		System.out.println("2) Ver la lista de videos ");
		int select = sc.nextInt();
		if (select == 1) {
			Video video = new Video();
		} else {
			Video video = new Video();
			String title = video.title;
			title = "Los barbaros";
			System.out.println(title);
		}
	}

}
