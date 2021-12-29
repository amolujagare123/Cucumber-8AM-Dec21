package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before("@userReg")
    public void beforeScenario()
    {
        System.out.println("********* >> beforeScenario");
    }

    @After("@userReg")
    public void afterScenario()
    {
        System.out.println("********* >> afterScenario");
    }


}
