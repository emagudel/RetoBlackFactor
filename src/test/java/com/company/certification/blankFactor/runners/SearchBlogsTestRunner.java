package com.company.certification.blankFactor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/history_01_search_the_Blog_for_an_article.feature",
        glue = { "com.company.certification.blankFactor.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class SearchBlogsTestRunner {}
