package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class UserRegistration {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }
    @When("I enter below data")
    public void i_enter_below_data(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        System.out.println("name="+data.get(0).get(0));
        System.out.println("email="+data.get(0).get(1));
        System.out.println("phone="+data.get(0).get(2));
        System.out.println("city="+data.get(0).get(3));

    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("user should be added");
        Assert.assertEquals("this is failure message",true,false);
    }
}
