import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerDemo implements MouseListener {
	JFrame frame;
	MouseListenerDemo(){
		frame = new JFrame();
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method
		new MouseListenerDemo();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("mouse enter");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited");
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
}
