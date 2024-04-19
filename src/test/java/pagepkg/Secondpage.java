package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Secondpage {
	
	 WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"sag\"]/ul/li[2]/a[2]")
	WebElement feedback;
	
	@FindBy(xpath="//*[@id=\"Img3\"]")
	WebElement industrial;
	
	public Secondpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void touch()
	{
		feedback.click();
	}
	public void back()
	{
		driver.navigate().back();
	}
	public void mousehover()
	{
		Actions act=new Actions(driver);
		act.moveToElement(industrial);
		act.perform();
	}
}
