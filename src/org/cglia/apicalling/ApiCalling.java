package org.cglia.apicalling;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCalling {
	public static void main(String[] args) throws IOException, InterruptedException {
		String url = "http://192.168.60.55:7000/getall";
		
		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> responce = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(responce.statusCode());
		
		System.out.println(responce.body());
	}
}
