package StepsDefinitionOperarLetras;

import Pages.DividirentreCeroPOM;
import Pages.OperarLetraPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import stepdefinitions.Hook;

import java.util.List;

public class OperarLetraStepDefinition {

    WebDriver victor;
    Hook hook=new Hook();
    OperarLetraPOM operarLetra;

    @Given("^Me encuentro en la pagina principal$")
    public void meEncuentroEnLaPaginaPrincipal() throws Throwable {
        hook.setUp();
        victor= Hook.driver;
        operarLetra=new OperarLetraPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();

    }

    @When("^ingresa letras en los campos$")
    public void ingresaLetrasEnLosCampos(DataTable dataTable) throws Throwable {
        List<String> listaDatos=dataTable.asList(String.class);
        operarLetra.IngresePrimerNumero(listaDatos.get(0));
        operarLetra.IngreseSegundoNumero(listaDatos.get(1));
    }

    @When("^Selecciono la operacion$")
    public void seleccionoLaOperacion(DataTable dataTable) throws Throwable {
        List<String> listaDatos=dataTable.asList(String.class);
        operarLetra.SeleccionOperacion(listaDatos.get(0));
        operarLetra.BtnCalcular();
    }

    @Then("^Deberia ver el texto Number (\\d+) is not a number$")
    public void deberiaVerElTextoNumberIsNotANumber(int arg1) throws Throwable {
     operarLetra.ValidarResultado();
    }
}
