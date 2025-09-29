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
		
		 IOperation op1 = new IOperation("OP-1", "Load", Duration.ofHours(3).toMinutes(), 2);
        op1.addResources(agv1);
        op1.addResources(agv2);
        
        
        
        IOperation op2 = new IOperation("OP-2", "Carry", Duration.ofHours(3).plusMinutes(30).toMinutes(), 1);
        op2.addResources(agv3);

        
        IOperation op3 = new IOperation("OP-3", "Discharge", Duration.ofHours(1).toMinutes(), 3);
        
        op3.addResources(agv4);
        op3.addResources(agv2);
        op3.addResources(agv1);
        

		
		// Industrialprocess - Ulas
		IndustrialProcess process1 = new IndustrialProcess("Process-1", 3);
        process1.addProcess(op1);
        process1.addProcess(op2);
        process1.addProcess(op3);
        
        
        IndustrialProcess process2 = new IndustrialProcess("Process-2", 2);
        process2.addProcess(op2);
        process2.addProcess(op3);

		     // After adding operations to your processes
        process1.printProcessInfo();  // prints details of Process 1
        process2.printProcessInfo();  // prints details of Process 2
		
		// Other - Mrunal
	}
}


