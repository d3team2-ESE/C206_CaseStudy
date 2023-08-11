import java.util.ArrayList;

public class ProfileDB {

	private static final int OPTION_UPDATEProfileDETAILS = 4;
	private static final int OPTION_DELETEProfile = 3;
	private static final int OPTION_ADDNEWProfile = 2;
	private static final int OPTION_VIEWALLProfile = 1;
	private static final int OPTION_QUIT = 5;
	public static ArrayList<Profile> ProfileList = new ArrayList<Profile>();

	public static void main(String[] args) {
		    
		    Profile Profile1 = new Profile("Huda","huderzz.gmail.com", "22014459");
		    Profile Profile2 = new Profile ("Gerald","gerald@gmail.com","1111222");

		    
		    ProfileDB.addProfile(Profile1);
		    ProfileDB.addProfile(Profile2);
		  
		    int option = 0;
		    
		    while (option != OPTION_QUIT) {
		      
		      ProfileDB.menu();
		      option = Helper.readInt("Enter option > ");
		    
		      if(option == OPTION_VIEWALLProfile) {
		        
		        ProfileDB.viewAllProfile(ProfileList);
		      
		      } else if (option == OPTION_ADDNEWProfile) {
		        
		        String ProfileName = Helper.readString("Enter Profile Name > ");
		        String ProfileEmail = Helper.readString("Enter Profile Email > ");
		        String ProfilePassword = Helper.readString("Enter Profile Password > ");
		        
		        Profile newProfile = new Profile(ProfileName, ProfileEmail, ProfilePassword);
		        
		        ProfileDB.addProfile(newProfile);
		        System.out.println("Profile added into system.");
		      
		      } else if (option == OPTION_DELETEProfile) {
		        
		        ProfileDB.viewAllProfile(ProfileDB.ProfileList);
		        String ProfileName = Helper.readString("Enter Profile Name to delete: ");
		        
		        boolean exist = false;
		        
		        for (int i = 0; i < ProfileList.size(); i++) {
		          
		          String ProfileName2 = ProfileList.get(i).getProfileName();
		          if (ProfileName.contentEquals(ProfileName2)) {
		            
		            ProfileList.remove(i);
		            System.out.println("Profile deleted.");
		            exist = true;
		          }
		        }
		        //
		        
		        if (exist == false) {
		          System.out.println("No identified Profile.");
		        }
		      
		      } else if (option == OPTION_UPDATEProfileDETAILS) {
		        ProfileDB.menu2();
		        option = Helper.readInt("Enter element that needed to be changed > ");
		        
		        if (option == 1) {
		          String currentName = Helper.readString("Enter current name > ");
		          
		          String ProfileName = ProfileList.get(0).getProfileName();
		          if (currentName.equals(ProfileName)) { 
		            String newName = Helper.readString ("Enter new name > "); 
		            ProfileList.get(0).setProfileName(newName);
		            System.out.println("Name updated.");
		        }
		      }
		        if (option == 2) {
		          String currentEmail = Helper.readString("Enter current email > ");
		          
		          String ProfileEmail = ProfileList.get(0).getProfileEmail();
		          if (currentEmail.contentEquals(ProfileEmail)) {
		            String newEmail = Helper.readString("Enter new email > ");
		            ProfileList.get(0).setProfileEmail(newEmail);
		            System.out.println("Email updated.");
		          }
		        }
		        if (option == 3) {
		          String user =  Helper.readString("Enter username > ") ; 
		          boolean isFound = false; 
		          
		          for (int i = 0; i <ProfileList.size(); i++) { 
		            
		            String ProfileName = ProfileList.get(i).getProfileName();
		            if (user.equalsIgnoreCase(ProfileName)) {
		              String currentPassword = Helper.readString("Enter current password > ");
		              
		            String ProfilePassword = ProfileList.get(i).getProfilePassword();
		            if (currentPassword.equals(ProfilePassword)) { 
		              String newPassword = Helper.readString ("Enter new password > "); 
		              ProfileList.get(i).setProfilePassword(newPassword);
		              
		            }else { 
		              
		              System.out.println("The password is incorect."); 
		              
		            }
		            
		            isFound = true;
	}

}
		          break;        
		            
	            }
	            
	          }
	          if (isFound == false) { 
	            System.out.println("This  user does not exist."); 
	          }
	          if (option == 4) {
	            System.out.println("Good Bye!");
	          }
	        }
	      
	      }if(option==OPTION_QUIT)
//
	{

		System.out.println("Good Bye!");
	}

}
}

	// end of main class

	private static void menu2() {
		Helper.line(60, "=");
		System.out.println("DETAILS MENU");
		Helper.line(60, "=");
		System.out.println("1. Change name");
		System.out.println("2. Change email");
		System.out.println("3. Change password");
		System.out.println("4. Quit");

	}

	public static void menu() {
		Helper.line(60, "=");
		System.out.println("Profile MENU");
		Helper.line(60, "=");
		System.out.println("1. View all Profile");
		System.out.println("2. Add Profile");
		System.out.println("3. Delete Profile");
		System.out.println("4. Update Profile details");
		System.out.println("5. Quit");
	}

	public static void addProfile(Profile newProfile) {

		ProfileList.add(newProfile);
	}

	public static void updateProfile(Profile Profile) {
		Helper.line(60, "-");
		System.out.println("Update Profile password");
		Helper.line(60, "-");
		ProfileList.set(0, Profile);

	}

	public static void delProfile(Profile Profile) {
		Helper.line(60, "-");
		System.out.println("DELETE Profile ");
		Helper.line(60, "-");
		ProfileList.remove(Profile);

	}

	public static void viewAllProfile(ArrayList<Profile> ProfileList) {
		Helper.line(60, "-");
		System.out.println("VIEW ALL Profile");
		Helper.line(60, "-");

		String output = String.format("%-10s %-30s %-10s\n", "NAME", "EMAIL", "PASSWORD");
		for (int i = 0; i < ProfileList.size(); i++) {
			output += String.format("%-10s %-30s %-10s\n", ProfileList.get(i).getProfileName(),
					ProfileList.get(i).getProfileEmail(), ProfileList.get(i).getProfilePassword());

		}
		System.out.println(output);
	}

	public static void addProfile(ArrayList<Profile> ProfileList) {
		Helper.line(60, "-");
		System.out.println("ADD Profile DETAILS");
		Helper.line(60, "-");

		String output = String.format("%-10s %-30s %-10s\n", "NAME", "EMAIL", "PASSWORD");
		for (int i = 0; i < ProfileList.size(); i++) {
			output += String.format("%-10s %-30s %-10s\n", ProfileList.get(i).getProfileName(),
					ProfileList.get(i).getProfileEmail(), ProfileList.get(i).getProfilePassword());

		}
		System.out.println(output);
	}

}

// end of ProfileDB class