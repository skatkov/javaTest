package com.example.tallink;

import java.sql.SQLException;

import com.example.tallink.dao.OperandDao;
import com.vaadin.Application;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;
import static com.example.tallink.service.CalculationTable.generateDummyData;
import static com.example.tallink.service.CalculationTable.emptyTable;

public class TallinkApplication extends Application {
	private IndexedContainer tableData = emptyTable();
	
	private Button button;
	private Window mainWindow = new Window("Tallink Application");
	private Table table = new Table();

	@Override
	public void init() {
		initButton();
		initTable();
		setMainWindow(mainWindow);
	}
	
	private void fullTable(){
		OperandDao dao = new OperandDao();
		try {
			table.setContainerDataSource(dao.buildContainer());
		} catch (SQLException e) {
			table.setContainerDataSource(tableData);
		}
	}

	private void initButton() {
		button = new Button("Do Magic", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				fullTable();
				button.setEnabled(false);
			}
		});
		mainWindow.addComponent(button);
	}

	private void initTable() {
		table.setContainerDataSource(tableData);
		table.setSelectable(true);
		mainWindow.addComponent(table);
	}


}
