
package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	User[] usersArray = new User[4];

	public void readFile() {
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));

			String line;
			int counter = 0;
			while ((line = fileReader.readLine()) != null) {

				String[] parts = line.split(",");

				if (parts.length == 3) {
					String username = parts[0];
					String password = parts[1];
					String name = parts[2];
					
					usersArray[counter] = new User(username, password, name); 
					System.out.println(usersArray[counter]);
				}
				counter++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}


		
	public User validateLogin(String email, String password) {
		
		for (User user : usersArray) {
			if (user.getUsername().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}