package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
}
