package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.qait.automation.getpageobjects.GetPage;

public class CartPageActions extends GetPage {

    WebDriver driver;
    private EventFiringWebDriver e_driver;

    public CartPageActions(WebDriver driver) {
        super(driver, "HomePage");
        this.driver = driver;

    }

    public void verifyCart() {
        isElementDisplayed("prodCheckoutPage");
    }

}
