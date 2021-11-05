package com.company.certification.blackFactor.tasks;


import com.company.certification.blackFactor.interactions.SelectionCityCruise;
import com.company.certification.blackFactor.interactions.SelectionSailTo;
import com.company.certification.blackFactor.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.blackFactor.interactions.SaveSearchCruises.saveInformationSearchCruises;
import static com.company.certification.blackFactor.model.DataTest.obtain;
import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.*;
import static com.company.certification.blackFactor.util.manager.Duration.durationDay;
import static com.company.certification.blackFactor.util.manager.VerifyObject.elementVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchBlogs implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.aTime(2000));
        actor.attemptsTo(
                WaitUntil.the(BUTTON_BLOG, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BUTTON_BLOG)
        );

        actor.attemptsTo(SelectionSailTo.inAplication());


        actor.attemptsTo(
                Check.whether(elementVisible(actor, POPUP_COOKIE)),
                Click.on(POPUP_COOKIE)
        );
        actor.attemptsTo(Click.on(SAIL_TO));
        actor.attemptsTo(SelectionSailTo.inAplication());
        actor.attemptsTo(
                Click.on(DURATION),
                Click.on(DURATION_DAY.of(durationDay(obtain("duration")))),
                Click.on(BUTTON_FIND_CRUISES),
                Wait.aTime(5000)
        );
        actor.attemptsTo(SelectionCityCruise.inAplication());
        actor.attemptsTo(
                WaitUntil.the(BUTTON_SAVE_CRUISE_DESTINATION, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_SAVE_CRUISE_DESTINATION)
         );
        if (elementVisible(actor,LABEL_CRUISE_DESTINATION)){
            actor.attemptsTo(saveInformationSearchCruises());
        }
        actor.attemptsTo(
                WaitUntil.the(IMAGE_CARNIVAL_HOME, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(IMAGE_CARNIVAL_HOME)
        );
    }

    public static SearchBlogs inTheAplication() {
        return instrumented(SearchBlogs.class);
    }
}
