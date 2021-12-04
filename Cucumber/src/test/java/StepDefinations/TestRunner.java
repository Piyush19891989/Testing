package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepDefinations"} ,
monochrome=true ,
//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = {"pretty","json:target/JUNITReports/report.xml"},
plugin = {"pretty","json:target/JUNITReports/report.xml",
		"json:target/JSONReports/Test.json",
		"html:target/HTMLReports/Test.html"}

// tags="@smoketest"
)
public class TestRunner {

}
