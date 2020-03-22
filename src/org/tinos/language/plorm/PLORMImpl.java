package org.tinos.language.plorm;
public class PLORMImpl implements PLORMInterf{
	private String PLSQL= "";
	public String getPLSQL() {
		return PLSQL;
	}

	public void setPLSQL(String pLSQL) {
		PLSQL = pLSQL;
	}

	public PLORMImpl startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return this;
	}
	
	public PLORMImpl withBaseName(String baseName) {
		PLSQL+= ";"+ "baseName:"+ baseName;
		return this;
	}
	//
	public PLORMImpl withTableSelect (String tableName) {
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
	
	public PLORMImpl withCondition(String conditionType) {
		PLSQL+= ";"+ "condition:"+ conditionType;
		return this;
	}

	public PLORMImpl let(String leftSet) {
		PLSQL+= ":"+ leftSet;
		return this;
	}

	public PLORMImpl lessThanAndEqualTo(String compareSet) {
		PLSQL+= "|<=|"+compareSet;
		return this;
	}
	
	public PLORMImpl equalTo(String compareSet) {
		PLSQL+= "|==|"+compareSet;
		return this;
	}
	
	public PLORMImpl lessThan(String compareSet) {
		PLSQL+= "|<|"+compareSet;
		return this;
	}
	
	public PLORMImpl greatThan(String compareSet) {
		PLSQL+= "|>|"+ compareSet;
		return this;
	}
	
	public PLORMImpl greatThanAndEqualTo(String compareSet) {
		PLSQL+= "|>=|"+ compareSet;
		return this;
	}
	
	public PLORMImpl notEqualTo(String compareSet) {
		PLSQL+= "|<>|"+ compareSet;
		return this;
	}
	
	public PLORMImpl in(String compareSet) {
		PLSQL+= "|in|"+ compareSet;
		return this;
	}
	
	public PLORMImpl notIn(String compareSet) {
		PLSQL+= "|!in|"+ compareSet;
		return this;
	}
	
	public PLORMImpl equals(String compareSet) {
		PLSQL+= "|equal|"+ compareSet;
		return this;
	}
	
	public PLORMImpl notEquals(String compareSet) {
		PLSQL+= "|!equal|"+ compareSet;
		return this;
	}
	
	public PLORMImpl innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= ";"+ "join:"+ baseName+ ":"+ tableName;
		return this;
	}
	
	public PLORMImpl withRelation(String relationType) {
		PLSQL+= ";"+ "relation:"+ relationType;
		return this;
	}
	
	public PLORMImpl as(String compareSet) {
		PLSQL+= "|as|"+ compareSet;
		return this;
	}
	
	public PLORMImpl upTo(String compareSet) {
		PLSQL+= "|~|"+ compareSet;
		return this;
	}
	
	public PLORMImpl withAggregation(String aggregationType) {
		PLSQL+= ";"+ "aggregation:"+ aggregationType;
		return this;
	}
	
	public PLORMImpl getCulumns() {
		PLSQL+= ";"+ "getCulumns";
		return this;
	}
	
	public PLORMImpl changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSQL+= ";"+ "changeCulumnName:"+ newCulumnName+ ":"+ oldCulumnName;
		return this;
	}
	
	public PLORMImpl withCulumnName(String culumnName, String dataType) {
		PLSQL+= ";"+ "culumnName:"+ culumnName+ ":"+ dataType;
		return this;
	}
	
	public PLORMImpl withCulumnValue(String culumnName, String culumnValue) {
		PLSQL+= ";"+ "culumnValue:"+ culumnName+ ":"+ culumnValue;
		return this;
	}
}