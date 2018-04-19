package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
import static org.junit.Assert.assertEquals;
import Impl.Implementatie;
import java.io.File;
import Impl.Implementatie;
import Impl.BrowserHelper;

public class ExampleSteps {

    //Implementatie implementatie;
    Implementatie implementatie = new Implementatie();

    @Given("^I am on the homepage and click on cars$")
    public void iAmOnTheHomepageAndClickOnCars() {
        //implementatie = new Implementatie();
        implementatie.gaNaarPHP();
        implementatie.clickonbutton("//*[@id=\"body-section\"]/div[1]/div/div/div[1]/div/ul/li[4]/a");
    }

    @When("^i choose all the required details$")
    public void iChooseAllTheRequiredDetails() {
        implementatie.checkiftrue("#s2id_autogen6");
        implementatie.clickonbutton("//*[@id=\"s2id_autogen6\"]/a");
        implementatie.typetext("//*[@id=\"select2-drop\"]/div/input","Amsterdam");
        //click downtown from dropdown
        implementatie.clickindropdown("#select2-drop > ul > li:nth-child(2)");
        //click on pickupdate
        implementatie.clickindropdown("#CARTRAWLER > form > div:nth-child(2) > div > input");
        //click on 1 may
        implementatie.clickindropdown("body > div:nth-child(25) > div.datepicker-days > table > tbody > tr:nth-child(4) > td:nth-child(7)");
        //click on time button
        implementatie.clickindropdown("#CARTRAWLER > form > div:nth-child(3) > div > select");
        //click on time of choice
        implementatie.clickindropdown("#CARTRAWLER > form > div:nth-child(3) > div > select > option:nth-child(17)");
        //click on drop off button
        implementatie.clickindropdown("#s2id_autogen8 > a:nth-child(1) > span:nth-child(1)");
        //type in keyword
        implementatie.typetextcss("#select2-drop > div:nth-child(1) > input:nth-child(1)","Amsterdam");
        //click on zuidoost
        implementatie.clickindropdown("#select2-drop > ul > li:nth-child(6)");

    }

    @Then("^I should be able to view details and search result$")
    public void iShouldBeAbleToViewDetailsAndSearchResult() {
        //click on search button by css selector
        implementatie.clickonbuttoncss("input.btn");
    }
}
