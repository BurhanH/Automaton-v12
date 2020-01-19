/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testngproject1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/**
 *
 * @author baur
 */
public class TestDuckDuckGo {
    
    private WebDriver driver;
    
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1366, 768));
    }
    
    @AfterTest
    public void tearDown() {
        if (driver != null)
            driver.close();
    }
    
    @Test
    public void testDuckDuckGo() {
        driver.get("https://www.duckduckgo.com");
        
        DuckDuckGoPage searchPage = new DuckDuckGoPage(driver);
        searchPage.setSearch("DuckDuckGo");
        searchPage.Search();
        
        DuckDuckGoResultPage resultPage = new DuckDuckGoResultPage(driver);
        
        Assert.assertFalse(resultPage.getResults().isEmpty());
    }
}
