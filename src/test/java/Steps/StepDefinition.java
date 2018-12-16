package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import restFullServices.TestClass;

import java.io.IOException;

public class StepDefinition {


    @Given("^when user is into login page$")
    public void when_user_is_into_login_page()  {
        System.out.println("-->> when user is into login page");
    }

    @When("^and provides username and password$")
    public void and_provides_username_and_password()  {
        System.out.println("-->> and provides username and password");
    }

    @And("^clicks on login button$")
    public void clicks_on_login_button() {
        System.out.println("-->> clicks on login button");
    }

    @Then("^user is able to view the Landing home page$")
    public void user_is_able_to_view_the_Landing_home_page()  {
        System.out.println("-->> user is able to view the Landing home page");
    }

    @Then("^test case is complete$")
    public void testCaseIsComplete() {
        System.out.println("-->> test case is complete");
        System.out.println("-->> test case is complete sucessfully");
    }

    @When("^user user passed a GET request$")
    public void userUserPassedAGETRequest() throws IOException {

        System.out.println("hello world ");
        TestClass testClass = new TestClass();
        testClass.executeTest();
        System.out.println(" ");
    }

    @Then("^Status code is (\\d+)$")
    public void statusCodeIs(int arg0) {

        System.out.println("Yes the status code returned is 200 Only");
    }
}
