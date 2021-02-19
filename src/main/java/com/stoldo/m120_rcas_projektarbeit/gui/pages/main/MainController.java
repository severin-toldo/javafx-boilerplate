package com.stoldo.m120_rcas_projektarbeit.gui.pages.main;

import javax.inject.Inject;

import com.stoldo.m120_rcas_projektarbeit.gui.AbstractController;
import com.stoldo.m120_rcas_projektarbeit.service.ExampleService;


public class MainController extends AbstractController {
	
	@Inject
	private ExampleService exampleService;

	
	@Override
	public void initialize() throws Exception {
		System.out.println("initialize");
		exampleService.example();
	}
	
}
