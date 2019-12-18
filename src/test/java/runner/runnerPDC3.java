package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="WebShopFeature",glue="C:\\Users\\pdc3b-training.pdc3b\\eclipse-workspace\\CucumberProject\\src\\test\\java\\stepdefinations\\DemoWebShop.java", tags= {"@Regression, @smoke"})

public class runnerPDC3 {

}
