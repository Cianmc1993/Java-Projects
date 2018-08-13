import java.util.*;

public class Activity
{
   private String activity;
   private double calsBurned;
   
   //Constructor 
   public Activity(String activityName, double calsBurnedPerMin)
   {
      activity = activityName;
      calsBurned = calsBurnedPerMin;
   }   
   

   public double getCaloriesBurned(int pounds, int mins)
   {  
      return pounds / mins; 
   }   
   
   public String getActivity()
   {
      return activity;
   }
   
   public double getCalsBurned()
   {
      return calsBurned;
   }


   
}

         
   