package gun04;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    // By.Name()
    // Senaryo: (locator olarak name kullanılacak)
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna "ismet" yazdırınız
    // 3-  soyad kutucuğuna "temur" yazdırınız

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement ad=driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("ismet");

        WebElement soyad=driver.findElement(By.name("q8_name[last]"));
        soyad.sendKeys("temur");


        WebElement btnSubmit=driver.findElement(By.id("input_2"));
        btnSubmit.click();

        Myfunc.Bekle(10);
        driver.quit();

    }














}
