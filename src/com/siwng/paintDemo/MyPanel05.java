package com.siwng.paintDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
public class MyPanel05 extends JPanel{
@Override
public void paint(Graphics g) {
	
//	super.paint(g);
	g.drawRect(10, 10, 80, 40);
	g.drawOval(30, 60, 50, 40);
	
	// rect fill
	g.setColor(Color.blue);
	g.fillRect(60, 50, 50, 50);
	
	// string 
	g.setColor(Color.RED);
	g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));
	g.drawString("Hello world", 70, 120);
	
	Image image= new ImageIcon("abc.jpg").getImage();
	g.drawImage(image, 200, 100, 100, 100,null);
}
}
