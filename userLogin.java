import java.util.*;

enum userChoice { SEARCHFILTER, USERPRIVACY}

class userLogin{
	String userName;
	String passWord;
	boolean flag;
	int choiceNumber=1;
	void checkCredentials() {
		System.out.println("Enter the username : ");
		System.out.println("Enter the Password : ");
		databaseInt di = new dataBase();
		flag = di.checkUserLoginCredentials(userName,passWord);
		if(flag) {
			System.out.println("You successfully loged-in ");
			flag=di.checkUserIsExisting(userName);
			if(flag)
			{
				userChoice();
			}
			else
			{
				threeStepInformation  si = new threeStepInformation(userName);
				di.addUserThreeStepsInformation(si);
				userChoice();
			}
		}
	}
	void userChoice() {
		new displayProfiles();
		userChoice uc = userChoice.values()[choiceNumber];
		switch(uc)
		{
		case SEARCHFILTER:
			searchFilters sf = new searchFilters();
			sf.filter();
			break;
		case USERPRIVACY:
			userPrivacy up = new userPrivacy();
			up.setRestriction();
			databaseInt db = new dataBase();
			db.addUserPrivacy(userName);
			break;
		default:
			break;
		}
		
	}
	
}
