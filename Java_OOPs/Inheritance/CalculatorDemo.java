package Inheritance;


class Calculator
{

    public int add(int a, int b)
    {
        return a+b; 
    }

    public int sub(int a, int b)
    {   
        return a-b;
    }
}

class AdvCalculator extends Calculator{

    public int mul(int a, int b)
    {
        return a*b;
    }

    public int div(int a, int b)
    {
        return a/b;
    }   
}


public class CalculatorDemo {
    public static void main(String[] args) {

        AdvCalculator calc = new AdvCalculator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.sub(10,20));
        System.out.println(calc.mul(10,20));
        System.out.println(calc.div(10,20));
    }
}
