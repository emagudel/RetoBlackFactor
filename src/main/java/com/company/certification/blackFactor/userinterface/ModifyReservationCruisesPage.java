package com.company.certification.blackFactor.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.blackFactor.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class ModifyReservationCruisesPage {

    public static final Target RESERVATION_NOW = Target.the("Reservation now").located(By.xpath("//*[@id='ccl-mainContainer']/div[1]/div/div/div/div/div/booking-button/div/span/span/span[2]/span[1]/span[2]"));
    public static final Target NUMBER_OF_GUESTS = Target.the("Number of guest").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div/div[1]/section/div[2]/div[1]/div"));
    public static final Target BUTTON_MIN_GUESTS = Target.the("Button minimo guest").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div/div[1]/section/div[2]/div[1]/button[1]"));
    public static final Target BUTTON_MAX_GUESTS = Target.the("Button maximo guest").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div/div[1]/section/div[2]/div[1]/button[2]"));
    public static final Target BUTTON_CONTINUE= Target.the("Button continue").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div/div[2]/button"));
    public static final Target TXT_CONTRY = Target.the("Campo Contry").located(By.xpath("//*[@class='be-qualifiers-cabin__section-input']"));
    public static final Target CHECK_YEAR_OLD = Target.the("Check year old").located(By.xpath("//*[@id='seniorCheckbox0']"));
    public static final Target BUTTON_CONTINUE_MODIFITY_RESERVATION= Target.the("Button continue modifity").located(By.xpath("//*[@class='be-btn be-qualifiers-pnl-btn be-btn be-btn--primary']"));
    public static final Target TYPE_ROOM_SELECTION = Target.the("Type room selection").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div[2]/button"));
    public static final Target TYPE_ROOM_PRICE = Target.the("Type room").located(By.xpath("//*[@class='be-metas-p-room-type-price-button__price']"));
    public static final Target BUTTON_TYPE_INTERIOR= Target.the("Button Type Interior").locatedBy("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div[{0}]/button");
    public static final Target BUTTON_SELECTION_INTERIOR= Target.the("Button selection interior").located(By.xpath("//*[@class='be-btn be-btn--primary be-meta-upgrade-room-type__price-button']"));
    public static final Target BUTTON_MORE_OPTIONS= Target.the("More options").located(By.xpath("//*[@class='be-btn-plain be-rate-p__container-more-options-button']"));
    public static final Target SELECTION_APRIL_PB4= Target.the("Selection April PB4").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div[4]/div[2]/div[3]/button"));
    public static final Target SELECTION_APRIL_PB4_TWO= Target.the("Selection April PB4 Two").located(By.xpath("//*[@id='shell-wrapper']/div/div/div/div[1]/div/div/div[4]/div[1]/div[4]/button"));
    public static final Target BUTTON_CONTINUE_SECTION= Target.the("Button continue section").located(By.xpath("//*[@class='be-btn be-loc-p__btn be-btn--primary']"));
    public static final Target BUTTON_SELECTION_DECK= Target.the("Button selection deck").located(By.xpath("//*[@class='be-btn be-btn--primary be-btn be-decks-p__cell--continue-btn be-btn--primary']"));
    public static final Target BUTTON_CONTINUE_CHOOSE_ROOM= Target.the("Button continue choose room").located(By.xpath("//*[@class='be-btn be-btn--primary be-rooms-p__continue-button']"));

    private ModifyReservationCruisesPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}