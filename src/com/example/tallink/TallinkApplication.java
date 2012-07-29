package com.example.tallink;


import com.example.tallink.dao.OperandDao;
import com.vaadin.Application;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;

public class TallinkApplication extends Application {
	OperandDao dao = new OperandDao();
	
	private Button button;
	private Window mainWindow = new Window("Tallink Application");
	private Table table = new Table("Operand", dao.getContainer());

	@Override
	public void init() {
		initButton();
		initTable();
		setMainWindow(mainWindow);
	}	
	
	private void initButton() {
		button = new Button("Do Magic", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				dao.calculateResults();
				table.refreshRowCache();
			}
		});
		mainWindow.addComponent(button);
	}

	private void initTable() {
		table.setSelectable(true);
		mainWindow.addComponent(table);
	}


}
