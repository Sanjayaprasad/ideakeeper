package ideakeeper;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ideakeeper {

	public static void main(String[] args) {
		String checkVal = "Text";
		System.setProperty("webdriver.chrome.driver", "/Users/solutionsiq/Downloads/chromedriver");
		        WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:3000");
				driver.findElement(By.id("text")).sendKeys("checkVal");
				driver.findElement(By.xpath("//button[@id='click']")).click();
				List<WebElement> list = driver.findElements(By.id("list"));
			    System.out.println("size is :"+list.size());
			    Assert.assertEquals(list.get(list.size()-1).getText(),checkVal);
			    System.out.println("Item Added");
		}
}