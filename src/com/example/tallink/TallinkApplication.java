package com.example.tallink;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class TallinkApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Tallink Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
