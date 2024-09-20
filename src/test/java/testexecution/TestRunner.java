package testexecution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = {"org.notepad"},
        tags = "@zalantestd",
        plugin = {"pretty", "html:target/HtmlReports/report.html",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml"}

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
