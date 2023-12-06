package chromeplayground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class ChromePlayground
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://demo.nopcommerce.com/");
        System.out.println( "Hello World!" );
    }
}
