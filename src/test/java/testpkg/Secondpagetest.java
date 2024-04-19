package testpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Secondpage;

public class Secondpagetest extends Baseclass {
	
	@Test
	public void test() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Secondpage sp=new Secondpage(driver);
		sp.touch();
		sp.back();
		sp.mousehover();
	}	
	}
