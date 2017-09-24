package tr.com.yd.ee.erp.webapp.stock.beans.order.dummy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ee.erp.webapp.stock.beans.dummy.Child;
import tr.com.yd.ee.erp.webapp.stock.beans.dummy.Parent;

@Component
@Scope("view")
public class DummyOrderBean implements Serializable {

	private List<Parent> parentList;
	private Parent selectedParent;
	
	@PostConstruct
	public void init()
	{
		parentList = new ArrayList<>();
		parentList.add(new Parent(1l, "p1", "pa", new ArrayList<Child>()));
		parentList.add(new Parent(2l, "p2", "pa", new ArrayList<Child>()));
		parentList.add(new Parent(3l, "p3", "pa", new ArrayList<Child>()));
		parentList.add(new Parent(4l, "p4", "pa", new ArrayList<Child>()));
		
	}
	
	public void onParentSelected()
	{
		System.out.println("here");
		selectedParent.getChildList().add(new Child(1l, "c1", "s1", "123123", selectedParent));
		selectedParent.getChildList().add(new Child(2l, "c2", "s2", "123123", selectedParent));
		selectedParent.getChildList().add(new Child(3l, "c3", "s3", "123123", selectedParent));
	}
	
	public List<Parent> getParentList() {
		return parentList;
	}
	public void setParentList(List<Parent> parentList) {
		this.parentList = parentList;
	}
	public Parent getSelectedParent() {
		return selectedParent;
	}
	public void setSelectedParent(Parent selectedParent) {
		this.selectedParent = selectedParent;
	}
	
	
}
