package com.Rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restassured {

		public static void main(String[] args) {
			RestAssured.baseURI="https://reqres.in/";
			RequestSpecification RequestSpecification=RestAssured.given();
			RequestSpecification.queryParam("page", "2");
			Response response = RequestSpecification.request(Method.GET, "api/users");
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			String asPrettyString=response.getBody().asPrettyString();
			System.out.println(asPrettyString);
			
	     
		
	

	}
		


}