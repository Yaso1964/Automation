package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  WebDriver driver;

  public void launchBrowser(){System.setProperty("webdriver.chrome.driver",
          "/Users/fionagwaze/Downloads/chromedriver-mac-x64/chromedriver");
      driver= new ChromeDriver();
      driver.get("https://5petals-cjcsegesfkh9awda.uksouth-01.azurewebsites.net/webapp/");


  }

    public static void main(String[] args) {

      Main obj=new Main();
      obj.launchBrowser();

    }
}