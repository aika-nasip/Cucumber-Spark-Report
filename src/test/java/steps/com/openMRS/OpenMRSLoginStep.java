package steps.com.openMRS;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.com.openMRS.OpenMRSHomePage;
import pages.com.openMRS.OpenMRSLoginPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;

public class OpenMRSLoginStep {
    WebDriver driver = Driver.getDriver();
    OpenMRSLoginPage loginPage = new OpenMRSLoginPage(driver);
    OpenMRSHomePage homePage = new OpenMRSHomePage(driver);


    @Given("user is on OpenMrs login page")
    public void userIsOnOpenMrsLoginPage() {
        driver.get(ConfigReader.getProperty("openMrsUrl"));
    }

    @When("user logs in with valid cred")
    public void userLogsInWithValidCred(DataTable credentials){
        String username = credentials.asList().get(0);
        String password = credentials.asList().get(1);
        loginPage.logIn(username,password);
    }

    @Then("user validates logged in user is {string}")
    public void userValidatesLoggedInUserIs(String expectedUserName) {
        homePage.userIcon.click();
        Assert.assertEquals("Logged in User Name Test Failed", expectedUserName,homePage.loggedInUser.getText());



    }
}
