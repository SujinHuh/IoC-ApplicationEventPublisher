package me.whiteship.demospring51;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler{
   @EventListener
   //@Order(Ordered.HIGHEST_PRECEDENCE )//@EventListener 우선 순위를 주는 것
   @Async //비동기적으로 사용하고싶다. 당연히 순서는 보장이 안됨  @EnableAsync
    public void handle(MyEvent event) {
       System.out.println(Thread.currentThread().toString());
       System.out.println("Event into, Data is"+ event.getDate());
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("======ContextClosedEvent=====");

    }
}
