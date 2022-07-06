package steps.com.autopracticesteps;

import com.autopractice.AutoPracticeMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.com.openMRS.OpenMRSHomePage;
import pages.com.openMRS.OpenMRSLoginPage;
import utils.ConfigReader;
import utils.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoPracticeSteps {
    WebDriver driver = Driver.getDriver();
    AutoPracticeMainPage autoMainPage = new AutoPracticeMainPage(driver);

    @Given("user is on contact us page")
    public void userIsOnAutoPracticePage() {
        driver.get(ConfigReader.getProperty("autoPractice"));
    }

    @When("user fills the form with given sheet name {string} and row number {int}")
    public void userFillsTheFormWithGivenSheetNameAndRowNumber(String sheetName, int rowNumber) throws IOException {
        String path = "/Users/ANMACPRO/Desktop/myExcelSheet";
        File excelFile = new File(path);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);





    }

    @And("user clicks on send button")
    public void userClicksOnSendButton() {
        autoMainPage.
    }

    @Then("user validates success message {string}")
    public void userValidatesSuccessMessage(String successMessage) {
        Assert.assertEquals("Success Message Test Failed",successMessage,autoMainPage.successMessage.getText());
    }
}


