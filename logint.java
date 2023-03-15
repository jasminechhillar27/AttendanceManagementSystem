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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class logint {
	JFrame j=new JFrame();
	JLabel name=new JLabel("Teacher Name:");
	JLabel title=new JLabel("Teacher Sign In");
	JLabel id=new JLabel("Teacher ID:");
	JButton login=new JButton("Submit");
	TextField tname=new TextField();
	TextField tpas=new TextField();
	JLabel pas=new JLabel("Password:");
	TextField tid=new TextField();
	
	logint(){
		j.setSize(1000,1000);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		j.setTitle("Sign In Page");
		j.setLocationRelativeTo(null);
		title.setBounds(0, 0, 1600, 100);
		title.setFont(new Font("Arial",Font.BOLD,45));
		title.setOpaque(true);
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		name.setBounds(580, 250, 230, 60);
		name.setFont(new Font("Arial",Font.BOLD,30));
		name.setForeground(Color.black);
		tname.setBounds(820, 250, 260, 60);
		id.setBounds(580, 340, 230, 60);
		id.setFont(new Font("Arial",Font.BOLD,30));
		id.setForeground(Color.black);
		tid.setBounds(820, 350, 260, 60);
		pas.setBounds(580, 450, 230, 60);
		pas.setFont(new Font("Arial",Font.BOLD,30));
		pas.setForeground(Color.black);
		tpas.setBounds(820, 450, 260, 60);
		login.setBounds(690, 570, 150, 60);
		login.setFont(new Font("Arial",Font.BOLD,30));
		login.setForeground(Color.black);
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		j.add(title);
		j.add(name);
		j.add(tname);
		j.add(id);
		j.add(tid);
		j.add(login);
		j.add(tpas);
		j.add(pas);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operation o=new operation();
				
			}
		});
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signinup s=new signinup();
				
			}
		});
		
		 
	}

}