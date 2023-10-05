package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan senaryo çalıştırıcı notasyon
@CucumberOptions(plugin = {"pretty","html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        /*
        rerun plugini ile fail olan scenarioları failed_scenario.txt dosyası içinde tutabiliriz
         */
        features = "src/test/resources/features",//features packageının yolu
        glue = "stepDefinitions",//stepdefinitions package ismi
        tags = "@arabalar",//Hangi scenariolari bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = false, //true seçersek scenariolari kontrol eder browser'i çalıştırmaz
        monochrome = false//--> true kullanırsak konsoldaki çıktıları tek renk verir
)

public class RunnerTwo {

}
