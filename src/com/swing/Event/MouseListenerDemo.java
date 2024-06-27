package com.swing.Event;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerDemo extends MouseAdapter{
	JFrame frame;
	JLabel result;
	MouseListenerDemo() {
		frame = new JFrame();
		result = new JLabel();
		frame.setSize(200,200);
		frame.setLayout(new FlowLayout());
		frame.add(result);
		frame.setVisible(true);
		frame.addMouseListener(this);
		
	}
	public static void main(String[] args) {
		new MouseListenerDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		result.setText("click");
		System.out.println("hello");
		
	}


}
