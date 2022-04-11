package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mphasis.Event.CustomEventPublisher;

@Controller
public class EventController {

	
	@Autowired
	CustomEventPublisher publisher;
	
	@GetMapping("/customevent")
	public String publishEventObject() {
		publisher.publish();
		return "hello";
	}
}
