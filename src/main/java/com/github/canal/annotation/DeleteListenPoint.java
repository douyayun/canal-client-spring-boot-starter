package com.github.canal.annotation;

import com.alibaba.otter.canal.protocol.CanalEntry;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ListenPoint(eventType = CanalEntry.EventType.DELETE)
public @interface DeleteListenPoint {

    @AliasFor(annotation = ListenPoint.class)
    String destination() default "";

    @AliasFor(annotation = ListenPoint.class)
    String[] schema() default {};

    @AliasFor(annotation = ListenPoint.class)
    String[] table() default {};

}
