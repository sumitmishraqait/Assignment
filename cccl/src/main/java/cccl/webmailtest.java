package cccl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webmailtest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//opening webmail
		driver.get("http://webmail.qainfotech.com");
		//Thread.sleep(2000);
		//enter username
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sumitmishra@qainfotech.com");
		Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sonu@1806");
		//Thread.sleep(2000);
		//click sign in
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		//Thread.sleep(2000);
		//compose mail
		//driver.findElement(By.xpath("//*[@id='zb__NEW_MENU_title']")).click();
		//access mail
		Thread.sleep(2000);
		List<WebElement> elementlist=driver.findElements(By.className("ZmRowDoubleHeader"));
		  System.out.println(elementlist.size());
		  int itr=1;
		   for(WebElement e : elementlist) 
		         {  
		    if(itr==4){
		             System.out.print("Text within the Anchor tab"+e.getText()+"\t");
		    e.click();
		    break;
		    }
		    itr++;
		         }
		//click on menu
		//driver.findElement(By.xpath("//*[@id='DWT31_dropdown']")).click();
		//Thread.sleep(5000);
		//sign out
		//driver.findElement(By.xpath("//*[@id='logOff_title']")).click();
		//Thread.sleep(2000);
		//close driver
		//driver.close();
		
	}

}
