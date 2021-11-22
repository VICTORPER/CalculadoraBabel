package StepDefinitionResta;

import Pages.RestarPOM;
import Pages.SumarPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import stepdefinitions.Hook;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class RestaStepDefinitions {
    WebDriver victor;
    Hook hook=new Hook();
    RestarPOM restar;


    @Given("Me encuentro en la pagina principal de la calculadora")
    public void me_encuentro_en_la_pagina_principal_de_la_calculadora() {
        hook.setUp();
        victor= Hook.driver;
        restar=new RestarPOM(victor);
        victor.get("https://testsheepnz.github.io/BasicCalculator.html");
        victor.manage().window().maximize();
    }

    @When("ingreso dos numeros")
    public void ingreso_dos_numeros(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
        restar.IngresePrimerNumero(listaDatos.get(0));
        restar.IngreseSegundoNumero(listaDatos.get(1));
        restar.SeleccionePrototipo(listaDatos.get(2));

    }

    @When("Selecciono la operacion")
    public void selecciono_la_operacion(DataTable dataTable) {
        List<String> listaDatos=dataTable.asList(String.class);
        restar.SeleccionOperacion(listaDatos.get(0));
    }

    @When("doy click en el boton calcular")
    public void doy_click_en_el_boton_calcular() {
        restar.BtnCalcular();
    }

    @Then("Debe arrojar el resultado correcto de la resta de los dos numeros")
    public void debe_arrojar_el_resultado_correcto_de_la_resta_de_los_dos_numeros() {
        //assertThat(victor.findElement(linkSignOff).isDisplayed(), Matchers.is(true));

    }


}