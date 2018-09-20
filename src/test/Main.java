package test; 


import java.util.concurrent.Semaphore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;

public class Main {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sudhanshu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.brazzers.com/");
	
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath(".//*[@id='btn-enter-zz']/em")).click();
	
	driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a/em")).click();
	
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("1909shanu");
	
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Shanu@123");
	
	driver.findElement(By.xpath(".//*[@id='productcc80064']")).click();
	
	}

}
