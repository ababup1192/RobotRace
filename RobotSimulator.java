import java.util.Random;

public class RobotSimulator{
		private Robot[] robotArray;
		private String[] robotNameArray = {"Ebi", "Kani", "Uni", "Tako", "Ika", "Maguro"};

	public RobotSimulator(){
		// ロボット登録
		register();

		// 初期状態
		printRobotInfo();

		System.out.println("レース開始！");
		for(int i=0; i<5; i++){
			for(int j=0; j<6; j++){
				if(robotArray[j] instanceof RacingRobot){
					((RacingRobot)robotArray[j]).run();
				}else if(robotArray[j] instanceof FlyingRobot){
					((FlyingRobot)robotArray[j]).fly();
				}
			}
		}
		System.out.println("レース終了！");

		// レース後
		printRobotInfo();

	}

	public void register(){
		robotArray = new Robot[6];
		Random random = new Random();

		for(int i=0; i<3; i++){
			robotArray[i] = new RacingRobot(robotNameArray[i] , random.nextInt(10));
		}
		for(int i=3; i<6; i++){
			robotArray[i] = new FlyingRobot(robotNameArray[i] , random.nextInt(10));
		}
	}

	public void printRobotInfo(){
		System.out.println("-----ロボット情報-----");
		for(int i=0; i<6; i++){
			System.out.println(robotArray[i].getInfo());
		}
		System.out.println("--------------------");
	}

	public static void main(String[] args){
		new RobotSimulator();
	}

}
