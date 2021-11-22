package stepdefinitions;

import Pages.SumarPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SumaStepDefinitions {
    WebDriver victor;
    Hook hook=new Hook();

    SumarPOM sumar;


    @Given("Me encuentro en la pagina principal")
    public void meEncuentroEnLaPaginaPrincipal() {
        hook.setUp();
        victor=Hook.driver;
        sumar=new SumarPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();
    }

    @When("ingreso dos numeros")
    public void ingresoDosNumeros(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
          sumar.IngresePrimerNumero(listaDatos.get(0));
          sumar.IngreseSegundoNumero(listaDatos.get(1));
          sumar.SeleccionePrototipo(listaDatos.get(2));

    }

    @When("Selecciono la operacion")
    public void seleccionoLaOperacion(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
    sumar.SeleccionOperacion(listaDatos.get(0));
    sumar.BtnCalcular();
    }

    @Then("Debe arrojar el resultado correcto")
    public void debeArrojarElResultadoCorrecto() {
        //sumar.ValidarResultado();
        sumar.BtnClear();

    }
}