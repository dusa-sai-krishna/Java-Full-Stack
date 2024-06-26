package Java_Enum;

enum Status
{
    ACTIVE,INACTIVE,BLOCKED;
}

public class Enum {
    
    public static void main(String[] args)
    {
        Status st = Status.ACTIVE;
        
        // Print a status
        System.out.println(st);

        // Print all status with their associated indices
        for (Status st2: Status.values())
        {
            System.out.println(st2 + " " + st2.ordinal());
        }
    }
}
