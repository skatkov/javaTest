package com.example.tallink.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class OperandDaoTest {
	
	public OperandDao dao;

	@Before
	public void setUp() throws Exception {
		dao = new OperandDao();
	}
	
	@Test
	public void test() throws SQLException {
		assertEquals(2, dao.buildContainer().size());
	}

}
