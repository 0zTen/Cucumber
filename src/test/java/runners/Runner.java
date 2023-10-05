package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan senaryo çalıştırıcı notasyon
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports1.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber1.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        /*
        rerun plugini ile fail olan scenarioları failed_scenario.txt dosyası içinde tutabiliriz
        Paralel çalıştırmalar sonucu detaylı rapor alabilmek için runner classlarındaki rapor isimlerini
        yukarıdaki gibi değiştirmek gerekir. Böylece raporları üst üste yazmamış olur ve çalıştırdığımız
        her runner için ayrı ayrı tek bir html sayfasında raporu görebiliriz.
         */
        features = "src/test/resources/features",//features packageının yolu
        glue = "stepDefinitions",//stepdefinitions package ismi
        tags = "@a1",//Hangi scenariolari bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true seçersek scenariolari kontrol eder browser'i çalıştırmaz
        monochrome = false//--> true kullanırsak konsoldaki çıktıları tek renk verir
)


public class Runner {
    /*
    @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
     */
    //pretty konsolda scenariolar ile ilgili ayrıntılı bilgi verir
}
