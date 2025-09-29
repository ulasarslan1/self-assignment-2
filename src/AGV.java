
package self_assignment_2;


public class AGV {
	
	private String ID;
	private double batteryLoad;
	private double consumption;
	private long chargingTime;
	private Position position;
	private float maxspeed;
	private float actspeed;
	
	public AGV(String iD, double batteryLoad, double consumption, 
			long chargingTime, Position position, float maxspeed,
			float actspeed) {
		this.ID = iD;
		this.batteryLoad = batteryLoad;
		this.consumption = consumption;
		this.chargingTime = chargingTime;
		this.position = position;
		this.maxspeed = maxspeed;
		this.actspeed = actspeed;
	}
	
	
	public double getConsumption() {
		return consumption;
	}

	
 public double getBatteryLoad() {
        return batteryLoad;
    }
 
	public void setData(String id, double battery, double cons, 
			long time, Position pos, float maxspeed, float actspeed) {
		this.ID = id;
		this.batteryLoad = battery;
		this.consumption = cons;
		this.chargingTime = time;
		this.position = pos;
		this.maxspeed = maxspeed;
		this.actspeed = actspeed;
	}
	
	public String getData() {
		return "AGV [ID = " + ID + ", batteryLoad = " + "%" +  batteryLoad + ", consumption = " + consumption + ", chargingTime = "
				+ chargingTime + " m" +  ", position = " + position + ", maxspeed = " + maxspeed + " km/h"+ ", actspeed = " + actspeed + " km/h" + "]";
	}


	@Override
	public String toString() {
		return ID;
	}
	
	
}

