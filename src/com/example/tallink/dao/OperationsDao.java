package com.example.tallink.dao;

import java.sql.SQLException;

import com.vaadin.data.Container;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;

public class OperationsDao {
	private JDBCConnectionPool connectionPool;
	
	public OperationsDao(){
		try {
			connectionPool = new SimpleJDBCConnectionPool(
			        "com.mysql.jdbc.Driver",
			        "jdbc:mysql://localhost/tallink", "tallink_user", "tallink_pass", 2, 5);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Container buildContainer() throws SQLException{		
		return new SQLContainer(new TableQuery("operations", connectionPool));
	}

}
