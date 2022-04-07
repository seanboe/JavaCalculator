import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphing extends JPanel {
	
	private final int FRAME_WIDTH = 700;
	private final int FRAME_HEIGHT = 700; 

  private final int ORIGIN_X = FRAME_WIDTH / 2;
  private final int ORIGIN_Y = FRAME_HEIGHT / 2;

  private int screenPanOffsetX = 0;
  private int screenPanOffsetY = 0;
  
  private Function function; 
	
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

    double pointX = ORIGIN_X;
    double pointY = ORIGIN_Y; 

    // POINT SHOULD BE CIRCLE AND HAVE DIAMETER OF 2 
    // GRAPH IS TO THE RIGHT OF THE Y-AXIS (AS OF NOW) 
    // STILL A WIP 
    while (pointX < FRAME_WIDTH) {
      HashMap<String, Double> point = new HashMap<String, Double>(); 
      point.put("x", pointX - FRAME_WIDTH / 2); 

      double computation = 0.0;

      // try {

        computation = functionExample(point);
        System.out.println(computation);


      // } catch (VariableDefinitionException e) {
      //   e.printStackTrace();
      // } 

      pointY = FRAME_HEIGHT / 2 - computation;

      g.fillOval((int)Math.round(pointX), (int)Math.round(pointY), 2, 2); 
      pointX++; 

    }
		
	}

  public double functionExample(HashMap<String, Double> point) {
    // return Math.pow(point.get("x"), 2);
    return Math.log(point.get("x"));
    //return Math.pow(point.get("x"), 3); 
  }

	public static void main(String[] args) {

    Graphing graph = new Graphing(); 

	}

}
