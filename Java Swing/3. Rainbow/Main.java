import java.awt.*;
import javax.swing.*;

class Main {
  public static void main(String[] args) {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(100, 100, 600, 500);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    Rainbow rainbow = new Rainbow();
    rainbow.setBackground(Color.CYAN);
    c.add(rainbow);
    w.setVisible(true);
  }
}