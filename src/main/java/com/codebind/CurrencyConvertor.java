package com.codebind;


import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyConvertor{
    private   JPanel panel1;
    private JTextField txtAmount;
    private JComboBox txtFrom;
    private JComboBox txtTo;
    private  JButton btnConvert;


    public CurrencyConvertor()  {
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total;
                double amount = Double.parseDouble(txtAmount.getText());
                CurrencyUnit usd = Monetary.getCurrency("USD");
                double USD = usd.getDefaultFractionDigits();
                CurrencyUnit eur = Monetary.getCurrency("EUR");
                double EUR = eur.getDefaultFractionDigits();
                CurrencyUnit ils = Monetary.getCurrency("EUR");
                double ILS = eur.getDefaultFractionDigits();
                if(txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "ILS") {

                    total = amount * 3.69 ;
                    JOptionPane.showMessageDialog(panel1,"Your amount is "+total);
                }




            }
        });




    }


    public static void main(String[] args)  {

        JFrame frame = new JFrame("Currency Convertor");
        frame.setContentPane(new CurrencyConvertor().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
