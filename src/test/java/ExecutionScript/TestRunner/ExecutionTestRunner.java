package ExecutionScript.TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= "Features",
        glue={"ExecutionScript/StepDefinition"},
        plugin = {"json:target/cucumber-report/cucumber-report.json"},
        //tags={"@RegistrarInversionistaExitoso"},
        monochrome = true
)

public class ExecutionTestRunner
{

}
