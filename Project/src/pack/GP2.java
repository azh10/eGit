package pack;

import java.io.IOException;

public class GP2{
	public static void main(String[] args) throws IOException{
		Database.caShow(0);
	}
	//probably useless code not sure yet
{
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
//	GP2(){
//		super("Frame");
//		setBounds(250,0,300,200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container con = this.getContentPane();
//		con.add(pane);
//		//con.add(answer);
//		bt.setMnemonic('y');
//		bt.addActionListener(this);
//		pane.add(answer);
//		pane.add(bt);
//		bt.requestFocus();
//		setVisible(true);
//	}
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
//		titlePanel = new JPanel();
//		titlePanel.setLayout(null);
//		titlePanel.setLocation(0,0);
//		titlePanel.setSize(250,30);
//		totalGUI.add(titlePanel);
//		
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
//		nameT.setText("NAME");
//		nameT.setBounds(0, 0, 50, 20);
//		//nameT.setEditable(false);
//		totalGUI.add(nameT);
//		
//		one.setText("words");
//		//one.setLocation(0, 30);
//		one.setBounds(0, 30, 50, 20);
//		one.setBackground(Color.white);
//		totalGUI.add(one);
//		
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
}
/*
	package pack;

import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.FileWriter;
import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Database extends JFrame implements ActionListener {
	JPanel bts;
	JButton selectBt, addBt, removeBt, sortBt;
	JPanel pane = new JPanel();
	JLabel answer = new JLabel("");
	TextField firstNameField = new TextField();
	TextField lastNameField = new TextField();
	TextField ageField = new TextField();
	TextField studentIDField = new TextField();
	TextField departidField = new TextField();
	TextField salaryField = new TextField();
	TextField seniorityField = new TextField();
	TextField field = new TextField();
	TextField data = new TextField();
	JTextArea area = new JTextArea();
	static String textData = "";
	static int value = -1;
	JLabel title = new JLabel();
	JLabel firstNameTitle = new JLabel();
	JLabel lastNameTitle = new JLabel();
	JLabel idT = new JLabel();
	JLabel departidT = new JLabel();
	Container con = this.getContentPane();
	RandomAccessFile file = null;
	FileWriter reFile = null;
	PrintWriter reFileOut = null;

	JRadioButton student = new JRadioButton("Student");
	JRadioButton teacher = new JRadioButton("Teacher");
	JRadioButton ta = new JRadioButton("TA");
	ButtonGroup btG = new ButtonGroup();

	JRadioButton nameBt = new JRadioButton("Name");
	JRadioButton ageBt = new JRadioButton("Age");
	JRadioButton salaryBt = new JRadioButton("Salary");
	ButtonGroup sortBtG = new ButtonGroup();

	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == addBt) {
			textData = "";
			if (value == 1) {
				try {
					add(value, firstNameField.getText(),
							lastNameField.getText(),
							Integer.parseInt(ageField.getText()),
							studentIDField.getText(),
							Integer.parseInt(seniorityField.getText()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (value == 2) {
				try {
					add(value, firstNameField.getText(),
							lastNameField.getText(),
							Integer.parseInt(ageField.getText()),
							departidField.getText(),
							Integer.parseInt(salaryField.getText()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (value == 3) {
				try {
					add(value, firstNameField.getText(),
							lastNameField.getText(),
							Integer.parseInt(ageField.getText()),
							departidField.getText(),
							Integer.parseInt(salaryField.getText()),
							studentIDField.getText(),
							Integer.parseInt(seniorityField.getText()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			firstNameField.setText("");
			studentIDField.setText("");
			departidField.setText("");
		}
		if (source == selectBt) {
			textData = "";
			if (student.isSelected()) {
				value = 1;
				System.out.println(value);
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
			if (teacher.isSelected()) {
				value = 2;
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
			if (ta.isSelected()) {
				value = 3;
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
		}
		if (source == removeBt) {
			try {
				remove(value, firstNameField.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}

			firstNameField.setText("");
		}
		if (source == sortBt) {
			if (nameBt.isSelected()) {
				Collections.sort(TeachersList, new NameComparison());
				Collections.sort(StudentsList, new NameComparison());
				Collections.sort(taList, new NameComparison());
			}
			if (ageBt.isSelected()) {
				Collections.sort(TeachersList, new AgeComparison());
				Collections.sort(StudentsList, new AgeComparison());
				Collections.sort(taList, new AgeComparison());
			}
			if (salaryBt.isSelected()) {
				Collections.sort(TeachersList, new SalaryComparison());
				Collections.sort(StudentsList, new SalaryComparison());
				Collections.sort(taList, new SalaryComparison());
			}
			
			// This will write the current arrayList of objects to their respective files
			file = new RandomAccessFile("tData.txt", "rw");
			for(Teacher temp: TeachersList){
				file.writeBytes(temp.toString());
			}

			reFile = new FileWriter("taData.txt");
			reFileOut = new PrintWriter(reFile);
			reFileOut.print(temp.toString());
			file = new RandomAccessFile("taData.txt", "rw");
			for(TA temp: taList){
				file.writeBytes(temp.toString());
			}

			file = new RandomAccessFile("sData.txt", "rw");
			for(Student temp: StudentsList){
				file.writeBytes(temp.toString());
			}

		}
	}

	public JPanel defaultPanel() {
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);

		student.setBounds(0, 0, 100, 20);
		student.addActionListener(this);
		teacher.setBounds(100, 0, 100, 20);
		ta.setBounds(200, 0, 100, 20);
		btG.add(student);
		btG.add(teacher);
		btG.add(ta);
		totalGUI.add(student);
		totalGUI.add(teacher);
		totalGUI.add(ta);

		bts = new JPanel();
		bts.setLayout(null);
		bts.setLocation(10, 40);
		bts.setSize(240, 70);
		totalGUI.add(bts);

		selectBt = new JButton("Select");
		selectBt.setLocation(0, 0);
		selectBt.setSize(240, 30);
		selectBt.addActionListener(this);
		bts.add(selectBt);

		totalGUI.setOpaque(true);
		return totalGUI;
	}

	public void readFile(int personType) throws IOException {
		if (personType == 3) {
			file = new RandomAccessFile("taData.txt", "r");
		} else if (personType == 2) {
			file = new RandomAccessFile("tData.txt", "r");
		} else if (personType == 1) {
			file = new RandomAccessFile("sData.txt", "r");
		}
		String str;
		while ((str = file.readLine()) != null) {
			textData += str + "\n";
		}
		System.out.println(textData);
		file.close();
	}

	{
		// PrintReader inputStream = null;
		// PrintWriter outputStream = null;
		//
		// try {
		// inputStream = new PrintReader("taData.txt");
		// outputStream = new PrintWriter(new
		// FileWriter("characteroutput.txt"));
		//
		// String l;
		// while ((l = inputStream.readLine()) != null) {
		// //System.out.println(l);
		// outputStream.println(l);
		// textData += ""+ l;
		//
		// }
		// //System.out.println(textData);
		// } finally {
		// if (inputStream != null) {
		// inputStream.close();
		// }
		// if (outputStream != null) {
		// outputStream.close();
		// }
		// }

	}

	// add to file
	// “o” stands for the type of data user is inputting
	// if personType == 3, then the user is adding a TA to the database
	// if personType == 2, then the user is adding a Teacher to the database
	// if personType == 1, then the user is adding a Student to the database
	// Array List for teacher is ArrayList<Teacher> TeachersList = new
	// ArrayList<Teacher>();
	// Array List for student is ArrayList<Student> StudentsList = new
	// ArrayList<Student>();

	ArrayList<Teacher> TeachersList = new ArrayList<Teacher>();
	ArrayList<Student> StudentsList = new ArrayList<Student>();

	public void add(int personType, String firstName, String lastName, int Age,
			String s1, int i1) throws IOException {
		if (personType == 2) {
			file = new RandomAccessFile("tData.txt", "rw");
			TeachersList.add(new Teacher(firstName, lastName, Age, s1, i1));
		} else if (personType == 1) {
			file = new RandomAccessFile("sData.txt", "rw");
			StudentsList.add(new Student(firstName, lastName, Age, s1, i1));
		}

		// Adds file contents to textData which adds contents to window
		String str;
		while ((str = file.readLine()) != null) {
			textData += str + "\n";
		}
		String l = firstName + " [" + lastName + "] \n";
		textData += l;
		file.writeBytes(l);

		System.out.println(textData);
		area.setText(textData);
		textData = "";
		file.close();
	}

	// adding for ta
	ArrayList<TA> taList = new ArrayList<TA>();

	public void add(int personType, String firstName, String lastName, int Age,
			String studentID, int seniority, String departID, int salary)
			throws IOException {
		System.out.println("words " + value);
		if (personType == 3) {
			file = new RandomAccessFile("taData.txt", "rw");
			taList.add(new TA(firstName, lastName, Age, studentID, seniority,
					departID, salary));
		}
		String str;
		while ((str = file.readLine()) != null) {
			textData += str + "\n";
		}
		String l = studentID + " [" + seniority + "] [" + departID
				+ "] [“+ salary +”]\n";
		textData += l;
		file.writeBytes(l);

		System.out.println(textData);
		area.setText(textData);
		textData = "";
		file.close();
	}

	public void remove(int personType, String s1) throws IOException{
		if(personType== 3){
			file = new RandomAccessFile("taData.txt", "rw");
			int index = 0;
			for (Person temp: taList){
				if(temp.getFirstName() != s1)
				{ index++; }
			}
			taList.remove(index);
			index = 0;

			Collections.sort(taList, new NameComparison());

		}else if(personType== 2){
			file = new RandomAccessFile("tData.txt", "rw");
			int index = 0;
			for (Person temp: TeachersList){
				if(temp.getFirstName() != s1)
				{ index++; }
			}
			TeachersList.remove(index);
			index = 0;
			Collections.sort(TeachersList, new NameComparison());
		}else if(personType== 1){
			file = new RandomAccessFile("sData.txt", "rw");
			int index = 0;
			for (Person temp: StudentsList){
				if(temp.getFirstName() != s1)
				{ index++; }
			}
			StudentsList.remove(index);
			index = 0;
			Collections.sort(StudentsList, new NameComparison());

		}



		
	//	int counter = 0;
	//	int end = s1.length() - 1;
	//	
	//	for(int i = 0; i <= end; i++){
	//		char c = file.readChar();
//			System.out.println(s1);
	//		System.out.println(s1.charAt(i) +" "+ c);
	//		if(s1.charAt(i) == c){
	//			counter++;
	//			if(counter == end){
	//				System.out.println("REMOVE");
	//			}else{
	//				System.out.println(c);
	//			}
	//		}
			
	//	}

	}

	public JPanel dataPanel(String in) {
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);

		firstNameTitle.setText("FIRST NAME");
		firstNameTitle.setBounds(0, 0, 100, 20);
		totalGUI.add(firstNameTitle);

		lastNameTitle.setText("LAST NAME");
		lastNameTitle.setBounds(25, 0, 100, 20);
		totalGUI.add(lastNameTitle);

		firstNameField.setBounds(25, 30, 100, 20);
		totalGUI.add(firstNameField);

		lastNameField.setBounds(0, 30, 100, 20);
		totalGUI.add(lastNameField);

		if (in.equals("Student")) {
			idT.setText("ID");
			idT.setBounds(110, 0, 50, 20);
			totalGUI.add(idT);

			studentIDField.setBounds(110, 30, 50, 20);
			totalGUI.add(studentIDField);
		} else if (in.equals("Teacher")) {
			departidT.setText("Depart. ID");
			departidT.setBounds(110, 0, 75, 20);
			totalGUI.add(departidT);

			departidField.setBounds(110, 30, 75, 20);
			totalGUI.add(departidField);
		} else if (in.equals("TA")) {

			idT.setText("ID");
			idT.setBounds(110, 0, 50, 20);
			totalGUI.add(idT);
			departidT.setText("Depart. ID");
			departidT.setBounds(170, 0, 75, 20);
			totalGUI.add(departidT);

			studentIDField.setBounds(110, 30, 50, 20);
			totalGUI.add(studentIDField);
			departidField.setBounds(170, 30, 75, 20);
			totalGUI.add(departidField);
		}

		bts = new JPanel();
		bts.setLayout(null);
		bts.setLocation(10, 270);
		bts.setSize(240, 100);

		totalGUI.add(bts);

		addBt = new JButton("Add");
		addBt.setLocation(0, 0);
		addBt.setSize(100, 30);
		addBt.addActionListener(this);
		bts.add(addBt);

		removeBt = new JButton("Remove");
		removeBt.setLocation(120, 0);
		removeBt.setSize(100, 30);
		removeBt.addActionListener(this);
		bts.add(removeBt);

		sortBt = new JButton("Sort");
		sortBt.setLocation(0, 40);
		sortBt.setSize(220, 30);
		sortBt.addActionListener(this);
		bts.add(sortBt);

		area.setBounds(5, 55, 275, 200);
		area.setBackground(Color.white);
		area.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		area.setEditable(false);
		area.setText(textData);
		totalGUI.add(area);

		totalGUI.setOpaque(true);
		return totalGUI;

	}

	public static void caShow(int choice) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame frame = new JFrame();
		switch (choice) {
		case 0:
			frame = new JFrame("Database");
			Database main = new Database();
			frame.setContentPane(main.defaultPanel());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(280, 120);
			break;
		case 1:
			frame = new JFrame("Student Data");
			Database student = new Database();
			frame.setContentPane(student.dataPanel("Student"));
			frame.setSize(500, 400);
			break;
		case 2:
			frame = new JFrame("Teacher Data");
			Database teacher = new Database();
			frame.setContentPane(teacher.dataPanel("Teacher"));
			frame.setSize(500, 400);
			break;
		case 3:
			frame = new JFrame("TA Data");
			Database ta = new Database();
			frame.setContentPane(ta.dataPanel("TA"));
			frame.setSize(500, 400);
			break;
		default:
			System.out.println("Something is wrong...");
		}
		frame.setVisible(true);
	}

	
}
*/