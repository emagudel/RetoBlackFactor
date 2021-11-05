package com.company.certification.blackFactor.tasks;

import com.company.certification.blackFactor.exceptions.BlackFactorException;
import com.company.certification.blackFactor.util.properties.BlackFactorProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {


    public static Performable theBlackFactorSite() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            String url = BlackFactorProperties.getUrlFront();
            actor.attemptsTo(Open.url(url));
        } catch (Exception e) {
            throw new BlackFactorException(e);
        }
    }
}
