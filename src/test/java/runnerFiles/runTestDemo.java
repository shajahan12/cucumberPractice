package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "src/test/java/FeatureFiles/TestDemoFeature.feature",
		// path of step definition file
		glue = "stepdefination")

public class runTestDemo {
	
}
