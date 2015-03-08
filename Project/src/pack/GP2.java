package pack;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.color.*;

public class GP2{
	public static void main(String[] args){
		//new GP2();
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Database.caShow(0);
			}
		});
		
	}
//	JPanel titlePanel, score, bts;
//	JLabel redL, blueL, myL;
//	JButton selectBt, removeBt;
//	JPanel pane = new JPanel();
//	JButton bt = new JButton("Press 'y'");
//	JLabel answer = new JLabel("");
//	TextField one = new TextField();
//	JLabel nameT = new JLabel();
//	Container con = this.getContentPane();
//	
//	JRadioButton student = new JRadioButton("Student");
//	JRadioButton teacher = new JRadioButton("Teacher");
//	JRadioButton ta = new JRadioButton("TA");
//	ButtonGroup btG = new ButtonGroup();
////	GP2(){
////		super("Frame");
////		setBounds(250,0,300,200);
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		Container con = this.getContentPane();
////		con.add(pane);
////		//con.add(answer);
////		bt.setMnemonic('y');
////		bt.addActionListener(this);
////		pane.add(answer);
////		pane.add(bt);
////		bt.requestFocus();
////		setVisible(true);
////	}
//	public void actionPerformed(ActionEvent event){
//		Object source =  event.getSource();
//		if(source == bt){
//			answer.setText("Button Pressed");
//			JOptionPane.showMessageDialog(null, "I hear You", "Message Dialog", JOptionPane.PLAIN_MESSAGE);
//			setVisible(true);
//		}
//        if(source == selectBt){
//        	if(student.isSelected()){
//    			showStudent();
//    		}
//        	if(teacher.isSelected()){
//    			//showTeacher();
//    		}
//        	if(ta.isSelected()){
//    			//showTA();
//    		}
//        }
//        else if(source == removeBt){
//        	answer.setText("removeBt");
//        }
//	}

//	public JPanel defaultPanel (){
//		JPanel totalGUI = new JPanel();
//		totalGUI.setLayout(null);
//		
////		titlePanel = new JPanel();
////		titlePanel.setLayout(null);
////		titlePanel.setLocation(0,0);
////		titlePanel.setSize(250,30);
////		totalGUI.add(titlePanel);
////		
//		student.setBounds(0,0,100,20);
//		student.addActionListener(this);
//		teacher.setBounds(100,0,100,20);
//		ta.setBounds(200,0,100,20);
//		btG.add(student);
//		btG.add(teacher);
//		btG.add(ta);
//		totalGUI.add(student);
//		totalGUI.add(teacher);
//		totalGUI.add(ta);
//		
//		if(student.isSelected()){
//			System.out.println("yup");
//		}
////		nameT.setText("NAME");
////		nameT.setBounds(0, 0, 50, 20);
////		//nameT.setEditable(false);
////		totalGUI.add(nameT);
////		
////		one.setText("words");
////		//one.setLocation(0, 30);
////		one.setBounds(0, 30, 50, 20);
////		one.setBackground(Color.white);
////		totalGUI.add(one);
////		
//		bts = new JPanel();
//		bts.setLayout(null);
//		bts.setLocation(10,80);
//		bts.setSize(240,70);
//
//		totalGUI.add(bts);
//		
//		selectBt = new JButton("Select");
//		selectBt.setLocation(0,0);
//		selectBt.setSize(100,30);
//		selectBt.addActionListener(this);
//		bts.add(selectBt);
//		
//		removeBt = new JButton("Remove");
//		removeBt.setLocation(120, 0);
//		removeBt.setSize(100, 30);
//		removeBt.addActionListener(this);
//		bts.add(removeBt);
//				
//		totalGUI.setOpaque(true);
//		return totalGUI;
//	}
//	
//	public static void caShow(){
//		JFrame.setDefaultLookAndFeelDecorated(false);
//		JFrame frame = new JFrame("Database");
//		
//		GP2 demo = new GP2();
//		frame.setContentPane(demo.defaultPanel());
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300, 200);
//		frame.setVisible(true);
//	}
//	
//	public static void showStudent(){
//		JFrame.setDefaultLookAndFeelDecorated(false);
//		JFrame frame = new JFrame("Student Data");
//		
//		GP2 demo = new GP2();
//		frame.setContentPane(demo.defaultPanel());
//		frame.setSize(300, 200);
//		frame.setVisible(true);
//	}
}
