package lunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

	public static void main(String[] args) {
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
		
		WebDriver d1 = new ChromeDriver();
	       d1.get("https://google.com");
	       WebElement searchInput = d1.findElement(By.name("q"));
	       searchInput.sendKeys("https://www.linkedin.com");
	       searchInput.submit();

	        // Click on the LinkedIn profile link in the search results
	       //WebDriverWait wait = new WebDriverWait(d1, 10);
	       WebElement linkedInLink = d1.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
	       linkedInLink.click();
	        // Find the username and password input fields and the login button
	        WebElement usernameInput = d1.findElement(By.xpath("//*[@id=\"session_key\"]"));
	        WebElement passwordInput = d1.findElement(By.xpath("//*[@id=\"session_password\"]"));
	        WebElement loginButton = d1.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button"));

	        // Enter your LinkedIn username and password
	        usernameInput.sendKeys("sai.hruthick12@gmail.com");
	        passwordInput.sendKeys("@Sai");

	        // Click the login button
	        loginButton.click();

	        // Wait for a moment to see the result
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();

}}}
