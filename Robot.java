public class Robot{
	private int id;
	private int distance;
	private int energy;

	public Robot(int id, int distance, int energy){
		this.id = id;
		this.distance = distance;
		this.energy = energy;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getDistance(){
		return distance;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getEnergy(){
		return energy;
	}

	public void setEnergy(int energy){
		this.energy = energy;
	}



}