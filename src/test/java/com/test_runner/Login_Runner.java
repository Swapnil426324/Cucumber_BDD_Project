package com.test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Workspace\\Cucumber_BDD\\Feature_File\\Login.feature",
                 glue="com.step_defination",
                 tags = "@RunThis",
                 dryRun = false,
                 monochrome = true,
                 plugin = "html:target/cucumber-reports/htmlReport.html"
		)
public class Login_Runner {

}
