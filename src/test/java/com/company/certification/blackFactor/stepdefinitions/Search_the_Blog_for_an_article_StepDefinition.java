package com.company.certification.blackFactor.stepdefinitions;

import com.company.certification.blackFactor.exceptions.ExpectedResultErr;
import com.company.certification.blackFactor.questions.VerifyExpectedResult;
import com.company.certification.blackFactor.tasks.SearchBlogs;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.company.certification.blackFactor.exceptions.ExpectedResultErr.EXPECTED_RESULT;
import static com.company.certification.blackFactor.tasks.LoadData.loadDataTestWithTheFollowing;
import static com.company.certification.blackFactor.tasks.OpenBrowser.theBlackFactorSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Search_the_Blog_for_an_article_StepDefinition {

    @Before(order = 1)
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) visit the page Blankfactor$")
    public void i_visit_the_page_carnival(String actorName) {
        theActorCalled(actorName).wasAbleTo(theBlackFactorSite());
    }


    @When("^(.*) search in the Blog an article with this information$")
    public void i_look_for_cruises_with_this_information(String actorName, List<Map<String, Object>> information) {
        theActorCalled(actorName).wasAbleTo(loadDataTestWithTheFollowing(information));
        theActorInTheSpotlight().attemptsTo(SearchBlogs.inTheAplication());
    }

 /*
    @Then("^I see the availability of the cruises$")
    public void i_see_the_availability_of_the_cruises() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResult.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }
*/
}
