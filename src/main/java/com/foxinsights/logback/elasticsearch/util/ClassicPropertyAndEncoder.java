package com.foxinsights.logback.elasticsearch.util;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import com.foxinsights.logback.elasticsearch.config.Property;

public class ClassicPropertyAndEncoder extends AbstractPropertyAndEncoder<ILoggingEvent> {

    public ClassicPropertyAndEncoder(Property property, Context context) {
        super(property, context);
    }

    @Override
    protected PatternLayoutBase<ILoggingEvent> getLayout() {
        return new PatternLayout();
    }
}
