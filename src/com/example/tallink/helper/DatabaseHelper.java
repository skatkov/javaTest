package com.example.tallink.helper;

import java.sql.SQLException;

import com.vaadin.data.util.sqlcontainer.RowId;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;

public class DatabaseHelper {
	private JDBCConnectionPool connectionPool = null;
	
	public DatabaseHelper() {
		initConnectionPool();
	}

	private void initConnectionPool() {
		try {
			connectionPool = new SimpleJDBCConnectionPool(
					"com.mysql.jdbc.Driver",
			        "jdbc:mysql://localhost/tallink", "tallink_user", "tallink_pass", 2, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static RowId findRowById(Object object) {
		//damn this is sick
		return new RowId(new Object[] { object });
	}
	
	public SQLContainer getOperandContainer() throws SQLException {
		return new SQLContainer(new TableQuery("operand", connectionPool));
		
		
	}
	public SQLContainer getOperationsContainer() throws SQLException{
		return new SQLContainer(new TableQuery("operations", connectionPool));
		
		
	}
	

}
