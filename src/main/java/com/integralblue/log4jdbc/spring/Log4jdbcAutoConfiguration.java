/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.integralblue.log4jdbc.spring;

import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link EnableAutoConfiguration Auto-configuration} for log4jdbc.
 *
 * @author Craig Andrews
 */
@Configuration
@ConditionalOnClass(DataSourceSpy.class)
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
public class Log4jdbcAutoConfiguration {
	@Bean
	public static Log4jdbcBeanPostProcessor log4jdbcBeanPostProcessor() {
		return new Log4jdbcBeanPostProcessor();
	}
}
