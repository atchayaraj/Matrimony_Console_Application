enum adminUsage{DISPLAY,REMOVE}

class Administrator extends dataBase{
	
	String adminPassword = "matriunder@Ad23";
	String checkAdminPassword;
	int adminchoice = 1;
	static int flag = 0;
	void adminAuthentication() {
		checkAdminPassword=""; 
		if(checkAdminPassword.equals(adminPassword))
		{
			System.out.println("Welcome! Admin");
			adminUsage au = adminUsage.values()[adminchoice];
			switch(au)
			{
			case DISPLAY:
				displayAll();
				break;
			case REMOVE:
				removeUser();
				break;
			default:
				break;
			}
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	private void removeUser() {}
}
