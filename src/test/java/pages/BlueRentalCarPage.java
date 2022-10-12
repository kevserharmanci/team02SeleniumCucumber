package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarPage {
    public BlueRentalCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement emailAdress;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginKullaniciGiris;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;

    @FindBy(xpath = "(//*[.='invalid credentials'])[5]")
    public WebElement basarisizGiris;



}
