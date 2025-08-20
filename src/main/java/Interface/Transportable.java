package Interface;

public interface Transportable {

    public  void go();

    public default void stop()
    {
        System.out.println("Stop");
    }
}
