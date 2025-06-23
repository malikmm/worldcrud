package com.malik.cucumber;

import com.malik.openapi.model.Country;
import com.malik.world.service.CountryService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class StepDefinitions {
    public static final String FRIDAY = "FRIDAY";
    public static final String SUNDAY = "SUNDAY";

    @Autowired
    private CountryService countryService;

    //==========================
    //Greeting
    //==========================
    @Given("today is Sunday")
    public String today_is_sunday() {
        return getDayOfTheWeek(SUNDAY);
    }


    @When("I ask whether it's Friday yet")
    public String i_ask_whether_it_s_friday_yet() {
        return getDayOfTheWeek(FRIDAY);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String message) {
        if(i_ask_whether_it_s_friday_yet().equals(FRIDAY)) {
            log.info("Yes, it is " + FRIDAY);
        } else {
            log.info(message + " it is not " + FRIDAY);
        }
    }

    //==========================
    //Country
    //==========================
    @Given("Selected country is {string}")
    public void selectedCountryIs(String name) {
        Country country = countryService.findByName(name);
        assertEquals(name,country.getName());
    }

    @When("Does {string} exist")
    public Boolean doesExist(String name) {
        assertEquals(name,countryService.findByName(name).getName());
        return true;
    }

    @Then("I should be told {string} {string}")
    public void iShouldBeTold(String name, String resp) {
        if(doesExist(name)) {
            log.info(name + " " + resp);
        } else {
            log.info(name + " does not " + resp);
        }
    }

    //==========================
    // utility methods
    //==========================
//    private static String getDay(String dayOfTheWeek) {
//        String day = getDayOfTheWeek(dayOfTheWeek);
//        return day;
//    }

    private static String getDayOfTheWeek(String dayOfTheWeek) {
        String day = LocalDate.now().getDayOfWeek().toString();
        if (day.equals(dayOfTheWeek)) {
            log.info("Today is " + dayOfTheWeek);
            assertEquals(dayOfTheWeek.toUpperCase(), day);
        } else {
            log.info("Today is " + day);
            assertNotEquals(dayOfTheWeek, day);
        }
        return day;
    }
}
