package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/featureFiles"},
        glue = {"stepDefinitions","CommonActions"},
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        },tags = " @Saitejafeature"



)
public class LoginJunitTestRunner  {



}
