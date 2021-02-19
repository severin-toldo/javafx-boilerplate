package com.stoldo.m120_rcas_projektarbeit.gui;


import org.apache.commons.lang3.StringUtils;

import com.stoldo.m120_rcas_projektarbeit.shared.util.FeatherUtils;
import com.stoldo.m120_rcas_projektarbeit.shared.util.JavaFxUtils;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.Getter;


public abstract class AbstractController {
	
	@Getter
	private Pane pane;
	
	@Getter
	private Stage stage;
	
	public AbstractController() {
		FeatherUtils.injectFields(this);
	}
	
	public String getFxmlFileName() {
		return StringUtils.replace(getClass().getSimpleName(), "Controller", ".fxml");
	}
	
	public void load(Stage stage) throws Exception {
		this.stage = stage;
		this.pane = JavaFxUtils.load(this);
	}
	
	@FXML
	public abstract void initialize() throws Exception;
}
