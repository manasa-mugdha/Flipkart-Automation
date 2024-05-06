import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class testcode {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Samsung Galaxy S10");
        searchBox.submit();
        
        WebElement samsungcheck= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div/div"));
        samsungcheck.click();
        
        WebElement assured= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[4]/label/div[1]"));
        assured.click();
        
        WebElement sort= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]"));
        sort.click();
        
    	List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
    	List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class = 'Nx9bqj _4b5DiR']"));
    	
        for(int i=0; i<list_of_products.size(); i++) {
        	
        	System.out.println(list_of_products.get(i).getText() + "-----------------" + list_of_products_price.get(i).getText());
        }
    }
}
