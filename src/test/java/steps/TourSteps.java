package steps;

import Impl.Implementatie;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TourSteps {

    //Implementatie implementatie;
    Implementatie implementatie = new Implementatie();

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        //go to url
        implementatie.gaNaarPHP();
    }

    @And("^I click on tours$")
    public void iClickOnTours() {
        //select tours
        implementatie.clickonbuttoncss(".loader[title=\"Tours\"]");
    }

    @When("^I select the first result on the page$")
    public void iSelectTheFirstResultOnThePage() {
        //select the Spectaculars Of The Nile 3 Nights
        implementatie.clickonbuttoncss(".bgwhite > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1) > b:nth-child(1)");
    }

    @And("^click on book now$")
    public void clickOnBookNow(){
        // click booknow
        implementatie.clickonbuttoncss(".btn-action");
    }

    @Then("^I get directed to the booking form$")
    public void iGetDirectedToTheBookingForm() {
        //type first name
        implementatie.typetextcss("#guestform > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)","Henk");
        //type laste name
        implementatie.typetextcss("#guestform > div:nth-child(2) > div:nth-child(1) > input:nth-child(2)", "Koopman");
        //type email
        implementatie.typetextcss("div.col-md-6:nth-child(3) > div:nth-child(1) > input:nth-child(2)", "Henk@koopman.nl");
        //confirm email
        implementatie.typetextcss("div.col-md-6:nth-child(4) > div:nth-child(1) > input:nth-child(2)","Henk@koopman.nl");
        //type tel.nr
        implementatie.typetextcss("div.col-md-6:nth-child(6) > div:nth-child(1) > input:nth-child(2)","06123456789");
        //type adress
        implementatie.typetextcss("#guestform > div:nth-child(7) > div > input", "Ordina 22505");
        //click on dropdownmenu country
        implementatie.clickindropdownxpath("/html/body/div[8]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[8]/div/div/a/span[1]");
        //select Netherlands
        implementatie.selecteeroptie("/html/body/div[14]/div/input", "Netherlands");
        // type name
        implementatie.typetextcss(".form-horizontal > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)", "Henk");
        // type idnumber
        implementatie.typetextcss(".form-horizontal > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)", "ID11111111");
        // type age
        implementatie.typetextcss(".form-horizontal > div:nth-child(1) > div:nth-child(3) > input:nth-child(2)", "33");
        // confirm booking
        implementatie.clickonbuttoncss("#body-section > div.container > div > div > div.acc_section > div.col-md-12.offset-0.go-right > div:nth-child(2) > div.form-group > button");
        implementatie.afsluiten();
    }
}
