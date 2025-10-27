//DO NOT EDIT THIS CLASS

public abstract class RobotBase
{
   protected int x = 0;
   protected int y = 0;
   protected String dir = "NORTH";

   public void move(int steps)
   {
      if(dir.equals("NORTH")) y += steps;
      else if(dir.equals("SOUTH")) y -= steps;
      else if(dir.equals("EAST"))  x += steps;
      else if(dir.equals("WEST"))  x -= steps;
   }

   public void turn(int degrees)
   {
      String[] dirs = {"NORTH", "EAST", "SOUTH", "WEST"};
      int index = 0;
      for(int i = 0; i < dirs.length; i++)
         if(dirs[i].equals(dir)) index = i;
      int turns = degrees / 90;
      int newIndex = (index + turns) % 4;
      if(newIndex < 0) newIndex += 4;
      dir = dirs[newIndex];
   }

   public void report()
   {
      System.out.println(x + " " + y + " " + dir);
   }
}
