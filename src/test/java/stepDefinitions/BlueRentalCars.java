package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BlueRentalCarPage;
import utilities.Driver;

public class BlueRentalCars {

    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentalCarPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentalCarPage.emailAdress.sendKeys("sjhfh@gmffl.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentalCarPage.password.sendKeys("fkfj1254");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentalCarPage.loginKullaniciGiris.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        assert blueRentalCarPage.basarisizGiris.isDisplayed();
    }


    @And("gecersiz {string} girer")
    public void gecersizGirer(String gecersizUser) {
        blueRentalCarPage.emailAdress.sendKeys(gecersizUser);
    }

    @And("gecersiz {string} girilir")
    public void gecersizGirilir(String gecersizPassword) {
        blueRentalCarPage.password.sendKeys(gecersizPassword);
    }
}
