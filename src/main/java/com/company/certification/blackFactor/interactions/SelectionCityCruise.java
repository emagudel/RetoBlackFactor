package com.company.certification.blackFactor.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static com.company.certification.blackFactor.model.DataTest.obtain;
import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.CITY_CRUISE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionCityCruise implements Interaction {

    public static SelectionCityCruise inAplication() {
        return instrumented(SelectionCityCruise.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaValores = CITY_CRUISE.resolveAllFor(actor);
        String dato ="";
        for (int iterador = 0; iterador < listaValores.size(); iterador++) {
            String[] lista = listaValores.get(iterador).getText().split("\n");
            dato = lista[0].trim();
            if(dato.equalsIgnoreCase(obtain("expectedResult"))){
                actor.attemptsTo(Scroll.to(CITY_CRUISE));
                CITY_CRUISE.resolveAllFor(actor).get(iterador).click();
                break;
            }
        }
    }
}
