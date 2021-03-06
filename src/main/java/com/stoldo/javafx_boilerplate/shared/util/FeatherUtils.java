package com.stoldo.javafx_boilerplate.shared.util;

import org.codejargon.feather.Feather;

public class FeatherUtils {
	
	private static Feather featherInstance;
	
	
	private FeatherUtils() {}
	
	public static Feather getInstance() {
		if (featherInstance == null) {
			featherInstance = Feather.with();
		}

		return featherInstance;
	}
	
	public static void injectFields(Object obj) {
		getInstance().injectFields(obj);
	}

}
