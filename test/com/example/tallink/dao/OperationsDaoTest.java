package com.example.tallink.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.vaadin.data.util.sqlcontainer.RowId;

public class OperationsDaoTest {
	private OperationsDao dao;
	
	private static RowId findRowById(Object object){
		return new RowId(new Object[]{object});
	}
	
	@Before
	public void setUp() throws Exception {
		dao = new OperationsDao();
	}

	@Test
	public void test() throws SQLException {
		assertEquals("[+]",dao.buildContainer().getItemIds().toString());
	}
	
	@Test
	public void test2() throws SQLException {
		assertEquals("plus", dao.buildContainer().getItem(findRowById("+")).getItemProperty("description").toString());
	}

}
