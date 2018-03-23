import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Samples {

	public static void main(String[] args) throws InterruptedException {
		
      System.out.println("hello world");
     
  	{
  		//FirefoxDriver Webdriver = new FirefoxDriver();
  		System.setProperty("webdriver.gecko.driver","G:\\OUPI_Automation\\JAR FILES SAMPLE\\EXE FILE\\geckodriver.exe");
  		WebDriver driver = new FirefoxDriver();

  		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  		// Navigate to URL
  		driver.get("http://uatapp.mysaras.com/K12Solution/School/default.aspx");
  		// Maximize the window.
  		driver.manage().window().maximize();
  		// Enter UserName
  		driver.findElement(By.id("txtEmail")).sendKeys("superhod");
  		// Enter Password
  		driver.findElement(By.id("txtPWD")).sendKeys("school");
  		driver.findElement(By.id("txcSC")).sendKeys("000");
  		// Wait For Page To Load
  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  		// Click on 'Sign In' button
  		driver.findElement(By.id("btnSignIn")).click();
  		//Click on Compose Mail.
  		Thread.sleep(12000);
  		driver.findElement(By.linkText("Publish Assets")).click();
  		Thread.sleep(12000);
  		driver.findElement(By.id("CPH_lnkbtnCreateAsset")).click();
  		Thread.sleep(5000);
  		driver.findElement(By.id("btnQuick")).click();
  		Thread.sleep(5000);
  		Select drp = new Select(driver.findElement(By.id("ctl00_CPH_quickLesson_ucChapterList_ddlClassAndSubjects")));
  		drp.selectByVisibleText("VII - English");
  		Thread.sleep(5000);
  		driver.findElement(By.id("ctl00_CPH_quickLesson_ucChapterList_rptCurriculum_ctl00_rptchapterChild_ctl00_btnCurriculum")).click();
  		Thread.sleep(5000);
  		driver.findElement(By.id("ctl00_CPH_quickLesson_txtLsnName")).sendKeys("Lessonname2");
  		Thread.sleep(5000);
  		
  		 WebElement iframe1 = driver.findElement(By.xpath("//*[contains(@title, 'Rich text editor, ctl00_CPH_quickLesson_editorPRK')]"));
  	        driver.switchTo().frame(iframe1);
  	        WebElement web1=driver.findElement(By.tagName("body"));
  	        web1.sendKeys("Quick lesson PRK");
  	        driver.switchTo().defaultContent();
  			Thread.sleep(3000);
  	    WebElement iframe2 = driver.findElement(By.xpath("//*[contains(@title, 'Rich text editor, ctl00_CPH_quickLesson_editorSLO')]"));
  	        driver.switchTo().frame(iframe2);
  	        WebElement web2=driver.findElement(By.tagName("body"));
  	        web2.sendKeys("Quick lesson SLO");
  	        driver.switchTo().defaultContent();
  	        Thread.sleep(3000);
  	        driver.findElement(By.id("ctl00_CPH_quickLesson_txtLsnDuration")).sendKeys("40");
  	        Thread.sleep(3000);
  	        driver.findElement(By.id("ctl00_CPH_quickLesson_lnkNext")).click();
  	        Thread.sleep(5000);
  		
  	        // Drag and drop 
  	        
  	     // Create object of actions class
  	       // Actions act=new Actions(driver);
  	         
  	        // find element which we need to drag
  	        WebElement drag=driver.findElement(By.xpath(".//*[@id='ctl00_CPH_quickLesson_myDataList']/span[1]/div"));
  	         
  	        // find element which we need to drop
  	        WebElement drop=driver.findElement(By.id("div_deft_drag_fix"));
  	         
  	        // this will drag element to destination
  	        //act.dragAndDrop(drag, drop).build().perform();
  	        
  	       Actions builder = new Actions(driver);
  	        
  	      //Building a drag and drop action
  	      Action dragAndDrop = builder.clickAndHold(drag)
  	    		  .moveToElement(drop)
  	      		     .release(drop)
  	              	     .build();

  	      //Performing the drag and drop action
  	      dragAndDrop.perform();
  	        Thread.sleep(5000);
  	}
	}

}
