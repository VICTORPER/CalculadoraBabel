package Calculadora.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/main/java/features/DivdirentreCeroCalculadora.feature",
        glue= ("StepDefinitionDividirentreCero"), snippets = SnippetType.CAMELCASE)
public class RunnerDividirentrecero {


}
