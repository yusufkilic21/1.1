package Gun05;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());



        //bır web elementının attrıbute ozellıklerını alma
        System.out.println("siparislerimLinki.href = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.title = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.rel = " + siparislerimLinki.getAttribute("rel"));

        Myfunc.Bekle(5);
        driver.quit();



















    }
}
