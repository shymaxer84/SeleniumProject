public class JavaProject {

    public static void main(String[] args)

    {
        exampleMethode();
    }
    public static void exampleMethode()
    {
        int x = 0;
        System.out.println("The result is:"+ methodeA(x));

        int a= 10;
        int b = 20;
        int c = 20/10;
        System.out.println("The result of c is :"+c);

        int y = methodeB();
        System.out.println(y);

    }
    
    public static int methodeA(int c)
    {
        int a=5;
       int  b=6;
        c=a+b;
       return c;

    }

    public static int methodeB()
    {

        return 10;

    }
}
