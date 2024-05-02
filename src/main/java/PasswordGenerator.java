
import com.codebind.CurrencyConvertor;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator {
    private JPanel mainPanel;
    private JTextField txtresults;
    private JCheckBox a6CharacterCheckBox;
    private JCheckBox a10CharacterCheckBox;
    private JCheckBox a12CharacterCheckBox;
    private JButton generatebtn;
    private JLabel passwordGeneratorlb;

    public PasswordGenerator() throws RuntimeException {
        generatebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length =13;
                String validChar ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
                StringBuilder str = new StringBuilder();
                Random randomChar = new Random();
                while (0<length--)
                {
                    str.append(validChar.charAt(randomChar.nextInt(validChar.length())));

                }
                String temp = String.valueOf(0);
                for (int i =0;i<=str.length();)
                {
                    temp += str.charAt(randomChar.nextInt(str.length()));
                    if (i ==4&&a6CharacterCheckBox.isSelected()) {
                        txtresults.setText((temp));

                    } else if (i ==8&&a10CharacterCheckBox.isSelected()) {

                        txtresults.setText((temp));

                    }
                    else if (i == 10&&a12CharacterCheckBox.isSelected())
                    {
                        txtresults.setText((temp));

                    }
                    i++;
                }


//                JOptionPane.showMessageDialog(mainPanel,"Your result is "+txtresults);
            }
        });

    }

    public static void main(String[] args)  {

        JFrame frame = new JFrame("Currency Convertor");
        frame.setContentPane(new PasswordGenerator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
