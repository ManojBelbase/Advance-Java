package com.siwng.paintDemo.copy;

import javax.swing.JFrame;

public class swing05 {
	JFrame frame;
	MyPanel05 p;
	swing05(){
		frame = new JFrame();
		p = new MyPanel05();
		frame.add(p);
		frame.setSize(400,300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new swing05();
	}

}
