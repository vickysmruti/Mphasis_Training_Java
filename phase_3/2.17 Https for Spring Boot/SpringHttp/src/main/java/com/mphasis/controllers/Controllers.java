package com.mphasis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Controllers<ProductRepository> {

         @Autowired
         private ProductRepository repository;
         
         @RequestMapping("/")
          @ResponseBody
          public String index() {
               String s = "This is running under SSL";

               return s;
          }
         
        
}

