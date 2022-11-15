package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver drivere = new EdgeDriver();

        // Launch the URL
        drivere.get(baseurl);

        // Maximise the window
        drivere.manage().window().maximize();

        // we get the implicity time to driver
        drivere.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Get the page of the title
        String title = drivere.getTitle();
        System.out.println("Page title is :"+ title);

        // Get the current URL
        System.out.println("Current URL ; "+ drivere.getCurrentUrl());

        // Get the page source
        System.out.println("Page Source :"+ drivere.getPageSource());

        // find the username field element
        WebElement usenameField= drivere.findElement(By.id("username"));
        usenameField.sendKeys("tomsmith");

        // find the password field element
        WebElement passwordfield= drivere.findElement(By.name("password"));
        passwordfield.sendKeys("SuperSecret");
        drivere.quit();
    }

}


