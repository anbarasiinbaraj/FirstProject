package com.org.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\org\\Feature"
,glue="com.org.Stepdefinition"
,tags= {"@Sce29,@Sce30"})
//, dryRun=true, strict=false, monochrome=true
public class Runner {

}
