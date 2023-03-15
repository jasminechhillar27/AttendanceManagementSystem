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
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class teacher {
	JFrame j=new JFrame();
	//JLabel login=new JLabel();
	JLabel name=new JLabel("Name:");
	JLabel title=new JLabel("Teacher SignUp");
	JLabel pas=new JLabel("Password:");
	JLabel mail=new JLabel("E-Mail:");
	JLabel id=new JLabel("Teacher ID:");
	JButton signup=new JButton("Sign Up");
	TextField tname=new TextField();
	TextField tid=new TextField();
	TextField tmail=new TextField();
	TextField tpas=new TextField();

	teacher(){
		j.setSize(1000,1000);
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		j.setTitle("Sign Up Page");
		j.setLocationRelativeTo(null);
		title.setBounds(0, 0, 1600, 100);
		title.setFont(new Font("Arial",Font.BOLD,45));
		title.setOpaque(true);
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		name.setBounds(580, 250, 150, 60);
		name.setFont(new Font("Arial",Font.BOLD,30));
		name.setForeground(Color.black);
		tname.setBounds(750, 250, 260, 60);
		id.setBounds(580, 340, 250, 60);
		id.setFont(new Font("Arial",Font.BOLD,30));
		id.setForeground(Color.black);
		tid.setBounds(750, 350, 260, 60);
		mail.setBounds(580, 450, 250, 60);
		mail.setFont(new Font("Arial",Font.BOLD,30));
		mail.setForeground(Color.black);
		tmail.setBounds(750, 450, 260, 60);
		pas.setBounds(580, 550, 250, 60);
		pas.setFont(new Font("Arial",Font.BOLD,30));
		pas.setForeground(Color.black);
		tpas.setBounds(750, 550, 260, 60);
		signup.setBounds(730, 720, 130, 60);
		signup.setFont(new Font("Arial",Font.BOLD,20));
		signup.setForeground(Color.black);
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		
		j.add(name);
		j.add(tid);
		j.add(title);
		j.add(tname);
		j.add(tmail);
		j.add(tpas);
		j.add(signup);
		j.add(id);
		j.add(mail);
		j.add(pas);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		signup.addActionListener(new ActionListener() {
			
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