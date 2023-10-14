import io.cucumber.testng.CucumberOptions;
import utilities.BaseClass;

@CucumberOptions
        (features = "src/test/java/StcSubscriptionPackages.feature",
                glue = {""},
                plugin = {"html:test-output/cucumber_reports/data.html"}
)


public class StcSubscriptionPackagesTestRunner extends BaseClass {

}
