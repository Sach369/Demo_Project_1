package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Feature/wiki.feature",
		glue="step_Definitions",
		dryRun=false,
		plugin= {"pretty","html:test-output"}
		
		)
		


public class testRunner {

}
