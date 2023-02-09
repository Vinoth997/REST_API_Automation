package usingUniRestLibrary;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UniRestHttpRequestExample {
	
	public void getRequestExample() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse =  Unirest.get("https://reqres.in/api/users/2").asJson();
		
		System.out.println("Get Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Message : "+jsonResponse.getStatusText());
		System.out.println("Response Body : "+jsonResponse.getBody());
		
	}
	
	public void postRequestExample() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post("https://reqres.in/api/users").
		body("{\"name\": \"Arena\",\"job\": \"leader\"}").asJson();
		
		System.out.println("Post Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Text : "+jsonResponse.getStatusText());
		System.out.println("Response Body : "+jsonResponse.getBody());
	
	}
	
	public void putResquestExample() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse = Unirest.put("https://reqres.in/api/users/222").
		body("{\\\"name\\\": \"Arena\",\"job\": \"leader\"}").asJson();
		
		System.out.println("Put Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Text : "+jsonResponse.getStatusText());
		System.out.println("Response Text : "+jsonResponse.getBody());
	}
	
	public void deleteRequestExample() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("https://reqres.in/api/users/2").asJson();
		
		System.out.println("Delete Status Code : "+jsonResponse.getStatus());
		System.out.println("Status Text : "+jsonResponse.getStatusText());
		System.out.println("Response Body : "+jsonResponse.getBody());
	}
	
	public static void main(String[] args) throws UnirestException {
		UniRestHttpRequestExample example = new UniRestHttpRequestExample();
//		example.getRequestExample();  //get 
//		example.postRequestExample(); //post
//		example.putResquestExample(); //put
		example.deleteRequestExample(); //delete
	}

}
