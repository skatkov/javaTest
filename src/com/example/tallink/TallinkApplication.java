package com.example.tallink;

import com.vaadin.Application;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;

public class TallinkApplication extends Application {
	private static String[] columns = {"number1", "number2", "operator", "result" };
	private IndexedContainer tableData = generateDummyData();
	
	private Button button = new Button("Populate Table");
	private Window mainWindow = new Window("Tallink Application");
	private Table table = new Table();
	
	@Override
	public void init() {
		initLayout();
		initTable();
		initButton();
		
	}
	
	private static IndexedContainer generateDummyData(){
		IndexedContainer ic = new IndexedContainer();
		for (String p: columns){
			ic.addContainerProperty(p, String.class, "default");
		}		
		return ic; 
	}
	
	private void initTable() {
		table.setContainerDataSource(tableData);
		table.setSelectable(true);
	}

	public void initLayout(){
		mainWindow.addComponent(button);
		mainWindow.addComponent(table);
		setMainWindow(mainWindow);
	}
	
	

}
