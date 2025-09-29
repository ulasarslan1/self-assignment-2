package self_assignment_2;

import java.util.List;

public class AGVMonitor {
    
    private List<AGV> agvs;

    public AGVMonitor(List<AGV> agvs) {
        this.agvs = agvs;
    }

    // Report battery levels of all AGVs
    public void checkBatteryStatus() {
        System.out.println("=== Battery Status Report ===");
        for (AGV agv : agvs) {
            System.out.println(agv.getData());
            if (agv.getBatteryLoad() < 20) {
                System.out.println("⚠️ ALERT: " + agv + " needs charging soon!");
            }
        }
        System.out.println();
    }

    // Calculate average consumption across all AGVs
    public void calculateAverageConsumption() {
        double total = 0;
        for (AGV agv : agvs) {
            total += agv.getConsumption();
        }
        double avg = total / agvs.size();
        System.out.println("Average Energy Consumption: " + avg + " kWh\n");
    }

    // Find the AGV with the highest speed
    public void findFastestAGV() {
        AGV fastest = agvs.get(0);
        for (AGV agv : agvs) {
            if (agv.getConsumption() < fastest.getConsumption()) {
                fastest = agv;
            }
        }
        System.out.println("Fastest AGV (by energy efficiency): " + fastest.getData() + "\n");
    }
}
