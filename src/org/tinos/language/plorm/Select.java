package org.tinos.language.plorm;
public class Select{
//动机：准备将下面的plsql翻译成orm，省的养疗经的query模式太固定，上手修改麻烦。
//	String plsql= "setRoot:C:/DetaDB;";
//	   plsql+= "baseName:ZYY;"; 
//	   plsql+= "tableName:zybc:create;" + 
//	   		"culumnName:pk:ID:string;" + 
//	   		"culumnName:uk:打分:string;" + 
//	   		"culumnName:uk:中药名称:string;" + 
//	   		"culumnName:uk:笔记原文:string;" + 
//	   		"culumnName:uk:功效:string;" + 
//	   		"culumnName:uk:风险规避:string;" + 
//	   		"culumnName:uk:用量:string;" + 
//	   		"culumnName:uk:性味:string;" + 
//	   		"culumnName:uk:经脉:string;" + 
//	   		"culumnName:uk:中医馆药理:string;" + 
//	   		"culumnName:uk:经解:string;" + 
//	   		"culumnName:uk:崇源:string;" + 
//	   		"culumnName:uk:愚按:string;" + 
//	   		"culumnName:uk:搭配:string;" + 
//	   		"culumnName:uk:常见药:string;";
//这个函数用于确定Deta PLSQL的Root like: 'c:/dsdsd' etc
	public String startAtRootDir(String root) {
		String PLSQL= "setRoot:"+ root+ ";";
		return PLSQL;
	}
	
	public String withDataBase(String base) {
		String PLSQL= "baseName:"+ base+ ";";
		return PLSQL; 
	}
	
	public String withTableCreate(String table) {
		String PLSQL= "tableName:"+ table+ ":create;";
		return PLSQL; 
	}
	
	public String withTableSelect(String table) {
		String PLSQL= "tableName:"+ table+ ":select;";
		return PLSQL; 
	}
	
	public String withTableDelete(String table) {
		String PLSQL= "tableName:"+ table+ ":delete;";
		return PLSQL; 
	}
	
	public String withTableUpdate(String table) {
		String PLSQL= "tableName:"+ table+ ":update;";
		return PLSQL; 
	}
	
	public String withTableInsert(String table) {
		String PLSQL= "tableName:"+ table+ ":insert;";
		return PLSQL; 
	}
}