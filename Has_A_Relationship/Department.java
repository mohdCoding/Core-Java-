package Has_A_Relationship;

public class Department {

	
	private Integer deptNo;
	private String deptName;
	private String deptLoc;
	
	Student[] students;
	public Department(Integer deptNo, String deptName, String deptLoc, 
			Student[] students) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.students = students;
	}
	
	/**
    public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	**/
	public void display() {
		System.out.println("*************Department details******************");
		System.out.println("dept No     ::   " + deptNo );
		System.out.println("dept Name   ::   " + deptName );
		System.out.println("dept Loc    ::   " + deptLoc );
		System.out.println("**************************************************");
		System.out.println("*************Student details**********************");
		
		for(Student student : students) {
			System.out.println("student id    ::  " + student.getId());
			System.out.println("student name  ::  " + student.getsName());
			System.out.println();
		}
	}

	
	
}
