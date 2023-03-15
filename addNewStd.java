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

public class addNewStd{
	JFrame j=new JFrame();
	JLabel title=new JLabel("Add New Student Details");
	JLabel name=new JLabel("Student Name:");
	JLabel id=new JLabel("Student ID:");
	JLabel cls=new JLabel("Class:");
	TextField sname=new TextField();
	TextField sid=new TextField();
	TextField scls=new TextField();
	JButton ad=new JButton("Add");
	
		addNewStd(){
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		title.setBounds(0, 0, 1600, 100);
		title.setOpaque(true);
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		title.setFont(new Font("Arial",Font.BOLD,45));
		name.setBounds(580, 250, 230, 60);
		name.setForeground(Color.black);
		name.setFont(new Font("Arial",Font.BOLD,30));
		sname.setBounds(820, 250, 260, 60);
		id.setBounds(580, 340, 230, 60);
		id.setForeground(Color.black);
		id.setFont(new Font("Arial",Font.BOLD,30));
		sid.setBounds(820, 350, 260, 60);
		cls.setBounds(580, 450, 230, 60);
		cls.setForeground(Color.black);
		cls.setFont(new Font("Arial",Font.BOLD,30));
		scls.setBounds(820, 450, 260, 60);
		ad.setBounds(690, 570, 150, 60);
		ad.setForeground(Color.black);
		ad.setFont(new Font("Arial",Font.BOLD,35));
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		
		j.setTitle("New Student Updation");
		j.setLocationRelativeTo(null);
		title.setForeground(Color.BLACK);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		j.add(title);
		j.add(name);
		j.add(sname);
		j.add(id);
		j.add(sid);
		j.add(cls);
		j.add(scls);
		j.add(ad);
		j.add(back);
		j.setSize(1000,1000);
		j.setLayout(null);
		j.setVisible(true);
		j.setExtendedState(j.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operation s=new operation();
				
			}
		});
		 
	}

}