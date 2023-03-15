//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class operation {
//	JFrame j=new JFrame();
//	JLabel title=new JLabel("Operstions");
//	JButton add=new JButton("Add new student");
//	JButton delt=new JButton("Delete new student");
//	JButton mark=new JButton("Mark attendance");
//	JButton chk=new JButton("Check Attendance");
//	
//	operation(){
//		title.setBounds(0, 0, 1600, 100);
//		title.setFont(new Font("Arial",Font.BOLD,55));
//		title.setForeground(Color.black);
//		title.setHorizontalAlignment(title.CENTER);
//		title.setOpaque(true);
//		add.setBounds(630, 250, 330, 60);
//		add.setForeground(Color.black);
//		add.setFont(new Font("Arial",Font.BOLD,30));
//		delt.setBounds(630, 350, 330, 60);
//		delt.setForeground(Color.black);
//		delt.setFont(new Font("Arial",Font.BOLD,30));
//		mark.setBounds(630, 450, 330, 60);
//		mark.setForeground(Color.black);
//		mark.setFont(new Font("Arial",Font.BOLD,30));
//		chk.setBounds(630, 550, 330, 60);
//		chk.setForeground(Color.black);
//		chk.setFont(new Font("Arial",Font.BOLD,30));
//		
//		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
//		JButton back=new JButton(icon);
//		back.setBounds(0, 0, 40, 40);
//		j.setTitle("Sign In Page");
//		j.setLocationRelativeTo(null);
//		j.getContentPane().setBackground(Color.LIGHT_GRAY);
//		j.setLayout(new BorderLayout());
//		j.add(add);
//		j.add(delt);
//		j.add(mark);
//		j.add(title);
//		j.add(chk);
//		j.add(back);
//		j.setSize(1000,1000);
//		j.setVisible(true);
//		j.setExtendedState(j.MAXIMIZED_BOTH);
//		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		delt.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				del o=new del();
//				
//			}
//		});
//		
//       
//       add.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			addNewStd a=new addNewStd();
//		}
//       });
//       back.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				signinup s=new signinup();
//				
//			}
//		});
//       	
//	}
//}


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class operation {
	JFrame j=new JFrame();
	JButton add=new JButton("Add New Student");
	JButton delt=new JButton("Delete New Student");
	JButton mark=new JButton("Mark Attendance");
	JButton check=new JButton("Check Attendance");
	
	operation() {
		
		add.setBounds(630, 250, 330, 60);
		add.setForeground(Color.black);
		
		add.setFont(new Font("Arial",Font.BOLD,30));
		delt.setBounds(630, 350, 330, 60);
		delt.setForeground(Color.black);
		delt.setFont(new Font("Arial",Font.BOLD,30));
		mark.setBounds(630, 450, 330, 60);
		mark.setForeground(Color.black);
		mark.setFont(new Font("Arial",Font.BOLD,30));
		check.setBounds(630, 550, 330, 60);
		check.setForeground(Color.black);
		check.setFont(new Font("Arial",Font.BOLD,30));
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		
		j.setTitle("Sign In Page");
		j.setLocationRelativeTo(null);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		j.add(add);
		j.add(delt);
		j.add(mark);
		j.add(check);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		delt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				del o=new del();
				
			}
		});
		
       add.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			addNewStd ad=new addNewStd();
		}
	});
       back.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			signinup sd=new signinup();
		}
	});
	
}
}
