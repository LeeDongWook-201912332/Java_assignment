package programming_homework;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student_Information extends JFrame {
	public Student_Information() {
		setTitle("수강하는 학생 정보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X 누르면 종료

		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 2, 0, 5));
		
		
		c.add(new JLabel("이름", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("학번", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("학과", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("과목", JLabel.CENTER));
		c.add(new JTextField(""));


		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student_Information();
	}

}