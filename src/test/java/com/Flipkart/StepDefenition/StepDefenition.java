package com.Flipkart.StepDefenition;

import java.sql.DriverAction;


import java.util.Set;

import org.Properties.FileReadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Flipkart.runner.RunnerClass;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition extends BaseClass{
	public static WebDriver driver = RunnerClass.driver;
	@Then("^user Launch the web application$")
	public void user_Launch_the_web_application() throws Throwable {
driver.get("https://www.flipkart.com/");	}

	@When("^user search for mixer in the search box$")
	public void user_search_for_mixer_in_the_search_box() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("mixer griner" + Keys.ENTER);
}

	@When("^user selects the mixer and navigates to Mixer page$")
	public void user_selects_the_mixer_and_navigates_to_Mixer_page() throws Throwable {
		WebElement mixer = driver.findElement(By.xpath("//div[text()='₹1,499']//parent::div/parent::div/parent::div/parent::div/div/div[text()='Longway Super Dlx 750 W Juicer Mixer Grinder (4 Jars, White & Blue)']"));
		System.out.println(mixer.getText());

	}

	@Then("^user gets the Mixer name text$")
	public void user_gets_the_Mixer_name_text() throws Throwable {
		WebElement mixer = driver.findElement(By.xpath("//div[text()='₹1,499']//parent::div/parent::div/parent::div/parent::div/div/div[text()='Longway Super Dlx 750 W Juicer Mixer Grinder (4 Jars, White & Blue)']"));
System.out.println(mixer.getText());
		mixer.click();

Set<String> WH = driver.getWindowHandles();
for(String str : WH) {
	driver.switchTo().window(str);
}
	}

	@When("^user search for Add to cart button$")
	public void user_search_for_Add_to_cart_button() throws Throwable {
		WebElement add = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	
	}
	@When("^user using javaScripts user moved to the Add to cart page$")
	public void user_using_javaScripts_user_moved_to_the_Add_to_cart_page() throws Throwable {
		WebElement add = driver.findElement(By.xpath("//button[text()='Add to cart']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", add);
		add.click();	
		}

	@When("^user placed the order by selecting the Placeorder$")
	public void user_placed_the_order_by_selecting_the_Placeorder() throws Throwable {
		System.out.println("done");

		// driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	//driver.findElement(By.xpath("//a[text()='Login']")).click();
	//driver.findElement(By.xpath("//div[.='Enter Email/Mobile number']")).sendKeys("8637615641");
	}

	@Then("^user enters Email address in the Emailaddress field$")
	public void user_enters_Email_address_in_the_Emailaddress_field() throws Throwable {
		System.out.println("FinalDone");
		//driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("husseyhari@gmail.com");
	
	}



}
