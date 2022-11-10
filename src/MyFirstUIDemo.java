import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.gecko.driver", "/Users/andriysushko/IdeaProjects/lesson3/resource/geckodriver");



        WebDriver driver = new FirefoxDriver();


        driver.get("https://google.com");

        WebElement btnAccept = driver.findElement(By.xpath( "//*[@id = 'L2AGLb']" ));
        Thread.sleep(10000);
        btnAccept.click();


        WebElement element = driver.findElement(By.xpath(".//*[@name='q']"));

        etSearchField.sendKeys("Selenium");

        element.submit();

        Thread.sleep(4000);

        etSearchField.submit ();

        Thread.sleep(4000);

        etSearchField.submit ();

        System.out.println ("Page title is: " + driver.getTitle());

        driver.quit();
    }
}