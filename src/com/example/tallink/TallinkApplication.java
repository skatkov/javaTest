package com.example.tallink;

import com.vaadin.Application;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;

public class TallinkApplication extends Application {
	
	private Button button = new Button("Populate Table");
	private Window mainWindow = new Window("Tallink Application");
	private Table table = new Table();
	
	@Override
	public void init() {
		initLayout();
		initTable();
	}
	
	private void initTable() {
		table.addContainerProperty("something", String.class, "defaultValue");
		table.addContainerProperty("another column", String.class, "defaultValue");
		table.setSelectable(true);
	}

	public void initLayout(){
		mainWindow.addComponent(button);
		mainWindow.addComponent(table);
		setMainWindow(mainWindow);
	}
	
	

}
