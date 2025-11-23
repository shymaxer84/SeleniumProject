package Abstract;

import Interface.Transportable;

public abstract class Furniture  {
    private String name;
    private int releaseNumber;

    public Furniture(String name, int releaseNumber) {
        this.name = name;
        this.releaseNumber = releaseNumber;
    }

    public abstract String getDescription();// we can also remove abstract and initiation and write return "This is Furniture"


}
