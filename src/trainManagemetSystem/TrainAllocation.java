package trainManagemetSystem;

import java.util.Scanner;

public class TrainAllocation {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TrainSystem trainSystem = new TrainSystem();
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nEnter your choice:");
	            System.out.println("1. Enter Profile");
	            System.out.println("2. Enter Train Choice");
	            System.out.println("3. Display Person Information");
	            System.out.println("4. Display Complete Information");
	            System.out.println("5. Display Train Status");
	            System.out.println("6. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine();  // consume newline

	            switch (choice) {
	                case 1:

	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter age: ");
	                    int age = sc.nextInt();
	                    trainSystem.addUser(name, age);
	                    break;
	                case 2:
	                    System.out.print("Enter your login ID: ");
	                    String loginId = sc.nextLine();
	                    System.out.println("Available Trains:");
	                    System.out.println("1. Train 1");
	                    System.out.println("2. Train 2");
	                    System.out.println("3. Train 3");
	                    System.out.print("Select a train: ");
	                    int trainChoice = sc.nextInt();
	                    trainSystem.selectTrain(loginId, trainChoice);
	                    break;
	                case 3:
	                    System.out.print("Enter your login ID: ");
	                    loginId = sc.nextLine();
	                    trainSystem.displayUserDetail(loginId);
	                    break;
	                case 4:
	                    trainSystem.displayAllProfile();
	                    break;
	                case 5:
	                    trainSystem.displayTrainStatus();
	                    break;
	                case 6:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }

	        sc.close();
	        System.out.println("Exiting the application.");
	    }
}
