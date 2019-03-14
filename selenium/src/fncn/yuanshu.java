package fncn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class yuanshu extends util{
	public static WebElement a;
	public void ys() {
		a=driver.findElement(By.xpath("	//*[@id=\"u1\"]/a[1]"));
	}


}
