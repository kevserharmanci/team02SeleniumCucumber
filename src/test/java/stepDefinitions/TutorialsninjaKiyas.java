package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class TutorialsninjaKiyas {
    @Given("Kullanici tutorialsninja sayfasina gider")
    public void kullaniciTutorialsninjaSayfasinaGider() {
        Driver.getDriver().get("");
    }


    @And("Phones & PDAs'a tıklayınız")
    public void phonesPDAsATıklayınız() {
    }

    @And("Telefonların markalarını alınız")
    public void telefonlarınMarkalarınıAlınız() {
    }

    @And("Tüm öğeleri sepete ekleyiniz")
    public void tümÖğeleriSepeteEkleyiniz() {
    }

    @And("Sepete tıklayınız")
    public void sepeteTıklayınız() {
    }

    @And("Sepetteki isimleri alınız")
    public void sepettekiIsimleriAlınız() {
    }

    @Then("Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız")
    public void sepettekiVeSayfadakiÜrünlerinDoğruOlduğunuKarşılaştırınız() {
    }


}
