package pack;

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
	JPanel titlePanel, score, bts;
	JLabel redL, blueL;
	JButton selectBt, addBt, removeBt;
	JPanel pane = new JPanel();
	JButton bt = new JButton();
	JLabel answer = new JLabel("");
	TextField nameF = new TextField();
	TextField idF = new TextField();
	TextField departidF = new TextField();
	TextField field = new TextField();
	TextField data = new TextField();
	JTextArea area = new JTextArea();
	static String textData = "";
	JLabel title = new JLabel();
	JLabel nameT = new JLabel();
	JLabel idT = new JLabel();
	JLabel departidT = new JLabel();
	Container con = this.getContentPane();
	RandomAccessFile file = null;
	
	JRadioButton student = new JRadioButton("Student");
	JRadioButton teacher = new JRadioButton("Teacher");
	JRadioButton ta = new JRadioButton("TA");
	ButtonGroup btG = new ButtonGroup();
	
	public void actionPerformed(ActionEvent event){
		Object source =  event.getSource();
		if(source == bt){
			answer.setText("Button Pressed");
			JOptionPane.showMessageDialog(null, "I hear You", "Message Dialog", JOptionPane.PLAIN_MESSAGE);
			setVisible(true);
		}
        if(source == selectBt){
        	if(student.isSelected()){
        		int value = 1;
        		try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
    			caShow(value);
    		}
        	if(teacher.isSelected()){
        		int value = 2;
        		try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
    			caShow(value);
    		}
        	if(ta.isSelected()){
        		int value = 3;
        		try {
					readFile(value);
				} catch (IOException e) {
					e.printStackTrace();
				}
    			caShow(value);
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
	
	public void readFile(int o) throws IOException {
		//System.out.println("words");
		if(o == 3){
			file = new RandomAccessFile("taData.txt", "r");
		}else if(o == 2){
			file = new RandomAccessFile("tData.txt", "r");
		}else if(o == 1){
			file = new RandomAccessFile("sData.txt", "r");
		}
		textData = file.readLine();
		textData += "\n"+ file.readLine();
		textData += "\n"+ file.readLine();
		System.out.println(textData);
		file.close();
		
		
		
		
//      PrintReader inputStream = null;
//      PrintWriter outputStream = null;
//
//      try {
//          inputStream = new PrintReader("taData.txt");
//          outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
//
//          String l;
//          while ((l = inputStream.readLine()) != null) {
//          	//System.out.println(l);
//              outputStream.println(l);
//              textData += ""+ l;
//              
//          }
//          //System.out.println(textData);
//      } finally {
//          if (inputStream != null) {
//              inputStream.close();
//          }
//          if (outputStream != null) {
//              outputStream.close();
//          }
//      }

	}
	
	public void add(int i, String s1, String s2) throws IOException {
		//System.out.println("words");

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        try {
            outputStream = new PrintWriter(new FileWriter("taData.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
            	//System.out.println(l);
            	//if()
                outputStream.println(l);
                textData += ""+ l;
                
            }
            //System.out.println(textData);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
	}
	public JPanel dataPanel (String in){
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		nameT.setText("NAME");	
		nameT.setBounds(0, 0, 100, 20);
		totalGUI.add(nameT);
		
		nameF.setBounds(0,30,100, 20);
		totalGUI.add(nameF);
		
		if(in.equals("Student")){
			idT.setText("ID");
			idT.setBounds(110, 0, 50, 20);
			totalGUI.add(idT);
			
			idF.setBounds(110,30,50, 20);
			totalGUI.add(idF);
		} else if(in.equals("Teacher")){
			departidT.setText("Depart. ID");
			departidT.setBounds(110,0,75,20);
			totalGUI.add(departidT);
			
			departidF.setBounds(110,30,75, 20);
			totalGUI.add(departidF);
		} else if(in.equals("TA")){
			
			idT.setText("ID");
			idT.setBounds(110, 0, 50, 20);
			totalGUI.add(idT);
			departidT.setText("Depart. ID");
			departidT.setBounds(170,0,75,20);
			totalGUI.add(departidT);
			
			idF.setBounds(110,30,50, 20);
			totalGUI.add(idF);
			departidF.setBounds(170,30,75, 20);
			totalGUI.add(departidF);
		}
		
		bts = new JPanel();
		bts.setLayout(null);
		bts.setLocation(10,270);
		bts.setSize(240,70);

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
		
		//System.out.println(textData);
//		data.setBounds(5,155,275,200);
//		data.setBackground(Color.white);
//		data.setEditable(false);
//		data.setText(textData);
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
				frame.setSize(300, 400);
				break;
			case 2:
				frame = new JFrame("Teacher Data");
				Database teacher = new Database();
				frame.setContentPane(teacher.dataPanel("Teacher"));
				frame.setSize(300, 400);
				break;
			case 3:
				frame = new JFrame("TA Data");
				Database ta = new Database();
				frame.setContentPane(ta.dataPanel("TA"));
				frame.setSize(300, 400);
				break;
			default:
				//System.out.println("Something is wrong...");
		}
		frame.setVisible(true);
	}
}