/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testngproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
/**
 *
 * @author baur
 */
public final class DuckDuckGoPage extends Page {
    
    private @FindBy(class="js-search-input search__input--adv")
    WebElement search;
    
    private @FindBy(class="search__button  js-search-button")
    WebElement button;
    
    public DuckDuckGoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void setSearch(String strText) {
        search.sendKeys(strText);
    }
    
    public void clickSearch() {
        button.click();
    }
}
