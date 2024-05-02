package org.example;

public class Abstract_and_Interface extends MyClass implements MyInterface1,MyInterface2{

        public static void main(String[] args) {

            new Abstract_and_Interface().yourAge();
            new Abstract_and_Interface().YourName();
            new Abstract_and_Interface().Bye();
            new Abstract_and_Interface().hello();
            System.out.println(MyInterface2.s);
        }

        @Override
        void Bye()
        {
            System.out.println("Bye");
        }
        @Override
        public void YourName(){

            System.out.println("Hello");
        }

}



    abstract class MyClass{

            String s;
            int a;


        void hello(){

            System.out.println("Hello");

        }
        abstract void Bye();


    }


    interface MyInterface1 {

            String s = "qwe";
          int a = 15;

          void YourName();

            default void yourAge(){

                System.out.println(25);
            }
    }


    interface MyInterface2 extends MyInterface1{

            String s = "qwe";
            int a = 13;


}

