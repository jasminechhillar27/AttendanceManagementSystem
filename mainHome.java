//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.text.StyledEditorKit.UnderlineAction;
//
//public class mainHome {
//	JFrame frame = new JFrame();
//	//JPanel title_panel = new JPanel();
//	JLabel textfield = new JLabel("Attendance Management System");
//	JButton std=new JButton("Student");
//	JButton tcr=new JButton("Teacher");
//	
//	
//	mainHome(){
//		
//		frame.setSize(1000,1000);
//		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//		frame.setLayout(new BorderLayout());
//		frame.setVisible(true);
//		frame.setTitle("Attendance Management System");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
//		
//		textfield.setBounds(0,0, 100, 100);
////		textfield.setBackground(Color.GRAY);
//		textfield.setForeground(Color.black);
//		textfield.setFont(new Font("Arial",Font.BOLD,75));
//		textfield.setHorizontalAlignment(JLabel.CENTER);
////		textfield.setText("Attendance");
//		textfield.setOpaque(true);
//		
//		std.setBounds(270, 250, 230, 150);
//		tcr.setBounds(270, 500, 230, 150);
//		tcr.setHorizontalAlignment(JLabel.CENTER);
//		//std.setBackground(new Color(25,25,25));
//		std.setForeground(Color.black);
//		//tcr.setBackground(new Color(25,25,25));
//		tcr.setForeground(Color.black);
//		std.setFont(new Font("Arial",Font.BOLD,45));
//		tcr.setFont(new Font("Arial",Font.BOLD,45));
////		std.setBounds(null);
//		frame.add(std);
//		frame.add(tcr);
//		
//		frame.add(textfield);
//
//		frame.add(textfield,BorderLayout.NORTH);
//		frame.setExtendedState(frame.MAXIMIZED_BOTH);
//		
//		
//		tcr.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			   signinup siu=new signinup();
//			   
//			}
//		});;
//		
//        std.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			   loginstu s=new loginstu();
//			  
//			}
//		});;
//		
//	}
//	
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
import javax.swing.JPanel;

public class mainHome {
	JFrame frame = new JFrame();
	//JPanel title_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton std=new JButton("Student");
	JButton tcr=new JButton("Teacher");
	
	
	
	mainHome(){
		
		frame.setSize(600,700);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textfield.setBounds(0,0, 100, 100);
		//textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(Color.black);
		textfield.setFont(new Font("Arial",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Attendance");
		textfield.setOpaque(true);
		
		std.setBounds(300, 300, 200, 100);
		Icon icon = new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\stud.png");
		JButton stdt=new JButton(icon);
		stdt.setBounds(500, 300, 100, 100);
		Icon icon2 = new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\teacher.png");
		JButton trc=new JButton(icon2);
		trc.setBounds(500, 500, 100, 100);
		tcr.setBounds(300, 500, 200, 100);
		tcr.setHorizontalAlignment(JLabel.CENTER);
		//std.setBackground(new Color(25,25,25));
		std.setForeground(Color.black);
		//tcr.setBackground(new Color(25,25,25));
		tcr.setForeground(Color.black);
		std.setFont(new Font("Arial",Font.BOLD,25));
		tcr.setFont(new Font("Arial",Font.BOLD,25));
		frame.add(std);
		frame.add(tcr);
		frame.add(stdt);
		frame.add(trc);
		
		frame.add(textfield);

		frame.add(textfield,BorderLayout.NORTH);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		tcr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   signinup t=new signinup();
			}
		});;
		
        std.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   loginstu s=new loginstu();
			}
		});;
		stdt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loginstu s=new loginstu();
			}
		});
		trc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signinup t=new signinup();
			}
		});
		
	}
	
}