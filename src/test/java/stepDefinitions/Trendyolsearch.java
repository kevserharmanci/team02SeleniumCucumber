package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.Driver;

public class Trendyolsearch {
    @Given("Google'a gidiniz")
    public void googleAGidiniz() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @Then("trendyol'u aratınız")
    public void trendyolUAratınız() {
        Driver.getDriver().findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("trendyol", Keys.ENTER);
    }
    String trenyolHandle;
    @And("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() {
        Driver.getDriver().findElement(By.xpath("//*[text()=\"Trendyol.com - Alışveriş - Aradığın Ürünler Trendyol'da\"]")).click();
        trenyolHandle=Driver.getDriver().getWindowHandle();
    }
    @And("makas aratınız")
    public void makasAratınız() {
        Driver.getDriver().findElement(By.xpath("//*[@class='vQI670rJ']")).sendKeys("makas", Keys.ENTER);
    }
    int resultIntTrendyol;
    @And("toplam ürün sayısını alınız")
    public void toplamÜrünSayısınıAlınız() {
        WebElement serchResultYazisi=Driver.getDriver().findElement(By.xpath("//*[@class='dscrptn']"));
        String resultString=serchResultYazisi.getText().split(" ")[3];
        resultIntTrendyol=Integer.parseInt(resultString);
    }
    int resultIntMorhipo;
    @Then("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() throws InterruptedException {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        Driver.getDriver().get("https://www.morhipo.com/");
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();
    }

    @And("makasi aratınız")
    public void makasiAratınız() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@id='pw-search-input']")).sendKeys("makas",Keys.ENTER);
        Thread.sleep(3000);

    }
    @And("toplam ürün sayısın alınız")
    public void toplamÜrünSayısınAlınız() {
        String resultString2=Driver.getDriver().findElement(By.xpath("//*[@class='bigger']")).getText();
        resultIntMorhipo=Integer.parseInt(resultString2);
    }
    String result;
    @Then("iki sitedeki topla makas sayısını karşılaştırınız")
    public void ikiSitedekiToplaMakasSayısınıKarşılaştırınız() {
        if (resultIntMorhipo > resultIntTrendyol) {
            result="morhipo";
        }else result="trendyol";
    }
    @And("Önce ürün sayısı fazla olan siteyi kapatınız")
    public void önceÜrünSayısıFazlaOlanSiteyiKapatınız() {
        if(result.equals("morhipo")){
            Driver.closeDriver();
        }else {
            Driver.getDriver().switchTo().window(trenyolHandle).close();

        }
    }
    @Then("Sonra diğer sayfayıda kapatınız")
    public void sonraDiğerSayfayıdaKapatınız() throws InterruptedException {
        Thread.sleep(3000);

        Driver.quitDriver();
    }
}
