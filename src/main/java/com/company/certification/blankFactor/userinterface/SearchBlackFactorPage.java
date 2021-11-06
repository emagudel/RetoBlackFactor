package com.company.certification.blankFactor.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.blankFactor.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class SearchBlackFactorPage {

    public static final Target BUTTON_BLOG = Target.the("Button Blog").located(By.id("menu-item-3960"));
    public static final Target SELECTION_ITEM = Target.the("Selection Item").located(By.className("page-item"));
    public static final Target TOPIC = Target.the("Topic").locatedBy("//*[text()='{0}']");
    public static final Target AUTHOR = Target.the("Author").locatedBy("//*[text()=' {0} ']");
    public static final Target PAGE_DESTINY = Target.the("Page Destiny").located(By.xpath("//*[@id='post_content']/h2[3]"));
    public static final Target ALL_TITLES = Target.the("All titles").located(By.xpath("//h2[@class='heading-4 post-title']"));
    public static final Target ALL_TITLES_LINK = Target.the("All titles link").located(By.xpath("//h2[@class='heading-4 post-title']/a"));



    private SearchBlackFactorPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}