package Interface;

public interface Transportable {

      void go();

  default void stop()
    {
        System.out.println("Stop");
    }


}
