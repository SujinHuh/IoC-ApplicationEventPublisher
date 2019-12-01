package me.whiteship.demospring51;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE + 2)//@EventListener 우선 순위를 주는 것
    @Async //비동기적으로 사용하고싶다. 당연히 순서는 보장이 안됨 @EnableAsync
    public void handle(MyEvent myEvent) {

        System.out.println(Thread.currentThread().toString());
        System.out.println("Another"+myEvent.getDate());

    }
}
