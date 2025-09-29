
import java.util.Arrays;

public class IOperation {
	
	private String operationID;
	private String description;
	private long nominalTime;
	private AGV[] resources;
	private int agvCount = 0;
	
	
	public IOperation(String operationID, String description, long nominalTime, int maxAgvCount) {
		this.operationID = operationID;
		this.description = description;
		this.nominalTime = nominalTime;
		this.resources = new AGV[maxAgvCount];
	}
	
	public long getNominalTime() {
		return nominalTime;
	}


	public void addResources(AGV agv) {
		if (agvCount < resources.length) {
            resources[agvCount] = agv;
            agvCount++;
        } else {
        	System.out.println("No more AGV can be added");
        }
	}
	
	public AGV[] getResources() {
		return resources;
	}
	

	@Override
	public String toString() {
		return operationID;
	}

	public void setData(String id, String description, long nominalTime) {
	     this.operationID = id;
	     this.description = description;
	     this.nominalTime = nominalTime;
	}
	
	public String getData() {
		return "IOperation [operationID = " + operationID + ", description = " + description + ", nominalTime = "
				+ nominalTime + " m" + ", resources = " + Arrays.toString(resources) + "]";
	}
	
	

	
	
	
	
	
	
}


