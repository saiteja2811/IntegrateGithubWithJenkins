package SampleProject1.SampleProject1;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookFlights {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void InitiateBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Initiated Chrome Browser");
	}
	public static void Initiateapplication() {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("Initiated makemytrip application");
		
	}
	
	public static void clickflights() {
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/a[1]/span[2]")).click();
		System.out.println("selected flights");
	}
	
	public static void clickloginorcreateaccount() throws InterruptedException {
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")).click();
		System.out.println("click on login");
	}
	
	public static void clickFrom() {
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		System.out.println("click from");
		
	}
	public static void clickTo() {
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/span[1]")).click();
		System.out.println("click to ");
		
	}
	
	public static void sendFromLocation() {
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Mumbai");
		System.out.println("sent from location as Mumbai");
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
		System.out.println("Select Mumbai from dropdown");
		
	}
	
	public static void sendToLocation() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Hyderabad");
		System.out.println("sent to location as hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'HYD')]")).click();
		System.out.println("select hyderabad from dropdown");
	}
	public static void depature() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 20 2022')]")).click();
	}
	public static void clicksearch() {
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	}
	public static void clickokaygotit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'OKAY, GOT IT!')]")).click();
	}
	public static void scroll() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public static void clickviewprices() {
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]")).click();
	}
	public static void booknow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/button[1]")).click();
	}
	public static void main(String args[]) throws InterruptedException {
		InitiateBrowser();
		Initiateapplication();
		clickflights();
		clickloginorcreateaccount();
		clickFrom();
		sendFromLocation();
		clickTo();
		sendToLocation();
		depature();
		clicksearch();
		clickokaygotit();
		scroll();
		clickviewprices();
		scroll();
		booknow();
		
		
		
	}

}
