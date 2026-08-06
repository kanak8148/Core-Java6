package Exception;

public class TestLoginException {
	public static void main(String[] args) {
		String login = "login@gmail.com";
		
		if(login=="admin@") {
			System.out.println("user  found");
			
		}else {
			throw new LoginException();
		}
		
	}

}
