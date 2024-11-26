package newprojartifact;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//opening the given url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com");
		driver.manage().window().maximize();
		Dimension dimension =new Dimension(800,600);
		driver.manage().window().setSize(dimension);
		
	
		
		//navigating to different url
		
		driver.navigate().to("https://fitpeo.com/revenue-calculator"); //its navigate then to
		
		WebElement scrolltoslider = driver.findElement(By.xpath("//input[@id=':R57alklff9da:']"));
		Actions actions = new Actions(driver); //its actions and it passes driver
		actions.moveToElement(scrolltoslider);
		actions.perform();
		//String comp = driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).getAttribute("value");
		WebElement slider = driver.findElement(By.xpath("//span[@style = 'left:10%']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider,93, 0).perform();
		
		//sending keys in text box
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).click();
		for(int i=0;i<=3;i++) {
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys(Keys.BACK_SPACE);
		
		}
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys("560");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		
		
		String actualDataEnteredinTextfield=driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).getAttribute("value");
		System.out.println("Actual value dispayed in text field:" + actualDataEnteredinTextfield);
		String expectedtext="560";
		System.out.println("Expected value dispayed in text field:" + expectedtext);
		if(actualDataEnteredinTextfield.equalsIgnoreCase(expectedtext))
		{
			System.out.println("Slider text field value is matching the expected amount 560");
		}
		
		
     //checkbox
		WebElement CPT99453 =driver.findElement(By.xpath("//span[text()='19.19']"));
		action.moveToElement(CPT99453).perform();
		WebElement CPT99453checkbox= driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(CPT99453));
		CPT99453checkbox.click();
		
		
		WebElement CPT99091 =driver.findElement(By.xpath("//span[text()='57']"));
		action.moveToElement(CPT99091).perform();
		WebElement CPT99091checkbox= driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(CPT99091));
		CPT99091checkbox.click();
		
		

		WebElement CPT99454 =driver.findElement(By.xpath("//span[text()='63']"));
		action.moveToElement(CPT99454).perform();
		WebElement CPT99454checkbox= driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(CPT99454));
		CPT99454checkbox.click();
		
		
		WebElement CPT99474 =driver.findElement(By.xpath("//span[text()='15']"));
		action.moveToElement(CPT99474).perform();
		WebElement CPT99474checkbox= driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).near(CPT99474));
		CPT99474checkbox.click();
		
		
		
		
		/////////////////////validation
		WebElement TotalRecurringReimbursement = driver.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']//child::p"));
		WebElement TotalRecurringReimbursementvalue= driver.findElement(RelativeLocator.with(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-12bch19']")).toRightOf(TotalRecurringReimbursement));
		String actualTotalRecurringReimbursement = TotalRecurringReimbursementvalue.getText();
        System.out.println("Total Recurring Reimbursement: " + actualTotalRecurringReimbursement);
       
        
        
        ///comparison
       
       String expected = "$110700";
       
      WebElement actualTotalRecurringReimbursementHeader= driver.findElement(By.xpath("//p[contains(text(),'Total Recurring')]//child::p"));
      System.out.println("Actual Value displayed on the header:" + actualTotalRecurringReimbursementHeader.getText());
      System.out.println("Expected Value to be displayed on the header:" + expected);
     
    	 
     if(expected.equals(actualTotalRecurringReimbursementHeader) ){
    	 System.out.println("Displayed amount on the header is matching the expected amount");
     }
     
     
     
     else {
	    System.out.println("Displayed amount on the header is not matching the expected amount");
         
         
    	 }
     
 
		

	}

}
