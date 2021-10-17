package com.fine;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement mob = driver.findElement(By.xpath("(//a[normalize-space()='Mobiles'])[1]"));
		Actions ac=new Actions(driver);
		ac.contextClick(mob).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
				
		WebElement ele = driver.findElement(By.xpath("(//a[normalize-space()='Electronics'])[1]"));
		ac.contextClick(ele).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> set = driver.getWindowHandles();
		for (String getname : set) {
			String title = driver.switchTo().window(getname).getTitle();
			System.out.println(title);
		}
		String s="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		
		for (String to : set) {
			if(driver.switchTo().window(to).getTitle().equals(s)) {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
