package com.mycompany.testngproject1;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baur
 */
public class DuckDuckGoResultPage extends Page {
    
    @FindBy(css=".result__title")
    List<WebElement> results;
    
    public DuckDuckGoResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public List<WebElement> getResults() {
        return results;
    }
}
