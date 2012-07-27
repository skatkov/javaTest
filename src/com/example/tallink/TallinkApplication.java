package com.example.tallink;

import com.vaadin.Application;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;

public class TallinkApplication extends Application {
	private static String[] columns = { "number1", "number2", "operator",
			"result" };
	private IndexedContainer tableData = generateDummyData();

	private Button button;
	private Window mainWindow = new Window("Tallink Application");
	private Table table = new Table();

	@Override
	public void init() {
		initButton();
		initTable();
		initLayout();
	}

	private void initButton() {
		button = new Button("Do Magic", new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				button.setCaption("stop pushing it already");
			}
		});
	}

	private static IndexedContainer generateDummyData() {
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

	private void initTable() {
		table.setContainerDataSource(tableData);
		table.setSelectable(true);
	}

	public void initLayout() {
		mainWindow.addComponent(button);
		mainWindow.addComponent(table);
		setMainWindow(mainWindow);
	}

}
