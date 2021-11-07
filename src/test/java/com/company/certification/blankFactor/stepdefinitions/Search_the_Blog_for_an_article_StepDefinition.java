package com.company.certification.blankFactor.stepdefinitions;

import com.company.certification.blankFactor.exceptions.ExpectedResultErr;
import com.company.certification.blankFactor.questions.VerifyExpectedResult;
import com.company.certification.blankFactor.questions.VerifyExpectedResultAlternate;
import com.company.certification.blankFactor.tasks.ClearFiles;
import com.company.certification.blankFactor.tasks.SearchAllTitles;
import com.company.certification.blankFactor.tasks.SearchBlogs;
import com.company.certification.blankFactor.tasks.Subscribe;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.company.certification.blankFactor.exceptions.ExpectedResultErr.EXPECTED_RESULT;
import static com.company.certification.blankFactor.tasks.LoadData.loadDataTestWithTheFollowing;
import static com.company.certification.blankFactor.tasks.OpenBrowser.theBlankFactorSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Search_the_Blog_for_an_article_StepDefinition {

    @Before(order = 1)
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 2)
    public void clearFiles() {
        Actor customer = Actor.named("customerName");
        customer.attemptsTo(ClearFiles.inTheAplication());
    }

    @Given("^(.*) visit the page Blankfactor$")
    public void i_visit_the_page_blankfactor(String actorName) {
        theActorCalled(actorName).wasAbleTo(theBlankFactorSite());
    }


    @When("^(.*) search in the Blog an article with this information$")
    public void i_search_in_the_Blog_an_article_with_this_information(String actorName, List<Map<String, Object>> information) {
        theActorCalled(actorName).wasAbleTo(loadDataTestWithTheFollowing(information));
        theActorInTheSpotlight().attemptsTo(SearchBlogs.inTheAplication());
    }

    @When("^I search in the Blog the articles$")
    public void i_search_in_the_Blog_the_articles() {
        theActorInTheSpotlight().attemptsTo(SearchAllTitles.inTheAplication());
    }


    @Then("^I verify the information required for the successful case$")
    public void i_verify_the_required_information() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResult.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

    @Then("^I verify the information required for the alternate case$")
    public void i_verify_the_required_information_alternate() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResultAlternate.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

    @And("^I Subscribe to our newsletter$")
    public void i_Subscribe_to_our_newsletter() {
        theActorInTheSpotlight().attemptsTo(Subscribe.inTheAplication());
    }

}
