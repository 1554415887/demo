package fncn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class util{
	public static WebDriver driver;
	public void ut(){
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();//�򿪹ȸ�
		driver.get("https://www.baidu.com/");
	}
	
}
