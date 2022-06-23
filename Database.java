import java.util.ArrayList;

class dataBase implements databaseInt{
	private ArrayList<userRegistration> list,list1 = new ArrayList<userRegistration>(); 
	private ArrayList<userPrivacy> list2 = new ArrayList<userPrivacy>();
	
	public void addUserRegistrationdetails(userRegistration r){}
	public boolean checkUserLoginCredentials(String username, String password) {
		for(userRegistration ur : list)
		{
			if(ur.getuserName().equals(username) && ur.getpassWord().equals(password))
			{
				return true;
			}
		}
		return false;
	}
	public void displayAll() {}
	public void addUserThreeStepsInformation(threeStepInformation t) {}
	public void getOTPconformation() {}
	public boolean checkUserIsExisting(String username) {
		return false;
	}
	public void addUserPrivacy(String username) {}
	ArrayList<userRegistration> call(){
		return list;
	}
}
