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

public class del {
	JFrame j=new JFrame();
	JLabel title=new JLabel("Delete Student from List");
	JLabel id=new JLabel("Student ID:");
	JButton de=new JButton("Delete");
	TextField tid=new TextField();
	
	del(){
		j.getContentPane().setBackground(Color.LIGHT_GRAY);
		j.setLayout(new BorderLayout());
		j.setVisible(true);
		title.setBounds(0, 0, 1600, 100);
		title.setOpaque(true);
		title.setForeground(Color.black);
		title.setHorizontalAlignment(title.CENTER);
		title.setFont(new Font("Arial",Font.BOLD,45));
		id.setBounds(580, 340, 230, 60);
		id.setForeground(Color.black);
		id.setFont(new Font("Arial",Font.BOLD,30));
		tid.setBounds(820, 350, 260, 60);
		de.setBounds(720, 570, 150, 60);
		de.setForeground(Color.black);
		de.setFont(new Font("Arial",Font.BOLD,35));
		Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
		JButton back=new JButton(icon);
		back.setBounds(0, 0, 40, 40);
		j.add(id);
		j.add(title);
		j.add(tid);
		j.add(de);
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
				operation o=new operation();
			}
		});
		
	}
	

}