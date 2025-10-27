public class RobotTester
{
   public static void main(String[] args)
   {
      CommandBot r = new CommandBot();
      Command[] program = {
         new CommandBot.Move(3),
         new CommandBot.Turn(90),
         new CommandBot.Move(2),
         new CommandBot.Report()
      };
      r.executeAll(program);
      r.returnToOrigin();
   }
}
