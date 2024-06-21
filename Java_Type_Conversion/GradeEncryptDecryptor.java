package Java_Type_Conversion;

import java.util.Scanner;
public class GradeEncryptDecryptor {

    public static void main(String[] args){

        //instantiate scanner class
        Scanner sc = new Scanner(System.in);

        
        //take grade as an input
        System.out.println("Enter your grade");
        String input = sc.next();

        char grade = input.charAt(0);

        //Encryption
        char en_grade=(char)(grade+8);
        System.out.println("Encrypted grade is:"+en_grade);

        //Decryption
        char de_grade= (char)(en_grade-8);
        System.out.println("Decrypted grade is:"+de_grade);



        sc.close();
    }
    
}
