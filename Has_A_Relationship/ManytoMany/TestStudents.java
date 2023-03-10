package Has_A_Relationship.ManytoMany;

public class TestStudents {

	public static void main(String[] args) {
		Course course1 = new Course("INJava","Java",500);
		Course course2 = new Course("INPython","Python",1000);
		Course course3 = new Course("INJs","JavaScript",1500);
		
		Course all[] = {course1, course2,course3};
	
		Course one[] = {course1,};
		Course two[] = {course1, course2};
		Course three[] = {course2, course3};
		Course four[] = {course3, course1};
		Course five[] = {course2, };
		Course six[] = {course3};
		
		Students student1 = new Students(4, "crish", 18, all);
		Students student2 = new Students(12, "hafeez", 16, three);
		Students student3 = new Students(11, "mint", 17, one);
		Students student4 = new Students(10, "warrior",14, four);
		
		
		student1.getStudentDetails();
		System.out.println();
		student2.getStudentDetails();
		System.out.println();
		student3.getStudentDetails();
		System.out.println();
		student4.getStudentDetails();
		
		

	}

}
