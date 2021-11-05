package com.company.certification.blackFactor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features={
                "src/test/resources/features"
        },
        glue = { "com.carnival.certification.automation.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class GeneralTestRunner {}