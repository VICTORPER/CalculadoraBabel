package StepDefinitionMultiplicar;

import Pages.MultiplicarPOM;
import Pages.RestarPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import stepdefinitions.Hook;

import java.util.List;

public class MultiplicarStepDefinition {

    WebDriver victor;
    Hook hook=new Hook();
    MultiplicarPOM multiplicar;


    @Given("^Me encuentro en la pagina principal de la calculadora$")
    public void meEncuentroEnLaPaginaPrincipalDeLaCalculadora() throws Throwable {
        hook.setUp();
        victor= Hook.driver;
        multiplicar=new MultiplicarPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();
    }

    @When("^ingreso dos numeros$")
    public void ingresoDosNumeros(DataTable dataTable) throws Throwable {
        List<String> listaDatos=dataTable.asList(String.class);
        multiplicar.IngresePrimerNumero(listaDatos.get(0));
        multiplicar.IngreseSegundoNumero(listaDatos.get(1));
        multiplicar.SeleccionePrototipo(listaDatos.get(2));
    }

    @When("^Selecciono la operacion$")
    public void seleccionoLaOperacion(DataTable dataTable) throws Throwable {
        List<String> listaDatos=dataTable.asList(String.class);
        multiplicar.SeleccionOperacion(listaDatos.get(0));
    }

    @When("^doy click en el boton calcular$")
    public void doyClickEnElBotonCalcular() throws Throwable {
        multiplicar.BtnCalcular();
    }

    @Then("^Debe arrojar el resultado correcto de la resta de los dos numeros$")
    public void debeArrojarElResultadoCorrectoDeLaRestaDeLosDosNumeros() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
