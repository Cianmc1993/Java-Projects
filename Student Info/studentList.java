import java.util.*;

public class studentList
{
   public static void main(String[] args) 
   {
      
      Scanner keyIn = new Scanner(System.in);
      
      ArrayList <Student> info = new ArrayList <Student> ();
      
      double total = 0;
      int failCount = 0;
      int passCount = 0;
      int distCount = 0;
      boolean found = false;
      
      info.add(new Student("Cian", 1, 30));
      info.add(new Student("Arron", 2, 70));
      info.add(new Student("Kelvin", 3, 85));
      
      for(Student a : info)
      {
         System.out.println("Name: "+a.getName()+" \nId number: "+a.getIdNumber()+" \nGrade: "+a.getMarks()+"\n");
      }
      
      System.out.println("Number of student objects: "+info.size());
      
      System.out.print("Enter student Id number: ");
      int num = keyIn.nextInt();
      
      for(int i = 0; i < info.size(); i++)
      {
         if(info.get(i).getIdNumber() == num)
         {
            System.out.println("Name: "+info.get(i).getName()+" \nId number: "+info.get(i).getIdNumber()+" \nGrade: "+info.get(i).getMarks()+"\n");
         }
         else
            System.out.println("Student Id not found");
            break;
      }
      
      for(Student a : info)
      {
         if(a.getMarks() < 40)
         {
            failCount++;
         }
         else if(a.getMarks() > 69)
         {
            distCount++;
         }
         else
            passCount++;
              
         total = total + a.getMarks();
      }
         double average = total / info.size();
         
         System.out.println("Average mark is: "+average);
         System.out.println("Number of fails: "+failCount);
         System.out.println("Number of pass': "+passCount);
         System.out.println("Number of distinctions: "+distCount);
         
         System.out.println("Enter Id of student you wish to remove :");
         int find = keyIn.nextInt();
    
         for(int i = 0;i<info.size();i++)
         {
            if(info.get(i).getIdNumber() == find)
            {
            info.remove(i);
            found = true;
            }
         }
            if(found)
            {
               System.out.println("Student with Id: "+find+" removed!");
            }
            else // if not found nofity not found
            System.out.println("No found with Id: "+find+"!");

         
   }
} 