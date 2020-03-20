package org.tinos.language.plorm;
public class Select{

//	String plsql= "setRoot:C:/DetaDB;" + 
//			"baseName:ZYY;" + 
//			"tableName:xybg:select;" +
//			"condition:or:ID|<=|3000;";
	
	String PLSQL= "";
	public String startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return PLSQL;
	}
	
	public String withBaseName(String baseName) {
		PLSQL+= "baseName:"+ baseName+ ";";
		return PLSQL; 
	}
	
	public String withTableSelect(String tableName) {
		PLSQL+= "tableName:"+ tableName+ ":select;";
		return PLSQL; 
	}
	//稍后我会把这个条件函数微分细化。
	public String withCondition(String conditionType, String conditionText) {
		PLSQL+= "condition:"+ conditionType+ ":"+ conditionText+ ";";
		return PLSQL; 
	}
}