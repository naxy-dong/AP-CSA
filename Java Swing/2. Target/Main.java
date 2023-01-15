
import java.awt.*;
import javax.swing.*;

public class Main 
{
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Target");
    window.setBounds(100, 100, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}