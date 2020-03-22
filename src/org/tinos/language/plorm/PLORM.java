package org.tinos.language.plorm;
public class PLORM{
//			String plsql= "setRoot:C:/DetaDB;" + 
//			"baseName:ZYY;" + 
//			"tableName:xybg:PLORM ;" +
//			"condition:or:ID|<=|3000;";
	String PLSQL= "";
	public String getPLSQL() {
		return PLSQL;
	}

	public void setPLSQL(String pLSQL) {
		PLSQL = pLSQL;
	}

	public PLORM startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return this;
	}
	
	public PLORM withBaseName(String baseName) {
		PLSQL+= ";"+ "baseName:"+ baseName;
		return this;
	}
	//
	public PLORM withTableSelect (String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":select";
		return this;
	}

	public String withTableCreate(String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":create";
		return PLSQL; 
	}
	
	public String withTableDelete(String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":delete";
		return PLSQL; 
	}
	
	public String withTableInsert(String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":insert";
		return PLSQL; 
	}
	
	public String withTableUpdate(String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":update";
		return PLSQL; 
	}
	
	//稍后我会把这个条件函数微分细化。
	public PLORM withCondition(String conditionType) {
		PLSQL+= ";"+ "condition:"+ conditionType;
		return this;
	}

	public PLORM let(String leftSet) {
		PLSQL+= ":"+ leftSet;
		return this;
	}

	public PLORM lessThanAndEqualTo(String compareSet) {
		PLSQL+= "|<=|"+compareSet;
		return this;
	}
	
	public PLORM equalTo(String compareSet) {
		PLSQL+= "|==|"+compareSet;
		return this;
	}
	
	public PLORM lessThan(String compareSet) {
		PLSQL+= "|<|"+compareSet;
		return this;
	}
	
	public PLORM greatThan(String compareSet) {
		PLSQL+= "|>|"+ compareSet;
		return this;
	}
	
	public PLORM greatThanAndEqualTo(String compareSet) {
		PLSQL+= "|>=|"+ compareSet;
		return this;
	}
	
	public PLORM notEqualTo(String compareSet) {
		PLSQL+= "|<>|"+ compareSet;
		return this;
	}
	
	public PLORM in(String compareSet) {
		PLSQL+= "|in|"+ compareSet;
		return this;
	}
	
	public PLORM notIn(String compareSet) {
		PLSQL+= "|!in|"+ compareSet;
		return this;
	}
	
	public PLORM equals(String compareSet) {
		PLSQL+= "|equal|"+ compareSet;
		return this;
	}
	
	public PLORM notEquals(String compareSet) {
		PLSQL+= "|!equal|"+ compareSet;
		return this;
	}
	
	public PLORM innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= ";"+ "join:"+ baseName+ ":"+ tableName;
		return this;
	}
	
	//稍后我会把这个条件函数微分细化。
	public PLORM withRelation(String relationType) {
		PLSQL+= ";"+ "relation:"+ relationType;
		return this;
	}
	
	public PLORM as(String compareSet) {
		PLSQL+= "|as|"+ compareSet;
		return this;
	}
	
	public PLORM upTo(String compareSet) {
		PLSQL+= "|~|"+ compareSet;
		return this;
	}
	
	public PLORM withAggregation(String aggregationType) {
		PLSQL+= ";"+ "aggregation:"+ aggregationType;
		return this;
	}
	
	public PLORM getCulumns() {
		PLSQL+= ";"+ "getCulumns";
		return this;
	}
	
	public PLORM changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSQL+= ";"+ "changeCulumnName:"+ newCulumnName+ ":"+ oldCulumnName;
		return this;
	}
	
	public PLORM withCulumnName(String culumnName, String dataType) {
		PLSQL+= ";"+ "culumnName:"+ culumnName+ ":"+ dataType;
		return this;
	}
	
	public PLORM withCulumnValue(String culumnName, String culumnValue) {
		PLSQL+= ";"+ "culumnValue:"+ culumnName+ ":"+ culumnValue;
		return this;
	}
}