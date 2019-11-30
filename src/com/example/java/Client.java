package com.example.java;

import java.util.Date;

public class Client {
	private String name = null;
	private String surname = null;
	private String password = null;
	private Date date = new Date();

	public Client(String name, String surname, String password, Date date) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.date = date;
	}

	public Client() {
		super();
	}

	public boolean verifyClient(String name2) throws Exception {
		boolean isUsuari = false;
		String name = Main.CLIENTONE;
		if (name.equals(name2)) {
			System.out.println("Cliente existente en la BD");
			isUsuari = true;
		} else {
			System.out.println("Cliente no encontrado ");
			isUsuari = false;
		}
		return isUsuari;
	}

	public void checkdata(String data) throws Exception {
		if (data != null) {
			System.out.println("Datos correctos ");
		} else {
			throw new Exception("Campo vacio ");
		}
	}
	
}
