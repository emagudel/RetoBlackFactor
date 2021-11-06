package com.company.certification.blankFactor.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.company.certification.blankFactor.model.DataTest.obtain;
import static com.company.certification.blankFactor.userinterface.SearchBlackFactorPage.*;
import static com.company.certification.blankFactor.util.manager.VerifyObject.elementVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionTopic implements Interaction {

    public static SelectionTopic inAplication() {
        return instrumented(SelectionTopic.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaValores = SELECTION_ITEM.resolveAllFor(actor);
        for (int iterador = 0; iterador < listaValores.size()-1; iterador++) {
            if (elementVisible(actor,TOPIC.of(obtain("topic"))) &&
                    elementVisible(actor,AUTHOR.of(obtain("written_by"))) ){
                TOPIC.of(obtain("topic")).resolveFor(actor).click();
                break;
            }else{
                SELECTION_ITEM.resolveAllFor(actor).get(iterador+1).click();
                actor.attemptsTo(Wait.aTime(2000));
            }
        }
    }
}
