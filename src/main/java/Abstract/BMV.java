package Abstract;

import Interface.MyColor;

public class BMV extends Cars implements MyColor
{
    @Override
    public void speed() {
        int speed = 500;
        System.out.println("The BMV speed is " + speed);

    }

    @Override
    public void color() {
        String color = "Green";
        System.out.println("The BNMV color is"+color);
    }
}
