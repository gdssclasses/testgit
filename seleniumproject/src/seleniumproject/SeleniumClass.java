package seleniumproject; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class SeleniumClass {
		
	public static void main(String[] args) {
	// declaration and instantiation of objects/variables
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();;
	driver.navigate().to("http://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");	
	driver.findElement(By.name("q")).click();
	//close Fire fox
/*	driver.close(); */
	}
}

