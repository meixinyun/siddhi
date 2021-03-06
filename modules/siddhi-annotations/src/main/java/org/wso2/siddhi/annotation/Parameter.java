/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.siddhi.annotation;

import org.wso2.siddhi.annotation.util.DataType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for storing the parameters of a processor.
 * Can be applied to windows, stream processors, stream functions, function executors and attribute aggregators
 *
 * <pre><code>
 * eg:-
 *      {@literal @}Parameter(name = "parameter1", type = {DataType.INT, DataType.LONG})
 *      {@literal @}Parameter(name = "parameter2", type = {DataType.BOOL}, description="description about the parameter")
 *      {@literal @}Parameter(name = "parameter3", type = {DataType.DOUBLE, DataType.FLOAT}, optional=true)
 *      public CustomProcessor extends ProcessorSuperClass {
 *          ...
 *      }
 * </code></pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Parameters.class)
public @interface Parameter {
    String name();

    DataType[] type();

    String description() default "";        // optional

    boolean optional() default false;       // optional
}
