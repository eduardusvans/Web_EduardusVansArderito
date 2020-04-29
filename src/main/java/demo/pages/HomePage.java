package demo.pages;

import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage {
    public void openHomePage(){
        Webdriverinstance.driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page");
    }
    public void inputSearch(String keyword){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword, Keys.ENTER);
    }
}
