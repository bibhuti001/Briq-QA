package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_NestedFrames {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bibhu\\Downloads\\work//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		WebElement rightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().defaultContent();
		WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		//for middle
		driver.switchTo().frame(topFrame);
		driver.switchTo().frame(middleFrame);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		//for left
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topFrame);
		driver.switchTo().frame(leftFrame);
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		//for right
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topFrame);
		driver.switchTo().frame(rightFrame);
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		//for bottom
		driver.switchTo().defaultContent();
		driver.switchTo().frame(bottomFrame);
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		

	}

}
