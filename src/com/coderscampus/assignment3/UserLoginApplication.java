
public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService("data.txt");
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		int maxAttempts = 5;

		while (attempts < maxAttempts) {
			System.out.println("Enter your email: ");
			String email = scanner.nextLine();
			
			System.out.println("Enter your password: ");
			String password = scanner.nextLine();
			
			User user = UserService.validateLogin(email, password);
			
			if (user != null) {
				System.out.println("welcome " + ((User) user).getName() + ",");
				
				return;
			}else {
				attempts++;
				if (attempts < maxAttempts) {
					System.out.println("Invalid login, please try again");
				 }
			 }				
		 }
		System.out.println("Too many failed login attempts, you are now locked out.");
		scanner.close
	  }
	}

}
