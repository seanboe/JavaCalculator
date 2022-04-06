import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphing extends JPanel {
	
	private final int FRAME_WIDTH = 1500;
	private final int FRAME_HEIGHT = 800; 

  private final int ORIGIN_X = FRAME_WIDTH / 2;
  private final int ORIGIN_Y = FRAME_HEIGHT / 2;

  private int screenPanOffsetX = 0;
  private int screenPanOffsetY = 0;
	
	public Graphing() {
		// NEED TO INSTANTIATE THE MEMBER VARIABLE function 
		JFrame f = new JFrame("Graphing");
		f.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		f.setBackground(Color.black); 
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public void paint(Graphics g) { // WITH RESPECT TO ORIGIN (AS OF NOW) 
		
		g.setColor(Color.black); 
		g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT); 
		
		g.setColor(Color.white);
		
		
    // Iterate over all X values on the screen; the left side of the screen is 
    // the negative half of the width of the screen with respect to the origin. 
    // Assuming that the user pans, then there is an offset; a pan to the left side
    // of the screen means that the pan is more negative
    for (int x = -ORIGIN_X + screenPanOffsetX; x < ORIGIN_X + screenPanOffsetX; x++) {
      // will finish later


    }

		
		// POINT SHOULD BE CIRCLE AND HAVE DIAMETER OF 2 
		// GRAPH IS TO THE RIGHT OF THE Y-AXIS (AS OF NOW) 
		// STILL A WIP 
		// while (xTracker < frameWidth) {
		// 	int yLoc = (frameHeight / 2) - ((int)(function.compute(xTracker - (frameWidth / 2)))); 
		// 	g.fillOval(xTracker, yLoc, 2, 2); 
		// 	g.fillOval(xTracker, ((int)(function.compute(null))), 2, 2); 
		// 	xTracker++; 
		// }
		
	}

  public double functionExample(double x) {
    return Math.pow(x, 2);
  }

	public static void main(String[] args) {

    Graphing graph = new Graphing(); 

	}

}
