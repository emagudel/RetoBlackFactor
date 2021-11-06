package com.company.certification.blankFactor.tasks;

import com.company.certification.blankFactor.exceptions.BlankFactorException;
import com.company.certification.blankFactor.util.properties.BlankFactorProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {


    public static Performable theBlankFactorSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            String url = BlankFactorProperties.getUrlFront();
            actor.attemptsTo(Open.url(url));
        } catch (Exception e) {
            throw new BlankFactorException(e);
        }
    }
}
