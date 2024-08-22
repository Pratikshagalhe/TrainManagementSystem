package trainManagemetSystem;
import java.util.*;

public class User {

	String name;
	int age;
	String trainName;
	int seatNumber;
	int boogieNumber;
	
	User(String name,int age){
		this.name=name;
		this.age =age;
	}
	
	void avilableTrain(String trainName,int boogieNumber,int seatNumber) {
		this.trainName=trainName;
		this.boogieNumber=boogieNumber;
		this.seatNumber=seatNumber;
	}

	  @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Train: " + trainName + 
	               ", Boogie: " + boogieNumber + ", Seat: " + seatNumber;
	    }
}
