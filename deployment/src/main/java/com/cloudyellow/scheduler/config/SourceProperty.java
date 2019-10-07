package com.cloudyellow.scheduler.config;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Administrator
 * @ClassName SourceProperty.java
 * @Description TODO
 * @date 2019/10/720:00
 */
public final class SourceProperty {
    /**
     * source类型
     */
    enum SOURCE_TYPE {
        CSV,
        JSON,
        DRUID,
        MYSQL,
        HDFS,
        KAFKA;
        public Class deduceValueClass(Object defaultValue, Class valueClass) {
            if (valueClass != null) {
                return valueClass;
            }
            if (defaultValue != null) {
                final Class<?> c = defaultValue.getClass();
                if (c.isAnonymousClass()) {
                    // for default values that are anonymous enums
                    return c.getSuperclass();
                }
                return c;
            }
            return defaultValueClass();
        }

        public Class defaultValueClass() {
            switch (this) {
                case CSV:
                    return long.class;
                case JSON:
                    return Long.class;
                case DRUID:
                    return Number.class;
                case MYSQL:
                    return Object.class;
                case HDFS:
                    return ArrayList.class;
                case KAFKA:
                    return HashMap.class;
                default:
                    throw new AssertionError("must specify value class for it");
            }
        }
    }
}
