package Interface;

public class Train implements Transportable{
private  String name;

    public Train(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println(this.name+" "+"this is train start moving");
    }
}
