package eg1;

import java.util.HashSet;
import java.util.Set;

public class Flight {
	public static void main(String args[]) {
		Set<Flight1> flightList = new HashSet<>();
		flightList.add(new Flight1(0111, "Boeing", 100));
		
		System.out.println("Printing all airplane details: \n");
		printFlight(flightList);
		
	}
	public static void printFlight(Set<Flight1> flightList) {
		for (Flight1 f: flightList) {
			System.out.println(f);
		}
	}
}
