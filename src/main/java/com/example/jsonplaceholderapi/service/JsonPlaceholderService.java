package com.example.jsonplaceholderapi.service;

import com.example.jsonplaceholderapi.api.JsonPlaceholderApiService;
import com.example.jsonplaceholderapi.model.DataNeeded;
import com.example.jsonplaceholderapi.model.api.DataGiven;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonPlaceholderService {

    //fileds from other service classes
    private JsonPlaceholderApiService jsonPlaceholderApiService;
    private JsonPlaceholderMapper jsonPlaceholderMapper;

    //constructor
    public JsonPlaceholderService(
            JsonPlaceholderApiService jsonPlaceholderApiService,
            JsonPlaceholderMapper jsonPlaceholderMapper) {
        this.jsonPlaceholderApiService = jsonPlaceholderApiService;
        this.jsonPlaceholderMapper = jsonPlaceholderMapper;
    }

    public List<DataNeeded> getDataNeeded(){
        DataGiven[] dataGiven = jsonPlaceholderApiService.getDataGiven();
        return jsonPlaceholderMapper.mapToDataNeeded(dataGiven);
    }
}
