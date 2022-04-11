package com.mphasis.Event;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StopEventHandling {
	
	@EventListener
	public void onContextStopped(ContextStoppedEvent contextStoppedevent) {
		System.out.println("Context stopped event received ====");

	}

}
