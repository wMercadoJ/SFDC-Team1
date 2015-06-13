package com.salesforce.dev.pages.Opportunities;

import com.salesforce.dev.framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Jimmy Vargas on 6/10/2015.
 */
public class OpportunityDetails {

    WebDriver driver;
    WebDriverWait wait;

    public OpportunityDetails(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getInstance().getWait();
    }
}