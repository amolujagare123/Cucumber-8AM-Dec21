package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {


        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
    @Then("I should be redirected to homepage")
    public void i_should_be_redirected_to_homepage() {
        System.out.println("I should be redirected to homepage");

        String expected ="POSNIC - Dashboard";
        String actual = driver.getTitle();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(expected,actual);
    }



}
