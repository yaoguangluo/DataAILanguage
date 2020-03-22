package org.tinos.language.plorm;
public class PLORMImpl implements PLORMInterf{
	private String PLSQL= "";
	public String getPLSQL() {
		return PLSQL;
	}

	public void setPLSQL(String pLSQL) {
		PLSQL= pLSQL;
	}

	public PLORMImpl startAtRootDir(String rootAddress) {
		PLSQL= Const.SET_ROOT+ Const.SECTION_DOT+ rootAddress
				+ Const.SECTION_PARSER;
		return this;
	}
	
	public PLORMImpl withBaseName(String baseName) {
		PLSQL+= Const.SECTION_PARSER+ Const.BASE_NAME+ Const.SECTION_DOT
				+ baseName;
		return this;
	}
	//
	public PLORMImpl withTableSelect (String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.TABLE_NAME+ Const.SECTION_DOT
				+ tableName
				+ Const.SECTION_DOT+ Const.SELECT;
		return this;
	}

	public String withTableCreate(String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.TABLE_NAME+ Const.SECTION_DOT
				+ tableName
				+ Const.SECTION_DOT+ Const.CREATE;
		return PLSQL; 
	}
	
	public String withTableDelete(String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.TABLE_NAME+ Const.SECTION_DOT
				+ tableName
				+ Const.SECTION_DOT+ Const.DELETE;
		return PLSQL; 
	}
	
	public String withTableInsert(String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.TABLE_NAME+ Const.SECTION_DOT
				+ tableName
				+ Const.SECTION_DOT+ Const.INSERT;
		return PLSQL; 
	}
	
	public String withTableUpdate(String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.TABLE_NAME+ Const.SECTION_DOT
				+ tableName
				+ Const.SECTION_DOT+ Const.UPDATE;
		return PLSQL; 
	}
	
	public PLORMImpl withCondition(String conditionType) {
		PLSQL+= Const.SECTION_PARSER+ Const.CONDITION+ Const.SECTION_DOT
				+ conditionType;
		return this;
	}

	public PLORMImpl let(String leftSet) {
		PLSQL+= Const.SECTION_DOT+ leftSet;
		return this;
	}

	public PLORMImpl lessThanAndEqualTo(String compareSet) {
		PLSQL+= Const.LESS_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl equalTo(String compareSet) {
		PLSQL+= Const.EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl lessThan(String compareSet) {
		PLSQL+= Const.LESS_THAN+ compareSet;
		return this;
	}
	
	public PLORMImpl greatThan(String compareSet) {
		PLSQL+= Const.GREAT_THAN+ compareSet;
		return this;
	}
	
	public PLORMImpl greatThanAndEqualTo(String compareSet) {
		PLSQL+= Const.GREAT_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl notEqualTo(String compareSet) {
		PLSQL+= Const.NOT_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl in(String compareSet) {
		PLSQL+= Const.IN+ compareSet;
		return this;
	}
	
	public PLORMImpl notIn(String compareSet) {
		PLSQL+= Const.NOT_IN+ compareSet;
		return this;
	}
	
	public PLORMImpl equals(String compareSet) {
		PLSQL+= Const.EQUALS+ compareSet;
		return this;
	}
	
	public PLORMImpl notEquals(String compareSet) {
		PLSQL+= Const.NOT_EQUALS+ compareSet;
		return this;
	}
	
	public PLORMImpl innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= Const.SECTION_PARSER+ Const.JOIN+ Const.SECTION_DOT+ baseName
				+ Const.SECTION_DOT+ tableName;
		return this;
	}
	
	public PLORMImpl withRelation(String relationType) {
		PLSQL+= Const.SECTION_PARSER+ Const.RELATION+ Const.SECTION_DOT
				+ relationType;
		return this;
	}
	
	public PLORMImpl as(String compareSet) {
		PLSQL+= Const.AS+ compareSet;
		return this;
	}
	
	public PLORMImpl upTo(String compareSet) {
		PLSQL+= Const.UP_TO+ compareSet;
		return this;
	}
	
	public PLORMImpl withAggregation(String aggregationType) {
		PLSQL+= Const.SECTION_PARSER+ Const.WITH_AGGREGATION
				+ Const.SECTION_DOT+ aggregationType;
		return this;
	}
	
	public PLORMImpl getCulumns() {
		PLSQL+= Const.SECTION_PARSER+ Const.GET_CULUMNS;
		return this;
	}
	
	public PLORMImpl changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSQL+= Const.SECTION_PARSER+ Const.CHANGES_CULUMN_NAME+ Const.SECTION_DOT
				+ newCulumnName+ Const.SECTION_DOT+ oldCulumnName;
		return this;
	}
	
	public PLORMImpl withCulumnName(String culumnName, String dataType) {
		PLSQL+= Const.SECTION_PARSER+ Const.CULUMN_NAME+ Const.SECTION_DOT+ culumnName
				+ Const.SECTION_DOT+ dataType;
		return this;
	}
	
	public PLORMImpl withCulumnValue(String culumnName, String culumnValue) {
		PLSQL+= Const.SECTION_PARSER+ Const.CULUMN_VALUE+ Const.SECTION_DOT+ culumnName
				+ Const.SECTION_DOT+ culumnValue;
		return this;
	}
}