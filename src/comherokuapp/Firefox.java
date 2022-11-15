package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Launch the URL
        driver.get(baseurl);

        // Maximise the windeow
        driver.manage().window().maximize();

        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the page of the title
        String title = driver.getTitle();
        System.out.println("Page title is : "+ title);

        // Get the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        // Get the page source
        System.out.println("Page Source : " + driver.getPageSource());

        // Find the username filed element
        WebElement usernameField=driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        // Find the password field element

        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("SuperSecret");
        driver.quit();
    }
}

