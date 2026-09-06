package basics;

class Calculator{

    public int add(int a,int b, int c){
        System.out.println("something's up");
        return a+b+c;
    };
    public int add(int n1, int n2){
        System.out.println("nothing");
        return n1+n2;
    };
};

public class calculator
{

    public static void main(String[] args)
    {

            int a = 10;
            int b = 12;
            int c = 77;

            Calculator calc = new Calculator();

            int result = calc.add(a,b,c);
            int result1 = calc.add(c, result);
            System.out.println(result);
            System.out.println("hola mf");
            System.out.println(result1);

    
    };
};


