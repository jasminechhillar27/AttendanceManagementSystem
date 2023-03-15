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

public class loginstu {
	JFrame j=new JFrame();
	JLabel title=new JLabel("Student Login");
	JLabel id=new JLabel("Student ID:");
	JButton submit=new JButton("Submit");
	TextField tid=new TextField();
	
	loginstu(){
		title.setBounds(0, 0, 1600, 100);
		title.setFont(new Font("Arial",Font.BOLD,55));
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		title.setOpaque(true);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		j.setTitle("Student Login");
		j.setLocationRelativeTo(null);
		submit.setHorizontalAlignment(submit.CENTER);
		id.setBounds(560, 300, 200, 50);
		id.setFont(new Font("Arial",Font.BOLD,30));
		id.setForeground(Color.black);
		tid.setBounds(800, 300, 230, 40);
		submit.setBounds(690, 460, 200, 120);
		submit.setFont(new Font("Arial",Font.BOLD,30));
		submit.setForeground(Color.black);
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		
		j.add(title);
		j.add(id);
		j.add(tid);
		j.add(submit);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.add(title,BorderLayout.NORTH);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				stdetail o=new stdetail();
				
			}
		});
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainHome mn=new mainHome();
				
			}
		});
		
		 
	}

}