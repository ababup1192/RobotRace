public class Robot{
	private int id;
	private String name;
	private int distance;
	private int energy;

	public Robot(int id, String name, int distance, int energy){
		this.id = id;
		this.name = name;
		this.distance = distance;
		this.energy = energy;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
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

	public String getInfo(){
		return String.format("Robot(id=%d, name=%s, energy=%d, distance=%d)", id, name, energy, distance);
	}
}