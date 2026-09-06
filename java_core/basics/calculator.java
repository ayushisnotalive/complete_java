package basics;

class Calculator{
    int a;
    int b;

    public int add(int a,int b){
        System.out.println("something's up");
        return a+b;
    }
}

public class calculator
{

    public static void main(String[] args)
    {

            int a = 10;
            int b = 12;

            Calculator calc = new Calculator();

            int result = calc.add(a,b);
            System.out.println(result);

    
    }
}

