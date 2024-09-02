package gun04;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        //seneryo:
        //1- https://form.jotform.com/221934510376353
        //2- ısım kutucuguna "ısmet" yazdırınız
        //3- soyad ktuucuguna "temur" yazdırınz

        //id=first_8

        WebDriver tarayıcı = new ChromeDriver();
        tarayıcı.get("https://form.jotform.com/221934510376353");
        Myfunc.Bekle(2);

        WebElement isimKutusu = tarayıcı.findElement(By.id("first_8")); // ıd sı fırst_8 olan elementı bul
        isimKutusu.sendKeys("yusuf");//web elemenete verılen yazıyı gonder.
        Myfunc.Bekle(2);

        WebElement soyIsımKutusu = tarayıcı.findElement(By.id("last_8"));
        soyIsımKutusu.sendKeys("kılıç");




        Myfunc.Bekle(5);
        tarayıcı.quit();


    }
}
