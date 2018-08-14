public class Student
{
   private String name;
   private int idNumber;
   private double marks;
   
   public Student(String nameIn, int idNoIn, double marksIn)
   {
      name = nameIn;
      idNumber = idNoIn;
      marks = marksIn;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public double getMarks()
   {  
      return marks;
   }

}