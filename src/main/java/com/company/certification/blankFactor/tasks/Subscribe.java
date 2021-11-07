package com.company.certification.blankFactor.tasks;


import com.company.certification.blankFactor.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.blankFactor.model.DataTest.obtain;
import static com.company.certification.blankFactor.userinterface.SearchBlackFactorPage.BUTTON_SUBSCRIBE;
import static com.company.certification.blankFactor.userinterface.SearchBlackFactorPage.EMAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Subscribe implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(EMAIL, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(EMAIL),
                Enter.theValue(obtain("email").trim()).into(EMAIL),
                Click.on(BUTTON_SUBSCRIBE)
        );
        actor.attemptsTo(Wait.aTime(5000));
    }

    public static Subscribe inTheAplication() {
        return instrumented(Subscribe.class);
    }
}
