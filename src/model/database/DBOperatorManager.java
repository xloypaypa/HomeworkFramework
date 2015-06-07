package model.database;

public class DBOperatorManager extends OperatorManager {
	
	public static DataBase getDataBase(String name) {
		return (DataBase) OperatorManager.getOperator(name);
	}

}
