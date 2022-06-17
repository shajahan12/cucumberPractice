package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of feature file
		features = "src/test/java/FeatureFiles/TestDemoFeature.feature",
		// path of step definition file
		glue = "stepdefination",
		monochrome=true,
		plugin= {"pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports/report.html"}
		)

public class runTestDemo {
	
}
