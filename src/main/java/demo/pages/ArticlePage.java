package demo.pages;

import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePage {
    WebDriverWait wait = new WebDriverWait(Webdriverinstance.driver, 10);
    public String getTitle(){
        WebElement titleArticle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//big//b")));
        String title = titleArticle.getText();
        return title;
    }
    public String getPokemonNumber(){

        WebElement PokemonNumber = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='roundy']//a[@title='List of Pokémon by National Pokédex number']/span")));
        String number = PokemonNumber.getText();
        return number;
    }
}
