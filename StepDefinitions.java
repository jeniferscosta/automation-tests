package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class StepDefinitions {

	WebDriver driver = null;
	
	@Given("^I am on the main page of the app$")
	public void mainPageOfTheApp() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("www.todolistavenuecode.com/index.html");
		System.out.println("Main page is displayed with my tasks link available");
	}
	
	@When("^I click on My Task link$")
	public void shouldClickOnMyTasklink() throws Throwable {
		driver.findElements(By.id("my_task")).click();
		System.out.println("My Tasks link was clicked");
	}

	@And("^I will be redirected to my tasks page$")
	public void shouldIBeRedirectedToMyTasksPage() throws Throwable {
		driver.navigate().to("www.todolistavenuecode.com/mytasks.html");
		System.out.println("Redirect to My Tasks Page");
	}

	@Then("^Click on Add Task button to add a new task;$")
	public void shouldClickOnAddTaskButton() throws Throwable {
		driver.findElements(By.id("add_task")).click();
		System.out.println("Add Task button was clicked");
	}
	
	@Then("^Hit the Enter button;$")
	public void shouldHittEnterKey() throws Throwable {
		driver.findElements(By.id("nnnn")).click();
		System.out.println("The Enter key was hit");
	}
	
	@And("^I try to find a input field to add my text description$")
	public void shouldFindInputFieldToAddMyTextDescription() throws Throwable {
		
		WebElement element = driver.findElement(By.name("txt_description"));
		
		if (!element.isDisplayed()) {
			System.out.println("Input field not availble");	
		}
		else{
			driver.findElement(By.name("txt_description")).sendKeys("this is my new task");
			driver.findElement(By.id("submit_btn")).click();
			System.out.println("Input field is availble");
		}
	}
}

