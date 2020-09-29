package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherStepDefs {
    private String city;
    private String country;

    @Given("city is: {string}")
    public void set_city(String city) {
        this.city = city;
    }

    @Given("country is: {string}")
    public void set_country(String country) {
        this.country = country.toLowerCase();
    }

    @When("we are requesting weather data")
    public void request_weather() {
    }

    @Then("lon is: {double}")
    public void check_lon(Double lon) {
    }

    @Then("lat is: {double}")
    public void check_lat(Double lat) {
    }

    @And("id is: {int}")
    public void check_id(int id) {
    }

    @And("main is: {string}")
    public void check_main(String main) {
    }

    @And("description is: {string}")
    public void check_description(String description) {
    }

    @And("icon is: {string}")
    public void check_icon(String icon) {
    }

    @And("base is: {string}")
    public void check_base(String stations) {
    }

    @And("temp is: {double}")
    public void check_temp(Double temp) {
    }

    @And("pressure is: {int}")
    public void check_pressure(int pressure) {
    }

    @And("humidity is: {int}")
    public void check_humidity(int humidity) {
    }

    @And("temp_min is: {double}")
    public void check_temp_min(Double temp_min) {
    }

    @And("temp_max is: {double}")
    public void check_temp_max(Double temp_max) {
    }

    @And("visibility is: {int}")
    public void check_visibility(int visibility) {
    }

    @And("wind speed is: {double}")
    public void check_windSpeed(Double speed) {
    }

    @And("wind deg is: {int}")
    public void check_windDeg(int deg){
    }

    @And("clouds all is: {int}")
    public void check_cloudsAll(int all) {
    }

    @And("dt is: {int}")
    public void check_dt(int dt) {
    }

    @And("sys type is: {int}")
    public void check_sysType(int type) {
    }

    @And("sys id is: {int}")
    public void check_sysId(int id) {
    }

    @And("message is: {double}")
    public void check_message(Double message) {
    }


    @And("sys country is: {string}")
    public void check_sysCountry(String country) {
    }

    @And("sunrise is: {int}")
    public void check_sunrise(int sunrise) {
    }

    @And("sunset is: {int}")
    public void check_sunset(int sunset) {
    }
}
