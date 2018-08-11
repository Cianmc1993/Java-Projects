import java.util.*;

public class Student
{

   private String firstName;
   private String lastName;
   private int currentYear;
   private String studentID;
   private String courses;
   private int tuitionBalance = 0;
   private static int courseCost = 600;
   private static int id = 1000;
   
   //Constructor: prompt for student's name and year
   public Student()
   {
      Scanner keyIn = new Scanner(System.in);
      
      System.out.println("Enter student first name: ");
      this.firstName = keyIn.nextLine();
      
      System.out.println("Enter student last name: ");
      this.lastName = keyIn.nextLine();
      
      System.out.println("Enter year of studies: ");
      this.currentYear = keyIn.nextInt();
      
      SetStudentID();
   }
   
   //Generate an ID
   private void SetStudentID()
   {
      id++;
      this.studentID = currentYear+ "" +id;   
   }
   
   //Enroll in a course
   public void enroll()
   {
      Scanner keyIn = new Scanner(System.in);
      do{
         System.out.print("Enter course you wish to enroll in(press Q to quit): ");
         String course = keyIn.nextLine();
         
            if(!course.equals("Q"))
            {
               courses = courses + "\n " + course;
               tuitionBalance = tuitionBalance + courseCost;
            }
            else
            {
               break;
            }
         }while(1 != 0);  
   }
   
   //View balance
   public void viewBalance()
   {
      System.out.println("Your balance is: $"+tuitionBalance);
   }
   
   //Pay tuition
   public void payTuition()
   {
      Scanner keyIn = new Scanner(System.in);
      viewBalance(); 
      System.out.print("How much would you like to pay? $");
      int amount = keyIn.nextInt(); 
      tuitionBalance -= amount;
      
      System.out.println("Thank you, your remaining balance is :$"+tuitionBalance+"\n");
   }
   
   //Show status
   public String toString()
   {
      return "Name: "+ firstName + " "+ lastName +
      "\nYear of studies: "+currentYear +
      "\nStudentID: "+studentID +
      "\nEnrolled in: "+ courses +
      "\nBalance: " +tuitionBalance +
      "\n";
   }
   
}