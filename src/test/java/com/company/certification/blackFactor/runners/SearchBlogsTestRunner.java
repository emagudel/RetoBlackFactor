package com.company.certification.blackFactor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/history_01_search_the_Blog_for_an_article.feature",
        glue = { "com.company.certification.blackFactor.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class SearchBlogsTestRunner {}
