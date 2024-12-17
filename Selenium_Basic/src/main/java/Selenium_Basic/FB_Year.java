package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Year {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		Thread.sleep(2000);
		w.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement e=w.findElement(By.id("year"));
		Select s = new Select(e);
		List<WebElement> l =s.getOptions();
		System.out.println("Listbox size = "+l.size());
		w.close();
	}

}
