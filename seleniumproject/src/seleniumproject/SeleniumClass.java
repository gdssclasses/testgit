package seleniumproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {
		
	public static void main(String[] args) {
	// declaration and instantiation of objects/variables
	System.setProperty("webdriver.firefox.marionette","C:\\Users\\User\\Desktop\\Java\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	String baseUrl = "http://www.foxnews.com/";
	String expectedTitle = "Fox News - Breaking News Updates | Latest News Headlines | Photos & News Videos";
	String actualTitle = "";
	// launch Fire fox and direct it to the Base URL
	driver.get(baseUrl);
	// get the actual value of the title
	actualTitle = driver.getTitle();
	/*
	* compare the actual title of the page with the expected one and print
	* the result as "Passed" or "Failed"
	*/
	if (actualTitle.contentEquals(expectedTitle)){
	System.out.println("Test Passed!");
	} else {
	System.out.println("Test Failed");
	}
	//close Fire fox
	driver.close();
	}
	}

