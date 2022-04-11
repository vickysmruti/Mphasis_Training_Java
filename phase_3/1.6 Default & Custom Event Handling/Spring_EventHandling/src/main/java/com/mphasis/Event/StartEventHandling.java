package com.mphasis.Event;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartEventHandling {

	@EventListener
	public void onContextStarted(ContextStartedEvent contextStartedevent) {
		System.out.println("Context started event received ====");

	}
}