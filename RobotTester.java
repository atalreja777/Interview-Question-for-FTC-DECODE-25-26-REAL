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

      System.out.println("=== Running Movement Program ===");
      r.executeAll(program);

      System.out.println("\n=== Returning to Origin ===");
      r.returnToOrigin();

      System.out.println("\n=== Final Position Check ===");
      r.report();
   }
}
