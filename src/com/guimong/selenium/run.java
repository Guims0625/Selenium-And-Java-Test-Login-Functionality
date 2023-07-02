package com.guimong.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Scenario 1: Navigate to the login page
        driver.get("https://www.saucedemo.com/");
        
        // Scenario 1: Log in using standard user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        
        // Scenario 1: Verify that user is able to navigate to home page
        WebElement homeTitle = driver.findElement(By.className("title"));
        String pageTitle = homeTitle.getText();
        if (pageTitle.equals("Products")) {
            System.out.println("Scenario 1: Logged in successfully");
        } else {
            System.out.println("Scenario 1: Login Failed");
        }
        
        // Scenario 1: Log out
        driver.findElement(By.id("react-burger-menu-btn")).click();
        
        // Scenario 1: Time to wait for logout button to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        
        driver.findElement(By.id("logout_sidebar_link")).click();
        
        // Scenario 1: Verify that user is navigated to login page
        WebElement signTitle = driver.findElement(By.className("login_logo"));
        if (signTitle.isDisplayed()) {
            System.out.println("Scenario 1: Logged out successfully");
        } else {
            System.out.println("Scenario 1: Logout Failed");
        }
        
        // Scenario 2: Log in using locked out user
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        
        // Scenario 2: Verify error message
        WebElement errorMessage = driver.findElement(By.cssSelector("[data-test='error']"));
        String errorMsg = errorMessage.getText();
        if (errorMsg.equals("Epic sadface: Sorry, this user has been locked out.")) {
            System.out.println("Scenario 2: Error message is displayed correctly");
        } else {
            System.out.println("Scenario 2: Error message is displayed incorrectly");
        }
        
	}

}
