package com.example.tallink.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class OperationsDaoTest {
	private OperationsDao dao;
	
	@Before
	public void setUp() throws Exception {
		dao = new OperationsDao();
	}

	@Test
	public void test() throws SQLException {
		System.out.print(dao.buildContainer().getItemIds());
	}

}
