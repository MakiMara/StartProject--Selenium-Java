package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld
{
     public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver", "/Users/marijanavukovic/Desktop/jAVAaUTOMATION/chromedriver 3");
         WebDriver driver=new ChromeDriver();
         driver.get("http://www.google.com");
         driver.quit();
    }
}
