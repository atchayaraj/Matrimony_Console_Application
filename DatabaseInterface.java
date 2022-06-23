public interface databaseInt {
	void addUserRegistrationdetails(userRegistration r);
	boolean checkUserLoginCredentials(String username, String password);
	void addUserThreeStepsInformation(threeStepInformation t);
	void getOTPconformation();
	boolean checkUserIsExisting(String username);
	void addUserPrivacy(String username);
	void displayAll();
}
