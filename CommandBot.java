public class CommandBot extends RobotBase implements Robot
{
   private Command[] history;
   private int count;
   private WheelPair wheels;
   private Gyro gyro;

   public CommandBot()
   {
      // TODO
   }

   public void execute(Command c)
   {
      // TODO
   }

   public void executeAll(Command[] cmds)
   {
      // TODO
   }

   public void returnToOrigin()
   {
      // TODO
   }

   public void moveForward(int steps)
   {
      // TODO
   }

   public void turnBy(int degrees)
   {
      // TODO
   }

   public static class Move implements Command
   {
      private int steps;

      public Move(int s)
      {
         // TODO
      }

      public void apply(Robot r)
      {
         // TODO
      }

      public Command inverse()
      {
         // TODO
         return null;
      }

      public String name()
      {
         // TODO
         return null;
      }
   }

   public static class Turn implements Command
   {
      private int degrees;

      public Turn(int d)
      {
         // TODO
      }

      public void apply(Robot r)
      {
         // TODO
      }

      public Command inverse()
      {
         // TODO
         return null;
      }

      public String name()
      {
         // TODO
         return null;
      }
   }

   public static class Report implements Command
   {
      public void apply(Robot r)
      {
         // TODO
      }

      public Command inverse()
      {
         // TODO
         return null;
      }

      public String name()
      {
         // TODO
         return null;
      }
   }

   public static class WheelPair extends RobotPart
   {
      public WheelPair()
      {
         super("Wheels");
      }

      public boolean healthy()
      {
         // TODO
         return false;
      }
   }

   public static class Gyro extends RobotPart
   {
      public Gyro()
      {
         super("Gyro");
      }

      public boolean healthy()
      {
         // TODO
         return false;
      }
   }
}
