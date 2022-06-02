import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myBookings {

	@Test
	public void viewHotelVoucher() {
		
		System.setProperty("webdriver.chrome.driver", "D:/Projetos/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Login - PHPTRAVELS", driver.getTitle());
		

		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");

		driver.findElement(By.xpath("//button//span[contains(text(),'Login')]")).click();
		driver.findElement(By.id("cookie_stop")).click();
		
		driver.findElement(By.xpath("//div[@class='sidebar-menu-wrap']//li//a[contains(text(),' My Bookings')]")).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Bookings - PHPTRAVELS", driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='sidebar-menu-wrap']//li//a[contains(text(),' My Bookings')]")).click();
	}
}
