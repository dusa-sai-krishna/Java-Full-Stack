package JavaArrays;

import java.lang.Math;
public class ReverseArray {
    

    public static void main(String[] args){

        //initialize an array
        int [] marks = {10,20,30,40,50};

        int half_point = Math.floorDiv(marks.length,2);
        int l = marks.length;
        int temp;

        for (int i=0 ; i<half_point; i++){
            temp = marks[i];
            marks[i]=marks[l-i-1];
            marks[l-i-1]=temp;
        }

        for (int ele: marks){
            System.out.print(ele+"\t");
        }



    }
}
