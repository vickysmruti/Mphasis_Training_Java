package com.mphasis.Event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher publisher;
   
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
      this.publisher = publisher;
   }
   public void publish() {
      CustomEvent c = new CustomEvent(this);
      publisher.publishEvent(c);
   }
}
