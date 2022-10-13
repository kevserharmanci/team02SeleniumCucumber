package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuTestPage {
    public HerOkuTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='onblur']")
    public WebElement onBlurButton;

    @FindBy(xpath = "//*[@id='onclick']")
    public WebElement onClickButton;

    @FindBy(xpath = "//*[@id='oncontextmenu']")
    public WebElement onContextButton;

    @FindBy(xpath = "//*[@id='ondoubleclick']")
    public WebElement onDoubleButton;

    @FindBy(xpath = "//*[@id='onfocus']")
    public WebElement onFocusButton;

    @FindBy(xpath = "//*[@id='onkeydown']")
    public WebElement onKeyDownButton;

    @FindBy(xpath = "//*[@id='onkeyup']")
    public WebElement onKeyUpButton;

    @FindBy(xpath = "//*[@id='onkeypress']")
    public WebElement onKeyPressButton;

    @FindBy(xpath = "//*[@id='onmouseover']")
    public WebElement onMouseOverButton;

    @FindBy(xpath = "//*[@id='onmouseleave']")
    public WebElement onMouseLeaveButton;

    @FindBy(xpath = "//*[@id='onmousedown']")
    public WebElement onMouseDownButton;

    @FindBy(xpath = "//*[@onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@onclick='deleteElement()']")
    public List<WebElement> deleteButtonList;





}
