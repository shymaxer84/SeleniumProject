package Interface;

public class Car implements Transportable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println(this.name + " "+"this is car start moving");
    }
}
