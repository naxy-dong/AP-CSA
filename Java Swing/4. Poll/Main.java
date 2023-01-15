import java.awt.*;
import javax.swing.*;

class Main extends JFrame{
  public static void main(String[] args)
  {
    Poll w = new Poll();
    w.setBounds(100, 100, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}