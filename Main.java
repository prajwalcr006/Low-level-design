package ParkingLot;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String args[]) {
		ParkingManagerFactory pmf = new ParkingManagerFactory();
		EntryGate entry = new EntryGate1();
		ExitGate exit = new ExitGate1();
		int parkingSpotId = 0;
		
		Map<Integer,Vehicle>mapNumberToVehicle = new HashMap<>();
		
		boolean runParkingLot = true;
		Scanner in = new Scanner(System.in);
		
		while(runParkingLot) {
			System.out.println("1 -> Add two wheeler spot, 2 -> 4 wheeler, 3 -> no addition");
			int choice = in.nextInt();
			
			if(choice == 1) {
				pmf.getParkingSpotManager("twoWheeler").addParkingSpots(new TwoWheelerParkingSpot(parkingSpotId++,false,1));
			}
			else if(choice == 2) {
				pmf.getParkingSpotManager("fourWheeler").addParkingSpots(new FourWheelerParkingSpot(parkingSpotId++,false,1));
			}
			
			System.out.println("Add any vehicle? Y/N");
			char c = in.next().charAt(0);
			
			if(c == 'Y') {
				System.out.println("Enter vehicle type to park and vehicle number");
				String type = in.next();
				int id = in.nextInt();
				
				Vehicle v = entry.enterVehicle(type, new FirstAvailableSpotStratergy(), id);
				if(v != null) {
					mapNumberToVehicle.put(id, v);
					System.out.println("Added vehicle "+v.vehicleId+" to spot "+v.ticket.spot.id);
				}
				else {
					System.out.println("NO available spots");
				}
				
			}
			
			System.out.println("Exit any vehicle: Y/N");
			c = in.next().charAt(0);
			
			if(c == 'Y') {
				System.out.println("Enter vehicle number");
				int number = in.nextInt();
				
				if(mapNumberToVehicle.containsKey(number)) {
					double bill = exit.exitVehicle(mapNumberToVehicle.get(number));
					System.out.println("Total bill is "+bill);
				}
				else {
					System.out.println("No vehicle present");
				}
			}
			
			System.out.println("Still run parking lot. Y/N");
			char ch = in.next().charAt(0);
			
			runParkingLot = (ch == 'Y');
		}
	}
}
