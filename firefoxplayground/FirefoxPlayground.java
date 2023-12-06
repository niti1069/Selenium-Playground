package firefoxplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxPlayground {
    public static void main(String[] args) {
        // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Software\\Driver\\geckodriver-v0.33.0-win64 (1).exe");

        // Create an instance of FirefoxDriver
        WebDriver firefox = new FirefoxDriver();

        // Navigate to the specified URL
        firefox.get("https://demo.nopcommerce.com/");

        System.out.println("Hello World!");
    }

}