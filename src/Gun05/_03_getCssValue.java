package Gun05;

import Utlity.Myfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_getCssValue {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu =driver.findElement(By.id("inputValEnter"));
        //parametre deggerını verıyor
        System.out.println("aramaKutusu.class = " + aramaKutusu.getAttribute("class"));


        //elementı sekıllendıren degerlerı  verıyor
        System.out.println("aramaKutusu.color = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.background = " + aramaKutusu.getCssValue("background"));
        System.out.println("aramaKutusu.font-size = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.border = " + aramaKutusu.getCssValue("border"));
        System.out.println("aramaKutusu.font-family = " + aramaKutusu.getCssValue("font-family"));


        Myfunc.Bekle(4);
        driver.quit();

















    }
}
