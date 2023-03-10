package Has_A_Relationship.ManytoMany;

public class Students {

	private Integer sid;
	private String sname;
	private Integer sage;
	
	private Course[] courses;

	public Students(Integer sid, String sname, Integer sage, Course[] courses) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.courses = courses;
	}
	
	public void getStudentDetails() {
		System.out.println("*********student details are****************");
		System.out.println("********************************************");
		System.out.println("sid     ::    " + sid);
		System.out.println("sname   ::    " + sname);
		System.out.println("sage    ::    " + sage);
		System.out.println("*********************************************");
		System.out.println("***********course details are***************");
		for(Course course: courses) {
			System.out.println("cid     ::   " + course.getCid());
			System.out.println("cname   ::   " + course.getCname());
			System.out.println("cost    ::   " + course.getCost());
			System.out.println();
		}
	}
}
