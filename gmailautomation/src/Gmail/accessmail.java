package Gmail;

import org.openqa.selenium.By;

public class accessmail extends Gmaillogin {

	public void access() throws InterruptedException
	{
		 //click on 4th email 
		 driver.findElement(By.cssSelector(".ae4.aDM tr:nth-child(4) .bog")).click();
		 Thread.sleep(5000);
		 System.out.println("successfully clicked");
	}
}
