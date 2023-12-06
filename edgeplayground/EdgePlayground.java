package edgeplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgePlayground {
    public static void main(String[] args) {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Driver\\edgedriver_win64\\msedgedriver.exe");

        // Create an instance of EdgeDriver
        WebDriver edge = new EdgeDriver();

        // Navigate to the specified URL
        edge.get("https://demo.nopcommerce.com/");

        System.out.println("Hello World!");

        // Close the browser
        edge.quit();
    }
}

