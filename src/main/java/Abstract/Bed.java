package Abstract;

public class Bed extends Furniture{

private boolean isHeadBoard;

    public Bed(String name, int releaseNumber, boolean isHeadBoard) {
        super(name, releaseNumber);
        this.isHeadBoard = isHeadBoard;
    }

    @Override
    public String getDescription() {
        return "This is bed" + (isHeadBoard ? " "+"with a headboard": "without headboard");
    }
}
