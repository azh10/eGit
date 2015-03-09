package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Database extends JFrame implements ActionListener{
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
	JLabel ageTitle = new JLabel();
	JLabel studentIDTitle = new JLabel();
	JLabel departidTitle = new JLabel();
	JLabel seniorityTitle = new JLabel();
	JLabel salaryTitle = new JLabel();
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


	public void actionPerformed(ActionEvent event){
		Object source =  event.getSource();
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
			lastNameField.setText("");
			ageField.setText("");
			studentIDField.setText("");
			seniorityField.setText("");
			departidField.setText("");
			salaryField.setText("");
		}
		if(source == selectBt){
			textData = "";
			if(student.isSelected()){
				value = 1;
				System.out.println(value);
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
			if(teacher.isSelected()){
				value = 2;
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
			if(ta.isSelected()){
				value = 3;
				try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
				caShow(value);
			}
		}
		if(source == removeBt){
			try {
				remove(value, firstNameField.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}

			firstNameField.setText("");
		}

		if(source == sortBt){
			if(nameBt.isSelected()){
				Collections.sort(TeachersList, new NameComparison());
				Collections.sort(StudentsList, new NameComparison());
				Collections.sort(taList, new NameComparison());
			}
			if(ageBt.isSelected()){
				Collections.sort(TeachersList, new AgeComparison());
				Collections.sort(StudentsList, new AgeComparison());
				Collections.sort(taList, new AgeComparison());
			}
			if(salaryBt.isSelected()){
				Collections.sort(TeachersList, new SalaryComparison());
				Collections.sort(taList, new SalaryComparison());
			}
			// This will write the current arrayList of objects to their respective files
			//file = new RandomAccessFile("tData.txt", "rw");
			try {
				reFile = new FileWriter("tData.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			reFileOut = new PrintWriter(reFile);
			
			for(Teacher temp: TeachersList){
				reFileOut.print(temp.toString());
			}

			//file = new RandomAccessFile("taData.txt", "rw");
			try {
				reFile = new FileWriter("taData.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			reFileOut = new PrintWriter(reFile);
			for(TA temp: taList){
				reFileOut.print(temp.toString());
			}

			//file = new RandomAccessFile("sData.txt", "rw");
			try {
				reFile = new FileWriter("sData.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			reFileOut = new PrintWriter(reFile);
			for(Student temp: StudentsList){
				reFileOut.print(temp.toString());
			}
		}

	}

	public JPanel defaultPanel (){
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);

		student.setBounds(0,0,100,20);
		student.addActionListener(this);
		teacher.setBounds(100,0,100,20);
		ta.setBounds(200,0,100,20);
		btG.add(student);
		btG.add(teacher);
		btG.add(ta);
		totalGUI.add(student);
		totalGUI.add(teacher);
		totalGUI.add(ta);

		bts = new JPanel();
		bts.setLayout(null);
		bts.setLocation(10,40);
		bts.setSize(240,70);
		totalGUI.add(bts);

		selectBt = new JButton("Select");
		selectBt.setLocation(0,0);
		selectBt.setSize(240,30);
		selectBt.addActionListener(this);
		bts.add(selectBt);

		totalGUI.setOpaque(true);
		return totalGUI;
	}

	public void readFile(int personType) throws IOException {
		//System.out.println("words");
		if(personType == 3){
			file = new RandomAccessFile("taData.txt", "r");
		}else if(personType == 2){
			file = new RandomAccessFile("tData.txt", "r");
		}else if(personType == 1){
			file = new RandomAccessFile("sData.txt", "r");
		}
		String str;
		while((str = file.readLine()) != null){
			textData += str +"\n";
		}
		System.out.println(textData);
		file.close();
	}
	//add to file
	// “o” stands for the type of data user is inputting
	// if personType == 3, then the user is adding a TA to the database
	// if personType == 2, then the user is adding a Teacher to the database
	// if personType == 1, then the user is adding a Student to the database
	// Array List for teacher is ArrayList<Teacher> TeachersList = new ArrayList<Teacher>();
	// Array List for student is ArrayList<Student> StudentsList = new ArrayList<Student>();

	ArrayList<Teacher> TeachersList = new ArrayList<Teacher>();
	ArrayList<Student> StudentsList = new ArrayList<Student>();

	public void add(int personType, String firstName, String lastName, int age,
			String s1, int i1) throws IOException {
		if (personType == 2) {
			file = new RandomAccessFile("tData.txt", "rw");
			TeachersList.add(new Teacher(firstName, lastName, age, s1, i1));
		} else if (personType == 1) {
			file = new RandomAccessFile("sData.txt", "rw");
			StudentsList.add(new Student(firstName, lastName, age, s1, i1));
		}

		// Adds file contents to textData which adds contents to window
		String str;
		while ((str = file.readLine()) != null) {
			textData += str + "\n";
		}
		String l = firstName +" "+ lastName +" "+ age +" yrs old [ID "+ s1 +"] ["+ i1 +"] \n";
		textData += l;
		file.writeBytes(l);

		System.out.println(textData);
		area.setText(textData);
		textData = "";
		file.close();
	}

//	int index = 0;
//	for (Person temp: TeachersList){
//		if(temp.getFirstName() != /****put the text field here ****/)
//		{ index++; }
//	}
//
//	TeachersList.remove(index);
//	index = 0;




	//adding for ta
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
				if(!(temp.getFirstName().equals(s1)))
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
	public JPanel dataPanel (String in){
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);

		nameBt.setBounds(0,300,100,20);
		nameBt.addActionListener(this);
		ageBt.setBounds(100,300,100,20);
		ageBt.addActionListener(this);
		salaryBt.setBounds(200,300,100,20);
		salaryBt.addActionListener(this);
		btG.add(nameBt);
		btG.add(ageBt);
		btG.add(salaryBt);
		totalGUI.add(nameBt);
		totalGUI.add(ageBt);
		totalGUI.add(salaryBt);
		
		firstNameTitle.setText("First");	
		firstNameTitle.setBounds(0, 0, 50, 20);
		totalGUI.add(firstNameTitle);

		lastNameTitle.setText("Last");	
		lastNameTitle.setBounds(60, 0, 50, 20);
		totalGUI.add(lastNameTitle);

		firstNameField.setBounds(0,30,50, 20);
		totalGUI.add(firstNameField);

		lastNameField.setBounds(60,30,50, 20);
		totalGUI.add(lastNameField);
		
		ageTitle.setText("Age");
		ageTitle.setBounds(110,0,30,20);
		totalGUI.add(ageTitle);
		
		ageField.setBounds(110,30,30,20);
		totalGUI.add(ageField);

		if (in.equals("Student")) {
			studentIDTitle.setText("ID");
			studentIDTitle.setBounds(140, 0, 50, 20);
			totalGUI.add(studentIDTitle);

			studentIDField.setBounds(140, 30, 50, 20);
			totalGUI.add(studentIDField);
			
			seniorityTitle.setText("Seniority");
			seniorityTitle.setBounds(200, 0, 50, 20);
			totalGUI.add(seniorityTitle);
			
			seniorityField.setBounds(200, 30, 50, 20);
			totalGUI.add(seniorityField);
		} else if (in.equals("Teacher")) {
			departidTitle.setText("Depart. ID");
			departidTitle.setBounds(140, 0, 75, 20);
			totalGUI.add(departidTitle);
			
			salaryTitle.setText("salary");
			salaryTitle.setBounds(220,0,75,20);
			totalGUI.add(salaryTitle);

			departidField.setBounds(140, 30, 75, 20);
			totalGUI.add(departidField);
			
			salaryField.setBounds(220, 30, 75, 20);
			totalGUI.add(salaryField);
			
			
		} else if (in.equals("TA")) {
			departidTitle.setText("Depart. ID");
			departidTitle.setBounds(140, 0, 75, 20);
			totalGUI.add(departidTitle);
			
			salaryTitle.setText("salary");
			salaryTitle.setBounds(220,0,75,20);
			totalGUI.add(salaryTitle);

			departidField.setBounds(140, 30, 75, 20);
			totalGUI.add(departidField);
			
			salaryField.setBounds(220, 30, 75, 20);
			totalGUI.add(salaryField);
			
			studentIDTitle.setText("ID");
			studentIDTitle.setBounds(300, 0, 50, 20);
			totalGUI.add(studentIDTitle);
			seniorityTitle.setText("Seniority");
			seniorityTitle.setBounds(345, 0, 50, 20);
			totalGUI.add(seniorityTitle);

			studentIDField.setBounds(300, 30, 50, 20);
			totalGUI.add(studentIDField);
			seniorityField.setBounds(345, 30, 50, 20);
			totalGUI.add(seniorityField);
		}

		bts = new JPanel();
		bts.setLayout(null);
		bts.setLocation(10,270);
		bts.setSize(240,40);

		totalGUI.add(bts);

		addBt = new JButton("Add");
		addBt.setLocation(0,0);
		addBt.setSize(100,30);
		addBt.addActionListener(this);
		bts.add(addBt);

		removeBt = new JButton("Remove");
		removeBt.setLocation(120, 0);
		removeBt.setSize(100, 30);
		removeBt.addActionListener(this);
		bts.add(removeBt);

		sortBt = new JButton("Sort");
		sortBt.setBounds(10,330,220,30);
		sortBt.addActionListener(this);
		totalGUI.add(sortBt);

		area.setBounds(5, 55, 275, 200);
		area.setBackground(Color.white);
		area.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		area.setEditable(false);
		area.setText(textData);
		totalGUI.add(area);

		totalGUI.setOpaque(true);
		return totalGUI;

	}
	public static void caShow(int choice){
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame frame = new JFrame();
		//System.out.println("in caShow"+ textData);
		switch(choice){
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
			frame.setSize(450, 400);
			break;
		case 2:
			frame = new JFrame("Teacher Data");
			Database teacher = new Database();
			frame.setContentPane(teacher.dataPanel("Teacher"));
			frame.setSize(450, 400);
			break;
		case 3:
			frame = new JFrame("TA Data");
			Database ta = new Database();
			frame.setContentPane(ta.dataPanel("TA"));
			frame.setSize(450, 400);
			break;
		default:
			//System.out.println("Something is wrong...");
		}
		frame.setVisible(true);
	}
}


// To do the sorting on an ArrayList via the first and last name
// Collections.sort(TeachersList, new NameComparison());
// Collections.sort(StudentsList, new NameComparison());
// Collections.sort(taList, new NameComparison());


// The following are used so that Collections.sort will sort it according to first and last name when comparing Person objects
// NameComparison is referenced from http://docs.oracle.com/javase/tutorial/collections/interfaces/order.html 
class NameComparison implements Comparator<Person>{
	@Override
	public int compare(Person person1, Person person2){
		int lastCmp = person1.getLastName().compareTo(person2.getLastName());
		return(lastCmp != 0 ? lastCmp : person1.getFirstName().compareTo(person2.getFirstName()));
	}
}


// Use Collections.sort(TeachersList, new AgeComparison());
// Use Collections.sort(StudentsList, new AgeComparison());
// Use Collections.sort(taList, new AgeComparison());


class AgeComparison implements Comparator<Person>{
	@Override
	public int compare(Person person1, Person person2){
		int value = 0;

		if(person1.getAge() > person2.getAge())
		{ value = 1; }
		else if (person1.getAge() < person2.getAge())
		{ value = -1;}

		return value;
	}
}




// Use Collections.sort(TeachersList, new SalaryComparison());
// Use Collections.sort(taList, new SalaryComparison());

class SalaryComparison implements Comparator<Teacher>{
	@Override
	public int compare(Teacher person1, Teacher person2){
		int value = 0;

		if(person1.getSalary() > person2.getSalary())
		{ value = 1; }
		else if (person1.getSalary() < person2.getSalary())
		{ value = -1;}

		return value;
	}
}


