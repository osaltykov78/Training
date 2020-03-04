import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class First {
	static int a=1;
	
	public static void main(String[] args) {
	
	System.out.println(a);
//	System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	DesiredCapabilities capabilities=new DesiredCapabilities();
//	options.addArguments("disable infobars");
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	RemoteWebDriver driver=new ChromeDriver(capabilities);
	driver.get("https://portal.achieve3000.com");
	driver.findElementById("login_name1").sendKeys("lkumar2b");
	driver.findElementById("password1").sendKeys("lkumar2b");
	driver.findElementById("button").click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	
	System.out.println(driver.findElementById("topPointsContainer").getText());
	driver.quit();
	
	}
	
	
}
