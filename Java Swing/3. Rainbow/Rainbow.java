import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    int xCenter = width/2;
    int yCenter = height/2;
    // that represent the center of the rainbow rings:
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    int radius = 400;
    // ________________________________________________

    g.setColor(Color.RED);
    g.fillArc(xCenter-200, yCenter, radius, radius, 0, 180);
    g.setColor(Color.GREEN);
    g.fillArc(xCenter-150, yCenter+50, radius-100, radius-100, 0, 180);
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter-100, yCenter+100, radius-200, radius-200, 0, 180);
    g.setColor(Color.CYAN);
    g.fillArc(xCenter-50, yCenter+150, radius-300, radius-300, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }
}