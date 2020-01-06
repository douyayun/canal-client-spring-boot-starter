package com.github.canal.annotation;

import com.alibaba.otter.canal.protocol.CanalEntry;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ListenPoint {

    String destination() default "";

    String[] schema() default {};

    String[] table() default {};

    CanalEntry.EventType[] eventType() default {};

}
