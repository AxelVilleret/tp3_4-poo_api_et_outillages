package com.poo.tp3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseMeteo(City city, Forecast[] forecast) {
    
}
