import models.Calculator;
import models.Circle;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, "Hello World");
        double radius;
        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius of the circle"));

        Circle circle = new Circle(radius);
        Calculator calculator = new Calculator();

        JOptionPane.showMessageDialog(null, "The area of the Circle is " + df.format(calculator.calculateArea(circle)));

    }


}
