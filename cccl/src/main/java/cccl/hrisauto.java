package cccl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrisauto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open hris
		driver.get("https://hris.qainfotech.com");
		Thread.sleep(3000);
		//click on login
		//driver.findElement(By.xpath("//*[@id='demo-2']/div/div[2]/ul/li[1]/a/span")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("sumitmishra");
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Sonu@1806");
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
       // Thread.sleep(5000);
       // driver.findElement(By.xpath("//*[@id='addstatustag']/span[1]")).click();
       // Thread.sleep(3000);
       // driver.findElement(By.xpath("//*[@id='addstatustag']")).click();
        //driver.findElement(By.xpath("//*[@id='menu1']/ul/li[6]/ul/li[3]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id='page']/div/div[1]/div[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='page']/div/div[1]/div[2]/ul/li/ul/li[4]/a/span")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
