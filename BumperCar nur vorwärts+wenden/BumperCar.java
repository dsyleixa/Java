import josx.platform.rcx.*;
import josx.robotics.*;


public class BumperCar {


   public static void main(String [] args) {

      Behavior b1 = new DriveForward();
      Behavior b2 = new HitWall();
      Behavior []bArray = {b1,b2};
      Arbitrator arby = new Arbitrator(bArray);

      arby.start();

      
   }
}

