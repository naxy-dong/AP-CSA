import java.awt.*;
import javax.swing.*;

public class RedPlus extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;


    g.setColor(Color.RED);
    g.fillRect(xCenter, yCenter, 10, 50);
    g.fillRect(xCenter, yCenter, 50, 10);
    g.fillRect(xCenter, yCenter - 50, 10, 50);
    g.fillRect(xCenter - 50, yCenter, 50, 10);

  }
}

    // g.setColor(Color.RED);
    // g.fillRect(xCenter, yCenter, 10, 50);
    // g.fillRect(xCenter, yCenter, 50, 10);