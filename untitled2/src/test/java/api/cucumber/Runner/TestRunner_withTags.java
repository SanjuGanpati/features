package api.cucumber.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/api/cucumber/features/Tag.feature",
        glue = {"api.cucumber.steps", "api.cucumber.hooks"},
       // tags = "@smoke"
       // tags= "@smoke and @regression"
       // tags = ("@smoke or @regression  and @important")
       // tags = ("@regression and not @smoke")
       //tags = ("@smoke or @regression  and not @important")
        tags = ("@mustRun")
)
public class TestRunner_withTags {

}

