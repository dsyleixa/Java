import josx.platform.rcx.*;
import josx.robotics.*;


public class HitWall implements Behavior {     //class name required
   public boolean takeControl(){
      return Sensor.S2.readBooleanValue();
   }

   public void suppress() {
      Motor.A.stop();
      Motor.C.stop();
   }
   
   public void action(){
      Motor.A.backward();
      Motor.C.backward();
      try{
         Thread.sleep(1000);
      }
      catch(Exception e){
      }
      Motor.A.stop();
      try{
         Thread.sleep(300);
      }
      catch(Exception e){
      }
      Motor.C.stop();
   }
}

