package tr.com.yd.ee.erp.webapp.stock.beans.dummy;

import java.util.ArrayList;
import java.util.List;

public class Parent {

	private Long id;
	private String parentCode;
	private String address;
	
	private List<Child> childList;
	
	private List<Child2> child2List;
	
	
	public Parent(Long id, String parentCode, String address, List<Child> child) {
		super();
		this.id = id;
		this.parentCode = parentCode;
		this.address = address;
		this.childList = new ArrayList<Child>();
		this.child2List = new ArrayList<Child2>();
	}
	
	
	public List<Child> getChildList() {
		return childList;
	}


	public void setChildList(List<Child> childList) {
		this.childList = childList;
	}


	public List<Child2> getChild2List() {
		return child2List;
	}


	public void setChild2List(List<Child2> child2List) {
		this.child2List = child2List;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
