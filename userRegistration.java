enum gender {MALE,FEMALE}

enum Religion { HINDU, ISLAM, CHRISTIANITY,SIKHISM, BUDDISM}

enum Hindu_Caste {ADHI_DRAVIDAR,BRAHMIN_IYENGAR, BRAHMIN_IYER,DEVAR, GOUNDER, CHETTIAR, NAYAKAR , NAIDU, KALLAR, AGAMUDAIYAR}

enum Islam_Caste { MEMON,ROWTHER,SHAFI,SHEIKH,MARAICAR,LEBBAI}

enum Mother_Tongue { TAMIL, TELUGU, MALAIYALAM, HINDI, KANNADA, MARATI }

class userRegistration{
	private static String Name;
	private String DOB;
	private String Gender;
	private String Religion;
	private String Caste;
	private String Subcaste;
	private String Mother_tongue;
	private String Mobile_number;
	private String Email_id;
	private String Create_password;
	private String userName;
	private static int value = 0000;
	userRegistration(){
		userName = createuserName();
	}
	public void getName(){}
	public void getDOB(){}
	public void getGender(){}
	public void getReligion(){}
	public void getCaste(){}
	public void getSubcaste(){}
	public void getMother_tongue(){}
	public void getMobile_number(){}
	public void getEmail_id(){}
	public String getpassWord(){
		return null;
		}
	private static String createuserName() {
		++value;
		return (Name+value);
	}
	public String getuserName() {
		return userName;
	}
}

