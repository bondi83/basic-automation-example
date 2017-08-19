package com.automation.apiTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class backendApiTest {

  @Test
  public void successfulRequestTest() {
    RestAssured.given().
        accept("application/json").
        when().
        get("https://api.nasa.gov/planetary/apod?api_key=NNKOjkoul8n1CH18TWA9gwngW1s1SmjESPjNoUFo").
        then().
        statusCode(200);
  }

}
