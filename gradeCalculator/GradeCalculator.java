import java.util.*;

class GradeCalculator{

   public static int calculateTotalMarks(int sub1 , int sub2 , int sub3){
            
            return sub1+sub2+sub3;
    }

    public static float claculateAvgPercentage(int totalMarks){

        return totalMarks/3.0f;
    }
   
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks for Physics : ");
        int physics= sc.nextInt();
         System.out.println("Enter the total marks for Chemistry : ");
        int chemistry= sc.nextInt();
         System.out.println("Enter the total marks for Mathematics : ");
        int maths= sc.nextInt();
        
        int totalMarks=calculateTotalMarks(physics,chemistry,maths);
        System.out.println("Total Marks out of 300 is : " +totalMarks);

        float percentage = claculateAvgPercentage(totalMarks);
        System.out.println("Percentage marks of student is : " +percentage);
        
        System.out.print("The student grade is : ");
        if(percentage>=75){
            System.out.println("A");
        }else if(percentage>=65 && percentage<75){
            System.out.println("B");
        }else if(percentage>=55 && percentage<65){
            System.out.println("C");
        }else if(percentage>=45 && percentage<55){
            System.out.println("D");
        }
        else
           System.out.println("Fail"); 
      

    }
}