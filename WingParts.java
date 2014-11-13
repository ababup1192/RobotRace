import java.util.Random;

public class WingParts{
  private int maxSpeed;

  public WingParts(int maxSpeed){
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed(){
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed){
    this.maxSpeed = maxSpeed;
  }

  public int boost(){
    Random random = new Random();
    int num = random.nextInt(100 + 1);
    return (int)((float)maxSpeed * (num/100.0));
  }
  public String getInfo(){
    return "WingParts(MaxSpeed=" + maxSpeed + ")";
  }
}
