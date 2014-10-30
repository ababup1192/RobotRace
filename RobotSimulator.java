public class RobotSimulator{

	public static void main(String[] args){
		Robot robot = new Robot(1, 0, 100);

		System.out.println("id=" + robot.getId() + ", energy=" + robot.getEnergy() + ", distance=" + robot.getDistance());

	}

}