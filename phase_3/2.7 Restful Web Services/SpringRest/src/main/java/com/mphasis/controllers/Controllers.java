package com.mphasis.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.mphasis.beans.Quote;

@Controller
public class Controllers {

         @RequestMapping("/")
          @ResponseBody
          public String index() {
                 
                 RestTemplate restTemplate = new RestTemplate();
             Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
                
            return quote.toString();
          }
           
        
}

