public class FlyingRobot extends Robot implements Forwardable{
  protected WingParts wingParts;
  protected int speed;

  public FlyingRobot(int id, String name, int distance, int energy, int speed, WingParts wingParts){
    super(id, name, distance, energy);
    this.speed = speed;
    this.wingParts = wingParts;
  }

  public FlyingRobot(String name, int speed){
    this(++maxId, name, 0, 100, speed, new WingParts(50));
  }

  public FlyingRobot(String name){
    this(name, 10);
  }

  public void fly(){
    if(isFlying()){
      energy = energy - 30;
      distance += speed + wingParts.boost();
    }
  }

  public void forward(){
    fly();
  }

  public boolean isFlying(){
    return energy >= 0;
  }

  public int getSpeed(){
    return speed;
  }

  public void setSpeed(int speed){
    this.speed = speed;
  }

  public WingParts getWingParts(){
    return wingParts;
  }

  public void setWingParts(WingParts wingParts){
    this.wingParts = wingParts;
  }

  public String getInfo(){
    return String.format("FlyingRobot(id=%2d, name=%6s, energy=%d, distance=%3d, %s)", id, name, energy, distance, wingParts.getInfo());
  }
}
