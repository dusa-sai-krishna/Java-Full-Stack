package Java_Conditions;
import java.util.Scanner;

public class PassOrFail {
 
    public static void main(String[] args){

      float math, science, english,avg;
      //initialize the Scanner class
      Scanner sc =new Scanner(System.in);

      // take input
      math = sc.nextFloat();
      science = sc.nextFloat();
      english = sc.nextFloat();

      avg = (math+science+english)/3.0f;

      if (avg>=40 && math>=33 && science>=33 && english>=33){
        System.out.println("Passed");
      }
      else{
        System.out.println("Fail");
      }

      sc.close();
    }
      

       
       


}
