package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionWebpage {
	
	
	@Given("^Open (.*) webpage$")
	   public void user_on_welcome_page(String webpage) {
	      System.out.println("User on welcome page: " + webpage);
	   }
	
	@When("^webpage testing jenkins$")
	   public void user_on_testing_page() {
	      System.out.println("User on welcome page: ");
	   }
	@Then("^display (.*) webpage names$")
	   public void verify_user_on_welcome_page(String name) {
	  
	      System.out.println("Title of the page: " + name);
	   }
	
	   
}
