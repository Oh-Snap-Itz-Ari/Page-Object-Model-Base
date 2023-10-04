package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    private WebDriver driver; // Se declara el Objeto Web Driver

    public Base(WebDriver driver) {
        this.driver = driver; // Constructor de la clase
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(); // Método para conexión con el Navegador
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator); // Wrapping de elementos de Selenium que necesitamos
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(WebElement element){
        return element.getText(); // Devuelve el texto del elemento que esta pasando como parámetro
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed(); // Nos indica si el elemento esta listo para ser utilizado (True)
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false; // Si la excepción se lanza es porque el elemento no esta (False)
        }
    }

    public void visit(String URL){
        driver.get(URL); // Permite ingresar a la URL
    }

}
