import java.util.*;

enum decision { REGISTRATION, LOGIN, ADMIN}

public class Main {
	public static void main(String[] args)
	{
		int number = 1;
	    decision d = decision.values()[number-1];
		while(true)
		{
			System.out.println("Registration or Login or Admin");
			switch(d)
			{
			case REGISTRATION:
				userRegistration r = new userRegistration();
				databaseInt ab = new dataBase();
				ab.addUserRegistrationdetails(r);
				System.out.println("Your UserName is : "+r.getuserName());
				break;
			case LOGIN:
				userLogin l = new userLogin();
				l.checkCredentials();
				break;
			case ADMIN:
				new Administrator();
				break;
			default:
				System.out.println("Please! enter valid desicion");
		}
	}
}
}
