package com.example.GetAPI;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@SpringBootApplication
public class GetApiApplication {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		SpringApplication.run(GetApiApplication.class, args);

		String url = "https://catfact.ninja/fact?max_length=140";
		CatFact fact = new CatFact();
		Gson gson = new Gson();

		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI(url))
				.GET()
				.build();
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
		fact = gson.fromJson(getResponse.body(), CatFact.class);

		System.out.println(fact.getFact());
	}



}
