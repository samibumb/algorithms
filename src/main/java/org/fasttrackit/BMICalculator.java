package org.fasttrackit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ex20
public class BMICalculator extends JFrame {
    private JPanel calcpanel;
    private JTextField heightField;
    private JTextField weightField;
    private JButton cancelButton;
    private JButton clearFieldsButton;
    private JButton calculateButton1;


    public BMICalculator() {
        calculateButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //calculate the bmi
                double height=Double.parseDouble(heightField.getText());
                double weight=Double.parseDouble(weightField.getText());
                double bmi=(weight/(height*height))*703;
                if (bmi>=18.5 && bmi<=25){
                    JOptionPane.showMessageDialog(null,"You are at a normal weight.\nYour result :"+bmi);
                }else{
                    JOptionPane.showMessageDialog(null,"You are overweight!\nYour result :"+bmi,"",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        clearFieldsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weightField.setText("");
                heightField.setText("");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMICalculator");
        frame.setContentPane(new BMICalculator().calcpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);

    }
}
