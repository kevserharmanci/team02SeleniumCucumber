package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class GuruStepDef {
    @Then("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        List<WebElement> theadList = Driver.getDriver().findElements(By.xpath("//thead/tr/th"));
        for (int i = 1; i <= theadList.size(); i++) {
            if (Driver.getDriver().findElement(By.xpath("//thead/tr/th["+i+"]")).getText().equals(istenenBaslik)){
                System.out.println(Driver.getDriver().findElement(By.xpath("//thead/tr/th["+i+"]")).getText());

                Driver.getDriver().findElements(By.xpath("//tbody/tr/td["+i+"]")).forEach(t->System.out.println(t.getText()));
            }
            System.out.println();
        }
    }
}
