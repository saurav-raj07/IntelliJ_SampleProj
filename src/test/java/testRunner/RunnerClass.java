package testRunner;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"Steps"},features = "./src/test/java/Features")

public class RunnerClass {


}
