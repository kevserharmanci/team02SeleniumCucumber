package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearc {
    AmazonPage amazonPage = new AmazonPage();
    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici searchbox a nutella yazar ve enter a basar")
    public void kullaniciSearchboxANutellaYazarVeEnterABasar() {
        try {
            amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @And("kullanici gelen sonuc textinin nutella aicerip icermedigini kontrol eder")
    public void kullaniciGelenSonucTextininNutellaAiceripIcermediginiKontrolEder() {
        assert amazonPage.aramaSonucWebElementi.getText().contains("nutella");

    }

    @Then("kullanici browser i kapatir")
    public void kullaniciBrowserIKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici searchbox a java yazar ve enter a basar")
    public void kullaniciSearchboxAJavaYazarVeEnterABasar() {
        try {
            amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @And("kullanici gelen sonuc textinin java icerip icermedigini kontrol eder")
    public void kullaniciGelenSonucTextininJavaIceripIcermediginiKontrolEder() {
        assert amazonPage.aramaSonucWebElementi.getText().contains("java");
    }

    @Then("kullanici searchbox a Selenium yazar ve enter a basar")
    public void kullaniciSearchboxASeleniumYazarVeEnterABasar() {
        try {
            amazonPage.aramaKutusu.sendKeys("Selenium"+ Keys.ENTER);
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
        }
    }

    @And("kullanici gelen sonuc textinin Selenium icerip icermedigini kontrol eder")
    public void kullaniciGelenSonucTextininSeleniumIceripIcermediginiKontrolEder() {
        assert amazonPage.aramaSonucWebElementi.getText().contains("Selenium");
    }


    @Then("Kulanici {string} icin arama yapar")
    public void kulaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);

    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        assert amazonPage.aramaSonucWebElementi.getText().contains(istenenKelime);
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int bekle) {
        try {
            Thread.sleep(bekle*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assert actualUrl.contains(istenenUrl);

    }


    @Given("Kullanici {string} sayfasina giderr")
    public void kullaniciSayfasinaGiderr(String ara) {
        Driver.getDriver().get(ara);
    }

}
