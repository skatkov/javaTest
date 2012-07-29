package com.example.tallink.dao;

import java.sql.SQLException;

import com.example.tallink.domain.Operand;
import com.example.tallink.helper.DatabaseHelper;
import com.vaadin.data.util.sqlcontainer.SQLContainer;

import static com.example.tallink.helper.DatabaseHelper.findRowById;


public class OperandDao {
	private SQLContainer container = null;
	private DatabaseHelper db = new DatabaseHelper();

	public SQLContainer getContainer() {
		if (container == null) {
			try {
				container = db.getOperandContainer();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return container;
	}

	public void addResult(Object primaryKey, String result) {
		container.getItem(findRowById(primaryKey)).getItemProperty(Operand.RESULT_PROP)
				.toString();
	}

}
