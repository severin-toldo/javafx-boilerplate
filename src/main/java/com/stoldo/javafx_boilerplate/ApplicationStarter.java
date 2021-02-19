package com.stoldo.javafx_boilerplate;

import com.stoldo.javafx_boilerplate.gui.AbstractController;
import com.stoldo.javafx_boilerplate.gui.pages.main.MainController;
import com.stoldo.javafx_boilerplate.shared.constants.TranslationKey;
import com.stoldo.javafx_boilerplate.shared.util.JavaFxUtils;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ApplicationStarter extends Application {
	
	public static void main(String[] args) {
		Application.launch(ApplicationStarter.class, args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AbstractController mainController = new MainController();
		mainController.load(primaryStage);
		Pane mainPane = mainController.getPane();
		Scene mainScene = new Scene(mainPane, 1600, 1050);
		primaryStage.centerOnScreen();
		primaryStage.setTitle(JavaFxUtils.translate(TranslationKey.APPLICATION_TITLE));
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}
