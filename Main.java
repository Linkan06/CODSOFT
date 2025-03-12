import java.util.Scanner;
class GradeCalculator 
{
  int i; 
  public void CalculateGrade(int ts)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the marks of each subject:");
    float[] marks= new float[ts];
    for(i=0; i<ts; i++)
    {
     marks[i]= input.nextInt();
    }
   float totalMarks=0;
   for(i=0; i<ts; i++)
   {
    totalMarks+=marks[i];
   }

   System.out.println("Student's Total marks:"+totalMarks);
   float AvgPer= totalMarks/ts;
   System.out.println("Student's Average Percentage:"+AvgPer);
   if(AvgPer>=90){
    System.out.println("Student Grade:A");
   }
  else{
   if(AvgPer<90 && AvgPer>=80)
   {
    System.out.println("Student's Grade:B");
   }
   else{
     if(AvgPer<80 && AvgPer>=70)
     {
      System.out.println("Student's Grade:C");
     }
     else{
       if(AvgPer<70 && AvgPer>=60)
       {
        System.out.println("Student's Grade:D");
       }
       else{
       if(AvgPer<60 && AvgPer>=50) 
       {
         System.out.println("Student's Grade:E, Need Preparation");
       }
       else
       {
         System.out.println("Student's Grade:F, Need improvement, pay attention");     
       }
     }
    }
  }
}
}
}
  
public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Student grade calculator");
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the name of student:");
    String name= input.nextLine();
    System.out.println("Enter the total number of subjects:");
    int ts = input.nextInt();
    
    GradeCalculator gc = new GradeCalculator();
    gc.CalculateGrade(ts); 
    
  }
}
