package domain;

import java.util.Set;

public class Province {
	private int pid;
	private String  pname;
	//关联属性
	private Set<City> cities;
	public int getId() {
		return pid;
	}
	public void setId(int id) {
		this.pid = id;
	}
	public String getName() {
		return pname;
	}
	public Province() {}
	public Province(int id, String name) {
		super();
		this.pid = id;
		this.pname = name;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public Set<City> getCities() {
		return cities;
	}
	@Override
	public String toString() {
		return "Province [pid=" + pid + ", pname=" + pname + ", cities=" + cities + "]";
	}
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	

}
