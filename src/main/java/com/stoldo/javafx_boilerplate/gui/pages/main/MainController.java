package com.stoldo.javafx_boilerplate.gui.pages.main;

import javax.inject.Inject;

import com.stoldo.javafx_boilerplate.gui.AbstractController;
import com.stoldo.javafx_boilerplate.service.ExampleService;


public class MainController extends AbstractController {
	
	@Inject
	private ExampleService exampleService;

	
	@Override
	public void initialize() throws Exception {
		System.out.println("initialize");
		exampleService.example();
	}
	
}
