package Has_A_Relationship;

public class CollegeStudents {

	private Integer sid;
	private String sname;
	private Integer sage;
	
	Branch branch;
	
	public CollegeStudents(Integer sid, String sname, Integer sage,Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	
	public void getStudentDetails() {
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("sid     ::  "+ sid);
		System.out.println("sname   ::  "+ sname);
		System.out.println("sage    ::  "+ sage);
		System.out.println("********************************************");
		System.out.println("***************Branch details are***********");
		System.out.println("bid     ::  "+branch.getBid());
		System.out.println("bloc    ::  "+branch.getBloc());
	}
	
	
	
	
}
