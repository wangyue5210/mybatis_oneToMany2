package domain;

public class City {
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + "]";
	}
	private int cid;
	private String cname;
	
	public City() {}
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = id;
	}
	public City(int id, String name, int pid) {
		super();
		this.cid = id;
		this.cname = name;
		
	}
	public String getName() {
		return cname;
	}
	public void setName(String name) {
		this.cname = name;
	}
	


}
