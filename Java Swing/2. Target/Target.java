import java.awt.*;
import javax.swing.*;

public class Target extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;

    int radius = 50;
    g.setColor(Color.BLACK);
    g.fillOval(xCenter-200, yCenter-200, radius * 8, radius * 8);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter-175, yCenter-175, radius * 7, radius * 7);
    g.setColor(Color.BLACK);
    g.fillOval(xCenter-125, yCenter-125, radius * 5, radius * 5);
    g.setColor(Color.BLUE);
    g.fillOval(xCenter-100, yCenter-100, radius * 4, radius * 4);
    g.setColor(Color.RED);
    g.fillOval(xCenter-75, yCenter-75, radius * 3, radius * 3);
    g.setColor(Color.YELLOW);
    g.fillOval(xCenter-50, yCenter-50, radius*2, radius*2);
  }
}