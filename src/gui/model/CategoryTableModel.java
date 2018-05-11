package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import entity.Category;
import service.CategoryService;

public class CategoryTableModel implements TableModel {
 
	String[] columnNames= new String[]{"分类名称","消费次数"};
	
	public List<Category> cs=new CategoryService().list();
	
	/*List<String> cs=new ArrayList<>();
	 public CategoryTableModel() {
	     cs.add("餐饮");
	     cs.add("住宿");
	     cs.add("交通");
	     cs.add("话费");
	 }*/
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];
	}

	@Override
	public int getRowCount() {
		return cs.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Category h=cs.get(rowIndex);
		if(0==columnIndex)
			return h.name;
		if(1==columnIndex)
			return h.recordNumber;
		return null;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
