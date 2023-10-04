package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {

    By registerLinkLocator = By.linkText("REGISTER");


    public RegisterPage(WebDriver driver){
        super(driver); // Constructor que incluye la herencia
    }

    //16:12 https://www.youtube.com/watch?v=lnXpzOl19EY&list=PLWkxwEHYPPt1PU5TSvdvhMaGVcytMkjHW&index=5

}
