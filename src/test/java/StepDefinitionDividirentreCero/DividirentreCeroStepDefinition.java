package StepDefinitionDividirentreCero;

import Pages.DividirPOM;
import Pages.DividirentreCeroPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import stepdefinitions.Hook;

import java.util.List;

public class DividirentreCeroStepDefinition
{
    WebDriver victor;
    Hook hook=new Hook();
    DividirentreCeroPOM dividirentrecero;


    @Given("Me encuentro en la pagina principal de la calculadora")
    public void me_encuentro_en_la_pagina_principal_de_la_calculadora() {
        hook.setUp();
        victor= Hook.driver;
        dividirentrecero=new DividirentreCeroPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();
    }

    @When("ingreso dos numeros")
    public void ingreso_dos_numeros(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
        dividirentrecero.IngresePrimerNumero(listaDatos.get(0));
        dividirentrecero.IngreseSegundoNumero(listaDatos.get(1));
        dividirentrecero.SeleccionePrototipo(listaDatos.get(2));

    }

    @When("Selecciono la operacion")
    public void selecciono_la_operacion(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
        dividirentrecero.SeleccionOperacion(listaDatos.get(0));
    }

    @When("doy click en el boton calcular")
    public void doy_click_en_el_boton_calcular() {

        dividirentrecero.BtnCalcular();
    }

    @Then("Debe arrojar el resultado correcto de la resta de los dos numeros")
    public void debe_arrojar_el_resultado_correcto_de_la_resta_de_los_dos_numeros() {
        //assertThat(victor.findElement(linkSignOff).isDisplayed(), Matchers.is(true));
        dividirentrecero.ValidarResultado();
    }

}
