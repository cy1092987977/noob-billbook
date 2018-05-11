package gui.panel;
import javax.swing.JLabel;
public class SpendPanel {
    public static SpendPanel instance =new SpendPanel();
    
    JLabel lMonthSpend =new JLabel("本月消费");
    JLabel lTodaySpend =new JLabel("本日消费");
    JLabel lAvgSpendPerDay =new JLabel("日均消费");
    JLabel lMonthLeft =new JLabel("本月剩余");
    JLabel lDayAvgAvailable =new JLabel("日均可用");
    JLabel lMonthLeftDay =new JLabel("距离月末");
    
    JLabel vMonthSpend =new JLabel("$2300");
    JLabel vTodaySpend =new JLabel("$25");
    JLabel vAvgSpendPerDay =new JLabel("$120");
    JLabel vMonthLeft =new JLabel("$2084");
    JLabel vDayAvgAvailable =new JLabel("$289");
    JLabel vMonthLeftDay =new JLabel("15天");
    
    private SpendPanel(){
    	
    }
}
