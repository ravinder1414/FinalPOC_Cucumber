import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin ={ "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json",},
        //format = {"pretty", "html:target/cucumberReport","json:target/cucumber.json"},
        features = "src/test/resources",

        tags ={"@Smoke","@regression","@wip"}
)
public class RunCukeTest {
// This class will be empty
}

