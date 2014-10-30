public class RacingRobot{
	private int id;
	private static int maxId;
	private String name;
	private int distance;
	private int energy;
	private FootParts footParts;
	private int speed;

	public RacingRobot(int id, String name, int distance, int energy, int speed, FootParts footParts){
		this.id = id;
		maxId = id;
		this.name = name;
		this.distance = distance;
		this.energy = energy;
		this.speed = speed;
		this.footParts = footParts;
	}

	public RacingRobot(String name, int speed){
		this(++maxId, name, 0, 100, speed, new FootParts(15));
	}

	public RacingRobot(String name){
		this(name, 10);
	}

	public void run(){
		if(isRunning()){
			energy = energy - 20;
			distance += speed + footParts.getSpeed();
		}
	}

	public boolean isRunning(){
		return energy >= 0;
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

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public FootParts getFootParts(){
		return footParts;
	}

	public void setFootParts(FootParts footParts){
		this.footParts = footParts;
	}

	public String getInfo(){
		return String.format("Robot(id=%2d, name=%6s, energy=%d, distance=%3d, %s)", id, name, energy, distance, footParts.getInfo());
	}
}