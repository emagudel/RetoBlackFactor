package com.company.certification.blankFactor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.company.certification.blankFactor.model.DataTest.obtain;

public class VerifyExpectedResultAlternate implements Question<Boolean> {

  public static VerifyExpectedResultAlternate inAplication() {
    return new VerifyExpectedResultAlternate();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyCurrentUrl = false;
      boolean verifyExpectedResult = false;
      String currentUrl = "";
      String urlDestiny = obtain("currentUrl");
      String expectedData = obtain("expectedResult");
      String expectedFront = "";
      verifyCurrentUrl = currentUrl.equals(urlDestiny);
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyCurrentUrl && verifyExpectedResult;
  }

}
