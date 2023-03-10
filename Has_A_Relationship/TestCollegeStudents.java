package Has_A_Relationship;

public class TestCollegeStudents {

	public static void main(String[] args) {
		
		Branch branch = new Branch(1432, "Banglore");
		
		CollegeStudents student1 = new CollegeStudents(7, "Cristiano Ronaldo", 36,branch);
		CollegeStudents student2 = new CollegeStudents(7, "Lionel Messi", 35,branch);
		CollegeStudents student3 = new CollegeStudents(7, "Neymar jr", 34,branch);
		
		student1.getStudentDetails();
		System.out.println("*************************************");
        student2.getStudentDetails();
		System.out.println("*************************************");
        student3.getStudentDetails();

	}

}
