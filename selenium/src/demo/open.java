package demo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class open {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("C:\\Program Files (x86)\\Google\\Chrome\\Application");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		driver=new RemoteWebDriver(new URL("http://192.168.5.173:5555/wd/hub"),capabilities);
		Thread.sleep(7000);
		driver.get("http://www.baidu.com/");
	}

}

