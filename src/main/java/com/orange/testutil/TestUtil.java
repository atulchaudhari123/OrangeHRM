package com.orange.testutil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.orange.testbase.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws Exception {
		super();

	}

	public void takeScreenshot(String filename) throws Exception {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\screenshot\\" + filename + ".jpg"));

	}

}
