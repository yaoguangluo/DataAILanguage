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
	
	public PLORM withTableSelect (String tableName) {
		PLSQL+= ";"+ "tableName:"+ tableName+ ":select ";
		return this;
	}
	
	//�Ժ��һ�������������΢��ϸ����
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
	
	public PLORM sameStringWith(String compareSet) {
		PLSQL+= "|equal|"+ compareSet;
		return this;
	}
	
	public PLORM notTheSameStringWith(String compareSet) {
		PLSQL+= "|!equal|"+ compareSet;
		return this;
	}
	
	public PLORM innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= ";"+ "join:"+ baseName+ ":"+ tableName;
		return this;
	}
	
	//�Ժ��һ�������������΢��ϸ����
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
}