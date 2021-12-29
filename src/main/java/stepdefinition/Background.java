package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Background {

    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
        System.out.println("=============> I open browser");
    }

    @And("^I maximize it$")
    public void i_maximize_it() throws Throwable {
        System.out.println("=============> I maximize it");

    }
}
