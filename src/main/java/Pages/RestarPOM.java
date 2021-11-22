package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RestarPOM {
    WebDriver victor;
    By txtnumber1 = By.name("number1");
    By txtnumber2 = By.name("number2");
    By SelectPrototype = By.name("selectBuild");
    By SelectOperation = By.name("selectOperation");
    By Clickcalculate = By.id("calculateButton");
    By validarResultado= By.xpath("//*[@id='numberAnswerField']");

    public RestarPOM(WebDriver victor2) {
        victor = victor2;

    }
    public void SeleccionePrototipo(String prototipo)
    {
        Select selectPrototipo = new Select(victor.findElement(SelectPrototype));
        selectPrototipo.selectByVisibleText(prototipo);
    }
    public void IngresePrimerNumero(String number1) {
        victor.findElement(txtnumber1).sendKeys(number1);
    }

    public void IngreseSegundoNumero(String number2) {
        victor.findElement(txtnumber2).sendKeys(number2);
    }

    public void SeleccionOperacion(String operation) {
        Select selectPasajeros = new Select(victor.findElement(SelectOperation));
        selectPasajeros.selectByVisibleText(operation);

    }

    public void BtnCalcular() {
        victor.findElement(Clickcalculate).click();

    }
}