package com.cts.RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/main/resources/Features/JpetStoreTC.feature",
			glue = "com/cts/StepDefinitions",
			monochrome = true,
			plugin = {"html:reports/","pretty"}
)

public class JpetStoreTC {

}
