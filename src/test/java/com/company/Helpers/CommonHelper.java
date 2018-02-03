package com.company.Helpers;

import com.company.Pages.BasePage;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CommonHelper extends BasePage{
   public  void closeApp(){
       driver.quit();
   }
    public WebDriver getDriver(){
        return driver;
    }

  public byte[] getScreenShot() throws IOException {
      byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
      return screenshot;
  }
}
