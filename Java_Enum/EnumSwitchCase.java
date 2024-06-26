package Java_Enum;

enum Status
{
    ACTIVE,INACTIVE,BLOCKED;
}

public class EnumSwitchCase {
    public static void main(String[] args)
    {
        Status st = Status.ACTIVE;

        switch(st)
        {
            case ACTIVE:
            System.out.println("Work is happening!!");
            break;

            case INACTIVE:
            System.out.println("Work Stopped");
            break;

            default:
            System.out.println("Your access is blocked");
            break;
        }
    }
}
