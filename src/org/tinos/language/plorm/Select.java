package org.tinos.language.plorm;
public class Select{
//������׼���������plsql�����orm��ʡ�����ƾ���queryģʽ̫�̶��������޸��鷳��
//	String plsql= "setRoot:C:/DetaDB;";
//	   plsql+= "baseName:ZYY;"; 
//	   plsql+= "tableName:zybc:create;" + 
//	   		"culumnName:pk:ID:string;" + 
//	   		"culumnName:uk:���:string;" + 
//	   		"culumnName:uk:��ҩ����:string;" + 
//	   		"culumnName:uk:�ʼ�ԭ��:string;" + 
//	   		"culumnName:uk:��Ч:string;" + 
//	   		"culumnName:uk:���չ��:string;" + 
//	   		"culumnName:uk:����:string;" + 
//	   		"culumnName:uk:��ζ:string;" + 
//	   		"culumnName:uk:����:string;" + 
//	   		"culumnName:uk:��ҽ��ҩ��:string;" + 
//	   		"culumnName:uk:����:string;" + 
//	   		"culumnName:uk:��Դ:string;" + 
//	   		"culumnName:uk:�ް�:string;" + 
//	   		"culumnName:uk:����:string;" + 
//	   		"culumnName:uk:����ҩ:string;";
//�����������ȷ��Deta PLSQL��Root like: 'c:/dsdsd' etc
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