package com.tevolvers.co.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features="src/test/resources/features/onboarding.feature",
        glue = "com.tevolvers.co.stepsdefinition",
        snippets = CAMELCASE,
        tags = "@verCarruser"
)
public class OnboardingDxHotelsRunner {

}
