package com.cloudyellow.scheduler.config;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 * @ClassName PipelineProperty.java
 * @Description TODO
 * @date 2019/10/718:57
 */
public enum PipelineProperty {

    /**
     * pipelinename
     */
    PIPELINE_NAME("pipeline_name",TYPE.STRING),

    ID("id",TYPE.STRING),

    PIPELINE_SOURCE("source",TYPE.LIST),

    PIPELINE_SOURCE_NAME("source_name",TYPE.STRING),

    PIPELINE_SOURCE_COLUMN("column",TYPE.LIST),
    COLUMN_NAME("name",TYPE.STRING);
//    SourceTpye("type", com.cloudyellow.scheduler.config.SourceTpye);


    /**
     * pipeline字段类型
     */
    enum TYPE{
        BOOLEAN,
        BINGINT,
        STRING,
        CLASS,
        LIST,
        MAP,
        SET,
        ENUM;

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

        /**
         *
         * @return
         */
        public Class defaultValueClass() {
            switch (this) {
                case BOOLEAN:
                    return long.class;
                case BINGINT:
                    return Long.class;
                case STRING:
                    return Number.class;
                case CLASS:
                    return Object.class;
                case LIST:
                    return ArrayList.class;
               case MAP:
                    return HashMap.class;
               case SET:
                    return HashSet.class;
                default:
                    throw new AssertionError("must specify value class for it");
            }
        }
    }

    private final String camelName;
    private final TYPE type;
//    private final Object defaultValue;
//    private Class valueClass;
//    private final boolean required;


    PipelineProperty(String camelName, TYPE type) {
        this.camelName = camelName;
        this.type = type;
    }
}
