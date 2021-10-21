package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScripts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Setting the property of chrome browser and passing chromedriver path 
				System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
				
				// Launching chrome browser instance
				WebDriver driver = new ChromeDriver();

				//manage() method
				driver.manage().window().maximize();

				// Opening URL of application 
				driver.get("https://en-gb.facebook.com/");
				Thread.sleep(3000);
				
				// Enter Details
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class=\'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
				
				// Opening URL of application 
				Thread.sleep(3000);
				driver.navigate().to("https://www.instagram.com/accounts/login/");
				Thread.sleep(3000);
				
				// Enter Details
				driver.findElement(By.xpath("//*[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@class='_2hvTZ pexuQ zyHYP']")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
				
				// Opening URL of application 
				Thread.sleep(3000);
				driver.navigate().to("https://elements.envato.com/sign-in");
				Thread.sleep(3000);
				
				// Enter Details
				driver.findElement(By.xpath("//*[@id='signInUsername']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id='signInPassword']")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div/div/div[2]/form/button")).click();
				
				// Opening URL of application 
				Thread.sleep(3000);
				driver.navigate().to("https://www.netflix.com/in/login");
				Thread.sleep(3000);
				
				// Enter Details
				driver.findElement(By.xpath("//*[@id='id_userLoginId']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id='id_password']")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
				
				// Opening URL of application 
				Thread.sleep(3000);
				driver.navigate().to("http://magnus.jalaacademy.com/Account/Login");
				Thread.sleep(3000);
				
				// Enter Details
				driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
				
	}

}
