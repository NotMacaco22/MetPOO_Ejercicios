import models.Product;
import models.ProductManager;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        JOptionPane optionPane = new JOptionPane();
        optionPane.showMessageDialog(null, "Hello World");

//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Product Manager");
//        frame.setSize(800, 600);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setVisible(true);

        optionPane.createDialog("Hola");



    }


}
