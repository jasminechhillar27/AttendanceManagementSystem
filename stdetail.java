import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class stdetail{
	JFrame j=new JFrame();
	JLabel title=new JLabel("Student Attendance Details");
	JLabel name=new JLabel("Student Name:");
	JLabel id=new JLabel("Student ID:");
	JLabel curattend=new JLabel("Current Attendance:");
	JLabel maxattend=new JLabel("Maximum Attendance:");
	TextField sname=new TextField();
	TextField sid=new TextField();
	TextField curatt=new TextField();
	TextField maxatt=new TextField();
	JButton cancel=new JButton("Cancel");
	
		stdetail(){
		title.setBounds(0, 0, 1600, 100);
		title.setFont(new Font("Arial",Font.BOLD,55));
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		title.setOpaque(true);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		name.setBounds(500, 300, 250, 50);
		name.setFont(new Font("Arial",Font.BOLD,30));
		name.setForeground(Color.black);
		sname.setBounds(860, 300, 250, 50);
		id.setBounds(500, 380, 250, 50);
		id.setFont(new Font("Arial",Font.BOLD,30));
		id.setForeground(Color.black);
		sid.setBounds(860, 380, 250, 50);
		curattend.setBounds(500, 460, 330, 50);
		curattend.setFont(new Font("Arial",Font.BOLD,30));
		curattend.setForeground(Color.black);
		curatt.setBounds(860, 460, 250, 50);
		maxattend.setBounds(500, 540, 330, 50);
		maxattend.setFont(new Font("Arial",Font.BOLD,30));
		maxattend.setForeground(Color.black);
		maxatt.setBounds(860, 540, 250, 50);
		j.setTitle("Student Attendance Details");
		j.setLocationRelativeTo(null);
		title.setForeground(Color.BLACK);
		title.setHorizontalAlignment(JLabel.CENTER);
		cancel.setBounds(730, 680, 100, 50);
		cancel.setForeground(Color.black);
		cancel.setFont(new Font("Arial",Font.BOLD,20));
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		
		
		
		j.add(title);
		j.add(name);
		j.add(sname);
		j.add(id);
		j.add(sid);
		j.add(curattend);
		j.add(maxattend);
		j.add(curatt);
		j.add(maxatt);
		j.add(cancel);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loginstu m=new loginstu();
			}
		});
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		 
	}

}