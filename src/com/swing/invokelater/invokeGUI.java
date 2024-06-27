package com.swing.invokelater;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class invokeGUI {
JFrame frame;
public invokeGUI() {
	// TODO Auto-generated constructor stub
	frame= new JFrame("InvokeGUI");
	frame.setVisible(true);
	frame.setSize(300,300);
	frame.setLayout(new FlowLayout());
	System.out.println("s");
}
}
