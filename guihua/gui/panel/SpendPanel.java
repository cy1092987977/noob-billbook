package gui.panel;
import javax.swing.JLabel;
public class SpendPanel {
    public static SpendPanel instance =new SpendPanel();
    
    JLabel lMonthSpend =new JLabel("��������");
    JLabel lTodaySpend =new JLabel("��������");
    JLabel lAvgSpendPerDay =new JLabel("�վ�����");
    JLabel lMonthLeft =new JLabel("����ʣ��");
    JLabel lDayAvgAvailable =new JLabel("�վ�����");
    JLabel lMonthLeftDay =new JLabel("������ĩ");
    
    JLabel vMonthSpend =new JLabel("$2300");
    JLabel vTodaySpend =new JLabel("$25");
    JLabel vAvgSpendPerDay =new JLabel("$120");
    JLabel vMonthLeft =new JLabel("$2084");
    JLabel vDayAvgAvailable =new JLabel("$289");
    JLabel vMonthLeftDay =new JLabel("15��");
    
    private SpendPanel(){
    	
    }
}
