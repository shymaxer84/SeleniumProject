

class Parent{

    int method(){

        return 1;
    }
    static class Child extends Parent{

        @Override
        int method(){

            return 2;
        }

    }
}

public class Overriding {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Parent.Child();
        System.out.println(parent.method());
        System.out.println(child.method());
    }

}
