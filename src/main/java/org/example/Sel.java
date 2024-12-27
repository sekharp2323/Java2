package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sekha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        try{
            driver.get("https://z-library.sk/");
            Thread.sleep(5000);
            WebElement logoElement=driver.findElement(By.cssSelector("img[alt='ZLibary Z-Library']"));
            String titleText=logoElement.getAttribute("title");
            System.out.println(titleText);
            System.out.println(" ");
            List<WebElement> bookElements=driver.findElements(By.cssSelector("z-cover"));

            for (WebElement bookElement : bookElements){
                String bookTile=bookElement.getAttribute("title");
                String bookAuthor=bookElement.getAttribute("author");
                System.out.println(bookTile+" "+bookAuthor);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }

    }
}
