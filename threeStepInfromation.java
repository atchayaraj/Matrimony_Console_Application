enum Marital_status {MARRIED, UNMARRIED, DIVORCED, AWAITING_DIVORCED,ANNULLED,widdowed}

enum Educationl_Qulaification {SSLC, HSC, Bachelors_Degree, Masters_Degree}

enum BD_Degree {BE,BDes,Bsc,BA,BBA,BMS,Bcom,BFA,LLb}

enum BE { Computer_Science, Electrical_and_Electronics, Mechatronics, Mechanical_Engineering,Electrical_and_communication }

enum BSc { Mathematics, Biotechnology, Geography, Statistic, Agriculture, Hospitality, Fashion_design, Computer_Science,Physics}

enum State { TAMIL_NADU,KERALA,KARNATAKA,ANDRA_PRADESH,ASSAM,GOA,JAMMU_N_KASHMIR,TELUNGANA,MADHYA_PRADESH,MAHARASHTRA,ARUNACHAL_PRADESH}

enum Annual_Income { Onelakh_to_Twolakh, Twolakh_to_Fourlakh,Fourlakh_to_Sixlakh}

class threeStepInformation{
	private String maritalStatus;
	private int Height;
	private String residentialAddress;
	private String educationalQualification;
	private String degree;
	private String workingStatus;
	private float annualIncome;
	private String fatherName;
	private String motherName;
	private String adhaarNumber;
	String username;
	threeStepInformation(String username){
		this.username = username;
	}
	public void getmaritalStatus(){}
	public void getHeight(){}
	public void getresidentialAddress(){}
	public void geteducationalQualification(){}
	public void getworkingStatus(){}
	public void getannualIncome(){}
	public void getfatherName(){}
	public void gemotherName(){}
}
