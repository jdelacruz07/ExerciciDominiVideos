package com.example.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {

		@Test
		public void verify() throws Exception {
			Client client = new Client();
			boolean isClient = client.verifyClient("Julio");
			
			assertEquals("Cliente nuestro" , true, isClient);
		}

}
