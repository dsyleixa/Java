import josx.platform.rcx.*;
import josx.robotics.*;


public class DriveForward implements Behavior {     //class name required

   public boolean takeControl(){
      return true;
   }
   
   public void suppress(){
      Motor.A.stop();
      Motor.C.stop();
   }
   
   public void action(){
      Motor.A.forward();
      Motor.C.forward();
   }
}

