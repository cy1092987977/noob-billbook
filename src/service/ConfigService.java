package service;

import dao.ConfigDAO;
import entity.Config;

public class ConfigService {
	public static final String budget = "budget";
	public static final String mysqlPath = "mysqlPath";
	public static final String default_budget = "500";
	
	static ConfigDAO dao= new ConfigDAO();
	static{
		init();
	}
	public static void init(){
		init(budget,default_budget);
		init(mysqlPath,"");
	}
	private static void init(String key, String value){
		Config config=dao.getByKey(key);
		if(config==null){
			Config c=new Config();
			c.setkey(key);
			c.setvalue(value);
			dao.add(c);
		}
	}
	public String get(String key){
		Config config=dao.getByKey(key);
		return config.getvalue();
	}
	public void update(String key,String value){
		Config config =dao.getByKey(key);
		config.setvalue(value);
		dao.update(config);
	}
	public int getIntBudget(){
		return Integer.parseInt(get(budget));
	}
	
}
