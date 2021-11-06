package com.company.certification.blankFactor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features={
                "src/test/resources/features"
        },
        glue = { "com.company.certification.blankFactor.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class GeneralTestRunner {}
