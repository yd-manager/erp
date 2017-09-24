package tr.com.yd.ee.erp.webapp.stock.beans.dummy;

public class Child {

	private Long id;
	private String name;
	private String surname;
	private String tc;
	private Parent parent;
	
	
	
	
	public Child(Long id, String name, String surname, String tc, Parent parent) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.tc = tc;
		this.parent = parent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	
}
