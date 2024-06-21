package JavaArrays;

public class Addmatrices {
 
    public static void main(String[] args){

        //initialize three 2 D matrices

        int [][] x = {{1,2,3},{4,5,6}};
        int [][] y = {{2,4,6},{8,10,12}};
        int [][] z = new int [2][3]; 

        //use loops

        for (int i=0; i<x.length ; i++){
            for (int j=0; j< x[i].length ; j++){
                z[i][j]= x[i][j]+y[i][j];

            }
        }

        System.out.println("Sum of two matrices is:");
        for (int i=0; i<x.length ; i++){
            for (int j=0; j< x[i].length ; j++){
                System.out.print(z[i][j]+"\t");

            }
            System.out.println("\n");
        }


    }

}
