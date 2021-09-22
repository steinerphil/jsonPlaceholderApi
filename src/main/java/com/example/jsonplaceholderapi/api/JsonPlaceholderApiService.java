package com.example.jsonplaceholderapi.api;

import com.example.jsonplaceholderapi.model.api.DataGiven;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderApiService {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos";
    private final RestTemplate restTemplate = new RestTemplate();

    public DataGiven[] getDataGiven(){
        ResponseEntity<DataGiven[]> response = restTemplate.getForEntity(API_URL, DataGiven[].class);
        return response.getBody();
    }
}
