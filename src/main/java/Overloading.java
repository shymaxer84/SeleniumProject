public class Overloading_Overriding {


int addTwoDigits(int a,int b){

    return a+b;
}

    double addTwoDigits(double a,double b){

        return a+b;
    }

    public static void main(String[] args) {
       Overloading_Overriding overloading = new Overloading_Overriding();
        System.out.println(overloading.addTwoDigits(5,6));
        System.out.println(overloading.addTwoDigits(3.5,4.6));
    }
}
