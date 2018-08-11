import java.util.*;

public class StudentDatabaseApp
{
   public static void main(String [] args)
   {      
      Scanner keyIn = new Scanner(System.in);
      
      int menu;
      
      System.out.print("How many students would you like to enroll? ");
      int num = keyIn.nextInt();
      
      //Creates an array with x number of students       
      Student[] students = new Student[num];
              
      for(int i = 0; i < students.length; i++)
      {
         students[i] = new Student();
         students[i].enroll();
      }

            
      do{
      System.out.println("Student database");
      System.out.println("1.View all students");
      System.out.println("2.View 1 student");
      System.out.println("3.Pay tuition");
      System.out.println("0.Exit");
      menu = keyIn.nextInt();
      
      switch(menu)
      {
         case 1:
            for(int i = 0; i < students.length; i++)
            {
               System.out.println(students[i].toString());
            }
            break;
         case 2:
            System.out.print("Which student would you like to view? ");
            int view = keyIn.nextInt();
            
            if(view < 0 || view > students.length)
            {
               System.out.println("Student does not exist");
            }
            else
            {
               System.out.println(students[view-1].toString());
            }
            break; 
         case 3:
            System.out.println("Which student would you like to deal with?? ");
            int stu = keyIn.nextInt();
            if(stu < 0 || stu > students.length)
            {
               System.out.println("Student does not exist");
            }
            else
            {
               students[stu-1].payTuition();
            }
            break;
         case 0:
            System.out.println("Goodbye");
            break;
         default:
            System.out.println("Error , incorrect choice");
          }
            }while(menu != 0);
         
   }
}      