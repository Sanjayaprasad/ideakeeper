package testcases;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ideaKeeperEnd2End {
	WebDriver driver =  null;
	public void init() {
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://localhost:3000");
			//retrun driver.get("http://localhost:3000");
		}	
	}

	@Before
	public void setUp() throws Exception {
		//WebDriver driver =  null;
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
    @Test
	public void shouldAcceptNullStringAsAnIdea() {
		String checkVal = "Text added";
		init();
		driver.findElement(By.name("idea")).sendKeys(checkVal);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> list = driver.findElements(By.id("list"));
	    //System.out.println("text is :"+list.get(list.size()-1).getText());
	    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
	    //System.out.println("Text added below");
	}
	
	@Test
	public void shouldAcceptMoreThanFourtyCharcterStringAsAnIdea() {
		String checkVal = "12345678901234567890123456789012345678901234";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("test passed due to submit button was enabled in ideakeepr application");
			    }
	@Test
	public void shouldAcceptTextAddedBelowListAsAnIdea() {
		String checkVal = "Text added below";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("text is :"+list.get(list.size()-1).getText());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Text added below");
			    }
	@Test
	public void shouldAcceptTextInTheListAsAnIdea() {
		String checkVal = "Text";
		        init();
				driver.findElement(By.name("idea")).sendKeys(checkVal);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Item Added");
			    }
}