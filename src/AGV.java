package self_assignment_2;

public class AGV {

	private double batteryLoad;
	private double consumption;	
	private float maxSpeed;
	private float actSpeed;
	private String stringId;
	private long chargingTime;
	private Position pos;
	
	public AGV (String loc_stringId, Position loc_position, double loc_batteryLoad,
			double loc_consumption,long loc_chargingTime, float loc_maxSpeed, float loc_actSpeed) {
		this.stringId = loc_stringId;
		this.pos = loc_position;
		this.batteryLoad = loc_batteryLoad;
		this.consumption = loc_consumption;
		this.chargingTime = loc_chargingTime;
		this.maxSpeed = loc_maxSpeed;
		this.actSpeed = loc_actSpeed;		
	}
	
	public void setdata(String loc_stringId, Position loc_position, double loc_batteryLoad,
			double loc_consumption,long loc_chargingTime, float loc_maxSpeed, float loc_actSpeed) {
		this.stringId = loc_stringId;
		this.pos = loc_position;
		this.batteryLoad = loc_batteryLoad;
		this.consumption = loc_consumption;
		this.chargingTime = loc_chargingTime;
		this.maxSpeed = loc_maxSpeed;
		this.actSpeed = loc_actSpeed;		
	}
	
	public String getData(){
		return (" AGV ID = " + stringId + ", Position = " + pos +
				", Battery " + batteryLoad + ", Consumption = " + consumption + 
				", Charging Time = " + chargingTime + ", Max speed = " + maxSpeed + 
				", Actual speed = " + actSpeed);
	}
	
	public double getConsumption() {
		return consumption;
	}
}