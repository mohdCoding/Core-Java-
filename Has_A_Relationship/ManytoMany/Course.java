package Has_A_Relationship.ManytoMany;

public class Course {

	
	private String cid;
	private String cname;
	private Integer cost;
	public Course(String cid, String cname, Integer cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}
	public String getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public Integer getCost() {
		return cost;
	}
	
	
	
	
	
	
}
