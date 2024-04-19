package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopNow\"]/a")
	WebElement shopping;
	
	@FindBy(xpath="//*[@id=\"bodyID\"]/div[2]/ul/li[8]/a/span[1]/picture/img")
	WebElement Homedecor;
	
	@FindBy(xpath="//*[@id=\"prd_img_2\"]")
	WebElement Third;
	
	@FindBy(xpath="//*[@id=\"pdp_bn_cta\"]/div/span")
	WebElement Buynow;
	
	public Firstpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void shop()
	{
		shopping.click();
	}
	public void select()
	{
		Homedecor.click();
	}
	public void third()
	{
		Third.click();
	}
	public void buynow()
	{
		Buynow.click();
	}
	

}
