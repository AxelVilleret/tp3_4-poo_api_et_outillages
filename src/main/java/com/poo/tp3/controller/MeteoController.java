package com.poo.tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.poo.tp3.model.Feature;
import com.poo.tp3.model.InfoAddress;
import com.poo.tp3.model.Properties;

@Controller
public class MeteoController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @return the data
     */
    public InfoAddress getData() {
        return restTemplate.getForObject(
                "https://api-adresse.data.gouv.fr/search/?q=8+bd+du+port", InfoAddress.class);
    }

    @RequestMapping(value = "/meteo", method = RequestMethod.POST)
    public String showMeteo(@RequestParam(name = "address") String addressGET, Model model) {
        Feature feature = getData().features()[0];
        Properties properties = feature.properties();
        model.addAttribute("address", addressGET);
        model.addAttribute("coordonnees", getData().features()[0].geometry().coordinates());
        model.addAttribute("cityCode", getData().features()[0].properties().citycode());

        return "meteo";
    }

}