//package TestCase1;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestCaseLogin {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
////		System.out.println("After chrome driver creation");
//		driver.get("http://www.gcrit.com/build3/admin/");
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("admin@123");
//		driver.findElement(By.id("tdb1")).click();
//		String url = driver.getCurrentUrl();
//		if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
//			System.out.println("Login Successful. Test case passed.");
//		} else {
//			System.out.println("Login Failed. test case Failed.");
//		}
//		Thread.sleep(5000);
////		driver.close();
//	}
//
//}
