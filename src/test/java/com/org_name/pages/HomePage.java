package com.org_name.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private By enterText = By.xpath("//input[@name='enter-name']");

    public void setEnterText(String name)
    {
        setText(enterText,"Dinesh");

    }

    public String getAppTitle()
    {
        return getTitle();
    }
}
