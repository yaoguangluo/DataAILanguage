package org.tinos.language.plorm;
public class Select{
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
}