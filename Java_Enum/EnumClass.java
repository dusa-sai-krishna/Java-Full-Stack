package Java_Enum;


enum Laptop
{
    Victus(50000), Ideapad(30000), Macbook(100000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    


}
public class EnumClass {
 
    public static void main(String[] args)
    {
        for (Laptop lp: Laptop.values())
        {
            System.out.printf("%s : %d",lp,lp.getPrice());
        }
    }
}
