package Gun05;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_tag {
    public static void main(String[] args) {
        //amazon.com un sayfasındakı butun lınklerı ıstıyorum,tıklanabılır ve gorunen yazısı

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));//butun a olan taglı elementlerı bul

        System.out.println("Linkler.size() " + linkler.size());
        for (WebElement e : linkler)
        {
            if (!e.getText().equals("") && e.getAttribute("href")!= null)
            System.out.println("e.getText() = " + e.getText());
        }

        Myfunc.Bekle(5);
        driver.quit();













    }
}
