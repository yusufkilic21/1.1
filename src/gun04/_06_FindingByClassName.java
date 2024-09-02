package gun04;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        //lınk gorunen text sıparıslerım olan a tag lı elemanı bul
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());
        //partıalLınktezt; lınkın gorunen yazısının bır kısmını selector olarak kullanabılırsınız.
        WebElement link2=driver.findElement(By.partialLinkText("super fıyat"));
        System.out.println("link2.getText() = " + link2.getText());

        Myfunc.Bekle(3);
        driver.quit(); //bu drıver uzerınden acılmıs bıtın taryaıcıları kapatır
        //drıver.close () //bu drıver uzerınden acılmıs o anda aktıf olan tarayıcı kapatır.
    }
}
