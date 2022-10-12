package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmycPage {

    public HmycPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement hesaplaGirisLogin;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement wrongPasswordMessage;

    @FindBy(xpath = "//*[@id='menuHotels']")
    public WebElement hotelManagementMenu;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[@class='fa fa-plus']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement selectUserBox;
    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationSuccessfullyMessage;

    @FindBy(xpath = "//*[@data-bb-handler='ok']")
    public WebElement SuccessfullyMessageOkButton;










}
