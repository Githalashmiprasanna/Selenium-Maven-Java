package test;

import java.util.HashMap;
import org.junit.runner.RunWith;
import courgette.api.CourgetteAfterAll;
import courgette.api.CourgetteBeforeAll;
import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;

@RunWith(Courgette.class)
@CourgetteOptions(threads = 3, 
runLevel = CourgetteRunLevel.SCENARIO,
rerunFailedScenarios = false,
showTestOutput = true, 
reportTitle = " Automation Report", 
reportTargetDir = "target", 
cucumberOptions = @CucumberOptions(features = "./src/main/resources/features", 
glue = ".",
tags = {
		"@tag" },

		plugin = { "pretty", "json:target/cucumber-report/results.json", "html:target/cucumber-report/cucumber.html",
				"junit:target/cucumber-report/cucumber.xml" }))

public class LocalTestRunner2 {

	public static HashMap<String, String> dBUtilDetails = new HashMap<String, String>();

	@CourgetteBeforeAll
	public static void setUp() throws Exception {

	}

	@CourgetteAfterAll
	public static void tearDown() {

	}
}
