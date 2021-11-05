package com.company.certification.blackFactor.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.blackFactor.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class SearchBlackFactorPage {

    public static final Target BUTTON_BLOG = Target.the("Button Blog").located(By.id("menu-item-3960"));
    public static final Target SELECTION_ITEM = Target.the("Selection Item").located(By.className("page-item"));
    public static final Target TOPIC = Target.the("Topic").locatedBy("//*[text()='{0}']");
    public static final Target AUTHOR = Target.the("Author").locatedBy("//*[text()=' {0} ']");


    public static final Target POPUP_COOKIE = Target.the("Button Cookie").located(By.xpath("//*[@id='cookie-consent-btn']"));
    public static final Target POPUP_HOME = Target.the("Popup home").located(By.xpath("//*[@id='MainBody']"));
    public static final Target SAIL_TO = Target.the("Sail to").located(By.id("cdc-destinations"));
    public static final Target SAIL_FROM = Target.the("Sail from").located(By.id("cdc-ports"));
    public static final Target DATES = Target.the("Dates").located(By.id("cdc-dates"));
    public static final Target DURATION = Target.the("Duration").located(By.id("cdc-durations"));
    public static final Target SELECTION_SAIL_TO = Target.the("Selection Bahamas").located(By.xpath("//*[@class='cdc-filter-5-cols-layout ng-scope']//button"));
    public static final Target BUTTON_FIND_CRUISES = Target.the("Button find").located(By.xpath("//*[@class='cdc-filters-search-cta']"));
    public static final Target DURATION_DAY = Target.the("Duration day").locatedBy("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ul/li[{0}]/button");
    public static final Target PRICE_FILTER = Target.the("Price filter").located(By.xpath("//span[contains(text(),'Pricing')]"));
    public static final Target BARRA_PRICE_MINIMO = Target.the("Barra minimo").located(By.xpath("//*[@id='sfc-xfilters']/ccl-cruise-search-bar-xfilters-pricing/div/div/div/div[2]/div/div/div/span[3]"));
    public static final Target BARRA_PRICE_MAXIMO = Target.the("Barra maximo").located(By.xpath("//*[@id='sfc-xfilters']/ccl-cruise-search-bar-xfilters-pricing/div/div/div/div[2]/div/div/div/span[4]"));
    public static final Target CRUISE_BAHAMAS_JACKSONVILLE = Target.the("Cruise destination").located(By.xpath("//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[7]/ccl-view-result-grid-item/div"));
    public static final Target CRUISE_BAHAMAS_JACKSONVILLE_TWO = Target.the("Cruise destination").located(By.xpath("//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-list/article[7]/ccl-view-result-list-item/div/div/a"));
    public static final Target CITY_CRUISE = Target.the("City cruise").locatedBy("//*[@class='cgc-cruise-glance__title']");
    public static final Target LABEL_CRUISE_DESTINATION = Target.the("Label cruise destination").located(By.xpath(("//*[@id='cruiseDescrGlance']")));
    public static final Target BUTTON_SAVE_CRUISE_DESTINATION = Target.the("Button save cruise destination").located(By.xpath(("//*[@class='component component-save-button save-cta ng-scope']")));
    public static final Target BUTTON_SAVE_HOME = Target.the("Button save home").located(By.xpath(("//*[@class='cgh-ribbon__content']")));
    public static final Target IMAGE_CARNIVAL_HOME = Target.the("Imagen carnival home").located(By.xpath("//*[@id='sm-logo']/img"));
    public static final Target BUTTON_LOGIN = Target.the("Button login").located(By.xpath(("//*[@id='cclr-global-header-root']/div/header/div[2]/nav[2]/div[2]/ul[2]/li[1]/div/div[3]/a")));
    public static final Target TXT_USER = Target.the("Campo usuario").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("Campo password").located(By.id("password"));
    public static final Target BUTTON_LOGIN_HOME = Target.the("Button login").located(By.xpath("//*[@id='MainBody']/div[12]/div/div/div/div[2]/div/div[1]/section/section/form/div[6]/button"));

    private SearchBlackFactorPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}