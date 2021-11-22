package Calculadora.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/main/java/features/RestarCalculadora.feature",
        glue= ("StepDefinitionResta"), snippets = SnippetType.CAMELCASE)
public class RunnerResta {


}
