package com.example.jsonplaceholderapi.service;

import com.example.jsonplaceholderapi.model.DataNeeded;
import com.example.jsonplaceholderapi.model.api.DataGiven;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JsonPlaceholderMapper {

    public List<DataNeeded> mapToDataNeeded(DataGiven[] apiData){
        List<DataNeeded> result = new ArrayList<>();
        for(DataGiven dataGiven : apiData){
            DataNeeded dataNeeded = new DataNeeded(
                    dataGiven.getUserId(),
                    dataGiven.getId(),
                    dataGiven.getTitle(),
                    dataGiven.isCompleted()
            );
            result.add(dataNeeded);
        }
        return result;
    }

}
