import javax.swing.*;

public class TrilloMainGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Trillo");

        BlockBreakerPanel panel = new BlockBreakerPanel();

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(490,600);
        frame.setResizable(false);

    }






}
