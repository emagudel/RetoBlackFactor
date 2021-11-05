package com.company.certification.blackFactor.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.company.certification.blackFactor.model.DataTest.obtain;
import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.*;
import static com.company.certification.blackFactor.util.manager.VerifyObject.elementVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionSailTo implements Interaction {

    public static SelectionSailTo inAplication() {
        return instrumented(SelectionSailTo.class);
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
                //actor.attemptsTo(Scroll.to(SELECTION_ITEM));
                SELECTION_ITEM.resolveAllFor(actor).get(iterador+1).click();
                actor.attemptsTo(Wait.aTime(2000));
            }
        }
    }
}
