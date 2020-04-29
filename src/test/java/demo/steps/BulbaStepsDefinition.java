package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BulbaStepsDefinition {
    private HomePage homePage = new HomePage();
    private ArticlePage articlePage = new ArticlePage();

    @Given("User open bulbapedia homepage")
    public void userOpenBulbapediaHomepage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on hompage")
    public void userInputSearchOnHompage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @Then("User see article with title {string} and Number {string} on article page")
    public void userSeeArticleWithTitleAndNumberOnArticlePage(String title, String number) throws InterruptedException {
        Assert.assertEquals(title, articlePage.getTitle());
        Assert.assertEquals(number, articlePage.getPokemonNumber());
    }
}
