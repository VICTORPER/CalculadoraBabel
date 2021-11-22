package StepDefinitionConcatenar;

import Pages.ConcatenarPOM;
import Pages.DividirPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import stepdefinitions.Hook;

import java.util.List;

public class ConcatenarStepDefinition {


    WebDriver victor;
    Hook hook=new Hook();
    ConcatenarPOM concatenar;

    @Given("^Me encuentro en la pagina principal de la calculadora$")
    public void meEncuentroEnLaPaginaPrincipalDeLaCalculadora() throws Throwable {

        hook.setUp();
        victor= Hook.driver;
         concatenar=new ConcatenarPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();
    }

    @When("^ingreso dos numeros$")
    public void ingresoDosNumeros(DataTable dataTable) throws Throwable {

        List<String> listaDatos=dataTable.asList(String.class);
        concatenar.IngresePrimerNumero(listaDatos.get(0));
        concatenar.IngreseSegundoNumero(listaDatos.get(1));
        concatenar.SeleccionePrototipo(listaDatos.get(2));
    }

    @When("^Selecciono la operacion$")
    public void seleccionoLaOperacion(DataTable dataTable) throws Throwable {
        List<String> listaDatos=dataTable.asList(String.class);
        concatenar.SeleccionOperacion(listaDatos.get(0));
    }

    @When("^doy click en el boton calcular$")
    public void doyClickEnElBotonCalcular() throws Throwable {
        concatenar.BtnCalcular();

    }


    @Then("^Debe arrojar el resultado correcto de la resta de los dos numeros$")
    public void debeArrojarElResultadoCorrectoDeLaRestaDeLosDosNumeros() throws Throwable {
    }

}
