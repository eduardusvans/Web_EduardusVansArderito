package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BulbapediaStepsDefinition {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    @Given("User open bulbapedia homepage")
    public void userOpenBulbapediaHomepage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on hompage")
    public void userInputSearchOnHompage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String title) {
        String actual = articlePage.getTitle();
        Assert.assertEquals(title, actual);
    }
}
