package TestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver = new ChromeDriver();
     driver.get("http://www.google.com");
     boolean existence = driver.findElement (By.linkText("Gmail")).isDisplayed();
     if (existence == true) {
    	 System.out.println("Gmail link exists");
     }
     else {
    	 System.out.println("Gmail link doesnt exists");
     }
     Thread.sleep(5000);
     driver.close();
	}

}
