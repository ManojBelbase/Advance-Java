package ChapterOne;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameDemo implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");
        JButton btn = new JButton("Add");

        frameDemo demo = new frameDemo();  // Create an instance of FrameDemo
        btn.addActionListener(demo);  // Add the action listener to the button

        frame.add(btn);
        frame.setSize(200, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked on Add button");
    }
}
