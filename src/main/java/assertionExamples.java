import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertionExamples{

    static WebDriver driver;
    @BeforeClass
    static public void setup()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fionagwaze/Downloads/chromedriver-mac-x64/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://5petals-cjcsegesfkh9awda.uksouth-01.azurewebsites.net/webapp/");

    }


    @Test
    public void getData()
    {
        String text =driver.findElement(By.cssSelector("h1")).getText();
        System.out.println(text);
        Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
        driver.close();
    }
    }
