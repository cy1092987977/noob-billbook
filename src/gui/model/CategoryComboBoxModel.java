package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import entity.Category;
import service.CategoryService;



public class CategoryComboBoxModel implements ComboBoxModel<Category> {
 public List<Category>cs=new CategoryService().list();
 
public Category c;
 public CategoryComboBoxModel() {
	/*cs.add("餐饮");
	cs.add("交通");
	cs.add("住宿");
	cs.add("话费");
	c=cs.get(0);*/
	 
	 if(!cs.isEmpty())
		 c=cs.get(0);
}
	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getElementAt(int index) {
		// TODO Auto-generated method stub
		return cs.get(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return cs.size();
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getSelectedItem() {
		if(!cs.isEmpty())
			return c;
		else
		   return null;
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
       c=(Category) anItem;
	}

}
