package com.company.certification.blankFactor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static com.company.certification.blankFactor.model.DataTest.obtain;
import static com.company.certification.blankFactor.userinterface.SearchBlackFactorPage.TOPIC;
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
      String expectedFront = TOPIC.of(obtain("expectedResult")).resolveFor(actor).getText().trim();

      verifyCurrentUrl = currentUrl.equals(urlDestiny);
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyCurrentUrl && verifyExpectedResult;
  }

}
