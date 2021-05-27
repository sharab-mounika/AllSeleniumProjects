package cucumberOptionsPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)	
@CucumberOptions(						// we have to give mapping to feature file and stepdefinition to trigger and execute the test here we are using cucumberoptions to map them
		features="src/test/java/FeaturePackge",  // to run all feature files just give path till package and if you want to run any specific feature file give that file name also in location
		glue="StepDefinitionPackage")      	// just give stepdefintion package name in glue. feature file package and step definition package must be under same parent i.e src/test/java
	
public class TestRunner extends AbstractTestNGCucumberTests {

}