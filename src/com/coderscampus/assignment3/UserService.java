
public class UserService {

	User[] users = new User[]
			
		BufferedReader fileReader=null;fileReader=new BufferedReader(new FileReader("filename"));
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
		filereader=new BufferedReader(new FileReader(data.txt));
			String line;
			while((line=reader.readline())!=null){
				String[] parts = line.split(",");
				if (parts.length == 3) {
					user.add(new User(parts[0], parts[1], parts[2]));
			}
		}
	}

public static User validateLogin(String email, String password) {
	for (User user : users) {
		if (user.getUsername().equals(email) && user.getPassword().equals(password)) {
			return user;
		}
	}
	return null;
	}
}