package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.listener.BackupListener;
import util.ColorUtil;
import util.GUIUtil;

public class BackupPanel extends WorkingPanel{
	static {
		GUIUtil.useLNF();
	}

	public static BackupPanel instance = new BackupPanel();
   // JLabel lBackup=new JLabel("这是对数据进行备份");
	JButton bSubmit = new JButton("备份");

	public BackupPanel() {
	//	GUIUtil.setColor(ColorUtil.grayColor, lBackup);
		GUIUtil.setColor(ColorUtil.blueColor, bSubmit);
	//	this.setLayout(new BorderLayout());
	//	this.add(lBackup,BorderLayout.CENTER);
		this.add(bSubmit);
		addListener();

	}
	public static void main(String[] args) {
		GUIUtil.showPanel(BackupPanel.instance);
	}
	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addListener() {
		BackupListener listener= new BackupListener();
		bSubmit.addActionListener(listener);
	}
}
