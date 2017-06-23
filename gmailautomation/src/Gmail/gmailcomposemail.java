package Gmail;

import org.openqa.selenium.By;

public class gmailcomposemail extends Gmaillogin{

	public  void compose_mail()
	{
		
		 
		//click on compose button
        driver.findElement(By.xpath(".//*[text()='COMPOSE']")).click();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
                System.out.println(e);
            }
        
        //write the value of To  Element
        driver.findElement(By.xpath(".//textarea[@name='to']")).sendKeys("somil_qait@gmail.com");
        
        //write the value of Subject  Element
        driver.findElement(By.xpath(".//input[@name='subjectbox']")).sendKeys("Testing script for sending mail to other");
        
        // write the Email Content
        driver.findElement(By.xpath(".//div[@aria-label='Message Body']")).sendKeys("Hello Somil,\nI hope you are enjoying your day.\n. \n\n\n\nRegards, \nSumit mishra");
        
        
     // for click on send Button    
       driver.findElement(By.xpath(".//*[text()='Send']")).click();
	}
}
