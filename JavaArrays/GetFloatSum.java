package JavaArrays;

public class GetFloatSum {
    

    public static void main(String[] args){
        //initialize a float array of marks
    float [] marks = {90.0f, 85.0f, 33.0f};
    float total_marks=0.0f;
    //using for loop

    for (int i=0; i<marks.length; i++){
        total_marks=total_marks+marks[i];
    }
    
    System.out.println("The sum is:"+total_marks);

    for (float mark : marks){
        total_marks=total_marks+mark;
    }
    
    System.out.println("The sum is:"+total_marks);
    }
    
}
