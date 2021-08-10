package com.xyz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
public static void main(String[] args) throws IOException {
	GlobalClass base = new GlobalClass();
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	WebElement UsernameBox = driver.findElement(By.id("username"));
	base.send(UsernameBox, "vaishuSanje1");
	WebElement PasswordBox = driver.findElement(By.id("password"));
	base.send(PasswordBox, "Lavender@12345");
	WebElement loginBtn = driver.findElement(By.id("login"));
	loginBtn.click();
	WebElement location = driver.findElement(By.id("location"));
	base.SelectByvisibleText(location, base.getData(1, 0));
	WebElement Hotel = driver.findElement(By.id("hotels"));
	base.SelectByvisibleText(Hotel, base.getData(2,1));
	WebElement RoomType = driver.findElement(By.id("room_type"));
	base.SelectByvisibleText(RoomType, base.getData(1,2));	
	WebElement RoomNumber = driver.findElement(By.id("room_nos"));
	base.SelectByvisibleText(RoomNumber, base.getData(4,3));
	WebElement Indate = driver.findElement(By.id("datepick_in"));
	Indate.clear();
	Indate.sendKeys(base.getData(1,4));
	WebElement Outdate = driver.findElement(By.id("datepick_out"));
	Outdate.clear();
	Outdate.sendKeys(base.getData(1, 5));
	WebElement adultrooms = driver.findElement(By.id("adult_room"));
	base.SelectByvisibleText(adultrooms, base.getData(2, 7));
	WebElement childrooms = driver.findElement(By.id("child_room"));
	base.SelectByvisibleText(childrooms, base.getData(1, 6));
	WebElement submit = driver.findElement(By.id("Submit"));
	submit.click();
	WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
	radioBtn.click();
	WebElement continueBtn = driver.findElement(By.id("continue"));
	continueBtn.click();
	WebElement FirstName = driver.findElement(By.id("first_name"));
	base.send(FirstName, base.getData(1, 8));
	WebElement LastName= driver.findElement(By.id("last_name"));
	base.send(LastName, base.getData(1, 9));
	WebElement address = driver.findElement(By.id("address"));
	base.send(address, base.getData(1, 10));
	WebElement CCnum = driver.findElement(By.id("cc_num"));
	base.send(CCnum,base.getData(1, 11));
	WebElement cctype = driver.findElement(By.id("cc_type"));
	base.SelectByvisibleText(cctype,base.getData(1, 12));
	WebElement month = driver.findElement(By.id("cc_exp_month"));
	base.SelectByvisibleText(month,base.getData(1, 13));
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	base.SelectByvisibleText(year,base.getData(12, 14));
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	base.send(cvv,base.getData(1, 15));
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();
	//WebElement orderID = driver.findElement(By.id("order_no"));
	//String orderNumber = orderID.getAttribute("Value");
	//System.out.println(orderNumber);
}
}
