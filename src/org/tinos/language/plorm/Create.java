package org.tinos.language.plorm;
public class Create{
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
	String PLSQL= "";
	public String startAtRootDir(String rootAddress) {
		PLSQL= "setRoot:"+ rootAddress+ ";";
		return PLSQL;
	}
	
	public String withBaseName(String baseName) {
		PLSQL+= "baseName:"+ baseName+ ";";
		return PLSQL; 
	}
	
	public String withTableCreate(String tableName) {
		PLSQL+= "tableName:"+ tableName+ ":create;";
		return PLSQL; 
	}
	
	public String withCulumnName(String culumnName, String keyType, String dataFormat) {
		PLSQL+= "culumnName:"+ keyType+ ":"+ culumnName+ ":"+ dataFormat+ ";";
		return PLSQL; 
	}
}