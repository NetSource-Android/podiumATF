package tests.homepage;

import org.testng.annotations.Test;
import framework.core.BaseTest;
import pageobjects.homepage.podiumHomePage;

public class PodiumHomePageTest extends BaseTest {

    @Test
    public void homepageTests() {

        podiumHomePage PodiumHomepage = new podiumHomePage(getDriver());
    }
}
