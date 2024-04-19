package testpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Thirdpage;

public class Thirdpagetest extends Baseclass {
	
	@Test
	public void test()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)"," ");
	Thirdpage tp=new Thirdpage(driver);
	tp.searches();
	tp.touch();

}}
