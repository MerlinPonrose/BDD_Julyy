package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\neworkspace\\BDD_Cucumber_July\\src\\test\\java\\com\\bdd\\featurefile",
glue="com.bdd.stepdefinition",
plugin= {"pretty","html:target/cucumber","json:target/cucumberr.json"},
monochrome=true,//display the console out in a readable format
dryRun=true)//To check the mapping between step definition and feature file to identify missing steps
public class TestRunner {

}
