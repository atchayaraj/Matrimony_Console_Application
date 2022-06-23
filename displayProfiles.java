import java.util.ArrayList;

enum profileOptions {INVITE, ACCEPT, DECLINE, REPORT}

class displayProfiles{
	 int optionsNumber = 1;
     String username;
     ArrayList<userRegistration> urr;
     displayProfiles(){
    	 getUserRegistrationListVar();
    	 for(userRegistration r :urr ) {}
    	 UserOptions();
     }
     displayProfiles(int age,String Religion,String caste,String educationalqualification,String maritalstatus,String residentialstate){
    	 for(userRegistration r :urr ) {}
    	 UserOptions();
     }
     void getUserRegistrationListVar(){
    	 dataBase td =  new dataBase();
    	 urr = td.call();
    	 }
     private void UserOptions() {
    	 profileOptions po = profileOptions.values()[optionsNumber];
    	 switch(po)
    	 {
    	 case INVITE:
    		Invitation iv = new Invitation(username);
    		break;
    	 case ACCEPT:
    		invitationAcceptDecline ad = new invitationAcceptDecline();
    		ad.acceptInvitation();
    		break;
    	 case DECLINE:
    		invitationAcceptDecline id = new invitationAcceptDecline();
    		id.declineInvitation();
    		break;
    	 case REPORT:
    		reportUser r = new reportUser(username);
    		break;
    	 default:
    		break;
    	 }
     }   
}
