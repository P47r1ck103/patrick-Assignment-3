
package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;

public class UserService {

	User[] usersArray = new User[100];
			
		BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
	String line;

	while((line=fileReader.readLine())!=null)
	{
		String[] parts = line.split(",");

		if (parts.length == 3) {
			String username = parts[0];
			String password = parts[1];
			String name = parts[2];
//			users.add(new User(username, password, name)); needs changed
		}
	}
//		filereader=new BufferedReader(new FileReader(data.txt)) {
//			String line;
//			while((line=reader.readline())!=null){
//				String[] parts = line.split(",");
//				if (parts.length == 3) {
//					users.add(new User(parts[0], parts[1], parts[2]));
//			}
//		}
	

public static User validateLogin(String email, String password) {
	User[] users;
	for (User user : users) {
		if (user.getUsername().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
			return user;
		}
	}
	return null;
	}
}
}