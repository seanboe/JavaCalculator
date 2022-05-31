import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphing extends JPanel implements KeyListener, ActionListener {
	
	private final int FRAME_WIDTH = 700;
	private final int FRAME_HEIGHT = 700; 

  private final int HALF_WIDTH = FRAME_WIDTH / 2;
  private final int HALF_HEIGHT = FRAME_HEIGHT / 2;

  // A pan to the right (screen moves left) is a negative pan offset, since the screen moves in the negative direction
  private int screenPanOffsetX = 0;
  // A pan to the up (screen moves down) is a negative pan offset, since the screen moves in the negative direction
  private int screenPanOffsetY = 0;
  
  private Function function; 
	
	public Graphing(Function fx) {
		// NEED TO INSTANTIATE THE MEMBER VARIABLE function 
		JFrame f = new JFrame("Graphing");
		function = fx;
		f.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		f.setBackground(Color.black); 
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}


  public void paint(Graphics g) {

    g.setColor(Color.white);
    g.fillRect(0, 0, FRAME_WIDTH, FRAME_WIDTH);
    g.setColor(Color.orange);
    paintAxis(g, true);

    g.setColor(Color.black);

    graph(g);

  }

  public void graph(Graphics g) {

    final double stepSize = 1;

    double prevX = 0;
    double prevY = functionExample(prevX);
    try {
		for (double x = -HALF_WIDTH; x < HALF_WIDTH; x += stepSize) {
			double computation = function.compute(x);
	  
			// scaling everything properly
			double coordX = x + HALF_WIDTH;
			computation = HALF_HEIGHT - computation;
	  
			// g.fillOval((int)(coordX), (int)(computation), 2, 2);
			g.drawLine((int)prevX, (int)prevY, (int)coordX, (int)computation);
			prevX = coordX;
			prevY = computation;
		  }
	} catch (Exception e) {
		//TODO: handle exception
	}

  }

  public void paintAxis(Graphics g, boolean dashed) {

    // y-axis
    for (int y = 0; y < FRAME_HEIGHT; y++) {
      if (y % 5 == 0 && dashed)
        continue;
      g.drawOval(HALF_WIDTH, y, 1, 1);
    }

    // x-axis
    for (int x = 0; x < FRAME_WIDTH; x++) {
      if (x % 5 == 0 && dashed)
        continue;
      g.drawOval(x, HALF_HEIGHT, 1, 1);
      }
  }


  // public void paintAxis(Graphics g, boolean gridLines, boolean dashed) {

  //   // x axis
  //   g.setColor(Color.orange);

  //   for (int y = 0; y < FRAME_HEIGHT; y++) {
  //     if (y % 15 == 0) {
  //       for (int x = 0; x < FRAME_WIDTH; x++) {
  //         if (x % 4 == 0 && dashed)
  //           g.drawOval(x, y, 1, 1);
  //       }
  //     }
  //     if (!gridLines)
  //       break;
  //   }

  //   for (int y = 0; y < FRAME_HEIGHT; y++) {
  //     if (y % 4 == 0 && dashed)
  //       g.drawOval(HALF_WIDTH, y, 1, 1);
  //   }

  // }

  // public void paintGridlines(Graphics g, boolean dashed) {
    


  // }




	// public void paint(Graphics g) { // WITH RESPECT TO ORIGIN (AS OF NOW) 
		
	// 	g.setColor(Color.black); 
	// 	g.fillRect(0, 0, frameWidth, frameHeight); 

  //   g.setColor(Color.white);
    
// ///////////////////////////////////////////////////////////////////////////////////////////////////
//     // GRAPHING 
//     double pointX = 0;
//     double pointY = ORIGIN_Y; 

//     // POINT SHOULD BE CIRCLE AND HAVE DIAMETER OF 2 

//     while (pointX < frameWidth) {
//       HashMap<String, Double> point = new HashMap<String, Double>(); 
//       point.put("x", pointX - frameWidth / 2); 

//       double computation = 0.0;

//         computation = functionExample(point);
//         System.out.println(computation);

//       pointY = (frameHeight / 2) - computation;

//       g.fillOval((int)Math.round(pointX), (int)Math.round(pointY), 2, 2); 
//       pointX++; 

//     }
    
// ///////////////////////////////////////////////////////////////////////////////////////////////////
		
// 	}

  public double functionExample(double x) {
    return x * Math.pow(Math.sin(x / 10), 3);

    //return Math.log(point.get("x"));
    //return Math.pow(point.get("x"), 3); 
  }

	// public static void main(String[] args) {


	// 	String infix = "x^2+1";

  //       String rpn = InfixParser.parse(infix);

  //       Stack < Function > blaze = InfixParser.stringRPNToStack(rpn);

  //       blaze = InfixParser.reverseStack(blaze);

  //       try {
  //           InfixParser.crunchRPNStack(blaze);
  //       } catch (OperatorOnlyException e) {
  //           // TODO Auto-generated catch block
  //           e.printStackTrace();
  //       }


  //       Function f = blaze.pop();

  //   	Graphing graph = new Graphing(f); 

	// }

  @Override
  public void keyPressed(KeyEvent arg0) {

  }

  @Override
  public void actionPerformed(ActionEvent arg0) {

  }

  @Override
  public void keyReleased(KeyEvent arg0) {

  }

  @Override
  public void keyTyped(KeyEvent arg0) {
    
  }

}
