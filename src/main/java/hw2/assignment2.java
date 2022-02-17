package hw2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {
WebDriver driver;

	@Before
	public void launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test	
	public void testing() throws InterruptedException{
		
		
		System.out.println(driver.getTitle());  //page title
		
		
		By userNameLocator = By.xpath("//input[@id='username']");
		By passwordLocator = By.xpath("//*[@id=\"password\"]");
		By signInButtonLocator = By.xpath("/html/body/div/div/div/form/div[3]/button");
		//By dashboarHeaderLocator = By.xpath("//h2[contains(text(), 'Dashboard')]");
		By customerMenuLocator = By.xpath("//span[contains(text(), 'Customers')]");
		
		By addCustomerMenuLocator = By.xpath("//a[contains(text(), 'Add Customer')]");
		
		By companyDropdownLocator = By.xpath("//select[@id=\"cid\"]");
		System.out.println(driver.getTitle());
		By groupLocator = By.xpath("//select[@id=\"group\"]");
		By FullNameLocator = By.xpath("//input[@id='account']");
		By EmailLocator = By.xpath("//div[@class='ibox-content']/descendant::input[2]");
		By PhonenumLocator = By.xpath("//input[@id='phone']");
		By AddressLocator = By.xpath("//input[@id='address']");
		By CityLocator = By.xpath("//input[@id='city']");
		By StateLocator = By.xpath("//input[@id='state']");
		By zipLocator = By.xpath("//input[@id='zip']");
		By PasswordLocator = By.xpath("//input[@id='password']");
		By ConfirmPasswordLocator = By.xpath("//input[@id='cpassword']");
		By SaveLocator = By.xpath("//button[@id='submit']");
		
		
		driver.findElement(userNameLocator).clear();
		driver.findElement(userNameLocator).sendKeys("demo@techfios.com");
		driver.findElement(passwordLocator).sendKeys("abc123");
		driver.findElement(signInButtonLocator).click();
		
		
		driver.findElement(customerMenuLocator).click();
		driver.findElement(addCustomerMenuLocator).click();
		driver.findElement(FullNameLocator).sendKeys("Bikal Guragain");
		
		
		Select dp = new Select(driver.findElement(companyDropdownLocator));
		dp.selectByVisibleText("SuperCompany");
		
		
		driver.findElement(EmailLocator).sendKeys("bikal899@gmail.com");
		driver.findElement(PhonenumLocator).sendKeys("6824084830");
		driver.findElement(AddressLocator).sendKeys("Straight Outta Nepal");
		driver.findElement(CityLocator).sendKeys("Arlington");
		driver.findElement(StateLocator).sendKeys("Texas");
		driver.findElement(zipLocator).sendKeys("76006");
		
		
		Select gl = new Select(driver.findElement(groupLocator));
		gl.selectByVisibleText("September_QA_2021");
		
		driver.findElement(PasswordLocator).sendKeys("haha1234");
		driver.findElement(ConfirmPasswordLocator).sendKeys("haha1234");
		Thread.sleep(5000);
		driver.findElement(SaveLocator).click();
}

}