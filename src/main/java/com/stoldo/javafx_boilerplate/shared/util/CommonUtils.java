package com.stoldo.javafx_boilerplate.shared.util;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

import com.stoldo.javafx_boilerplate.shared.constants.PathConstants;

public class CommonUtils {
	
	public static double roundTwoDecimals(double d) {
		return Math.round(d * 100.0) / 100.0;
	}
	
	public static File copyFileToImageDir(File srcFile) throws Exception {
		String uuid = UUID.randomUUID().toString();
    	File newFile = new File(PathConstants.IMAGE_PATH + File.separator + uuid + "_" + srcFile.getName());
    	FileUtils.copyFile(srcFile, newFile);
    	return newFile;
	}
	
}
