package org.tinos.language.plorm;
public class Select{
//			String plsql= "setRoot:C:/DetaDB;" + 
//			"baseName:ZYY;" + 
//			"tableName:xybg:select;" +
//			"condition:or:ID|<=|3000;";
	String PLSQL= "";
	public String getPLSQL() {
		return PLSQL;
	}

	public void setPLSQL(String pLSQL) {
		PLSQL = pLSQL;
	}

	public Select startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return this;
	}
	
	public Select withBaseName(String baseName) {
		PLSQL+= "baseName:"+ baseName+ ";";
		return this;
	}
	
	public Select withTableSelect(String tableName) {
		PLSQL+= "tableName:"+ tableName+ ":select;";
		return this;
	}
	//稍后我会把这个条件函数微分细化。
	public Select withCondition(String conditionType) {
		PLSQL+= "condition:"+ conditionType+ ":";
		return this;
	}

	public Select let(String leftSet) {
		PLSQL+= leftSet;
		return this;
	}

	public Select lessAndEqualTo(String compareSet) {
		PLSQL+= "|<=|"+compareSet+";";
		return this;
	}
}