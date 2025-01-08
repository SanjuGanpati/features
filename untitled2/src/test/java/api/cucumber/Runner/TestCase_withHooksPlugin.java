package api.cucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWithh(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/TestDemo.feature"},
        glue = {"api.cucumber.steps", "api.cucumber.hooks"},
       monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports"} , dryRun = false)
               // "json:target/report.json",
               // "junit:target/report.xml"},

public classs TestCase_withHooksPlugin {
}
