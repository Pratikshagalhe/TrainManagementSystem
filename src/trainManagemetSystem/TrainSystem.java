package trainManagemetSystem;

import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.Map;

class TrainSystem{

	private static final int totalTrain =3;
	private static final int totalBoogies=3;
	private static final int seatPerBoogie =2;
	
	private Map<String,User> userProfile = new HashMap<>();
	private int[][][] seats = new int[totalTrain][totalBoogies][seatPerBoogie];
	private int userCount =0;
	
	public String addUser(String name,int age) {
		String loginId = "User"+(++userCount);
		userProfile.put(loginId, new User(name,age));
		System.out.println("Register successfully. Your Login Id :"+loginId);
		return loginId;
	}
	
	public void selectTrain(String LoginId,int trainchoice) {
		
		User user = userProfile.get(LoginId);
		
		if(user != null) {
			for(int i=0;i<totalBoogies;i++) {
				for(int j=0; j<seatPerBoogie;j++) {
					if(seats[trainchoice -1][i][j]==0) {
						seats[trainchoice-1][i][j] = 1;
						user.avilableTrain("Train"+trainchoice , i+1,j+1);
						System.out.println("seat booked successfully"+trainchoice);
						return;
						
					}
				}
			}
			System.out.println("No seats available in train" + trainchoice);
		}else {
			System.out.println("Invalid login ID");
		}
	
	}
	
	public void displayUserDetail(String loginId) {
		User user = userProfile.get(loginId);
		if(user != null) {
			System.out.println(user);
		}
		else {
			System.out.println("Invalid Login ID");
		}
	}
	
	public void displayAllProfile() {
		if(userProfile.isEmpty()) {
			System.out.println("No register users");
		}
		else {
			userProfile.values().forEach(System.out::println);
		}
	}
	
	  public void displayTrainStatus() {
	        for (int i = 0; i < totalTrain; i++) {
	            System.out.println("Train " + (i + 1) + " Status:");
	            for (int j = 0; j < totalBoogies; j++) {
	                int bookedSeats = 0;
	                for (int k = 0; k < seatPerBoogie; k++) {
	                    if (seats[i][j][k] == 1) {
	                        bookedSeats++;
	                    }
	                }
	                System.out.println("Boogie " + (j + 1) + ": " + bookedSeats + "/" + seatPerBoogie + " seats booked.");
	            }
	        }
	    }

}
