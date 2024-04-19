package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thirdpage {
	
	 WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"search_string\"]")
		WebElement search;
		
		@FindBy(xpath="//*[@id=\"Img3\"]")
		WebElement touchscreen;
		
		public Thirdpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void searches()
		{
			search.sendKeys("mobiles", Keys.ENTER);
		}
		public void touch()
		{
			touchscreen.click();
		}

}
