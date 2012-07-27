package com.example.tallink.service;

import com.vaadin.data.util.IndexedContainer;

public class CalculationTable {
	
	private final static String[] columns = { "number1", "number2", "operator",
	"result" };
	
	public static IndexedContainer emptyTable(){
		IndexedContainer ic = new IndexedContainer();
		for (String p : columns) {
			ic.addContainerProperty(p, String.class, "default");
		}
		return ic;
		
	}
	
	public static IndexedContainer generateDummyData() {
		IndexedContainer ic = new IndexedContainer();
		for (String p : columns) {
			ic.addContainerProperty(p, String.class, "default");
		}
		for (int i = 0; i < 100; i++) {
			Object id = ic.addItem();
			ic.getContainerProperty(id, columns[0]).setValue("num_test_" + i);
			ic.getContainerProperty(id, columns[1]).setValue("num_test_" + i);
			ic.getContainerProperty(id, columns[2]).setValue("operator_test");
			ic.getContainerProperty(id, columns[3]).setValue("empty_result");
		}
		return ic;
	}

}
