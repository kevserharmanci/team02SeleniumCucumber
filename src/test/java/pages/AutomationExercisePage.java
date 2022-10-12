package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement AllProductsVisibility;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProductButton;

    @FindBy(linkText = "View Product")
    public WebElement viewProductButton;









}
