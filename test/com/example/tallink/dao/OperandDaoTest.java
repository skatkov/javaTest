package com.example.tallink.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.example.tallink.domain.Operand;
import com.vaadin.data.util.sqlcontainer.RowId;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.ui.Table;

public class OperandDaoTest {
	
	public OperandDao dao;
	
	private static RowId findRowById(Object object){
		return new RowId(new Object[]{object});
	}

	@Before
	public void setUp() throws Exception {
		dao = new OperandDao();
	}
	
	@Test
	public void testContainerSize() throws SQLException {
		assertEquals(2, dao.getContainer().size());
	}
	
	@Test
	public void testContainerKeys() throws SQLException {
		
		assertTrue(dao.getContainer().getItemIds().toString().equals("[1, 2]"));
	}
	
	@Test
	public void testCalculateResults(){
		dao.calculateResults();
		assertEquals("9",dao.getContainer().getContainerProperty(findRowById(1), Operand.RESULT_PROP).toString());
		assertEquals("12", dao.getContainer().getContainerProperty(findRowById(2), Operand.RESULT_PROP).toString());
		
		//dao.getContainer().getItem(findRowById(1)).getItemProperty(Operand.RESULT_PROP).getValue();
	}
	
	
	public void testTable() throws UnsupportedOperationException, SQLException{
		SQLContainer db = dao.getContainer();
		Table table = new Table("Some caption", db);
		table.getItem(findRowById(1)).getItemProperty("result").setValue("9");
		assertEquals("9", table.getItem(findRowById(1)).getItemProperty("result").toString());
		db.commit();
				
		
	}
	

}
