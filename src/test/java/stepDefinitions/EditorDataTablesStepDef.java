package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorDataTablesPage;
import utilities.Driver;

public class EditorDataTablesStepDef {

    EditorDataTablesPage editorDataTablesPage = new EditorDataTablesPage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        editorDataTablesPage.endButton.click();
    }

    @And("tum bilgileri girer  {string},{string},{string},{string},{string},{string},{string}")
    public void tumBilgileriGirer(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) {
        editorDataTablesPage.firstNameTextBox.sendKeys(firstName, Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office,
                Keys.TAB,extension,Keys.TAB,startDate,Keys.TAB,salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        editorDataTablesPage.createButton.click();
    }

    @When("kullanici ilk {string} ile arama yapar")
    public void kullaniciIlkIleAramaYapar(String firstName) {
        editorDataTablesPage.seaarchTextBox.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(editorDataTablesPage.isimVarMi.getText().contains(firstName));
    }
}
