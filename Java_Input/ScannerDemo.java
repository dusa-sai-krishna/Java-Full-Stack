package Java_Input;

import java.util.*;

public class ScannerDemo{
    
    public static void main(String []args){
        // create a scanner instance
        Scanner sc = new Scanner(System.in);

        String sentence =sc.nextLine();

        System.out.println(sentence);
        
        sc.close();
    }
}