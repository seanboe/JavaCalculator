import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphing extends JPanel implements ActionListener, MouseListener, KeyListener {
	//[1067, 531]
	private final int frameWidth = 1067;
	private final int frameHeight = 531; 

  private int ORIGIN_X = frameWidth / 2;
  private int ORIGIN_Y = frameHeight / 2;

  private int screenPanOffsetX = 0;
  private int screenPanOffsetY = 0;
  
  private Function function; 
	
	public Graphing(Function fx) {
		// NEED TO INSTANTIATE THE MEMBER VARIABLE function 
		JFrame f = new JFrame("Graphing");
		function = fx;
		f.setSize(new Dimension(frameWidth, frameHeight));
		f.setBackground(Color.black); 
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public void paint(Graphics g) { // WITH RESPECT TO ORIGIN (AS OF NOW) 
		
		g.setColor(Color.black); 
		g.fillRect(0, 0, frameWidth, frameHeight); 

    g.setColor(Color.white);
    
///////////////////////////////////////////////////////////////////////////////////////////////////
    // GRAPHING 
    double pointX = 0;
    double pointY = ORIGIN_Y; 

    // POINT SHOULD BE CIRCLE AND HAVE DIAMETER OF 2 

    while (pointX < frameWidth) {
      HashMap<String, Double> point = new HashMap<String, Double>(); 
      point.put("x", pointX - frameWidth / 2); 

      double computation = 0.0;

        try {
			computation = function.compute(pointX);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperatorOnlyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(computation);

      pointY = (frameHeight / 2) - computation;

      g.fillOval((int)Math.round(pointX), (int)Math.round(pointY), 2, 2); 
      pointX++; 

    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////

    
		
	}

  public double functionExample(HashMap<String, Double> point) {
     return Math.pow(point.get("x"), 1);
    //return Math.log(point.get("x"));
    //return Math.pow(point.get("x"), 3); 
  }

	public static void main(String[] args) {

		String infix = "x^2+1";

        String rpn = InfixParser.parse(infix);

        Stack<Function> blaze = InfixParser.stringRPNToStack(rpn);

        blaze = InfixParser.reverseStack(blaze);

        try {
            InfixParser.crunchRPNStack(blaze);
        } catch (OperatorOnlyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        Function f = blaze.pop();

        System.out.println(f.toString());

    	Graphing graph = new Graphing(f); 

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getKeyCode() == 39) { // MOVING RIGHT 
			ORIGIN_X -= 5; 
			repaint(); 
		} else if (arg0.getKeyCode() == 37) { // MOVING LEFT 
			ORIGIN_X += 5; 
			repaint(); 
		}
		
		if (arg0.getKeyCode() == 38) { // MOVING UP 
			ORIGIN_Y -= 5; 
			repaint(); 
		} else if (arg0.getKeyCode() == 40) { // MOVING DOWN 
			ORIGIN_Y += 5; 
			repaint(); 
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
