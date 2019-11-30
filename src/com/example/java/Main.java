package com.example.java;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final String CLIENTONE = "Julio";
	static final String TITLEOFVIDEO = "Los Barbaros";
	
	public static void main(String[] args) throws Exception {
		
		int select = selectionMenu();

		if (select == 1) {
			optionClient();

		} else if (select == 2) {
			newClient();
		} else {
			System.out.println("Adeuuuuu");
		}
	}

	public static int selectionMenu() {
		int select = 0;
		do {
			select = askInformationInteger("1) Eres cliente\n"
										 + "2) No eres cliente, hazte cliente!\n"
										 + "3) Salir");
		} while (select != 1 && select != 2 && select != 3);
		return select;
	}

	private static void optionClient() throws Exception {
		Client client = new Client();
		boolean isUser;
		String nameclient = askInformationString("Dime tu nombre ");
		isUser = client.verifyClient(nameclient);
		if (isUser) {
			optionCustomer();
		} else {
			int selection = askInformationInteger("1) Darse de alta\n"
										        + "2) Salir");
			if (selection == 1) {
				System.out.println("Alta Correcta");
			} else {
				System.out.println("Adeuuuuu");
			}
		}
	}

	private static void newClient() throws Exception {
		Client client = new Client();
		boolean isUser;
		String name;
		name = askInformationString("Dame tu nombre ");
		isUser = client.verifyClient(name);
		if (isUser) {
			System.out.println("Error: cliente ya dado de alta!");
		} else {
			System.out.println("Alta Correcta");
		}
	}

	private static void optionCustomer() {
		int selection = askInformationInteger("1) Crear un nuevo video\n" 
											+ "2) Ver la lista de videos ");
		if (selection == 1) {
			String videoName = askInformationString("Dame el nombre del video");
			Video video = new Video();
			video.addTags(videoName);
		} else {
			Video video = new Video();
			System.out.println(video.showListOfVideos());
		}
	}

	private static String askInformationString(String data) {
		System.out.print(data);
		String name = sc.next();
		return name;
	}

	private static int askInformationInteger(String data) {
		System.out.print(data);
		int selection = sc.nextInt();
		return selection;
	}

	
}
