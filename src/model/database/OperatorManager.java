package model.database;

import java.util.Vector;

public class OperatorManager {
	
	protected static Vector<DataOperator> operators = new Vector<>();
	
	public static void addOperator(DataOperator operator) {
		operators.addElement(operator);
	}
	
	public static DataOperator getOperator(String name) {
		for (DataOperator operator : operators) {
			if (operator.isThisDataBase(name)) {
				return operator;
			}
		}
		return null;
	}

}
