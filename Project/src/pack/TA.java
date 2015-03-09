package pack;

public class TA extends Teacher implements StudentTA{
	private String studentID;
	private int seniority;

	public TA(String firstName, String lastName, int age, String departId, int salary, String studentID, int seniority) {
		super(firstName, lastName, age, departId, salary);
		setStudentID(studentID);
		setSeniority(seniority);
	}
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

}
