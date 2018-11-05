import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"chai"},
        plugin = {"ru.yandex.qatools.allure.cucumberjvm.AllureReporter"}
        //snippets = SnippetType.CAMELCASE
        //,format = {"pretty", "html:output"}
)

public class RunnerTest {

}