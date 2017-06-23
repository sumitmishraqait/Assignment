package cccl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twit
{
	private static WebDriver driver;

public static void testTitle(String a, String b) {
 if (a.contentEquals(b)) {
  System.out.println("Test Passed..Title is working fine");
 } else {
  System.out.println("Test Failed....Sorry, Title doesn't match");
 }
}

public static void testCurrentUrl(String a, String b) {
 if (a.contentEquals(b)) {
  System.out.println("Test Passed..CurrentUrl is '" + a + "' and it's working fine");
 } else {
  System.out.println("Test Failed....Sorry, CurrentUrl doesn't match");
 }
}

public static boolean testTwitter() throws InterruptedException {
 WebElement ele2 = driver.findElement(By.cssSelector(".EdgeButton.EdgeButton--transparent.EdgeButton--medium.StreamsLogin.js-login"));
 ele2.click();

 WebElement ele3 = driver.findElement(By.cssSelector(".email-input.js-signin-email"));
 ele3.click();
 ele3.sendKeys("your twitter account id");

 WebElement ele4 = driver.findElement(By.cssSelector(".LoginForm-input.LoginForm-password"));
 ele4.click();
 ele4.sendKeys("your password");
 Thread.sleep(100);
 
 WebElement ele5 = driver.findElement(By.cssSelector(".EdgeButton--medium.submit"));
 ele5.click();
 Thread.sleep(100);
 
 WebElement ele6 = driver.findElement(By.cssSelector(".settings.dropdown-toggle"));
 ele6.click();
 Thread.sleep(100);
 
 WebElement ele7 = driver.findElement(By.cssSelector(".js-signout-button"));
 ele7.click();

 return true;

}

public static void main(String[] args) throws InterruptedException {
 String expectedTitle, expectedCurrentUrl, actualTitle, actualCurrentUrl;
 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.17.0-win64\\geckodriver.exe");

 driver = new FirefoxDriver();

 String url = "https://www.twitter.com";

 driver.get(url);
 expectedCurrentUrl = "https://twitter.com/";
 actualCurrentUrl = "";
 actualCurrentUrl = driver.getCurrentUrl();

 expectedTitle = "Twitter. It's what's happening.";
 actualTitle = "";
 actualTitle = driver.getTitle();

 twit.testTitle(actualTitle, expectedTitle);
 twit.testCurrentUrl(actualCurrentUrl, expectedCurrentUrl);
 twit.testTwitter();

 if (twit.testTwitter()) {
  System.out.println("Operation Completed!");
 } else {
  System.out.println("Some error occured in Twitter Checking");
 }
 
 driver.close();
 System.exit(0);

}

}
