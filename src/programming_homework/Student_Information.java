package programming_homework;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student_Information extends JFrame {
	public Student_Information() {
		setTitle("�����ϴ� �л� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X ������ ����

		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 2, 0, 5));
		
		
		c.add(new JLabel("�̸�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�", JLabel.CENTER));
		c.add(new JTextField(""));
		c.add(new JLabel("����", JLabel.CENTER));
		c.add(new JTextField(""));


		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student_Information();
	}

}