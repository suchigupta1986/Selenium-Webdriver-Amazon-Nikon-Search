import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class NikonD3X {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suchi\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		// TODO Auto-generated method stub
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.com");
driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Nikon");
driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

WebElement address=driver.findElement(By.xpath(".//*[@id='sort']"));
Select HTL=new Select(address);
HTL.selectByVisibleText("Price: High to Low");
Thread.sleep(5000L);

driver.findElement(By.xpath(".//*[@id='result_1']/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
String Productname=driver.findElement(By.xpath(".//*[@id='productTitle']")).getText();
System.out.println(Productname);
Assert.assertTrue(Productname.contains("Nikon D3X"));
System.out.println("Product Matched");

	}

}
