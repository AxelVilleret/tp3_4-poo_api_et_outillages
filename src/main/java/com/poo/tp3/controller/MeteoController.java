package com.poo.tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.poo.tp3.model.records.ResponseGeo;
import com.poo.tp3.model.records.ResponseMeteo;

@Controller
public class MeteoController {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseGeo getResponseGeo(String address) {
        return restTemplate.getForObject(
                "https://api-adresse.data.gouv.fr/search/?q="+address, ResponseGeo.class);
    }

    public ResponseMeteo getResponseMeteo(String address) {
        ResponseGeo rs = getResponseGeo(address);
        String cityCode = rs.features()[0].properties().citycode();
        Double coordonnees[] = rs.features()[0].geometry().coordinates();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer 2fcf8103e3e4635eaf92dac82238a5318d49cd118a113298a7d30c5b8fe4eca3");
        HttpEntity<ResponseMeteo> request = new HttpEntity<>(headers);
        return restTemplate.exchange("https://api.meteo-concept.com/api/forecast/daily?latlng="+coordonnees[1]+"%2C"+coordonnees[0]+"&insee="+cityCode, HttpMethod.GET, request, ResponseMeteo.class).getBody();
    }

    @RequestMapping(value = "/meteo", method = RequestMethod.POST)
    public String showMeteo(@RequestParam(name = "address") String addressGET, Model model) {
        ResponseMeteo rm = getResponseMeteo(addressGET);
        model.addAttribute("address", addressGET);
        model.addAttribute("cityName", rm.city().name());
        model.addAttribute("forecast", rm.forecast());
        return "meteo";
    }

}