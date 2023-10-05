package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinition {
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
    }

    @Then("kullanici arama kutusunda iphone aratir")
    public void kullanici_arama_kutusunda_iphone_aratir() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Given("kullanici arama kutusunda samsung aratir")
    public void kullanici_arama_kutusunda_samsung_aratir() {
       AmazonPage amazonPage = new AmazonPage();
       amazonPage.aramaKutusu.sendKeys("samsung",Keys.ENTER);
    }

    @Given("kullanici parametreli method ile {string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
      AmazonPage amazonPage =new AmazonPage();
      amazonPage.aramaKutusu.sendKeys(str,Keys.ENTER);
      Driver.closeDriver();
    }
}
