package Abstract;

import Interface.Car;
import Interface.Train;
import Interface.Transportable;

public class Test {
    public static void main(String[] args) {

//    BMV bmv= new BMV();
//        bmv.driving();
//        bmv.speed();
//        bmv.color();
//    Audio audio =new Audio();
//    audio.speed();

        Furniture chair = new Chair("Kids chair",2024,4);
        System.out.println(chair.getDescription());
        Furniture bed = new Bed("KidsBed",2024,true);
        System.out.println(bed.getDescription());

        Transportable car = new Car("Toyota");
        Transportable train = new Train("My tarin");
        Transportable chairs = new Chair("chair",2024,4);
        chairs.go();
        car.go();
        train.go();

        car.stop();
        train.stop();
        chairs.stop();
    }
}
