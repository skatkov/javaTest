package com.example.tallink.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.tallink.domain.Operand;
import com.example.tallink.helper.DatabaseHelper;
import com.vaadin.data.util.sqlcontainer.SQLContainer;

import static com.example.tallink.helper.DatabaseHelper.findRowById;

public class OperandDao {
	private SQLContainer container = null;
	private DatabaseHelper db = new DatabaseHelper();

	public OperandDao() {
		try {
			container = db.getOperandContainer();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public SQLContainer getContainer() {
		return container;
	}

	public void setResult(Object primaryKey, Integer result) {
		container.getItem(findRowById(primaryKey))
				.getItemProperty(Operand.RESULT_PROP).setValue(result);
	}

	public void calculateResults() {
		try {
			String lastOperation = null;
			Iterator operations = db.getOperationsContainer().getItemIds()
					.iterator();
			// TODO: check that iterator contains proper id's (like * / + - )
			while (operations.hasNext()) {
				//TODO: check how much operations are there and react accordingly
				lastOperation = operations.next().toString();
				
				Iterator operands = container.getItemIds().iterator();
				Integer lastOperands = null;
				
				while (operands.hasNext()){
					lastOperands = Integer.parseInt(operands.next().toString());
					setResult(lastOperands, calculateValues(getProperty(lastOperands, Operand.A_PROP), getProperty(lastOperands, Operand.B_PROP), lastOperation));
				}
			}
	
			container.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Integer calculateValues(Integer a, Integer b, String operation){
		if (operation.equals("+")){
			return a + b;
		} else if (operation.equals("-")){
			return a - b;
		} else if (operation.equals("*")){
			return a * b;
		} else if (operation.equals("/")){
			return a/b;
		} else {
			return 0;
		}
	}
	
	private Integer getProperty(Object rowId, String property){
		return Integer.parseInt(container.getItem(findRowById(rowId)).getItemProperty(property).toString());
	}

}
