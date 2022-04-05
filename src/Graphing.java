import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Graphing extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	private int frameWidth = 1500;
	private int frameHeight = 800; 
	private Function function; 
	
	public Graphing() {
		// NEED TO INSTANTIATE THE MEMBER VARIABLE function 
		JFrame f = new JFrame("Graphing");
		f.setSize(new Dimension(frameWidth, frameHeight));
		f.setBackground(Color.black); 
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) { // WITH RESPECT TO ORIGIN (AS OF NOW) 
		
		g.setColor(Color.black); 
		g.fillRect(0, 0, frameWidth, frameHeight); 
		
		g.setColor(Color.white);
		
		ArrayList<Integer> originCoordinates = new ArrayList<Integer>(); 
		originCoordinates.add(frameWidth / 2); // x-coordinate 
		originCoordinates.add(frameHeight / 2); // y-coordinate 
		
		int xTracker = originCoordinates.get(0);
		int yTracker = originCoordinates.get(1); 
		
		// POINT SHOULD BE CIRCLE AND HAVE DIAMETER OF 2 
		// GRAPH IS TO THE RIGHT OF THE Y-AXIS (AS OF NOW) 
		// STILL A WIP 
		while (xTracker < frameWidth) {
			int yLoc = (frameHeight / 2) - ((int)(function.compute(xTracker - (frameWidth / 2)))); 
			g.fillOval(xTracker, yLoc, 2, 2); 
			g.fillOval(xTracker, ((int)(function.compute(null))), 2, 2); 
			xTracker++; 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Graphing graph = new Graphing(); 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	Timer t;
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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
		repaint();
	}

}
