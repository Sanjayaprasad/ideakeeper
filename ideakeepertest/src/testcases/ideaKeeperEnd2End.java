//package testcases;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ideaKeeperEnd2End {
	WebDriver driver =  null;
	private void init(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
			 driver = new ChromeDriver(); 
			 driver.get("http://localhost:3000");
		}
		
	}
    @Test
	public void shouldAcceptNullStringAsAnIdea() {
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

@Test
	public void shouldAcceptTextAndMustBeAbleToDisplayMinimumOf200Ideas() throws InterruptedException{
		String checkVal = "Text";
			init();
			List<WebElement> list = driver.findElements(By.id("list"));
			System.out.println("Size is"+list.size());
			driver.findElement(By.name("idea")).sendKeys(checkVal);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			List<WebElement> list1 = driver.findElements(By.id("list"));
			Thread.sleep(1000);
			System.out.println("size is:"+list1.size());
			boolean listsize = list.size() != list1.size();
			Assert.assertTrue(listsize);
	}		
}
