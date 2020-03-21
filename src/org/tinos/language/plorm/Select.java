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
		PLSQL+= ";"+ "baseName:"+ baseName;
		return this;
	}
	
	public Select withTableSelect(String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":select";
		return this;
	}
	//稍后我会把这个条件函数微分细化。
	public Select withCondition(String conditionType) {
		PLSQL+= ";"+ "condition:"+ conditionType;
		return this;
	}

	public Select let(String leftSet) {
		PLSQL+= ":"+ leftSet;
		return this;
	}

	public Select lessThanAndEqualTo(String compareSet) {
		PLSQL+= "|<=|"+compareSet;
		return this;
	}
	
	public Select equalTo(String compareSet) {
		PLSQL+= "|==|"+compareSet;
		return this;
	}
	
	public Select lessThan(String compareSet) {
		PLSQL+= "|<|"+compareSet;
		return this;
	}
	
	public Select greatThan(String compareSet) {
		PLSQL+= "|>|"+ compareSet;
		return this;
	}
	
	public Select greatThanAndEqualTo(String compareSet) {
		PLSQL+= "|>=|"+ compareSet;
		return this;
	}
	
	public Select notEqualTo(String compareSet) {
		PLSQL+= "|<>|"+ compareSet;
		return this;
	}
	
	public Select in(String compareSet) {
		PLSQL+= "|in|"+ compareSet;
		return this;
	}
	
	public Select notIn(String compareSet) {
		PLSQL+= "|!in|"+ compareSet;
		return this;
	}
	
	public Select sameStringWith(String compareSet) {
		PLSQL+= "|equal|"+ compareSet;
		return this;
	}
	
	public Select notTheSameStringWith(String compareSet) {
		PLSQL+= "|!equal|"+ compareSet;
		return this;
	}
	
	public Select innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= ";"+ "join:"+ baseName+ ":"+ tableName;
		return this;
	}
	
	//稍后我会把这个条件函数微分细化。
	public Select withRelation(String conditionType) {
		PLSQL+= ";"+ "relation:"+ conditionType;
		return this;
	}
}