package work;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		
		//window: object JFrame
		JFrame frame = new JFrame("My Window");
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		
		
		
		//create button and add JFrame
		
		JButton button=new JButton("Click Me !!!");
		
//		//ActionListener Anonymous class - start
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Click");
//				JOptionPane.showMessageDialog(null, "Hey, Button Click");
//				
//			}
//		}); 
//		//end
		
		button.addActionListener(( e)->{
			System.out.println("Button Click");
			JOptionPane.showMessageDialog(null, "Hey, Button Click");
			
			
		});
		
		
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
