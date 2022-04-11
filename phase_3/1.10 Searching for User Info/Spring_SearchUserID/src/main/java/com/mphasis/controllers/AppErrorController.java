package com.mphasis.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class AppErrorController implements ErrorController {

	@RequestMapping("/error")
    public String handleError() {
        //TODO: do something like logging
        return "error";
    }

    public String getErrorPath() {
        return null;
    }
}