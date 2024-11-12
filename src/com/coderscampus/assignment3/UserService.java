
package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
<<<<<<< HEAD

public class UserService {

	User[] usersArray = new User[100];
			
		BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
	String line;
=======
import java.io.IOException;

public class UserService {

	User[] usersArray = new User[4];
>>>>>>> b2fdf423d016eccafb3b2a7a63faff7fa9fe673d

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

<<<<<<< HEAD
public static User validateLogin(String email, String password) {
	User[] users;
	for (User user : users) {
		if (user.getUsername().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
			return user;
=======

		
	public User validateLogin(String email, String password) {
		
		for (User user : usersArray) {
			if (user.getUsername().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
>>>>>>> b2fdf423d016eccafb3b2a7a63faff7fa9fe673d
		}
		return null;
	}
}
}