package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    /**
     * {} --- remplaza cualquier cadena
     * {word} --- remplaza una palabra
     * {string} --- remplazar palabra/s cuando estan entre ""
     * {int} ---remplazar un valor entero
     * {float} --- remplaza un valor con decimales 0.55
     * */


    @Given("i have access to {}")
    public void iHaveAccessToFacebook(String app) {

    }

    @When("i type the email: {}")
    public void iTypeTheEmailUpbUpbCom(String email) {
    }

    @And("i type the password: {int}")
    public void iTypeThePassword(int pwd) {
    }

    @And("i click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("i should be logged")
    public void iShouldBeLogged() {
    }
}
