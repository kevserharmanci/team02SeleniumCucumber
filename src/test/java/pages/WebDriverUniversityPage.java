package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebDriverUniversityPage {
    public WebDriverUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@type='text']")
    public WebElement addNewTodoTextBox;

    @FindBy(xpath = "//li")
    public List<WebElement> allTodoText;

    @FindBy(xpath = "//i")
    public List<WebElement> deleteAllTodoText;



}
