public class FootParts{
	private int speed;

	public FootParts(int speed){
		this.speed = speed;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public String getInfo(){
		return "FootParts(speed=" + speed + ")";
	}
}