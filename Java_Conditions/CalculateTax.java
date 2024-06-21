package Java_Conditions;

import java.util.Scanner;
public class CalculateTax {
    

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        //Take user input
        System.out.println("Give income in Lakhs");
        float income = sc.nextFloat();
        float tax=0.0f;
        if (income>=2.5f && income<5.0f){
            tax = income*(5/100.0f);
        }
        else if (income>=5.0f && income<10.0f){
            tax = income*(20/100.0f);
        }
        else if (income>=10.0f){
            tax = income*(30/100.0f);
        }
        else{
            System.out.println("Income should be greater than 2.5 L");
        }

        if (tax!=0){
            System.out.printf("Income tax to be paid is %3.2f",tax);
        }
        





        sc.close();
    }
}
