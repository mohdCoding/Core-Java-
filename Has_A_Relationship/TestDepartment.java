package Has_A_Relationship;

public class TestDepartment {

	public static void main(String[] args) {
		
//	Student stu1 = new Student(9, "Rooney");
//	Student stu2 = 	new Student(7, "Cristiano Ronaldo");
//	Student stu3 = new Student(10, "Lionel Messi");

		Student stu1 = new Student();
		stu1.setId(9);
		stu1.setsName("Rooney");
		
		Student stu2 = new Student();
		stu2.setId(7);
		stu2.setsName("Cristiano Ronaldo");
		
		Student stu3 = new Student();
		stu3.setId(10);
		stu3.setsName("Lionel Messi");
		
		
	Student[] student = new Student[3];
	student[0] = stu1;
	student[1] = stu2;
	student[2] = stu3;
	
	Department department = new Department();
	department.setDeptNo(123);
	department.setDeptName("BSC-(IT)");
	department.setDeptLoc("Real Madrid");
	department.setStudents(student);
	
	department.display();
		

	}

}
