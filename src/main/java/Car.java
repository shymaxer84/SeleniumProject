public class Car  extends ConstructorGetterSetter{



    public Car(String make, String model, String color) {
        super(make, model, color);


    }


    public static void main(String[] args) {


        ConstructorGetterSetter car1 = new ConstructorGetterSetter("Ford","Mondeo","Silver");
        ConstructorGetterSetter car2 = new ConstructorGetterSetter("Kia","Ceed","Green");
        System.out.println("Car "+ car1.getMake());
        System.out.println("Car"+" " + car2.getColor());

    }
}
