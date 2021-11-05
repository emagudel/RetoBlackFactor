package com.company.certification.blackFactor.interactions;

import com.company.certification.blackFactor.model.DataTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.LABEL_CRUISE_DESTINATION;

public class SaveSearchCruises implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        DataTest.getMap()
                .put("sailFromCruise", LABEL_CRUISE_DESTINATION.resolveFor(actor).getText());

    }

    public static SaveSearchCruises saveInformationSearchCruises() {
        return new SaveSearchCruises();
    }

}
