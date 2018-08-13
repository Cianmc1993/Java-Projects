import java.util.*; 

public class activityList
{
   public static void main(String [] args)
   {  
      Scanner keyIn = new Scanner(System.in);
     	//Part1
      ArrayList <Activity> activityList  = new ArrayList <Activity>();
      
      int activityCount = 0;
      int pounds;
      int mins;
      
      //Part2
      activityList.add(new Activity("BasketBall", .063));
      activityList.add(new Activity("Golf", .038));
      activityList.add(new Activity("Swimming", .071));
      activityList.add(new Activity("Walking", .037));
      activityList.add(new Activity("Running(8 minute mile)", .095));
      
      //Part3
      for(Activity a : activityList)
      {
         System.out.println("Activity : "+a.getActivity()+" : Calories burned per min per pound :"+a.getCalsBurned());
      }
      
      //Part4
      System.out.println("Enter number of calories: ");
      double noOfCalories = keyIn.nextDouble();
      
      for(int i = 0;i < activityList.size();i++)
      {
         if(activityList.get(i).getCalsBurned() > noOfCalories)
         {
            activityCount++;
            System.out.println(activityList.get(i).getActivity());
         }
      }
            System.out.println("Number of activities that burn more calories per minute is "+activityCount);
            
      //Part5
      System.out.println("Enter pounds :" );
      pounds = keyIn.nextInt();
      
      System.out.println("Enter mins :" );
      mins = keyIn.nextInt();
      
      for(int i = 0;i < activityList.size();i++)
      {
         System.out.println(activityList.get(i).getActivity() + " : " +activityList.get(i).getCaloriesBurned(pounds,mins) * activityList.get(i).getCalsBurned());
      }
      
      //Part6
      System.out.println("Enter activity: ");
      String choice = keyIn.next();
      
      System.out.println("Enter pounds :" );
      pounds = keyIn.nextInt();
      
      System.out.println("Enter mins :" );
      mins = keyIn.nextInt();
      
       for(int i = 0;i < activityList.size();i++)
       {
          if(activityList.get(i).getActivity().toLowerCase().equals(choice.toLowerCase()))
          {
              System.out.println(activityList.get(i).getCaloriesBurned(pounds, mins) * activityList.get(i).getCalsBurned());
          }
       }


      
   }
}
