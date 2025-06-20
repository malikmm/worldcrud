package com.malik.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class StepDefinitions {
    public static final String FRIDAY = "FRIDAY";
    public static final String SUNDAY = "SUNDAY";

    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();//
        assertNotEquals(SUNDAY, LocalDate.now().getDayOfWeek().toString());
    }
    @When("I ask whether it's Friday yet")

    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertEquals(FRIDAY, LocalDate.now().getDayOfWeek().toString());
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        log.info(string + ", today is " + LocalDate.now().getDayOfWeek());
        assertTrue(true, "Today is " + LocalDate.now().getDayOfWeek());
    }

}
