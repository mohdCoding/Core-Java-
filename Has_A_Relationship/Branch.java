package Has_A_Relationship;

public class Branch {

	private Integer bid;
	private String bloc;
	
	public Branch(Integer bid, String bloc) {
		this.bid = bid;
		this.bloc = bloc;
	}
	
	public Integer getBid() {
		return bid;
	}
	
	public String getBloc() {
		return bloc;
	}
}
