package com.rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NewClass {
	public static void main(String[] args) {
		
	
		WebDriver driver = (WebDriver) new EdgeDriver();
        driver.get("https://www.facebook.com/login.php");
        driver.findElement(By.id("email")).sendKeys("Rahul");
        driver.findElement(By.id("pass")).sendKeys("Rahul@123");
        driver.findElement(By.id("loginbutton")).click();
        WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Log in ')]"));
        String text2 = text.getText();
        System.out.println(text2);
        //driver.quit();
        WebElement errortxt = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String er = errortxt.getText(); 
        System.out.println(er);
        driver.close();

		
	}

}
