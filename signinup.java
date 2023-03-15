import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

	public class signinup{
		JFrame j=new JFrame();
		JButton Signin=new JButton("Sign In");
		JButton Signup=new JButton("Sign Up");
		JLabel login=new JLabel("OR");
		signinup(){
			
			j.getContentPane().setBackground(Color.LIGHT_GRAY);
			j.setLayout(new BorderLayout());
			j.setVisible(true);
			j.setTitle("Sign Up or Sign In");
			j.setLocationRelativeTo(null);
			login.setBounds(680, 420, 200, 50);
			login.setHorizontalAlignment(login.CENTER);
			login.setForeground(Color.black);
			login.setFont(new Font("Arial", Font.BOLD, 30));
			
			Signup.setBounds(665, 220, 230, 120);
			Signup.setForeground(Color.black);
			Signup.setFont(new Font("Arial",Font.BOLD,45));
			Signin.setBounds(665, 540, 230, 120);
			Signin.setForeground(Color.black);
			Signin.setFont(new Font("Arial",Font.BOLD,45));
			Icon icon=new ImageIcon("C:\\Users\\Jass chhillar\\Downloads\\back.png");
			JButton back=new JButton(icon);
			back.setBounds(0, 0, 40, 40);
			j.add(Signup);
			j.add(Signin);
			j.add(back);
			j.add(login);
			j.setSize(1000,1000);
			j.setLayout(null);
			j.setVisible(true);
			j.setExtendedState(j.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Signup.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					teacher o=new teacher();
					
				}
			});
			
            Signin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					logint o=new logint();
					
				}
			});
            
            back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mainHome mh=new mainHome();
				}
			});

			
			 
		}

	}