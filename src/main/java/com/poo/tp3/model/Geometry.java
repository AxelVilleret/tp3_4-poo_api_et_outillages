package com.poo.tp3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Geometry(String type, Double[] coordinates) {

}
