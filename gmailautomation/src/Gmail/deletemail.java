package Gmail;

import org.openqa.selenium.By;

public class deletemail extends Gmaillogin{
	public void delete() throws InterruptedException
	{accessmail s=new accessmail();
		//driver.findElement(By.cssSelector(".T-Jo-auh")).click();
		//s.access();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".T-Jo-auh")).click();
		//delete all email of page
		driver.findElement(By.cssSelector("div[data-tooltip='Delete']")).click();
	}

}
