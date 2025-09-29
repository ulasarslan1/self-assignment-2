package self_assignment_2;

import java.time.Duration;
import java.util.*;

public class WarehouseSimulation {
    public static void main(String[] args) {
    	
    	AGV agv1 = new AGV("AGV-1", 60.0, 40.0, Duration.ofHours(3).toMinutes(), new Position(200, 400), 300, 150);
        AGV agv2 = new AGV("AGV-2", 80.0, 30.0, Duration.ofHours(2).toMinutes(), new Position(400, 300), 250, 120);
        AGV agv3 = new AGV("AGV-3", 70.0, 25.0, Duration.ofHours(2).plusMinutes(30).toMinutes(), new Position(100, 500), 320, 100);
        AGV agv4 = new AGV("AGV-4", 90.0, 50.0, Duration.ofHours(0).plusMinutes(30).toMinutes(), new Position(150, 360), 270, 130);
        
        
//        System.out.println(agv1.getData());
//        System.out.println("");
//        System.out.println(agv2.getData());
//        System.out.println("");
//        System.out.println(agv3.getData());
//        System.out.println("");
//        System.out.println(agv4.getData());
//        System.out.println("");

        
        IOperation op1 = new IOperation("OP-1", "Load", Duration.ofHours(3).toMinutes(), 2);
        op1.addResources(agv1);
        op1.addResources(agv2);
        
        
//        System.out.println(op1.getData());
//        
//        System.out.println("");
        
        IOperation op2 = new IOperation("OP-2", "Carry", Duration.ofHours(3).plusMinutes(30).toMinutes(), 1);
        op2.addResources(agv3);
        
//        System.out.println(op2.getData());
        
        IOperation op3 = new IOperation("OP-3", "Discharge", Duration.ofHours(1).toMinutes(), 3);
        
        op3.addResources(agv4);
        op3.addResources(agv2);
        op3.addResources(agv1);
        
//        System.out.println("");
//        System.out.println(op3.getData());       
//        System.out.println("");
        
       
        IndustrialProcess process1 = new IndustrialProcess("Process-1", 3);
        process1.addProcess(op1);
        process1.addProcess(op2);
        process1.addProcess(op3);
        
        
        IndustrialProcess process2 = new IndustrialProcess("Process-2", 2);
        process2.addProcess(op2);
        process2.addProcess(op3);
        
        System.out.println("Information of Process 1");
        System.out.println("-------------------");
        System.out.println("Total Resources: " + process1.processResources());
        System.out.println("Total Duration: " + process1.processDuration() + " minutes");
        System.out.println("Total Energy Consumption: " + process1.totalEnergyConsumption() + " kwh");
        System.out.println(" ");
        System.out.println("Information of Process 2");
        System.out.println("-------------------");
        System.out.println("Total Resources: " + process2.processResources());
        System.out.println("Total Duration: " + process2.processDuration() + " minutes");
        System.out.println("Total Energy Consumption: " + process2.totalEnergyConsumption() + " kwh");
        
     // AGV Monitoring Section
        System.out.println("\n=== Monitoring Report ===");
        List<AGV> agvList = Arrays.asList(agv1, agv2, agv3, agv4);
        AGVMonitor monitor = new AGVMonitor(agvList);

        monitor.checkBatteryStatus();
        monitor.calculateAverageConsumption();
        monitor.findFastestAGV();
    	
    	
    	
    }
}
