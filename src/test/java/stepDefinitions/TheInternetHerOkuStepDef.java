package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.HerOkuTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TheInternetHerOkuStepDef {

    HerOkuTestPage herOkuTestPage = new HerOkuTestPage();

    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herOkuTestPage.addElementButton.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        ReusableMethods.waitForVisibility(herOkuTestPage.deleteButton,12);
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herOkuTestPage.deleteButton.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herOkuTestPage.deleteButton.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        Assert.assertTrue(herOkuTestPage.deleteButtonList.isEmpty());
    }
}
