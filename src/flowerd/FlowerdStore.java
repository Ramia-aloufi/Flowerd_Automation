package flowerd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowerdStore {

    //Use safari Browser
    SafariDriver driver;
    String expect1 = "The email you entered isn’t connected to an account. Find your account and log in.";

    String url;
    String expect;
    String actual;
    String email;
    String phone;
    boolean status;
    
    @BeforeTest
    public void before() {
            driver = new SafariDriver();
            email = "raa@ram.com";
            phone ="0500098000";
            url = "https://floward.com/en-sa/riyadh";
    }
@Test
public void sigup()throws InterruptedException  {
      WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(90));
      //navigate to banana website and maximaize
      driver.get(url);
      driver.manage().window().maximize();
      
      //Click Login
      driver.findElement(By.cssSelector("#top-head > div > div > nav > div > div.col-10.pt-2.px-0 > ul > li:nth-child(2)")).click();
      Thread.sleep(5000);
     //Click Create Account
      driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div > div.forgot-grid.row.mt-3 > div > a")).click();
      Thread.sleep(5000);

      //Enter email
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div:nth-child(1) > input")).sendKeys(email);
      Thread.sleep(5000);
     
      //Enter firstName
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div:nth-child(2) > input")).sendKeys("ramia");
      Thread.sleep(1000);
     
      //Enter LasttName
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div:nth-child(3) > input")).sendKeys("aloufi");
      Thread.sleep(1000);
     
      //click female Gender
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div.form-group.mb-3.col-12 > p-radiobutton:nth-child(3) > div > div.p-radiobutton-box")).click();
      Thread.sleep(1000);
    
      //PhoneNumber
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div.row.mx-0 > div.field-group.col-8 > input")).sendKeys(phone);
      Thread.sleep(1000);
    
      //Enter birthDate
      driver.findElement(By.cssSelector("      body > app-root > app-signup > div > div > div > div > form > div.filed-group.mb-3.col-12 > p-calendar > span > input")).click();
      Thread.sleep(1000);
      
      //select month
      Select month = new Select(driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div.filed-group.mb-3.col-12 > p-calendar > span > div > div > div > div.p-datepicker-header.ng-tns-c74-10 > div > select.p-datepicker-month.ng-tns-c74-10.ng-star-inserted")));
      month.selectByIndex(3);
      Thread.sleep(1000);
    
      //select year
      Select year = new Select(driver.findElement(By.cssSelector(" body > app-root > app-signup > div > div > div > div > form > div.filed-group.mb-3.col-12 > p-calendar > span > div > div > div > div.p-datepicker-header.ng-tns-c74-10 > div > select.p-datepicker-year.ng-tns-c74-10.ng-star-inserted")));
     year.selectByIndex(50);
      Thread.sleep(1000);
    
      //select day
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div.filed-group.mb-3.col-12 > p-calendar > span > div > div > div > div.p-datepicker-calendar-container.ng-tns-c74-10.ng-star-inserted > table > tbody > tr:nth-child(3) > td:nth-child(6)")).click();
      Thread.sleep(1000);
     
      //Password
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div:nth-child(8) > input")).sendKeys("Abc1234");
      Thread.sleep(1000);
     
      //click CreateButton
      driver.findElement(By.cssSelector("body > app-root > app-signup > div > div > div > div > form > div.col-12.text-center > button")).click();
      
      Thread.sleep(10000);

      
      
     
      
      
      
      
      
      


      
      
      
}
}
