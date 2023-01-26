package com.poo.tp3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record InfoAddress(String type, String version, Feature[] features) {
    
}
