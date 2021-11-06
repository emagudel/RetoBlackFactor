package com.company.certification.blackFactor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static com.company.certification.blackFactor.model.DataTest.obtain;
import static com.company.certification.blackFactor.userinterface.SearchBlackFactorPage.PAGE_DESTINY;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class VerifyExpectedResult implements Question<Boolean> {

  public static VerifyExpectedResult inAplication() {
    return new VerifyExpectedResult();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyCurrentUrl = false;
      boolean verifyExpectedResult = false;
      WebDriver driver = getDriver();
      String currentUrl = driver.getCurrentUrl();
      String urlDestiny = obtain("currentUrl");
      String expectedData = obtain("expectedResult");
      String expectedFront = PAGE_DESTINY.resolveFor(actor).getText().trim();
      verifyCurrentUrl = currentUrl.equals(urlDestiny);
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyCurrentUrl && verifyExpectedResult;
  }

}
