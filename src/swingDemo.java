
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
public class swingDemo implements ActionListener{
	JFrame frame;
	JLabel lnum1,lnum2,result;
	JTextField txtnum1,txtnum2;
	JButton btnadd;
	
swingDemo(){
	// initialize the component and container
	frame = new JFrame();
	lnum1= new JLabel("First Num");
	lnum2= new JLabel("Second Num");
	txtnum1 = new JTextField(20);
	txtnum2 = new JTextField(20);
	btnadd= new JButton("Add");
	result = new JLabel();
	//setting the layout
	frame.setLayout(new FlowLayout());
	
	// Add components in frame
	frame.add(lnum1);
	frame.add(txtnum1);
	frame.add(lnum2);
	frame.add(txtnum2);
	frame.add(btnadd);
	frame.add(result);
	
	//setting size and visibility of frame
	frame.setSize(300,300);
	frame.setVisible(true);
	btnadd.addActionListener(this);
}
public static void main(String[] args) {
	new swingDemo();
}
@Override
public void actionPerformed(ActionEvent e) {
	int n1 = Integer.parseInt(txtnum1.getText());
	int n2 = Integer.parseInt(txtnum2.getText());
	int sum= n1+n2;
	result.setText(" " + sum);
	System.out.println("The sum of two number is: "+sum);
}
}
