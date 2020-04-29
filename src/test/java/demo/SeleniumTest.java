package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.webdriver.Webdriverinstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    @Before
    public void before(){
        Webdriverinstance.initialize();
    }
    @After
    public void after(){
        Webdriverinstance.quit();
    }
    private void searchBulba(String keyword, String expected){
        homePage.openHomePage();
        homePage.inputSearch(keyword);
        String title = articlePage.getTitle();
        Assert.assertEquals(expected,title);
    }
    @Test
    public void searching1() {
        searchBulba("Pikachu", "Pikachu");
    }
    @Test
    public void searching2() {
        searchBulba("Bulbasaur", "Bulbasaur");
    }
    @Test
    public void searching3() {
        searchBulba("Raichu", "Raichu");
    }
}
