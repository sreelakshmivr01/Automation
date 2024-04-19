package testpkg;

import java.util.Set;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Firstpage;

public class Firstpagetest extends Baseclass {
	
	@Test
	public void test()
	{
		Firstpage fp=new Firstpage(driver);
		fp.shop();
		fp.select();
		fp.third();
		fp.buynow();
		
	}
	@Test
	public void test2() throws InterruptedException
	{
     Set<String> allWindowhandles=driver.getWindowHandles();
		
		for(String handle : allWindowhandles)
		{
			Thread.sleep(2000);
			if(!handle.equalsIgnoreCase(handle))
			{
				driver.switchTo().window(handle);
    	    	driver.close();

			}
			driver.switchTo().window(handle);
	}
	

	}
}
