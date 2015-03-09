package pack;

public class Student extends Person {
	private String studentID;
	private int seniority; 
	
	public Student(String firstName, String lastName, int age, String studentID, int seniority) {
		super(firstName, lastName, age);
		setStudentID(studentID);
		setSeniority(seniority);
	}

	public String getStudentID() {
		return studentID;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public String toString(){
		String result;
		result = super.toString() +"/t[Student ID: "+ studentID +"]";
		return result;
	}

}
