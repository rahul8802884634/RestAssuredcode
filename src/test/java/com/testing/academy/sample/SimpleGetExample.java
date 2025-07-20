package com.testing.academy.sample;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleGetExample {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:\n" + response.getBody().asPrettyString());
    }
}
