package com.company.certification.blackFactor.tasks;


import com.company.certification.blackFactor.interactions.SelectionAllTitles;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.BUTTON_BLOG;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchAllTitles implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_BLOG, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_BLOG)
        );
        actor.attemptsTo(SelectionAllTitles.inAplication());
    }

    public static SearchAllTitles inTheAplication() {
        return instrumented(SearchAllTitles.class);
    }
}
