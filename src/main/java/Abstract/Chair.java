package Abstract;

import Interface.Transportable;

public class Chair extends Furniture implements Transportable {
   private  int numberOfLegs;

    public Chair(String name, int releaseNumber, int numberOfLegs) {
        super(name, releaseNumber);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String getDescription() {
        return "This is chair";
    }

    @Override
    public void go() {
        System.out.println("This is chair with wheels ");
    }
}
