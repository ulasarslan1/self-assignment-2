package self_assignment_2;
import java.time.Duration;

public class WarehouseSimulation {
	public static void main(String args[]) {
		
		// AGV - Ashwin
		AGV agv1 = new AGV("agv1", new Position(0,0), 100.0, 70.0, Duration.ofHours(3).toMinutes(), 250, 230);
		AGV agv2 = new AGV("agv2", new Position(60,20), 100.0, 80.0, Duration.ofHours(1).toMinutes(), 170, 110);
		AGV agv3 = new AGV("agv3", new Position(10,30), 100.0, 20.0, Duration.ofHours(5).toMinutes(), 230, 190);
		AGV agv4 = new AGV("agv4", new Position(3,9), 100.0, 40.0, Duration.ofHours(2).toMinutes(), 160, 145);
		
		System.out.println(agv1.getData());
		System.out.println("");
		System.out.println(agv2.getData());
		System.out.println("");
		System.out.println(agv3.getData());
		System.out.println("");
		System.out.println(agv4.getData());
		System.out.println("");
		
		// IoOperations - Adithya
		
		// Industrialprocess - Ulas
		
		// Other - Mrunal
	}
}
