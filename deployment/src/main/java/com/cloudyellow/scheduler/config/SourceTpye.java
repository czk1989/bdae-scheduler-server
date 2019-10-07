package com.cloudyellow.scheduler.config;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Administrator
 * @ClassName SourceTpye.java
 * @Description TODO
 * @date 2019/10/719:58
 */
public enum SourceTpye {
        CSV,
        JSON,
        DRUID,
        MYSQL,
        HDFS,
        KAFKA,
        REDIS;
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
                case REDIS:
                    return HashMap.class;
                default:
                    throw new AssertionError("must chose one in [CSV,JSON,DRUID,MYSQL,HDFS,KAFKA,REDIS]!");

            }
        }
}
