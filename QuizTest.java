package javab;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QuizTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Online MSE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		JLabel l1, l2, l3, l4;
		l1 = new JLabel("Login Page");
		l1.setBounds(200, 0, 200, 30);
		l2 = new JLabel("NAME");
		l2.setBounds(100, 50, 300, 30);
		l3 = new JLabel("USN");
		l3.setBounds(100, 120, 300, 30);
		l4 = new JLabel("SECTION");
		l4.setBounds(100, 190, 300, 30);
		JTextField name, usn, sec;
		name = new JTextField("Enter Your NAME");
		name.setBounds(100, 80, 250, 30);
		usn = new JTextField("Enter Your USN");
		usn.setBounds(100, 150, 250, 30);
		sec = new JTextField("Enter Your SECTION");
		sec.setBounds(100, 220, 250, 30);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(name);
		frame.add(usn);
		frame.add(sec);

	}

}
