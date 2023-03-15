//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class markAtt {
//	JFrame j=new JFrame();
////	JLabel name= new JLabel("Name");
////	JLabel id=new JLabel("ID");
////	JLabel Month=new JLabel("Month");
//	
//	markAtt(){
//		j.setExtendedState(j.MAXIMIZED_BOTH);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		String column[]= {"Name", "ID", "Month"};
//		
//		
//		j.setSize(600,600);
//		j.setLayout(null);
//		j.setVisible(true);
//	}
//
//}
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tcr {
	JFrame j=new JFrame();
	//JPanel panel1 = new JPanel();
	JLabel textfield = new JLabel();
	JButton Signin=new JButton("Sign in");
	JButton Signup=new JButton("Sign up");
	tcr(){
	    textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(Color.black);
		textfield.setFont(new Font("Arial",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setOpaque(true);
		
		Signup.setBounds(640, 180, 180, 80);
		Signin.setBounds(640, 330, 180, 80);
		Icon icon = new ImageIcon("C:\\Users\\ANCHAL JAIN\\OneDrive\\Desktop\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		j.add(textfield);

		j.add(textfield,BorderLayout.NORTH);
		j.add(Signup);
		j.add(Signin);
		j.add(back);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setSize(600,600);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
	}

}
