package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablesPage {


    public EditorDataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.='New'])[1]")
    public WebElement endButton;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement seaarchTextBox;

    @FindBy(xpath = "(//*[@class='sorting_1'])[1]")
    public WebElement isimVarMi;









}
